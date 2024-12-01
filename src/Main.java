public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int money1 = 0;
        int salary = 15000;
        int month = 1;
        while (money1 < 2459000) {
            money1 = money1 + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money1 + " рублей");
            month = month + 1;
        }

        System.out.println("Задача 2");
        int start = 0;
        while (start < 10) {
            start++;
            System.out.print(start + " ");

        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = (population / 1000) * 17;
        int death = (population / 1000) * 8;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRate - death;
            System.out.println("Год " + i + " ,численность населения составляет " + population);
        }
        System.out.println("Задача 4");

        int firstSum = 15000;
        int lastSum = 12_000_000;
        int countMonth = 0;

        while (firstSum <= lastSum) {
            firstSum = (int) (firstSum + firstSum * 0.07);
            countMonth++;
            System.out.println("За " + countMonth + " месяц сумма накоплений состаляет " + firstSum);

        }
        System.out.println("Задача 5");

        int firstSum1 = 15000;
        int lastSum1 = 12_000_000;
        int countMonth1 = 5;

        while (firstSum1 <= lastSum1) {
            firstSum1 = (int) (firstSum1 + firstSum1 * 0.07);
            countMonth1++;
            if (countMonth1 % 6 == 0) {
                System.out.println("За " + countMonth1 + " месяц сумма накоплений состаляет " + firstSum1);

            }
            System.out.println("Задача 6");

            int firstSum2 = 15000;
            int lastSum2 = 12_000_000;
            int countMonth2 = 0;
            int months = 12 * 9;

            while (countMonth2 <= months) {
                firstSum2 = (int) (firstSum2 + firstSum2 * 0.07);
                countMonth2++;
                if (countMonth2 % 6 == 0) {
                    System.out.println("За " + countMonth2 + " месяц сумма накоплений состаляет " + firstSum2);
                }
            }

            System.out.println("Задача 7");
            int firstFriday = 6;
            for (int day = firstFriday; day <= 31; day += 7) {
                System.out.println("Сегодня пятница " + day + "ое число. Необходимо подготовить отчет.");
            }

            System.out.println("Задача 8");
            int spanKamets = 79;
            int startDate = 200;
            int finalDate = 100;
            int currentYear = 2023;
            int pastBecentenary = currentYear - startDate;
            for (int year1 = 0; year1 <= currentYear + finalDate; year1 = year1 + spanKamets) {
                if (year1 >= pastBecentenary) {
                    System.out.println(year1);
                    if (year1 > currentYear) {
                        break;
                    }
                }
            }
        }
    }
}




