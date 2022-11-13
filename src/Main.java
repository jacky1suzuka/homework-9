import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        int sumPayments = 0;
        for (int i = 0; i < arr.length; i++) {
            sumPayments = sumPayments + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumPayments + " рублей.");

        // Задание 2
        int maxPayment = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPayment){
                maxPayment = arr[i];
            }
        }

        int minPayment = maxPayment;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPayment){
                minPayment = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей.");

        // Задание 3
        double sumPaymentsDouble = sumPayments;
        double avgPayments = sumPaymentsDouble / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgPayments + " рублей.");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}