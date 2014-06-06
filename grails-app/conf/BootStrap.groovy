import io.github.psychopunch.bookstore.Book

class BootStrap {

    def init = { servletContext ->
        new Book(title: "A Christmas Carol", author: "Charles Dickens").save(flush: true)
        new Book(title: "To Kill a Mockingbird", author: "Harper Lee").save(flush: true)
    }
    def destroy = {
    }
    
}
