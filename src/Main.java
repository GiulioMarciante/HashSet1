import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
public class Main {
    public static void main(String[] args) {
        System.out.println("The size of the HashSet is: " + hashSetFunction().size() +"\n" + "\nThe elements are the follows:");

        Iterator it = hashSetFunction().iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println("element: " + element);
        }
    }
    public static Set hashSetFunction(){
        return new HashSet<>(Arrays.asList("carrots", "zucchini", "tomatoes"));
    }
}

