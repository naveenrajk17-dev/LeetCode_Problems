import java.util.HashMap;

public class Roman_to_Integer_13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result -= hm.get(s.charAt(i));
            } else {
                result += hm.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {

        // Test cases
        String roman1 = "III";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";

        System.out.println("Roman: " + roman1 + " -> Integer: " + romanToInt(roman1));
        System.out.println("Roman: " + roman2 + " -> Integer: " + romanToInt(roman2));
        System.out.println("Roman: " + roman3 + " -> Integer: " + romanToInt(roman3));
    }

}
