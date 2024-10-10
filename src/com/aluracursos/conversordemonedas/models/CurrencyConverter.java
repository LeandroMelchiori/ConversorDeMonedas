package com.aluracursos.conversordemonedas.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/96a10f2ed5a6e542d28d2179/latest/";
    // Función para obtener la tasa de cambio entre dos monedas
    public static double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        // Usar el código proporcionado por la API para hacer la solicitud
        String url_str = API_URL + baseCurrency;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convertir la respuesta a JSON usando el fragmento proporcionado
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Verificar si la solicitud fue exitosa
        String req_result = jsonobj.get("result").getAsString();
        if (!req_result.equals("success")) {
            throw new Exception("Error en la respuesta de la API: " + req_result);
        }

        // Obtener las tasas de conversión
        JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

        // Devolver la tasa de cambio entre baseCurrency y targetCurrency
        return conversionRates.get(targetCurrency).getAsDouble();
    }
}
