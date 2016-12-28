package com.rozdolsky.creditcard.dao

class CreditCardsFinderTest extends GroovyTestCase {

    CreditCardsFinder finder = new CreditCardsFinder()

    void testFindAll() {
        List rows = finder.findAll()
        assert rows == [
            ['id': 1, 'name': 'Chase Rewards', 'number': '1234-1234-1234-1234', 'expirationMonth': 8, 'expirationYear': 2020, 'interestRate': 15, 'promoMonth': 3, 'promoYear': 2017, 'type': 2, 'vendorBank': 'Chase'],
            ['id': 2, 'name': 'Blue Rewards', 'number': '4444-4444-4444-4444', 'expirationMonth': 12, 'expirationYear': 2018, 'interestRate': 13.9, 'promoMonth': '', 'promoYear': '', 'type': 3, 'vendorBank': 'AmEx']
        ]
    }
}
