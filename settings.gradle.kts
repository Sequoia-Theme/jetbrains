rootProject.name = "sequoia-jetbrains"

pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
  plugins {
    id("org.jetbrains.intellij.platform") version "2.16.0"
  }
}

plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
