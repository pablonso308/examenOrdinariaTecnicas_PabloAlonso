package org.example;



import java.util.HashMap;
import java.util.Map;

public class GlamourFinancialImplementation implements GlamourFinancial {
    // Variables de instancia para mantener la cotización de las acciones en diferentes mercados financieros
    private Map<String, Double> stockPrices; // Almacena precios de acciones por mercado
    private double bookValue; // Valor en libros de la empresa

    // Constructor
    public GlamourFinancialImplementation(double initialBookValue) {
        this.stockPrices = new HashMap<>();
        this.bookValue = initialBookValue;
    }

    // Métodos para obtener y actualizar la cotización de las acciones en cada mercado
    @Override
    public double getStockPrice(String market) {
        return stockPrices.getOrDefault(market, 0.0);
    }

    @Override
    public void updateStockPrice(String market, double price) {
        stockPrices.put(market, price);
    }

    // Método para calcular el valor de mercado (Market Value)
    @Override
    public double calculateMarketValue() {
        double totalMarketValue = 0.0;
        for (double price : stockPrices.values()) {
            totalMarketValue += price;
        }
        return totalMarketValue;
    }

    // Método para calcular el precio-valor en libros (Price-to-Book Value)
    @Override
    public double calculatePriceToBookValue() {
        double marketValue = calculateMarketValue();
        return marketValue / bookValue;
    }

    // Métodos adicionales que pueden ser necesarios
    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }

    public double getBookValue() {
        return bookValue;
    }
}
