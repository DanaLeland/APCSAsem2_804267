import java.util. *;
public class Num3{
    public String findFirstRepeating(String letters){
        boolean placent = false;
        int place = 0;
        String one = letters.substring(place);
        String found = null;
        while(placent = false){
            if(letters.indexOf(one) >= 2){
                found = letters.substring(place);
                placent = true;
            }
            else{
                place++;
            }
        }
        return found;
    }
}
