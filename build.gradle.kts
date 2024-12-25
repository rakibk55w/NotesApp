// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
    }
    dependencies {
        val navVersion = "2.8.5"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id ("com.android.library") version "7.3.1" apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
    id ("androidx.navigation.safeargs") version "2.8.5" apply false
}