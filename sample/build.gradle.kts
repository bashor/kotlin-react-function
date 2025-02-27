plugins {
  kotlin("js") version "1.4.30"
  kotlin("plugin.serialization") version "1.4.30"
  id("com.bnorm.react.kotlin-react-function") version "0.4.0"
}

repositories {
  mavenCentral()
  jcenter()
  maven { setUrl("https://kotlin.bintray.com/kotlinx") }
  maven { setUrl("https://dl.bintray.com/kotlin/kotlin-js-wrappers") }
}

kotlin {
  js(IR) {
    browser {}
    binaries.executable()
  }
}

dependencies {
  implementation(kotlin("stdlib-js"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")
  implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.1")

  implementation("com.bnorm.react:kotlin-react-function:0.3.0")
  implementation("org.jetbrains:kotlin-react-dom:17.0.1-pre.144-kotlin-1.4.21")
  implementation("org.jetbrains:kotlin-styled:5.2.0-pre.144-kotlin-1.4.21")

  implementation(npm("@reach/accordion", "^0.13.0"))
  implementation(npm("prop-types", "^15.6.2")) // Not sure why this is needed...
}
