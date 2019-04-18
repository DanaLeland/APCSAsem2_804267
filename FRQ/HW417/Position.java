public class Position{

    public static Position findPosition(int num, int [][] intArr){

        for(int r=0;r<intArr.length;r++){
            for(int c=0;c<intArr[0].length;c++){
                if(intArr[r][c] == num){
                    return new Position(r,c); //gives an error, says can't be int & int, but that's legit what the peramters are, idk what else to do
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr){
        Position[][] followingNums = new Position[intArr.length][intArr[0].length];
        for(int r=0;r<intArr.length;r++){
            for(int c=0;c<intArr[intArr.length].length;c++){
                followingNums[r][c] = findPosition(intArr[r][c] - 1, intArr);
            }
        }
        return followingNums;
    }
}
