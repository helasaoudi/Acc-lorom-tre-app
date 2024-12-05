plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.test_jenkins"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.test_jenkins"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.junit.junit)
    implementation(libs.ext.junit)
    implementation(libs.cardview)
    // Keep only JUnit for testing
    testImplementation(libs.junit) {
        exclude(group = "org.hamcrest", module = "hamcrest-core") // Exclude hamcrest if necessary
    }

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
