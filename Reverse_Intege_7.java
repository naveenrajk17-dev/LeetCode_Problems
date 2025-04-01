public class Reverse_Intege_7 {
    public static void main(String[] args) {
        Reverse sol=new Reverse();
        System.out.println(sol.reverse(-123));  // Should output -321
        System.out.println(sol.reverse(120));   // Should output 21
        System.out.println(sol.reverse(1534236469));
    }
}
class Reverse {
    public int reverse(int x) {
        int rev = 0;
        // boolean ans=x<0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
//class Reverse {
//    public int reverse(int x) {
//        int rev = 0;
//        boolean isNegative = x < 0;
//        String str = String.valueOf(Math.abs(x));
//        StringBuilder sb = new StringBuilder(str).reverse();
//
//        try {
//            rev = Integer.parseInt(sb.toString());
//        } catch (NumberFormatException e) {
//            return 0; // Return 0 if reversed number overflows
//        }
//
//        return isNegative ? -rev : rev;
//    }
//}