import java.util.*;
public class SelectionOfTheSort{
    public static void main(){
        int[] specialArray = new int[10];
        for(int num = 0; num<10; num++){
            specialArray[num] = (int) (Math.random()*10) + 1;
        }
        for(int i = 0; i < specialArray.length; i ++){
            for(int j = 0; j<= i; j++){
                if(specialArray[i] > j){
                    specialArray[i] = j;
            }
            }
        }
       
    }

}
