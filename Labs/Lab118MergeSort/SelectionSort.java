import java.util.*;
public class SelectionSort{
    void SelectionSort(){
        int arr[] = new int[10];
        for(int y = 0; y>=10 ; y++){
            int num = (int) (Math.random()*10 + 1);
            arr[y] = num;
        }
        
        int length = arr.length; 
        for (int i = 0; i < length-1; i++){  
            int lowest = i; 
            for (int x = i+1; x < length; x++){
                if (arr[x] < arr[lowest]){ 
                    lowest = x; 
                }
                } 
            int temp = arr[lowest]; 
            arr[lowest] = arr[i]; 
            arr[i] = temp; 
        }
    }
}
