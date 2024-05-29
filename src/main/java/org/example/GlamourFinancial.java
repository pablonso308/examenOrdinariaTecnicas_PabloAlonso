package org.example;

public interface GlamourFinancial {

    // Métodos para obtener y actualizar la cotización de las acciones en diferentes mercados
    double getStockPrice(String market);
    void updateStockPrice(String market, double price);

    // Métodos para calcular indicadores financieros relevantes
    double calculateMarketValue();
    double calculatePriceToBookValue();
}
