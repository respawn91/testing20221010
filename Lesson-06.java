// Что такое функция

import java.util.*;

public class Main {
    
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static void main(String[] args) {
      
      int x = 30;
      int y = 50;
      
      int c = 10;
      int d = 40;
      
      System.out.println(max(x, y));
      System.out.println(max(c, d));
      System.out.println(max(x, c));
  }
}

// Что такое метод

import java.util.*;

public class Main {
    
    public static void max(int a, int b) {
      
      if(a > b)
        System.out.println(a);
      else
        System.out.println(b);
    }
    
    public static void main(String[] args) {
      
      int x = 30;
      int y = 50;
      
      int c = 10;
      int d = 40;
    
      int a = 50;
      int b = 100;
      
      max(a, b);
      max(x, y);
  }
}


// Task 6-1

import java.util.*;

public class Main {
    
    public static void print() {
      
      for(int i = 0; i < 4; i++) {
        System.out.println("5 5 5 5 5 5");
      } 
    }
    
    public static void main(String[] args) {
      
      print();   
      
  }
}


// Task 6-1

import java.util.*;

public class Main {
    
    public static void print(int number, int columns, int rows) {
      
      for(int j = 0; j < rows; j++) {
        for(int i = 0; i < columns; i++) {
          System.out.print(number + " ");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      
      print(13, 12, 16);   
      
  }
}


// Task 6-1

import java.util.*;

public class Main {
    
    public static void print(int number, int columns, int rows) {
      
      if((columns > 0) && (rows > 0)) {
        for(int j = 0; j < rows; j++) {
          for(int i = 0; i < columns; i++) {
            System.out.print(number + " ");
          }
          System.out.println();
        }  
      }
      else {
        System.out.println("Invalid parameters!");
      }
      
    }
    
    public static void main(String[] args) {
      
      print(5, 6, 4);   
      
  }
}


// Task 6-3

import java.util.*;

public class Main {
    
    public static void printElement(int a, int b) {
      System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printLine(int n) {
      for(int i = 1; i <= 9; i++) {
        printElement(n, i);
      }
      System.out.println();
    }
    
    public static void printTable() {
      for(int i = 1; i <= 9; i++) {
        printLine(i);
      }
    }
    
    public static void main(String[] args) {
      
      printTable();  
  }
}


// Task 6-4

import java.util.*;

public class Main {
    
    public static int fib(int n) {
      if((n == 1) || (n == 2))
        return 1;
      else
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void fibPrint(int n) {
      for(int i = 1; i <= n; i++) {
        System.out.print(fib(i) + " ");
      }
    }
    
    public static void main(String[] args) {
      
      fibPrint(15);
  }
}


// Task 6-5

import java.util.*;

public class Main {
    
    public static long factorialClassic(int n) {
      
      long result = 1;
      
      for(int i = 1; i <= n; i++) {
        result = result * i;
      }
      
      return result;
    }
    
    public static void printFactorialClassic(int n) {
      for(int i = 1; i <= n; i++) {
        System.out.print(factorialClassic(i) + " ");
      }
      System.out.println();
    }
    
    public static long factorialRecursion(int n) {
      
      if(n == 1)
        return 1;
      else
        return n * factorialRecursion(n - 1);
    }
    
    public static void printFactorialRecursion(int n) {
      for(int i = 1; i <= n; i++) {
        System.out.print(factorialRecursion(i) + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      printFactorialClassic(10);
      printFactorialRecursion(10);
      
  }
}

// Task 6-6

import java.util.*;

public class Main {
    
    // max(int, int)
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    // max(double, double)
    public static double max(double a, double b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    // max(int, int, int)
    public static int max(int a, int b, int c) {
      
      return max(max(a, b), c);
    }
    
    // max(int, int, int, int)
    public static int max(int a, int b, int c, int d) {
      
      return max(max(a, b), max(c, d));
    }
    
    public static void main(String[] args) {
      
      System.out.println(max(3, 5));               // 5
      System.out.println(max(-5,-10));             // -5
      System.out.println(max(7, 5, 3));          // 7
      System.out.println(max(3, 10, 5));         // 10
      System.out.println(max(-3, -5, -1));       // -1
      System.out.println(max(-3, -5, -1, 0));     // 0
      
      System.out.println(max(3.0, 5.4));          // 5.4
      
      
      
  }
}

// Task 6-7

import java.util.*;

public class Main {
  
    public static double perimetr(double a, double b, double c) {
      
      if(isTriangle(a,b,c) == true) {
        return a + b + c;  
      }
      else
        return 0;
    }
    
    public static double square(double a, double b, double c) {
      
      if(isTriangle(a,b,c) == true) {
        double p = perimetr(a,b,c) / 2;
      
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
      }
      else
        return 0;
    }
    
    public static void print(double a, double b, double c) {
      if(isTriangle(a,b,c) == true) {
        System.out.println("Треугольник существует!");
        System.out.println("Площадь равна " + square(a,b,c));
        System.out.println("Периметр равен " + perimetr(a,b,c));
      }
      else {
        System.out.println("Треугольника не существует!");
      }
    }
    
    public static boolean isTriangle(double a, double b, double c) {
      
      if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a))
        return true;
      else
        return false;
      
    }
    
    public static void main(String[] args) {
      
      print(11, 13, 15);
  }
}

