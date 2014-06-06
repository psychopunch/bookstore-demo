package io.github.psychopunch.bookstore

import grails.rest.Resource;

@Resource(uri='/books')
class Book {

    static constraints = {}
    
    Long id
    
    String title
    String author
    
}
