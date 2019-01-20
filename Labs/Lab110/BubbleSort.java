import java.util.*;
class BubbleSort { 
    void bubbleSort() { 
        int arr[] = new int[10];
        for(int y = 0; y>=10 ; y++){
            int num = (int) (Math.random()*10 + 1);
            arr[y] = num;
        }
        
        int length = arr.length; 
        for (int x = 0; x < length-1; x++) {
            for (int i = 0; i < length-x-1; i++) {
                if (arr[i] > arr[i+1]){ 
                    int temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                }
            }
        }
    } 
}