import java.util.*;
public class selectionSort
{
    public static void main(){
        int sort = 0;
        Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int smallest = 0;
        for(int num = 0; num<10; num++){
            nums.add(rand.nextInt(10));
        }
        for(int i = 0; i < nums.size() - 1; i++){
            for(int x = i + 1; x< nums.size(); x++){
                if(nums.get(i)<=smallest){
                    smallest = nums.get(i);
                }
                if(smallest != nums.get(i)){
                    int temp = nums.get(i);
                    nums.set(i, nums.get(smallest));
                    nums.set(smallest, temp);
                }
                sort++;
            }
        }
        long end = System.nanoTime();
        System.out.println("Sorted " + sort + " times");
        System.out.println("Took " + end + " nano-seconds");
    }
}
