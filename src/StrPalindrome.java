public class StrPalindrome {
    public static void main(String[] args) {
        String name = "abcdba";
        if(isPalindrome(name)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
