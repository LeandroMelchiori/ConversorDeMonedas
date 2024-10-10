package com.aluracursos.conversordemonedas.models;

public class CurrencyMapper {
    // Función para mapear las opciones del menú con los códigos de moneda
    public static String getCurrencyFromOption(int option) {
        switch (option) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "ARS";
            case 4:
                return "GBP";
            case 5:
                return "JPY";
            case 6:
                return "AUD";
            case 7:
                return "CAD";
            case 8:
                return "CNY";
            case 9:
                return "BRL";
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }
}
