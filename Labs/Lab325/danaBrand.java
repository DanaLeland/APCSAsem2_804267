import java.util.ArrayList;
import java.util.Random;
public class danaBrand implements Insults
{
    ArrayList<String> listDana = new ArrayList<String>();
    public void dana(){
        listDana.add("dingle");
        listDana.add("dangle");
        listDana.add("flip");
        listDana.add("flap");
        listDana.add("hecker");
        listDana.add("frickin frick:");
        listDana.add("pizza chit");
        listDana.add("big dumb");
    }
    public void chooseInsult(int choice){
        if(choice<listDana.size()){
            System.out.println(listDana.get(choice));
        }
        else{
            System.out.println("Error 404: Entry not found");
        }
    }
    public void addInsult(String name){
        if(!listDana.contains(name)){
            listDana.add(name);
        }
        else{
            System.out.println("You absolute dingle dangle of a flip flap you already added that name.");
        }
    }
    public void sort(){
        String temp;
        for(int i = 0; i<listDana.size(); i++){
            for(int j = 0; j<listDana.size(); j++){
                if(listDana.get(i).length()>listDana.get(j).length()){
                    temp = listDana.get(i);
                    listDana.set(i, listDana.get(j));
                    listDana.set(j, temp);
                }
            }
        }
    }
    
}
