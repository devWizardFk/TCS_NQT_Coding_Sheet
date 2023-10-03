package TCS_NQT_Coding_Sheet.Number_System;

public class IntegerToWords {
    public static String intToWords(int num) {
        String[] ones = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ", "ten ","eleven ",
                    "twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
        String[] tens = {"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
        String ans = "";
        if(num/1000 != 0) 
            ans += ones[num/1000] + "thousand ";
        if((num/100)%10 != 0)
            ans += ones[(num/100)%10] + "hundred ";
        num %= 100;
        if(num > 19) 
            ans += tens[num/10] + ones[num%10];
        else 
            ans += ones[num];
        return ans;
    }
    public static void main(String[] args) {
        int num = 1020;
        System.out.println(intToWords(num));
    }
}

