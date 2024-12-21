# SpringBoot

Crear proyecto básico SpringBoot:
https://start.spring.io/

# JDK
Instalar último JDK: ejemplo:
https://www.oracle.com/es/java/technologies/downloads/#jdk23-windows

AÑADIR VARIABLES JAVA_HOME y AÑADIR el bin al PATH:

## Java Home
C:\Users\David\Documents\SpringBoot>echo %JAVA_HOME%
C:\Program Files\Java\jdk-23\

## PATH del sistema (WINDOWS)
C:\Users\David\Documents\SpringBoot>echo %PATH%
C:\Program Files\Java\jdk-23\bin

Panel de control\Sistema y seguridad\Sistema -> Variables de entorno

# Maven

## Instalación, compilación y ejecución con Maven desde consola:
mvn clean install
mvn spring-boot:run

mvn compile (no siempre necesario)

Resultado:
---
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.thevenin:hola-mundo >-----------------------
[INFO] Building hola-mundo 0.0.1-SNAPSHOT
[INFO]   from pom.xml

[..]
¡Hola, Mundo desde Spring Boot!

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.1)
[..]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.476 s
[INFO] Finished at: 2024-12-21T10:48:18Z
[INFO] ------------------------------------------------------------------------

# Ejecución desde el JDK con java -jar 

C:\Users\David\Documents\SpringBoot\HolaMundo>java -jar target/hola-mundo-0.0.1-SNAPSHOT.jar
¡Hola, Mundo desde Spring Boot!

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.1)