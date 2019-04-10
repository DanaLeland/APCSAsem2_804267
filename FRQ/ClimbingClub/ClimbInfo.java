import java.util.ArrayList;
public class ClimbInfo
{
    private String returnPeakName;
    private int returnClimbTime;
    public static ArrayList<String> climbName = new ArrayList<String>();
    public static ArrayList<Integer> peakTime = new ArrayList<Integer>();
    
    public ClimbInfo(String peakName, int climbTime){
        climbName.add(peakName);
        peakTime.add(climbTime);
        returnPeakName = peakName;
        returnClimbTime = climbTime;
    }
    public String getName(){
        return returnPeakName;
    }
    public int getTime(){
        return returnClimbTime;
    }
}
