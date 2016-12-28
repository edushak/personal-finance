package com.rozdolsky.creditcard.dao

import groovy.sql.GroovyRowResult
import groovy.sql.Sql

class CreditCardsFinder {

    Sql sql

    CreditCardsFinder() {
        String dbFileName = 'creditCardsStorage.sqlite'
        ClassLoader classLoader = getClass().getClassLoader();
        File dbFile = new File(classLoader.getResource(dbFileName).getFile());
        if (!dbFile.exists()) {
            throw new Exception('DB SQLite file does not exists: ' + dbFile.absolutePath)
        }
        sql = Sql.newInstance('jdbc:sqlite:' + dbFile.absolutePath, 'org.sqlite.JDBC' )
    }

    List<GroovyRowResult> findAll() {
        sql.rows("select * from CreditCards")

//        sql.rows("select * from CreditCards") {
//        }
    }
}
