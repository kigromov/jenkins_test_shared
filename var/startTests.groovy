#!/usr/bin/env groovy
def call(Map<String, String> params) {
    //assert params["runId"]

    //def threadsCount = params["threadsCount"] ?: "8"
    //def testList = params["testList"] ?: "*Test"
    //def runId = params["runId"]
            stage("start test job") {
            // build job: 'QA/TestJob',
            //         parameters: [string(name: 'threadsCount', value: threadsCount),
            //                      string(name: 'runId', value: runId),
            //                      string(name: 'testList', value: testList)]
                build job: 'AllureTest/allure', 
                        parameters: [string(name: 'testList', value: '*')]
            }

            // stage("get failed test") {
            //     def testResultAction = currentBuild.rawBuild.getAction(AbstractTestResultAction.class)
            //     def failedTests = testResultAction.getFailedTests()
            //     def failedTestsString = "```"
            //     for(CaseResult cr : failedTests) {
            //         failedTestsString = failedTestsString + "${cr.getFullDisplayName()}:\n${cr.getErrorDetails()}\n\n"
            //     }
            //     echo failedTestsString
            // }

}