import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numher: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
    }
    static long fibo(int n){
        return (long)((Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}