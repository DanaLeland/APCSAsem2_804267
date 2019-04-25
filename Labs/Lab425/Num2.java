import java.util.*;
public class Num2{
    public int findSum(int[] a1, int[] a2, int targ){
        int sum = 0;
        for(int i = 0; i<= a1.length; i++){
            for(int j = 0; j<= a2.length; j++){
                if(i + j == targ || i + j == targ-1 || i + j == targ + 1){
                    sum = i + j;
                }
            }
        }
        return sum;
    }
}
