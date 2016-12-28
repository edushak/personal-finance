package com.rozdolsky.util

class Helper {

    static ConfigObject getConfigObject(String fileName) {
        File appConfigFile = Helper.getResource(fileName)
        ConfigSlurper slurper = new ConfigSlurper()
        slurper.parse(appConfigFile.toURI().toURL())
    }

    static ConfigObject getAppConfig() {
        return getConfigObject('app.config')
    }

    static File getResource(String fileName) {
        ClassLoader classLoader = new Helper().getClass().getClassLoader()
        return new File(classLoader.getResource(fileName).file)
    }
}
