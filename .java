import java.util.Scanner;

publi class TestFunctions{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("There are seven function here:\na. f(x) = x^2;\nb. f(x) = sin(x);\nc. f(x) = cos(x;\nd. f(x) = tan(x);\ne. f(x) = cos(x) + 5sin(x);\nf. f(x) = 5cos(x) + sin(x);\ng. f(x) = log(x) + x^2)");
    System.out.println("Enter the number you want to calculate function a.");
    double a1 = input.nextDouble();
    System.out.println("The answer to function a is:" +  );
   
    System.out.println("Enter the number you want to calculate function b.");
    double b1 = input.nextDouble();
    System.out.println("The answer to function b is:" + );
   
    System.out.println("Enter the number you want to calculate function c.");
    double c1 = input.nextDouble();
    System.out.println("The answer to function c is:" +  );
    
    System.out.println("Enter the number you want to calculate function d.");
    double d1 = input.nextDouble();
    System.out.println("The answer to function d is:" +  );
   
    System.out.println("Enter the number you want to calculate function e.");
    double e1 = input.nextDouble();
    System.out.println("The answer to function e is:" +  );
    
    System.out.println("Enter the number you want to calculate function f.");
    double f1 = input.nextDouble();
    System.out.println("The answer to function f is:" +  );
    
    System.out.println("Enter the number you want to calculate function g.");
    double g1 = input.nextDouble();    
    System.out.println("The answer to function g is:" +  );
    
    Functions answer = new Functions(a1, b1, c1, d1, e1, f1, g1);
    }
}

  class Functions{
    Function(){
    }
    
    Function(a1, b1, c1, d1, e1, f1, g1){
      a1 = a1;
      b1 = b1;
      c1 = c1;
      d1 = d1;
      e1 = e1;
      f1 = f1;
      g1 = g1;
    }
    
    
  }
