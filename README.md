# ms-cutomer-bff

Proyecto para clases de fullstack con java25 y maven 

1. ¿Qué es Git y por qué lo usamos?
Git es un Sistema de Control de Versiones. Imagina que estás escribiendo una tesis y guardas archivos como tesis_v1.doc, tesis_final.doc, tesis_esta_si_es_la_buena.doc. Git evita ese caos.

 - Repositorio (Repo): Es la carpeta de tu proyecto "vigilada" por Git.

 - Commit: Es una "foto" de tu código en un momento específico. Si algo se rompe mañana, puedes volver a la foto de hoy.

 - Branch (Rama): Permite trabajar en una función nueva (como un chat) sin arruinar el código que ya funciona (la rama principal o main).

2. Spring Boot y el salto a Java 25
Spring Boot es el framework (marco de trabajo) más popular para crear aplicaciones empresariales con Java. Su lema es "Convention over Configuration": ya viene con todo configurado para que no pierdas tiempo en archivos XML aburridos.

3. Guía Paso a Paso en CMD 
Si el repositorio es nuevo o quieres inicializar uno tú mismo, sigue este orden:

Fase A: Inicializar y Conectar (Git)
  
  - Crea tu carpeta y entra:
  mkdir mi-proyecto-spring
  cd mi-proyecto-spring
  
  - Inicializa el repositorio: Esto crea una carpeta oculta .git que empezará a rastrear tus cambios.
  git init

  - Conectar con un servidor (GitHub/GitLab): Si ya tienes un link de un repo vacío en la nube:
  git remote add origin https://github.com/tu-usuario/tu-repo.git
  
  - Traer el código (si ya existe contenido):
  git pull origin main
  
  Fase B: Comandos de Construcción y Ejecución
  Una vez que tienes los archivos en tu notebook, necesitas que Spring Boot "despierte".
  
  Descargar dependencias: mvn clean install (Esto lee el pom.xml y baja todas las librerías de internet).
  
  Compilar y Ejecutar:
  mvn spring-boot:run

4. Estructura básica de lo que verás
5. Al abrir el proyecto en un editor (IntelliJ), verás esto:
src/main/java: Aquí vive tu código Java 25.
src/main/resources: Aquí están las configuraciones (application.properties) y carpetas estáticas.
pom.xml o build.gradle: El "cerebro" que dice qué versión de Java y qué librerías usa el proyecto.

¿Cómo saber si funcionó?
Cuando ejecutas el comando de arranque, verás un logo gigante de SPRING en arte ASCII en tu CMD. Al final dirá algo como:
Tomcat started on port(s): 8080 (http) with context path ''
Eso significa que puedes ir a tu navegador y escribir localhost:8080.
