package ru.netology.services;

public class StatCalcService {
    public long calcTotal(long[] sales) {
        long total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        return total;
    }

    public long calcAverage(long[] sales) {
        long total = calcTotal(sales);

        return (total/sales.length);
    }

    public int minSales(long[] sales) { // Я поленился...
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { 
        int maxMonth = 0; 

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { 
                maxMonth = i; 
            }
        }

        return maxMonth + 1; 
    }

    public long calcStonks(long[] sales) {
        long average = calcAverage(sales);
        long months = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months++;
            }
        }

        return months;
    }

    public long calcUnstonks(long[] sales) {
        long average = calcAverage(sales);
        long months = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                months++;
            }
        }

        return months;
    }
}
