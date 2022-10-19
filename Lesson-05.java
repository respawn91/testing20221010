// for

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i++) {
        System.out.println("Какой-то текст");
      }
  }
}

// for

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i++) {
        System.out.println("Бегун находится на круге номер " + i);
      }
  }
}


// for

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = -5; i > -10; i--) {
        System.out.println(i);
      }
  }
}

// for

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i < 50; i = i * 2) {
        System.out.println(i);
      }
  }
}


// Task 5-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i < 10; i++) {
        System.out.print("20 ");
      }
  }
}


// Task 5-2

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 10; i <= 25; i++) {
        System.out.printf("%d %d.4\n", i, i);
      }
  }
}


// Task 5-3

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i <= 9; i++) {
        System.out.printf("%d x 7 = %d\n", i, i * 7);
      }
  }
}


// Task 5-4-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      
      for(int i = 100; i <= 500; i++) {
        System.out.println("===============");
        System.out.println("i = " + i);
        System.out.println("Сумма до вычисления = " + sum);
        sum = sum + i;
        System.out.println("Сумма после вычисления = " + sum);
      }
      
      System.out.println(sum);
  }
}


// Task 5-5
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = 10;
      
      double sum = 0;
      
      for(int i = 0; i < n; i++) {
        // Задаем временную переменную для хранения числа, которое считываем
        double temp = sc.nextDouble();
        System.out.print(temp + " ");
        sum = sum + temp;
      }
      System.out.println();
      
      System.out.println("sum = " + sum);
      System.out.println("average = " + (sum/n));
  }
}

// while
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      while(i < 10) {
        System.out.print(i + " ");
        i++;
      }
  }
}


// do while
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      do {
        System.out.print(i + " ");
        i++;
      }
      while(i < 10);
  }
}


// do while VS while
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 10;
      int j = 10;
      
      System.out.println("while");
      
      while(i < 10) {
        System.out.println(i + " ");
        i++;
      }
      
      System.out.println("do while");
      
      do {
        System.out.println(j + " ");
        j++;
      }
      while(j < 10);
      
  }
}


// Task 5-7
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int temp = sc.nextInt();
      int sum = 0;
      int counter = 0;
      
      while(temp != 0) {
        counter++;
        sum = sum + temp;
        System.out.print(temp + " ");
        temp = sc.nextInt();
      }
      System.out.println();
      
      System.out.println("Sum = " + sum);
      System.out.println("Counter = " + counter);
      
      System.out.println("Average = " + ((double)sum/counter));
      
  }
}



// Считать все числа

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      int counter = 0;
      
      while(sc.hasNext()) {
        int temp = sc.nextInt();
        counter++;
        sum = sum + temp;
        System.out.print(temp + " ");
      }
      System.out.println();
      
      System.out.println("Sum = " + sum);
      System.out.println("Counter = " + counter);
      
      System.out.println("Average = " + ((double)sum/counter));
      
  }
}


// Task 5-8-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 1762457;
      int originalNumber = number;
      int countOfThree = 0;
      
      while(number != 0 ) {
        int lastDigit = number % 10;
        
        if(lastDigit == 3) {
          countOfThree++;
        }
        
        number = number / 10;
      }
      
      System.out.printf("Число %d содержит цифру 3 %d раз\n", originalNumber, countOfThree);
      
  }
}


// Task 5-8-6

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 13679832;
      int originalNumber = number;
      int counter = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        if((lastDigit == 5) || (lastDigit == 0)) {
          counter++;
        }
        
        number = number / 10;
      }
      
      System.out.printf("Цифры 0 или 5 в числе %d встречаются %d раз\n", originalNumber, counter);
      
  }
}

// Task 5-10

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 13679832;
      int originalNumber = number;
      
      int max = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        if(lastDigit > max) {
          max = lastDigit;
          
          if(max == 9) {
            break;
          }
        }
        
        number = number / 10;
      }
      
      System.out.printf("В числе %d максимальная цифра - %d \n", originalNumber, max);
      
  }
}



// Task 5-11

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 5000; i > 0; i--) {
        if(i % 39 == 0) {
          System.out.println(i);
          break;
        }
      }
  }
}