package be.kvi.githubcore

import org.example.be.kvi.githubcore.GitHubContext
import org.junit.jupiter.api.Test

class GitHubContextTest {
    @Test
    fun listEnvironmentVariables() {
        val gitHubContext = GitHubContext()
        gitHubContext.listEnvironmentVariables()
    }
}