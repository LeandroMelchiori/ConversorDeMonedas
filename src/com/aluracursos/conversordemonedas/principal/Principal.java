package com.aluracursos.conversordemonedas.principal;
import java.util.Scanner;
import com.aluracursos.conversordemonedas.models.Menu;
import com.aluracursos.conversordemonedas.models.CurrencyConverter;
import com.aluracursos.conversordemonedas.models.CurrencyMapper;  // Importar la nueva clase

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();  // Crear una instancia de la clase Menu
        int option = 0;

        while (option != 3) {  // Cambiar para que 3 sea la opción de salir
            // Mostrar el menú
            menu.showMenu();

            // Permitir al usuario elegir las monedas
            System.out.print("Ingresa el número de la moneda base: ");
            int baseOption = scanner.nextInt();
            String baseCurrency = CurrencyMapper.getCurrencyFromOption(baseOption);  // Usar la clase CurrencyMapper

            System.out.print("Ingresa el número de la moneda objetivo: ");
            int targetOption = scanner.nextInt();
            String targetCurrency = CurrencyMapper.getCurrencyFromOption(targetOption);  // Usar la clase CurrencyMapper

            // Pedir monto a convertir
            System.out.print("Ingresa el monto a convertir: ");
            double amount = scanner.nextDouble();

            // Realizar la conversión
            try {
                double exchangeRate = CurrencyConverter.getExchangeRate(baseCurrency, targetCurrency);
                double convertedAmount = amount * exchangeRate;
                System.out.println(amount + " " + baseCurrency + " son equivalentes a " + convertedAmount + " " + targetCurrency);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Preguntar si desea hacer otra conversión o salir
            System.out.print("¿Deseas realizar otra conversión? (1: Sí, 3: No): ");
            option = scanner.nextInt();
        }

        System.out.println("Saliendo...");
        scanner.close();
    }
}
