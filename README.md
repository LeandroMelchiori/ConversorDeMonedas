# 💱 Conversor de Monedas

Este proyecto es una aplicación de consola en Java que permite realizar conversiones entre distintas monedas usando la API [ExchangeRate-API](https://www.exchangerate-api.com/). El usuario puede seleccionar las monedas base y objetivo, así como ingresar el monto que desea convertir.

## 🌎 **Características principales:**  

✅ Conversión de divisas en tiempo real.  
✅ Consumo de una **API REST** para obtener tasas de cambio actualizadas.  
✅ Interfaz interactiva en **consola** para una experiencia sencilla.  
✅ Implementación de **manejo de excepciones** para evitar errores inesperados.

## 📌 Estructura del Proyecto

El proyecto está dividido en varias clases:

- **Principal**: Clase principal que controla el flujo del programa, muestra el menú y maneja la entrada del usuario.
- **Menu**: Clase que muestra las monedas disponibles para la conversión.
- **CurrencyConverter**: Clase que realiza las solicitudes HTTP a la API para obtener las tasas de cambio.
- **CurrencyMapper**: Clase que mapea las opciones del menú con los códigos de moneda correspondientes.

## 🛠️ Requisitos

- **Java 17** o superior.
- Dependencias:
  - Biblioteca `gson` para manejar el formato JSON.

## 📦 Instalación y Configuración

🔹 1. Clona este repositorio:

   ```bash
   git clone https://github.com/usuario/conversor-de-monedas.git
```
🔹 2. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, etc.).

🔹 3. Asegúrate de tener la dependencia de `gson` en tu proyecto. Si estás usando Maven, agrega la siguiente dependencia en tu archivo `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.8</version>
   </dependency>
```
🔹 4. Obtén una clave API gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/) y colócala en el archivo `CurrencyConverter.java` reemplazando `YOUR_API_KEY`:

   ```java
   private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/";
```
## 🎮 Cómo usar la aplicación

1️⃣ Ejecuta la clase `Principal` para iniciar el programa.

2️⃣ El menú mostrará una lista de monedas disponibles. Debes ingresar el número correspondiente a la moneda base y a la moneda objetivo.

3️⃣ Ingresa el monto que deseas convertir.

4️⃣ El programa mostrará el resultado de la conversión usando las tasas de cambio actuales.


### 📌 Ejemplo de uso:

```java
===== Conversor de Monedas =====
Monedas disponibles:
1. USD (Dólar estadounidense)
2. EUR (Euro)
3. ARS (Peso argentino)
4. GBP (Libra esterlina)
5. JPY (Yen japonés)
6. AUD (Dólar australiano)
7. CAD (Dólar canadiense)
8. CNY (Yuan chino)
9. BRL (Real brasileño)
Elige dos monedas para cotizar.
Ingresa el número de la moneda base: 1
Ingresa el número de la moneda objetivo: 2
Ingresa el monto a convertir: 100
100.0 USD son equivalentes a 91.35 EUR
¿Deseas realizar otra conversión? (1: Sí, 3: No): 3
Saliendo...


