package com.creational.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

import static com.creational.builder.Book.*;


/*
A Builder is used to create an object by initializing only the parts that are required,
like title and publisher.

To implement a builder, we need to create a static class inside the Book class
(or any class we want to build) with the same fields as the Book class.

Each setter method in the Builder class returns the Builder itself, allowing method chaining.
At the end, we create a build() method which sets the values of the Book class
from the Builder class and returns the constructed Book object.
*/

@SpringBootApplication
public class BuilderPattern {
    static void main() {
        Book buildOne = builder()
                .title("Java Design Patterns")
                .author("Akhtar")
                .description("A guide")
                .publisher("XYZ")
                .build();

        Book buildTwo = builder()
                .title("Java Design Patterns")
                .author("Ansari")
                .publisher("XYZ")
                .build();

        Book buildThree = builder()
                .title("Java Design Patterns")
                .author("Akhtar")
                .description("No guide")
                .build();

        Stream.of(buildOne, buildTwo, buildThree).forEach(System.out::println);

        SpringApplication.run(BuilderPattern.class);
    }
}
