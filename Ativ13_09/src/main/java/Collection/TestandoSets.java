package Collection;

import java.util.*;

public class TestandoSets {

     public static void main(String[] args) {

          // Set<String> set = new HashSet<>();

          // Set<String> set = new TreeSet<>();

          Set<String> set = new LinkedHashSet<>();

          System.out.println(set.size());
          System.out.println(set.isEmpty());

          set.add("Andre");
          set.add("Marcos");
          set.add("Patricia");
          set.add("Juliana");
          set.add("Geraldo");
          set.add("Bruna");

          System.out.println(set.size());
          System.out.println(set.isEmpty());
          System.out.println(set);
          System.out.println(set.add("Andres"));
          System.out.println(set);
          System.out.println(set.contains("Geraldo"));
          set.remove("Andre");
          System.out.println(set);
     }
}
