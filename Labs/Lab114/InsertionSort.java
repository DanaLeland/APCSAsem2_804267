public class InsertionSort{
    public static void main(){
       int[] array = new int[10];
       for(int num = 0; num<10; num++){
            array[num] = (int) (Math.random()*10) + 1;
        }
       for(int i = (array.length-1); i>=0; i--){
           for(int x = 1; x <= i; x++){
               if(array[x-1]>array[x]){
                   array[x-1] = array[x];
                   int y = array[x-1];
                   array[x] = y;
                }
            }
        }
        long start = System.nanoTime();
        long end = System.nanoTime();
        long duration = (end - start);
        System.out.println("Sorting took " + duration + " nano-seconds");
    } 
}
