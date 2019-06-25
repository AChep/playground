plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
}

repositories {
    mavenCentral()
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    sourceSets {
        getByName("main").apply {
            setRoot("src/androidMain")
            java.setSrcDirs(listOf("src/androidMain/kotlin"))
        }
    }
}

kotlin {
    android {
    }
    jvm()

    sourceSets {
        getByName("commonMain").apply {
            dependencies {
                implementation(kotlin("stdlib-common"))
                compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$KOTLIN_COROUTINES_VERSION")
            }
        }
        getByName("jvmMain").apply {
            dependencies {
                implementation(kotlin("stdlib"))
                compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core:$KOTLIN_COROUTINES_VERSION")
            }
        }
        getByName("androidMain").apply {
            dependencies {
                implementation(kotlin("stdlib"))
                compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-android:$KOTLIN_COROUTINES_VERSION")
            }
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$KOTLIN_COROUTINES_VERSION")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$ANDROIDX_LIFECYCLE_VERSION")
}

configurations.create("compileClasspath")
