import java.util.List;
import java.util.*;

public class ClimbingClub{
    private List<ClimbInfo> climbList;
    
    public ClimbingClub(){}
    public void addClimb(String peakName, int climbTime){
        for(int i = 0; i <= climbList.size()-1; i++){
            if(peakName.compareTo(ClimbInfo.climbName.get(i))<=0){
                ClimbInfo.climbName.add(peakName);
                ClimbInfo.peakTime.add(climbTime);
                return;
            }
        }
        ClimbInfo.climbName.add(peakName);
        ClimbInfo.peakTime.add(climbTime);
    }
    public int distinctPeakNames(){
        if(ClimbInfo.climbName.size() == 0 || ClimbInfo.peakTime.size() == 0){
            return 0;
        }
        int x = ClimbInfo.peakTime.get(0);
        String y = ClimbInfo.climbName.get(0);
        
        ClimbInfo currInfo = (y, x);
        String pervName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for(int k = 1; k <= climbList.size()-1; k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if(pervName.compareTo(currName) != 0){
                numNames++;
                pervName = currName;
            }
        }
        return numNames;
        
    }
    //NO, YES
}
