package SumDigPower;

import java.util.List;
import java.util.ArrayList;

class SumDigPower {
    public static void main(String[] args) {
        System.out.println(sumDigPow(10,150));
    }

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> result = new ArrayList<>();
        for(long i=a;i<=b;i++){
            long sumDig=i;
            if(isEqual(sumDig,i)){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isEqual(long a, long b) {
        long number = investNumber(a);
        long sumDig=0;
        int count = 1;
        while(number!=0){
            sumDig+=Math.pow(number%10,count);
            number/=10;
            count++;
        }
        return sumDig==b;
    }
    public static long investNumber(long number){
        String numberChar = String.valueOf(number);
        String result = "";
        for(int i = numberChar.length()-1;i>=0;i--){
            result = result +numberChar.charAt(i);
        }
        return Long.parseLong(result);
    }
}