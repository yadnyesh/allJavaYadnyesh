package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("GOOL", 118.15, 20));
        stockList.add(new Stock("FCBK", 120.00, 15));
        stockList.add(new Stock("WMT", 99.12, 13));
        stockList.add(new Stock("TGT", 82.77, 22));
        stockList.add(new Stock("IBM", 235.2, 34));
        stockList.add(new Stock("AAPL", 443.5, 62));
        stockList.add(new Stock("GEH", 112.3, 11));
        stockList.add(new Stock("AMZN", 93.1, 8));
        stockList.add(new Stock("MSFT", 73.2, 91));

        StockFilters.bySymbol(stockList, "AAPL").forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        StockFilters.byPriceAbove(stockList, 80.00).forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        System.out.println(StockFilters.filter(stockList, s -> s.getPrice() > 80.00));
     }
}
