package com.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String title;
    private String description;
    private String author;
    private String publisher;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String title;
        private String description;
        private String author;
        private String publisher;


        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.title = this.title;
            book.description = this.description;
            book.author = this.author;
            book.publisher = this.publisher;

            return book;
        }

    }
}
