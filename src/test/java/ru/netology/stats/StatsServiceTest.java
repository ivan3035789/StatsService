package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @org.junit.jupiter.api.Test
    void showsTheTotalSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(sales);
        assertEquals(expected, actual);
        System.out.println("Сумма всех продаж :___________________________________________" + actual);
    }

    @org.junit.jupiter.api.Test
    void showsTheAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmountPerMonth(sales);
        assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц :_________________________________" + actual);
    }

    @org.junit.jupiter.api.Test
    void NumberTheMonthInWhichTheSalesPeakOccurred() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
        System.out.println("Номер месяца, в котором был пик продаж :________________________" + actual);
    }

    @org.junit.jupiter.api.Test
    void NumberTheMonthInWhichThereWasAMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
        System.out.println("Номер месяца, в котором был минимум продаж :____________________" + actual);

    }

    @org.junit.jupiter.api.Test
    void NumberMonthsInWhichSalesWereBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numMonthsAboveAverageSales(sales);
        assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего :______" + actual);
    }

    @org.junit.jupiter.api.Test
    void NumberMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.numMonthSalesBelowAverage(sales);
        assertEquals(expected, actual);
        System.out.println("Количествово месяцев, в которых продажи были выше среднего :____" + actual);


    }
}