// Приведение типов данных

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 100;
      int b = 30;
      
      int c = a / b;
      System.out.println(c);
      
      double d = a / b;
      System.out.println(d);
      
      double x = 100;
      double y = 30;
      
      double z = x / y;
      System.out.println(z);
  }
}


// Приведение типов данных

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 100;
      int b = 30;
      
      double x = 100;
      double y = 30;
      
      double result1 = a / y;
      System.out.println(result1);
      
      double result2 = x / b;
      System.out.println(result2);
      
      double result3 = a / b;
      System.out.println(result3);
      
      double result4 = (double)a / b;
      System.out.println(result4);
  }
}


// Math

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double pi = Math.PI;
      double e = Math.E;
      
      System.out.println(pi);
      System.out.println(e);
      
      double a1 = Math.sqrt(9);
      double a2 = Math.sqrt(24);
      
      double a3 = Math.abs(-9);
      
      double a4 = Math.cos(0);
      
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a3);
      System.out.println(a4);
      
  }
}


// Task 4-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double r = 4;
      
      double c = 2 * Math.PI * r;
      
      System.out.println(c);
  }
}


// Task 4-3

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 982;
      
      int s = number / 100;
      int d = number/ 10 % 10;
      int e = number % 10;
      
      System.out.printf("%d = %d * 100 + %d * 10 + %d\n", number, s, d, e);
      
      int sum = s + d + e;
      int multiply = s * d * e;
      
      System.out.println("Sum = " + sum);
      System.out.println("Multiply = " + multiply);
  }
}


// Операции сравнения

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 10;
      
      boolean result1 = (a == b);
      System.out.println(result1);      // false
      
      boolean result2 = (a == c);
      System.out.println(result2);      // true
      
      boolean result3 = (a != b);
      System.out.println(result3);      // true
      
      boolean result4 = (a != c);
      System.out.println(result4);      // false
  }
}


// Операции сравнения

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 10;
      
      boolean result1 = (a > b);
      System.out.println(result1);      // false
      
      boolean result2 = (a > c);
      System.out.println(result2);      // false
      
      boolean result3 = (a < b);
      System.out.println(result3);      // true
      
      boolean result4 = (a >= c);
      System.out.println(result4);      // true
  }
}


// Логические операции

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 100;
      int b = 20;
      int c = 500;
      
      boolean result1 = ((a > b) || (a > c));
      boolean result2 = ((b > c) || (b > a));
      
      System.out.println(result1);    // true
      System.out.println(result2);    // false
      
      boolean result3 = ((a > b) && (a > c));
      boolean result4 = ((b > c) && (b > a));
      boolean result5 = ((c > a) && (c > b));
      
      System.out.println(result3);    // false
      System.out.println(result4);    // false
      System.out.println(result5);    // true
      
  }
}


// Task 4-5

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 1255;
      
      boolean isEven = (number % 2 == 0);
      boolean isEndedBySeven = (number % 10 == 7);
      
      System.out.println("Число четное? " + isEven);
      System.out.println("Число оканчивается на 7? " + isEndedBySeven);
  }
}


// If

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 750;
      
      if(number > 100) {
        System.out.println("Число больше 100!");
        System.out.println("Само число - " + number);
      }
  }
}


// If

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 50;
      
      if(number > 100) {
        System.out.println("Число больше 100!");
        System.out.println("Само число - " + number);
      }
      else {
        System.out.println("Число меньше 100!");
        System.out.println("Само число - " + number);
      }
  }
}


// Task 4-6

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 51;
      int b = -50;
      
      System.out.printf("a = %d, b = %d\n", a, b);
      
      if(Math.abs(a) > Math.abs(b)) {
        a = a / 2;
      }
      
      System.out.printf("a = %d, b = %d\n", a, b);
  }
}


// Task 4-8

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int day = 8;
      
      switch(day) {
        
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
          
        default:
          System.out.println("Incorrect number of day!");
          break;
      }
  }
}



