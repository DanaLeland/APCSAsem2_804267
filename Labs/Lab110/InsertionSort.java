public class InsertionSort{
    void IntsersectionSort(){ 
        int arr[] = new int[10];
        for(int y = 0; y>=10 ; y++){
            int num = (int) (Math.random()*10 + 1);
            arr[y] = num;
        }
        
        int length = arr.length; 
        for (int i=1; i<length; ++i){ 
            int current = arr[i]; 
            int x = i-1; 
            while (x>=0 && arr[x] > current){ 
                arr[x+1] = arr[x]; 
                x = x-1; 
            } 
            arr[x+1] = current; 
        } 
    } 
}
