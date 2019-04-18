import java.util.*;
public class Digits{
    private ArrayList<Integer> digitList;
    
    public Digits (int num){
        
        if(num==0){
            digitList.add(new Integer(0));
        }
        else if (num>=0){
            digitList.add(0, new Integer(num%10));
            num/=10;
        }
        
    }
    
    public boolean isStrictlyIncreasing(){
        for(int i =0; i < digitList.size(); i++){
            if(digitList.get(i-1).compareTo(digitList.get(i))>=0){
                return false;
            }
        }
        return true;
    }
}
