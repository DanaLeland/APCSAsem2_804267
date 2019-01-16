import java.util.*;
public class insertionSort{
    public static void main(){
        int sort = 0;
        Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int smallest = 0;
        for(int num = 0; num<10; num++){
            nums.add(rand.nextInt(10));
        }
        for(int i = 0; i < nums.size() - 1; i++){
            int num = nums.get(i);
            for(int x = i - 1; x>=0; x--){
                if(num<nums.get(x)){
                    nums.set(x+1, nums.get(x));
                    if(x==0){
                        nums.set(0, num);
                    }
                    else{
                        nums.set(x+1, num);
                    }
                }
                sort++;
            }
        }
        long end = System.nanoTime();
        System.out.println("Sorted " + sort + " times");
        System.out.println("Took " + end + " nano-seconds");
    }
    
}
