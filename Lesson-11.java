// Exception
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Test #1");
      
      int a = 10;
      int b = 0;
      
      int c = a / b;
      
      System.out.println(c);
      
      System.out.println("Test #2");
  }
}

// Exception
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Test #1");
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      try {
        int c = a / b;
        System.out.println("c = " + c);
      }
      catch(Exception e) {
        System.out.println("Делить на ноль нельзя!");
      }
      
      System.out.println("Test #2");
  }
}


// StackTrace
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Test #1");
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int[] array = new int[2];
      array[0] = a;
      array[1] = b;
      
      try {
        int c = a / b;
        array[1] = c;
        System.out.println("c = " + c);
      }
      catch(ArithmeticException ae) {
        System.out.println("Делить на ноль нельзя!");
      }
      catch(ArrayIndexOutOfBoundsException ai) {
        System.out.println("Вышли за границы массива!");
      }
      catch(Exception e) {
        System.out.println("Делить на ноль нельзя!");
      }
      
      System.out.println("Test #2");
  }
}



import java.util.*;

public class Main {
    
    public static void method1() {
      int a = 10 / 5;
      method2();
    }
    
    public static void method2() {
      try {
        int a = 10 / 0;  
      }
      catch(ArithmeticException ae) {
        ae.printStackTrace();
      }
      method3();
    }
    
    public static void method3() {
      double a = -55 * 3;
      method4();
    }
    
    public static void method4() {
      int a = 7 / 2;
      method5();
    }
    
    public static void method5() {
      System.out.println("Hello there!");
    }
    
    public static void main(String[] args) {
      method1();
  }
}


import java.util.*;

public class Main {
    
    public static void method1() {
      int a = 10 / 5;
      method2();
    }
    
    public static void method2() {
      try {
        int a = 10 / 0;  
      }
      catch(ArithmeticException ae) {
        ae.printStackTrace();
      }
      method3();
    }
    
    public static void method3() {
      int[] array = new int[5];
      try {
        array[10] = 10;
      }
      catch(ArrayIndexOutOfBoundsException ai) {
        ai.printStackTrace();
      }
      method4();
    }
    
    public static void method4() {
      try {
        int a = 10 / 0;  
      }
      catch(ArithmeticException ae) {
        ae.printStackTrace();
      }
      method5();
    }
    
    public static void method5() {
      System.out.println("Hello there!");
    }
    
    public static void main(String[] args) {
      method1();
  }
}

// NullPointer
https://codeboard.io/projects/359668

// Unit testing
https://codeboard.io/projects/359671
https://codeboard.io/projects/359675