import java.util.ArrayList;
import java.util.Random;
public class generic implements Insults{
    ArrayList<String> listReal = new ArrayList<String>();
    public void real(){
        listReal.add("smart alec");
        listReal.add("buttface");
        listReal.add("poopy pants");
        listReal.add("dummy");
        listReal.add("dimwit"); //5
        listReal.add("hypocrite");//6
        listReal.add("weeb");
        listReal.add("prick");
    }
    public void chooseInsult(int choice){
        if(choice<listReal.size()){
            System.out.println(listReal.get(choice));
        }
        else{
            System.out.println("Error 404: Entry not found");
        }
    }
    public void addInsult(String name){
        if(!listReal.contains(name)){
            listReal.add(name);
        }
        else{
            System.out.println("You absolute dingle dangle of a flip flap you already added that name.");
        }
    }
    public void stort(){
        String temp;
        for(int i = 0; i<listReal.size(); i++){
            for(int j = 0; j<listReal.size(); j++){
                if(listReal.get(i).length()>listReal.get(j).length()){
                    temp = listReal.get(i);
                    listReal.set(i, listReal.get(j));
                    listReal.set(j, temp);
                }
            }
        }
    }
}
