# QA Automation - Playwright + Cucumber

## Descripción

Proyecto de automatización de pruebas UI desarrollado con Java, Playwright, Cucumber y Maven, aplicando el patrón **Page Object Model (POM)**.

Se automatizó el flujo principal de compra de SauceDemo.

## Tecnologías

- Java 11
- Maven
- Playwright
- Cucumber
- JUnit
- Gherkin

## Escenarios automatizados

- ✅ Login exitoso
- ✅ Agregar producto al carrito
- ✅ Checkout exitoso

## Ejecutar el proyecto

```bash
mvn clean test
```

## Resultado esperado

```text
Tests run: 3
Failures: 0
Errors: 0
BUILD SUCCESS
```

## Reporte

Después de ejecutar las pruebas se genera el reporte HTML:

```text
target/cucumber-report.html
```

## Autor

William Joseph Quiroz Salazar