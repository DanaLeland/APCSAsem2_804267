import java.util.*;
public class Five{
    int[][] publicMatrix;
    int[][] occupier;
    int[][] entry;
    ArrayList<Boolean> boolish = new ArrayList<>();
    public void Five(int [][] matrix){
        publicMatrix = matrix;
        
    }
    public void loadOccupied(){
        boolean occupied;
        double percent = publicMatrix.length/3;
        int temp;
        int setter;
        for(int i = 0; i<percent; i++){
            temp = i;
            i = (int) Math.random()*publicMatrix.length + 1;
            entry = ((ArrayList)publicMatrix.get(i)).get(i);
            boolish.get(entry).set(0, false);
            i = temp;
        }
    }
    public void loadNeighbors(){
        int[][]theReturner;
        for(int i = 0; i<occupier.length; i++){
            if(boolish.get(i) == true){
                theReturner.set(publicMatrix.get(i).get(i));
            }
        }
        System.out.print(theReturner);
    }
}
