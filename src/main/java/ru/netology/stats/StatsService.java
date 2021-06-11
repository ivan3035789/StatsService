package ru.netology.stats;

public class StatsService {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmountPerMonth(long[] sales) {
        long average = salesAmount(sales) / sales.length;
        return average;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        maxMonth += 1;
        return maxMonth;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        minMonth += 1;
        return minMonth;
    }


    public long numMonthsAboveAverageSales(long[] sales) {
        long average = averageAmountPerMonth(sales);
        long numberOfSales = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberOfSales += 1;
            }
        }
        return numberOfSales;
    }


    public long numMonthSalesBelowAverage(long[] sales) {
        long average = averageAmountPerMonth(sales);
        long numberOfSales = 0;
        for (long sale : sales) {
            if (sale >= average) {
                numberOfSales += 1;
            }
        }
        return numberOfSales;

    }
}

