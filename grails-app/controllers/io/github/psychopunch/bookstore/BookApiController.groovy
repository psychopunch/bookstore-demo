package io.github.psychopunch.bookstore

import grails.rest.RestfulController;

class BookApiController extends RestfulController<Book> {

    static responseFormats = ['json', 'xml']
    
    BookApiController() {
        super(Book)
    }
    
    @Override
    def index(final Integer max) {
        log.info "CONTROLLER TRIGGERED"
        params.max = Math.min(max ?: 10, 100)
        respond listAllResources(params), [includes: includeFields, excludes: ['class']]
    }
    
    private getIncludeFields() {
        params.fields?.tokenize(',')
    }
    
}
