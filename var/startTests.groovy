#!/usr/bin/env groovy
def call() {
    step("start test job") 
    {
        build job: 'AllureTest/allure', parameters: [string(name: 'testList', value: '*')]
    }
}