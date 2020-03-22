import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){

            long num = in.nextLong();

            calculate(num);

        }
        in.close();
    }
    
    public static void calculate(long num){

        System.out.println(sum(num-1,3)+sum(num-1,5)-sum(num-1,15));

    }
    
    public static long sum(long m,long n) {

        long p =m/n;
        return n*(p*(p+1))/2; 
    }
    
}
