pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "HtiApp"
include(":app")
include(":navigation")
include(":home:ui")
include(":home:data")
include(":home:domain")
include(":mycourses:ui")
include(":mycourses:data")
include(":mycourses:domain")
include(":services:ui")
include(":services:data")
include(":services:domain")
include(":auth:ui")
include(":auth:data")
include(":auth:domail")
include(":core:ui")
