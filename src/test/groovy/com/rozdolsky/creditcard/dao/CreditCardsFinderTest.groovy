package com.rozdolsky.creditcard.dao

class CreditCardsFinderTest extends GroovyTestCase {

    CreditCardsFinder finder = new CreditCardsFinder()

    void testFindAll() {
        assert finder.findAll() != null
    }
}
