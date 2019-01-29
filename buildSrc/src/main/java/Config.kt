import org.gradle.api.JavaVersion

object Config {
    // Android config
    const val androidBuildTools = "28.0.3"
    const val androidMinSdk = 15
    const val androidTargetSdk = 28
    const val androidCompileSdk = 28
    const val applicationId = "com.example.iqdatasdk"
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val authority = "IQDataSdkInitProvider"
    val compileSourceVersion = JavaVersion.VERSION_1_8
    val compileTargetVersion = JavaVersion.VERSION_1_8
}

object Versions {
    // Plugins
    const val androidToolsPlugin = "3.3.0"
    const val versionsPlugin = "0.20.0"

    // Android libraries
    const val compatLibrary = "1.0.2"
    const val material = "1.0.0"

    // Third party libraries
    const val iqdata = "1.0.1"
}

object Plugins {
    val androidTools = "com.android.tools.build:gradle:${Versions.androidToolsPlugin}"
    val android = "com.android.application"
    val versions = "com.github.ben-manes.versions"
}

object Libs {
    val appcompat = "androidx.appcompat:appcompat:${Versions.compatLibrary}"
    val material = "com.google.android.material:material:${Versions.material}"

    val iqdata = "ai.iqdata:iqdata-android-sdk:${Versions.iqdata}"
}