import java.lang.reflect.Array;
import java.util.*;
public class Num4{
    public ArrayList<Integer> findIntersection(int[]a1, int[]a2, int[]a3){
        int scorn = 0;
        ArrayList<Integer> scrond = new ArrayList<Integer>();
        boolean fornd = false;
        while(fornd = false){
            int first = (int)Array.get(a1, scorn);
            int second = (int)Array.get(a2, scorn);
            int third = (int)Array.get(a3, scorn);
            if(first == second && first == third && second == third){
                scrond.add((Integer)Array.get(a1, scorn));
                fornd = true;
            }
            else{
                scorn++;
            }
        }
        return scrond;
    }
}
