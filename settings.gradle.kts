/**
 * The pluginManagement lambda function provides PluginManagementSpec argument which is accessible.
 * within PluginManagementSpec we can find a function called repositories that provides a RepositoryHandler argument.
 * This is the place we pass the list of our repositories where Gradle will try to find plugins and it will download the ones it finds.
 * **/
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

/**
 * It doues the similar thing as the pluginManagement one, but it provides the list of repositories where Gradle will search for
 * dependencies that are necessary for our project.
 * **/
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AllYouNeedInAndroid"
include(":app")
include(":data")
include(":core")
include(":dynamic")
include(":feature")
include(":test")
include(":build-logic")
include(":build-logic:convention")
