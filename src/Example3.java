



import java.util.Scanner;


public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите лимит чисел Фибоначчи");
        int x = scanner.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0+ " "+ n1 + " ");
        for (int i=3; i<=x; i++){
            n2 = n0+n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();

    }
}
