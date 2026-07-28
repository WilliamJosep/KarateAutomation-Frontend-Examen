# Frontend Automation - Playwright + Cucumber

## Descripción

Proyecto de automatización de pruebas UI desarrollado con Java, Playwright, Cucumber y Maven siguiendo el patrón Page Object Model (POM).

---

## Tecnologías

- Java 11
- Maven
- Playwright
- Cucumber
- Gherkin
- JUnit
- Page Object Model (POM)

---

## Estructura

src
├── main
│   └── java
│       └── pages
│
├── test
│   ├── java
│   │   ├── hooks
│   │   ├── runners
│   │   └── stepdefinitions
│   │
│   └── resources
│       └── features

---

## Escenarios Automatizados

### Login

- Abrir SauceDemo
- Ingresar usuario
- Ingresar contraseña
- Validar acceso

### Carrito

- Agregar producto
- Validar cantidad del carrito

### Checkout

- Completar compra
- Validar mensaje de confirmación

---

## Ejecutar el proyecto

mvn clean test

---

## Resultado esperado

3 Scenarios
3 Passed
0 Failed