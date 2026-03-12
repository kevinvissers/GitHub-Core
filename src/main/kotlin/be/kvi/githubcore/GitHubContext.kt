package org.example.be.kvi.githubcore

class GitHubContext {

    enum class Event {
        GITHUB_EVENT_NAME,
        GITHUB_STEP_SUMMARY,
        GITHUB_OUTPUT,
        GITHUB_REPOSITORY_OWNER,
        CI,
        GITHUB_DEPENDENCY_GRAPH_ENABLED,
        GITHUB_RUN_ATTEMPT,
        GITHUB_PATH,
        ImageOS,
        GITHUB_WORKFLOW_REF,
        GITHUB_ACTION_REPOSITORY,
        GITHUB_RETENTION_DAYS,
        GITHUB_ACTION,
        GITHUB_REPOSITORY_ID,
        INVOCATION_ID,
        GITHUB_REPOSITORY,
        GITHUB_JOB,
        EDGEWEBDRIVER,
        HOME,
        GITHUB_HEAD_REF,
        RUNNER_OS,
        ACTIONS_ORCHESTRATION_ID,
        GITHUB_WORKFLOW_SHA,
        LANG,
        GITHUB_RUN_ID,
        RUNNER_TOOL_CACHE,
        SELENIUM_JAR_PATH,
        GITHUB_REF_NAME,
        ImageVersion,
        GITHUB_ENV,
        RUNNER_WORKSPACE,
        GITHUB_API_URL,
        USER,
        RUNNER_ARCH,
        CHROME_BIN,
        ENABLE_RUNNER_TRACING,
        GITHUB_RUN_NUMBER,
        PATH,
        LOGNAME,
        GITHUB_REF,
        GITHUB_REF_PROTECTED,
        GECKOWEBDRIVER,
        GITHUB_REF_TYPE,
        GITHUB_ACTOR_ID,
        GITHUB_WORKSPACE,
        GITHUB_SERVER_URL,
        GITHUB_SHA,
        ACTIONS_RUNNER_ACTION_ARCHIVE_CACHE,
        GITHUB_ACTIONS,
        GITHUB_ACTOR,
        RUNNER_NAME,
        CHROMEWEBDRIVER,
        GITHUB_GRAPHQL_URL,
        GITHUB_BASE_REF,
        RUNNER_TRACKING_ID,
        RUNNER_TEMP,
        GITHUB_ACTION_REF,
        GITHUB_STATE,
        RUNNER_ENVIRONMENT,
        GITHUB_WORKFLOW,
        GITHUB_REPOSITORY_OWNER_ID,
        GITHUB_EVENT_PATH,
        GITHUB_TRIGGERING_ACTOR
    }

    fun listEnvironmentVariables() {
        val environmentVariables = System.getenv()
        environmentVariables.forEach {
            println("${it.key} = ${it.value}")
        }
    }

    private fun getEnvironmentVariables(event: Event): String {
        val environmentVariables = System.getenv(event.name) ?: ""
        return environmentVariables
    }

    private fun getEnvironmentVariable(name: String) {
        val environment = System.getenv(name)
    }
}