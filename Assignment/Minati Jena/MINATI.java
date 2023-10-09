import java.util.Scanner;

public class MINATI {
    public static void main(String[] args) {
        System.out.println("welcome to minati you read java");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s);
        int d = sc.nextInt();
        System.out.println(d);
        int e = s + d;
        System.out.println(e);
        sc.close();
    }
}