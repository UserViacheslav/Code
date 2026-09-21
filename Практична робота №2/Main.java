import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(
            "Примітивні типи даних:\n" +
            "byte: Займає "+ Byte.SIZE+ " біт, " + " Мінімальне значення: " + Byte.MIN_VALUE + " Максимальне значення: " + Byte.MAX_VALUE +
            "\nshort: Займає "+ Short.SIZE+ " біт, " + " Мінімальне значення: " + Short.MIN_VALUE + " Максимальне значення: " + Short.MAX_VALUE +
            "\nint: Займає "+ Integer.SIZE+ " біт, " + " Мінімальне значення: " + Integer.MIN_VALUE + " Максимальне значення: " + Integer.MAX_VALUE +
            "\nlong: Займає "+ Long.SIZE+ " біт, " + " Мінімальне значення: " + Long.MIN_VALUE + " Максимальне значення: " + Long.MAX_VALUE
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВВЕДЕННЯ ДАНИХ");

        System.out.print("Введіть byte: ");
        byte bytevalue = Byte.parseByte(scanner.nextLine());
        System.out.println("Результат: " + bytevalue);

        System.out.print("Введіть short: ");
        short shortvalue = Short.parseShort(scanner.nextLine());
        System.out.println("Результат: " + shortvalue);

        System.out.print("Введіть int: ");
        int intvalue = Integer.parseInt(scanner.nextLine());
        System.out.println("Результат: " + intvalue);

        System.out.print("Введіть long: ");
        long longvalue = Long.parseLong(scanner.nextLine());
        System.out.println("Результат: " + longvalue);
        scanner.close();
    }
}








