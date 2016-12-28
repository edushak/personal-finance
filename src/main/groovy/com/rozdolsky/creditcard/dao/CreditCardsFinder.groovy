package com.rozdolsky.creditcard.dao

import com.rozdolsky.util.Helper
import groovy.sql.GroovyRowResult
import groovy.sql.Sql

class CreditCardsFinder {

    Sql sql

    /**
     * runs once during object creation
     */
    CreditCardsFinder() {
        ConfigObject config = Helper.appConfig

        File dbFile = Helper.getResource(config.dbFile)
        if (!dbFile.exists()) {
            throw new Exception('DB SQLite file does not exists: ' + dbFile.absolutePath)
        }
        sql = Sql.newInstance('jdbc:sqlite:' + dbFile.absolutePath, 'org.sqlite.JDBC')
    }

    List<GroovyRowResult> findAllCards() {
        sql.rows("select * from CreditCards")
    }

    List<GroovyRowResult> findByExpiration(int year, int month) {
        // TODO
    }

    List<GroovyRowResult> findWithPromotion(int year, int month) {
        // TODO
    }

}
