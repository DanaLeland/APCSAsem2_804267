import java.util.*;
import java.util.Collections;
public class Four{
    
    public static void sortStrings(ArrayList<String> names){
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
    public void shuffleStrings(ArrayList<String> names){
        Collections.shuffle(names);
    }
    public void insertString(String word){
        
    }
}