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
        int depositOne = 15000;
        float percent = 0.07f;
        int total = 0;
        for (int i = 1; i <= 79; i++) {
            {
                System.out.println("Месяц " + i + " ,сумма составляет " + total1);
            }
        }
    }
}