package io.github.psychopunch.bookstore

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification


@Mixin(PropertyMixin)
class WithMixin {
    
    Integer number
    String description
    
}

class NoMixin {
    
    Integer number
    String description
    
}

@TestMixin(GrailsUnitTestMixin)
class PropertyMixinSpec extends Specification {

    void "test object with mixin"() {
        expect:
        5 == new WithMixin(number: 1, description: "with mixin").mixinProperties().size()
    }
    
}
