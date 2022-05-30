package com.dejerz.libraryrest;

public class ArticleNotFoundException extends RuntimeException {
    public ArticleNotFoundException(Long id) {
        super("Could not find article "+id);
    }
}
