import java.util.*;
public class SelectionSort{
    public static void main(){
        Random rand = new Random();
        ArrayList<Integer> specialArray = new ArrayList<Integer>();
        for(int num = 0; num<10; num++){
            specialArray.add(rand.nextInt(10));
        }
        for(int i = 0; i < specialArray.size()-1; i ++){
            for(int j = i+1; j<= specialArray.size(); j++){
                if(specialArray.get(i) > specialArray.get(j)){
                    j = i;
                }
                int temp = specialArray.get(j);
                specialArray.get(j) = specialArray.get(i);
                specialArray.get(i) = temp;
            }
        }
        long start = System.nanoTime();
        long end = System.nanoTime();
        long duration = (end-start);
        System.out.println("Sorting took " + duration + " nano-seconds");
    }
}
