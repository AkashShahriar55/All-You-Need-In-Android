pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

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
