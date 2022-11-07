// Инициализация массивов

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array = new int[5];
      
      System.out.println(array[0]);
      System.out.println(array[1]);
      System.out.println(array[2]);
      System.out.println(array[3]);
      System.out.println(array[4]);
      
  }
}

// Инициализация массивов

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array = new int[5];
      
      array[0] = 10;
      array[2] = -3;
      array[4] = 7;
      
      System.out.print(array[0] + " ");
      System.out.print(array[1] + " ");
      System.out.print(array[2] + " ");
      System.out.print(array[3] + " ");
      System.out.print(array[4] + " ");
      
  }
}

// Инициализация массивов

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array = {1, 4, 6, 7, -2, 0, 3, -10, 12};
      
      System.out.print(array[0] + " ");
      System.out.print(array[1] + " ");
      System.out.print(array[2] + " ");
      System.out.print(array[3] + " ");
      System.out.print(array[4] + " ");
      System.out.print(array[5] + " ");
      System.out.print(array[6] + " ");
      System.out.print(array[7] + " ");
      System.out.print(array[8] + " ");
      
  }
}


// Инициализация массивов
import java.util.*;

public class Main {
    
    public static void print(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int[] array = new int[7];
      
      print(array);
  }
}


// Task 9-1
import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = scanArray(10);
      
      printArray(array);
  }
}


// Task 9-2
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      
      printArray(array);
  }
}

// Task 9-2
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      
      printArray(array);
  }
}


// Task 9-4
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f ", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextDouble() * 100;
      }
      
      return array;
    }
    
    public static double[] multiplyArray(double[] array, double n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static double[] decreaseArray(double[] array, double n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] - n;
      }
      
      return array;
    }
    
    public static double[] divideToFirstElementArray(double[] array) {
      
      double temp = array[0];
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] / temp;
      }
      
      return array;
    }
    
    public static void main(String[] args) {
      
      double[] array = generateArray(5);
      
      printArray(array);
      
      divideToFirstElementArray(array);
      
      printArray(array);
  }
}


// Task 9-5
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f ", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextDouble() * 100;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.printf("%.2f ", array[i]);
        }
      }
      System.out.println();
    }
    
    public static void printElementsLess100(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] <= 100) {
          System.out.printf("%.2f ", array[i]);
        }
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      double[] array = {-3, 0, 6, 102, -5, 110, 32, -16, 28, 100};
      
      printArray(array);
      printNonNegativeElements(array);
      printElementsLess100(array);
      
  }
}


// Task 9-6
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f ", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextDouble() * 100;
      }
      
      return array;
    }
    
    public static double findMaxElementOfArray(double[] array) {
      
      double max = array[0];
      
      for(int i = 1; i < array.length; i++) {
         if(array[i] > max) {
            max = array[i];
         } 
      }
      
      return max;
    }
    
    public static int findIndexOfMaxElementOfArray(double[] array) {
      
      int index = 0;
      
      double max = findMaxElementOfArray(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          // break;
        }
      }
      
      return index;
    }
    public static void main(String[] args) {
      
      double[] array = {3, 6, 110, 102, 1, 110};
      printArray(array);
      
      System.out.println(findMaxElementOfArray(array));
      System.out.println(findIndexOfMaxElementOfArray(array));
  }
}


// Task 9-7
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f ", array[i]);
      }
      System.out.println();
    }
    
    public static double[] scanArray(int n) {
      
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      
      return array;
    }
    
    public static double[] generateArray(int n) {
      
      double[] array = new double[n];
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextDouble() * 100;
      }
      
      return array;
    }
    
    public static double[] swapElementsOfArray(double[] array, int n, int m) {
      
      if((n < 0) || (n >= array.length) || (m < 0) || (m >= array.length)) {
        return array;
      }
      else {
        double temp = array[n];
        array[n] = array[m];
        array[m] = temp;
        
        return array;
      }
    }
    
    public static void main(String[] args) {
      
      double[] array = generateArray(8);
      printArray(array);
      
      printArray(swapElementsOfArray(array, 1, 4));
      printArray(swapElementsOfArray(array, 0, 5));
      printArray(swapElementsOfArray(array, -1, 4));
      printArray(swapElementsOfArray(array, 1, -1));
      printArray(swapElementsOfArray(array, 9, 2));
  }
}


// https://codeboard.io/projects/356703