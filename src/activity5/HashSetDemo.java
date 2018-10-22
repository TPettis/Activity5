package activity5;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

  public static void demoHashSet() {
    HashSet<String> countriesSet = new HashSet<String>();
    countriesSet.add("USA");
    countriesSet.add("Mexico");
    countriesSet.add("Peru");
    countriesSet.add("Peru");
    System.out.println(countriesSet);

    ArrayList<String> countriesList = new ArrayList();
    countriesList.add("USA");
    countriesList.add("Mexico");
    countriesList.add("Peru");
    countriesList.add("Peru");
    System.out.println(countriesList);


  }


}
