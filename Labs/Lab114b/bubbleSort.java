import java.util.*;
public class bubbleSort{
    public static void main(){
        //long start = System.nanoTime();
        int count = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int x = 0; x < 10; x++){
            int num = (int) (Math.random()*10 + 1);
            nums.add(num);
        }
        
        for(int i = 0 ; i < nums.size(); i++){
            for(int j = 1 ; j < nums.size(); j++){
            if(nums.get(i)>(nums.get(j))){
                int temp = nums.get(j);
                nums.set(j, i);
                nums.set(i, temp);
                count++;
            }
        }
        }
        long end = System.nanoTime();
        System.out.println("Sorted " + count + " times");
        System.out.println("Took " + end + " nano-seconds");
    }
}
