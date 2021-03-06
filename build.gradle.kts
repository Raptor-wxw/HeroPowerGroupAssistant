plugins {
    val kotlinVersion = "1.6.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.10.1"
}

group = "org.wzry.heropower"
version = "2.0.2"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.2.2")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("com.alibaba:fastjson:1.2.79")
    implementation("org.jsoup:jsoup:1.14.3")
}