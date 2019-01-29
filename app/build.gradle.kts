plugins {
    id(Plugins.android)
}

android {
    compileSdkVersion(Config.androidCompileSdk)
    buildToolsVersion(Config.androidBuildTools)

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Config.androidMinSdk)
        targetSdkVersion(Config.androidTargetSdk)
        versionCode = Config.versionCode
        versionName = Config.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Config.compileSourceVersion
        targetCompatibility = Config.compileTargetVersion
    }
}
dependencies {
    implementation(Libs.appcompat)
    implementation(Libs.material)
    implementation(Libs.iqdata)
}
