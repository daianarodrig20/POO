Programación Orientada a Objetos
2021
Práctica 2
Design principles y Design Patterns

● SOLID, es un acrónimo de 5 importantes principios de la programación orientada a
objetos. Explicar y brindar ejemplos.


1)SOLID

#Single-responsibility Principle
A class should have one and only one reason to change, meaning that a class should have only one job.

#Open-closed Principle
Objects or entities should be open for extension, but closed for modification.
This simply means that a class should be easily extendable without modifying the class itself.

#Liskov substitution principle
Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
All this is stating is that every subclass/derived class should be substitutable for their base/parent class.

#Interface segregation principle
A client should never be forced to implement an interface that it doesn't use or clients shouldn't be forced to depend on methods they do not use.

#Dependency Inversion principle
Entities must depend on abstractions not on concretions. It states that the high level module must not depend on the low level module, but they should depend on abstractions.





● Sobre el patrón de diseño Singleton, explique:
○ ¿Porque se puede considerar que no cumple con el principio de Single
Responsibility?
○ ¿Porque se considera que dificulta realizar tests de unidad?

1) A singleton has two responsibilities:

Manage the creation of the instance of the class
Do something that is the original responsibility of the class

2) Each test must have its own context. We create the same context for multiple tests when we use the singleton pattern. One context affects to other one.


#Java Build Tools





For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference):

LifeCycle:

clean - clean project
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.    

Versionado Semántico:
https://semver.org/lang/es/

Git Flow:
https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow

Git's steps:

git init
git remote add origin https://github.com/ndigrazia/unnobapoorepo.git
echo "# " >> README.md
git add README.md
git commit -m "first commit"
git branch -M master
git push -u origin master

git branch develop
git checkout develop
git add .
git commit -m "my project commit"
git push -u origin develop

Learning GIT: https://learngitbranching.js.org/

Web Applications
Explique los siguientes tipos de aplicaciones web 
Dynamic Web Applications 
Single Page Applications 
Progressive Web Applications

Java Build Tools
Describir:
Apache Ant
Apache Ant es una herramienta usada en programación para la realización de tareas mecánicas y repetitivas, normalmente durante la fase de compilación y construcción
Apache Ant is a Java library and command-line tool whose mission is to drive processes described in build files as targets and extension points dependent upon each other.

Apache Maven
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 

Podríamos decir, que Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.
https://www.javiergarzas.com/2014/06/maven-en-10-min.html



Gradle:


Gradle es un sistema de automatización de construcción de código de software que construye sobre los conceptos de Apache Ant y Apache Maven e introduce un lenguaje específico del dominio basado en Groovy en vez de la forma XML utilizada por Apache Maven para declarar la configuración de proyecto.​ 

Apache Maven
¿Qué es el archivo POM de maven?
Maven utiliza un Project Object Model (POM) para describir el proyecto de software a construir, sus dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos. Viene con objetivos predefinidos para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado.

pom.xml: el Project Object Model (POM) es el encargado de gestionar y construir los proyectos, contiene el listado de dependencias que son necesarias para que el proyecto funcioné, plugins, etc. Toda la información del proyecto está basada en este fichero. Tiene extensión .xml y desde la propia web oficial de Apache Maven, lo definen como el núcleo central, por lo que podemos afirmar que es el corazón del proyecto.


Explique brevemente el Build Lifecycle de maven y cada una de sus etapas.


Crear un proyecto Java del tipo web application utilizando Maven.

IntelliJ IDEA: Creando proyecto Spring con Maven












Un controlador de versiones es un sistema que nos permite guardar un registro de las modificaciones que realizamos sobre un fichero o conjunto de ficheros a lo largo del tiempo de tal manera que sea posible recuperar versiones específicas más adelante. Habitualmente se utiliza en entornos de desarrollo de software, pero puede resultar de gran utilidad para cualquier persona que necesite un control robusto sobre la tarea que está realizando.
La mayoría de la gente utilizamos algún sistema de control de versiones sin ser conscientes de ello. El ejemplo más claro es al editar cualquier tipo de fichero en servicios de almacenamiento en “la nube” como Google Drive o Dropbox.
Pero, ¿por qué es importante utilizar un sistema de control de versiones?
Un software de control de versiones (VCS) es una valiosa herramienta con numerosos beneficios para un flujo de trabajo de equipos de software de colaboración. Cualquier proyecto de software que tiene más de un desarrollador manteniendo archivos de código fuente debe usar un VCS. Además, los proyectos mantenidos por una sola persona se beneficiarán enormemente de su uso. Se puede decir que no hay una razón válida para privarse del uso de un VCS en cualquier proyecto moderno de desarrollo de software.
Características fundamentales
Resolución de conflictos
Es muy probable que los miembros del equipo tengan la necesidad de realizar cambios en el mismo archivo de código fuente al mismo tiempo. Un VCS monitoriza y ayuda a poder resolver los conflictos entre varios desarrolladores.
Revertir y deshacer los cambios en el código fuente
Al empezar a monitorizar un sistema de archivos de códigos fuente, existe la posibilidad de revertir y deshacer rápidamente a una versión estable conocida.
Copia de seguridad externa del código fuente
Se debe crear una instancia remota del VCS que se puede alojar de forma externa con un tercero de confianza y con ello, se conservará una copia del código fuente.

Versionado de código
¿Qué son las herramientas para el versionado de código?
¿Cuáles son las diferencias en las herramientas de versionado de código
Subversion (SVN) y GIT?
Explique que es un workflow o branching model
Explique en que consiste las técnica de code review / pull request
Este comando se emplea para extraer y descargar contenido desde un repositorio remoto y actualizar al instante el proyecto local para reflejar ese contenido.
Básicamente, git fetch y git merge al mismo tiempo.


Sobre el proyecto anteriormente creado:
Inicializar un repositorio Git
Determinar tipos de archivos o directorios que convienen no ser versionados (según el tipo de aplicación y lenguaje) e incluirlo .gitignore.
realizar un commit inicial con la estructura inicial del proyecto
crear la rama develop y sobre ella crear la clase User (con atributos email y password y sus respectivos getters y setters) en package ar.edu.unnoba.poo.2021.model.
realizar un nuevo commit para incluir esta modificaciones.
cambiar al branch master
realizar un merge con la rama develop
crear un tag especificando la version 0.1

