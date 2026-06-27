public class ReverseNumberRecursion {
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(ans);
        System.out.println();
        System.out.println(reverse2(1234));
    }
    static int ans = 0;
    static void reverse(int n){
        int rem = 0;
        if(n==0){
            return;
        }
        rem = n%10;
        n = n/10;
        ans = (ans*10)+rem;
        reverse(n);

    }
    static int count(int n){
        int c = 0;
        while(n!=0){
            n = n/10;
            c++;
        }
        return c;
    }
    static int reverse2(int n){
        int c = count(n);
        int rem = 0;
        if(n==1){
            return 1;
        }
        rem = n%10;
        n = n/10;
        rem = (int) (rem*(Math.pow(10,c-1)));
        return rem + reverse2(n);
    }
}
