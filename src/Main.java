import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
        System.out.println();
        listIter.set("Португалия");
        
        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
    }
}