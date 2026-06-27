import java.util.Scanner;

public class fiboWithFormule {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter numher: ");
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(fibo(i));
            }
        }
        static int fibo(int n){
            return (int)(((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
        }
    }
