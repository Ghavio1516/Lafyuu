plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ghavio.lafyuu"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ghavio.lafyuu"
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

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14" // Ganti dengan versi terbaru yang sesuai
    }
}

dependencies {
    // Dependensi Jetpack Compose
    implementation("androidx.compose.ui:ui:1.6.7") // Ganti dengan versi terbaru yang sesuai
    implementation("androidx.compose.material3:material3:1.2.1") // Ganti dengan versi terbaru yang sesuai
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.7") // Ganti dengan versi terbaru yang sesuai
    implementation("androidx.compose.runtime:runtime:1.6.7") // Ganti dengan versi terbaru yang sesuai
    implementation("androidx.compose.compiler:compiler:1.5.14") // Ganti dengan versi terbaru yang sesuai

    // Dependensi lainnya
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.foundation.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.androidx.navigation.compose)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
