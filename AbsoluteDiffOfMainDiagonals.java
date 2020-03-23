import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author deltaC
 * 
 * Program to compute the absolute difference between the main diagonals of a square matrix
 *
 */
public class AbsoluteDiffOfMainDiagonals {


    /**
     * @param arr
     * @return the ablsolute difference between the diagonals of a matrix
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
    
    return Math.abs(sumP(arr)-sumS(arr));

    }

    /**Method to calculate the sum of the secondry difference
     * 
     * @param ary
     * @return sum of the diagonal
     */
    public static int sumS(List<List<Integer>> ary){

    int sum = 0;

    for(int r = 0;r < ary.size();r++){
        for(int c = 0;c<ary.size();c++){

            if((r+c)==(ary.size()-1)){
                
                List<Integer> items = ary.get(r);
                sum += items.get(c);
            }
        }
    }
    return sum;
}
   /**
    * Mathod to compute sum of the main diagonal
 * @param ary
 * @return sum of diagonal
 */
public static int sumP(List<List<Integer>> ary){

          int sum = 0;

        for(int r = 0;r<ary.size();r++){

           for(int c = 0;c<ary.size();c++){

              if(r==c){
                List<Integer> items = ary.get(r);
                sum += items.get(c);
            }
        }
        
    }
    return sum;
    }

}