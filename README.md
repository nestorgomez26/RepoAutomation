# RepoAutomation

Este repositorio contiene un proyecto de automatización de pruebas de QA desarrollado en Java, utilizando Maven para la gestión de dependencias y TestNG como framework de pruebas.

## Descripción del Proyecto

El objetivo de este proyecto es proporcionar un conjunto de pruebas automatizadas para garantizar la calidad de la aplicación bajo prueba. Se utilizan las siguientes tecnologías y herramientas:

* **Java**: Lenguaje de programación principal.
* **Maven**: Herramienta de gestión de dependencias y construcción de proyectos.
* **TestNG**: Framework de pruebas para Java.
* **Selenium WebDriver**: Para la automatización de pruebas de interfaz de usuario (UI).
* **ChromeDriver**: Driver para el navegador Chrome.

## Requisitos Previos

Antes de ejecutar las pruebas, asegúrate de tener instalados los siguientes componentes:

* **Java Development Kit (JDK)**: Versión 8 o superior.
* **Maven**: Versión 3.6 o superior.
* **Navegador Google Chrome**: Para la ejecución de pruebas de UI.
* **ChromeDriver**: Asegúrate de que la versión del ChromeDriver sea compatible con la versión de tu navegador Chrome.

## Configuración del Proyecto

1.  **Clonar el repositorio:**

    ```bash
    git clone [https://github.com/nestorgomez26/RepoAutomation.git](https://www.google.com/search?q=https://github.com/nestorgomez26/RepoAutomation.git)
    ```

2.  **Navegar al directorio del proyecto:**

    ```bash
    cd RepoAutomation
    ```

3.  **Descargar las dependencias del proyecto:**

    ```bash
    mvn clean install
    ```

## Ejecución de las Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando de Maven:

```bash
mvn test
```

Este comando ejecutará todas las pruebas definidas en el proyecto utilizando TestNG.

## Estructura del Proyecto

El proyecto sigue la siguiente estructura de directorios:

```
RepoAutomation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ... (Código fuente de la aplicación)
│   └── test/
│       └── java/
│           └── ... (Clases de prueba)
├── pom.xml (Archivo de configuración de Maven)
└── README.md
```

## Informes de Pruebas

Los informes de pruebas generados por TestNG se encuentran en el directorio `target/surefire-reports`.

## Contribución

Si deseas contribuir a este proyecto, sigue estos pasos:

1.  Haz un fork del repositorio.
2.  Crea una rama para tu contribución: `git checkout -b mi-contribucion`.
3.  Realiza tus cambios y confirma tus commits.
4.  Sube tus cambios a tu fork: `git push origin mi-contribucion`.
5.  Crea un pull request.

## Licencia

Este proyecto está bajo la licencia MIT
