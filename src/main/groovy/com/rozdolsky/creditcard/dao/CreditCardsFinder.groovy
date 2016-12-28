package com.rozdolsky.creditcard.dao

import com.rozdolsky.util.Helper
import groovy.sql.GroovyRowResult
import groovy.sql.Sql

class CreditCardsFinder {
    Sql sql
    ConfigObject queries

    /**
     * runs once during object creation
     */
    CreditCardsFinder() {
        File dbFile = Helper.getResource(Helper.appConfig.dbFile)
        if (!dbFile.exists()) {
            throw new Exception('DB SQLite file does not exists: ' + dbFile.absolutePath)
        }
        sql = Sql.newInstance('jdbc:sqlite:' + dbFile.absolutePath, 'org.sqlite.JDBC')
        queries = Helper.getConfigObject('queries.sql')
    }

    List<GroovyRowResult> findAllCards() {
        sql.rows(queries.creditCards.selectAll)
    }

    List<GroovyRowResult> findByExpiration(int year, int month) {
        // TODO
    }

    List<GroovyRowResult> findWithPromotion(int year, int month) {
        // TODO
    }

}
