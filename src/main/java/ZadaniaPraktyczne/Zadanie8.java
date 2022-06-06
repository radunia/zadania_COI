package ZadaniaPraktyczne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zadanie8 {
    /*
    8.	Mając listę String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” }
    proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków
     */
    public static void main(String[] args) {
        List<String> listaDrzew = new ArrayList<String>();
        listaDrzew.add("brzoza");
        listaDrzew.add("modrzew");
        listaDrzew.add("grab");
        listaDrzew.add("buk");
        listaDrzew.add("wierzba");

        Iterator<String> iterator = listaDrzew.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("---------------");
        for(String s:listaDrzew){
            System.out.println(s);
        }
    }
}
