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
        when:
        def declaredProperties = WithMixin.metaClass.properties
        def declaredPropertyNames = declaredProperties*.name

        then:
        declaredPropertyNames.size() == 3
        'class' in declaredPropertyNames
        'number' in declaredPropertyNames
        'description' in declaredPropertyNames
    }


    void "test object without mixin"() {
        when:
        def declaredProperties = NoMixin.metaClass.properties
        def declaredPropertyNames = declaredProperties*.name

        then:
        declaredPropertyNames.size() == 3
        'class' in declaredPropertyNames
        'number' in declaredPropertyNames
        'description' in declaredPropertyNames
    }

}
