package org.example.be.kvi.githubcore

class GitHubContext {

    fun listEnvironmentVariables() {
        val environmentVariables = System.getenv()
        environmentVariables.forEach {
            println("${it.key} = ${it.value}")
        }
    }

    private fun getEnvironmentVariable(name: String) {
        val environment = System.getenv(name)
    }
}