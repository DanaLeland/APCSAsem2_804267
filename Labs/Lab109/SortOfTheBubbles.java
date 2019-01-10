import java.util.*;
public class SortOfTheBubbles
{
    public static void main(){
        int[] specialArray = new int[10];
        for(int num = 0; num<10; num++){
            specialArray[num] = (int) (Math.random()*10) + 1;
        }
        boolean sorted = false;
        if (sorted = false){
            for(int val = 0; val<=10; val++){
                for(int val2 = 0; val2<=val; val2++){
                    if(specialArray[val]>specialArray[val2]){
                        int myDude = specialArray[val]; 
                        specialArray[val2] = specialArray[val]; //THE OLD SWITCHEROO
                        specialArray[val2] = myDude;
                    }
                }
            }
            sorted = true;
        }
    } 
}
