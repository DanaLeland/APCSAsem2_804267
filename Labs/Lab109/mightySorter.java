import java.util.*;
public class mightySorter
{
   public static void main(){
       int[] array = new int[10];
       for(int i = (array.length-1); i>=0; i--){
           for(int x = 1; x <= i; x++){
               if(array[x-1]>array[x]){
                   array[x-1] = array[x];
                   int y = array[x-1];
                   array[x] = y;
                }
            }
        }
    } 
}
