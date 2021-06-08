package ru.netology.stats;

public class StatsService {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

//______________________________________________________________________________________________________________________

    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        System.out.println("Сумма всех продаж :___________________________________________" + sum);
        return sum;
    }
//______________________________________________________________________________________________________________________

    public long averageAmountPerMonth(long[] sales) {
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        System.out.println("Средняя сумма продаж в месяц :_________________________________" + average);
        return average;
    }
//______________________________________________________________________________________________________________________

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        int maxMonth2 = 0;
        int month2 = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
                month += 1;
            }
            if (sale <= sales[maxMonth]) {
                maxMonth2 = month2;
                month2 += 1;
            }
            maxMonth2 += 1;
        }
        System.out.println("Номер месяца, в котором был пик продаж :________________________" + maxMonth2);
        return maxMonth2;
    }
//______________________________________________________________________________________________________________________

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
        System.out.println("Номер месяца, в котором был минимум продаж :____________________" + minMonth);
        return minMonth;
    }
//______________________________________________________________________________________________________________________

    public long numMonthsAboveAverageSales(long[] sales) {
        long sum = 0;
        long average = 0;
        long numberOfSales = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        for (long sale : sales) {
            if (sale < average) {
                numberOfSales += 1;
            }
        }
        System.out.println("Количество месяцев, в которых продажи были ниже среднего :______" + numberOfSales);
        return numberOfSales;

    }
//______________________________________________________________________________________________________________________

    public long numMonthSalesBelowAverage(long[] sales) {
        long sum = 0;
        long average = 0;
        long numberOfSales = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        for (long sale : sales) {
            if (sale >= average) {
                numberOfSales += 1;
            }
        }
        System.out.println("Количествово месяцев, в которых продажи были выше среднего :____" + numberOfSales);
        return numberOfSales;

    }
}
