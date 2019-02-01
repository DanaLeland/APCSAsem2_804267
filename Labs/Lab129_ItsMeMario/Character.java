public class Character
{
    public static String allString;
    public static void setCatchphrase(String catchphrase){
        allString = catchphrase;
    }
    public String getCatchphrase(){
        return(allString);
    }
    public static int allSpeed;
    public static void setSpeed(int speed){
        allSpeed = speed;
    }
    public int getSpeed(){
        return (allSpeed * 2);
    }
}
