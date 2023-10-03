package TCS_NQT_Coding_Sheet.Number_System;

public class BinaryToDecimal {
    public static int binToDec(int n) {
        int mul = 1;
        int ans = 0;
        while(n != 0) {
            int dig = n % 10;
            ans += dig*mul;
            mul *= 2;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 101011;
        System.out.println("("+n+")2 = (" + binToDec(n) +")10");

        //Method-2
        String num = "1011";
        System.out.println(Integer.parseInt(num,2));
    }
}