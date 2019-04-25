import java.util.*;
public class Num1{
    public Integer findMissing(ArrayList<Integer> arr1){
        ArrayList<Integer> missing = new ArrayList<Integer>();
        Collections.sort(arr1);
        for(int i = 0; i <= arr1.size(); i++){
            if(arr1.get(i) -2 == arr1.get(i--)){
                missing.add(arr1.get(i));
            }
        }
        return missing.get(1);
    }
}
