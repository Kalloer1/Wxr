plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.wr"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.wr"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"


    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    compileOnly ("de.robv.android.xposed:api:82")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation(files("lib\\XposedBridgeApi-82.jar"))

}