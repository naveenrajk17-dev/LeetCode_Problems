public class Palindrome_Number_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11221));
    }
    public static boolean isPalindrome(int x){
        int original = x;
        if(x<0){
            return false;
        }
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;
        }
        if(original==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
