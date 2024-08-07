plugins {
    kotlin("jvm") version "1.9.23"

    // flywayMigrate Task
    // ПРОБУЕМ РАЗНЫЕ ВЕРСИИ на совместимость
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway/10.8.1
    id("org.flywaydb.flyway") version "9.22.3"
}

group = "org.gulash"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // flyway зависимости
    implementation("org.flywaydb:flyway-core:9.22.3")

    // драйвера
    implementation("org.postgresql:postgresql:42.6.2")

    testImplementation(kotlin("test"))
}

// flywayMigrate Task. Настройки аналогичны как в application.properties
flyway {
    url = "jdbc:postgresql://localhost:5432/testbd"
    user = "postgres"
    password = "postgres"
    baselineOnMigrate = true
    locations = arrayOf("filesystem:db/migration/dev/postgresql")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

