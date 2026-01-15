package com.creational.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

import static com.creational.builder.Book.*;

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
