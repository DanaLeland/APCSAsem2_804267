import java.util.*;
public class Num5{
    public int[][] flipDiagonal(int[][]Mat){
        int row = 0; int col = 0; int[][]temp = new int [Mat.length][Mat.length];
        for(int r = 0; r < Mat.length; r++){
            for(int c = 0; c < Mat.length; c++){
                row = Mat.length - r;
                col = Mat.length - c;
                Mat[r][c] = temp[row][col];
            }
        }
        return temp;
    }
}
