// Queue
https://codeboard.io/projects/357455

// ArrayList
import java.util.*;
import java.util.ArrayList;

public class Main {
    
    public static void print(ArrayList<String> list) {
      
      for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ; ");
      }
      System.out.println();
    }
    
    public static void swap(ArrayList<String> list, String name1, String name2) {
      
      if((list.contains(name1) == true) && (list.contains(name2) == true)) {
        
        int indexOne = list.indexOf(name1);
        int indexTwo = list.indexOf(name2);
        
        list.set(indexOne, name2);
        list.set(indexTwo, name1);
      }
    }
    
    public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList();
      
      list.add("Kate");
      print(list);
      
      list.add("Anton");
      list.add("Nikolay");
      print(list);
      
      list.add(1, "Svetlana");
      print(list);
      
      list.add(list.size()/2 , "Ivan");
      print(list);
      
      list.set(3, "Maxim");
      print(list);
      
      list.remove(1);
      print(list);
      
      list.remove("Maxim");
      print(list);
      
      swap(list, "Kate", "Nikolay");
      print(list);
      
      swap(list, "Kate", "Oleg");
      print(list);
      
      swap(list, "Oleg", "Vasilii");
      print(list);
      
  }
}

// ArrayList
https://codeboard.io/projects/357482