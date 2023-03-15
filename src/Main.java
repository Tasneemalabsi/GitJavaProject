import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.println(addTwotoTheNumber(inputNumber));

    }
    public static int addTwotoTheNumber(int n){
        return n+2;
    }

}