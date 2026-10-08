import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String s = in.nextLine();

        int count = 0;
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            
            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
            i++;
        }

        System.out.println("Всього речень: " + count);
    }
}