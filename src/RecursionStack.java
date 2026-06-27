public class RecursionStack {
    public static void main(String[] args) {
        ascendingOrder(5);
        System.out.println();
        descendingOrder(5);
    }
    static void descendingOrder(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        descendingOrder(n-1);
    }
    static void ascendingOrder(int n){
        if(n==0){
            return;
        }
        ascendingOrder(n-1);
        System.out.println(n);
    }
}
