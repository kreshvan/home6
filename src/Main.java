public class Main {
    public static void main(String[] args) {
//задание 1
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
//задание 2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
//задание 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
//задание 4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
//задание 5
        for (int i = 1994; i >= 1994 && i <= 2096; i = i + 4) {
            System.out.println(i + " " + "год является високосным");
        }
//задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
//задание 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
//задание 8  salary - зарплата, totalSalary - общая зарплата.
        int salary = 29000;
        int totalSalary = 0;
        for (int i = 0; i < 12; i = i + 1) {
            totalSalary = totalSalary + salary;
            System.out.println("Месяц" + i + " " + "сумма накоплений равна" + " " + totalSalary);
        }
//задание 9
        int salary1 = 29000;
        int totalSalary1 = 0;// так как изначально ничего не зарабатывает
        for (int i = 0; i < 12 ; i = i + 1) {
            totalSalary1 = totalSalary1 + salary1;
            totalSalary1 = totalSalary1 + salary1 / 100;
            totalSalary1+= totalSalary1/100;

            System.out.println("Месяц" + i + " " + "сумма накоплений равна" + " " + totalSalary1);
        }
//задание 10
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i + "=" + i * 2);
        }

    }
}


