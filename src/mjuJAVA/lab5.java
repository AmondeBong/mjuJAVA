package mjuJAVA;
import java.util.ArrayList;
public class lab5{
    public static void main(String[] args){
    	ArrayList<NameSet> family  = new ArrayList<NameSet>();
        family.add(new NameSet("Kildong"));
        family.add(new NameSet("Soohee"));

        for(NameSet object: family) {
        	System.out.println(object);
        
        }

    }


}