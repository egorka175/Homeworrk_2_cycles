import java.util.Scanner;

public class Homework2_8_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = s.nextInt();
        int b = 0;
        int c =0;

        for (int l = 1; l < a; l++)
             {
                b+=l;


            }

c=b+a;

        System.out.println("Результат: " + c);
    }
}


