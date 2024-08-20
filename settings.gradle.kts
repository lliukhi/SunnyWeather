pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }

        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url=uri("https://maven.aliyun.com/repository/spring-plugin") }
        maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://maven.aliyun.com/repository/google") }
        maven { url=uri("https://jitpack.io")}
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url=uri("https://maven.aliyun.com/repository/spring-plugin") }
        maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://maven.aliyun.com/repository/google") }
        maven { url=uri("https://jitpack.io")}
        google()
        mavenCentral()
    }
}

rootProject.name = "SunnyWeather"
include(":app")
 