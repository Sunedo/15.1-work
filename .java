import java.util.Scanner;

publi class TestFunctions{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("There are seven function here:\na. f(x) = x^2;\nb. f(x) = sin(x);\nc. f(x) = cos(x;\nd. f(x) = tan(x);\ne. f(x) = cos(x) + 5sin(x);\nf. f(x) = 5cos(x) + sin(x);\ng. f(x) = log(x) + x^2)");
    
    System.out.println("Enter the number you want to calculate function a.");
    double a1 = input.nextDouble();
    
    System.out.println("Enter the number  x you want to calculate function b.");
    double b1 = input.nextDouble();
  
    System.out.println("Enter the number x you want to calculate function c.");
    double c1 = input.nextDouble();

    System.out.println("Enter the number x you want to calculate function d.");
    double d1 = input.nextDouble();
    
    System.out.println("Enter the number x you want to calculate function e.");
    double e1 = input.nextDouble();
    
    System.out.println("Enter the number x you want to calculate function f.");
    double f1 = input.nextDouble();
    
    System.out.println("Enter the number x you want to calculate function g.");
    double g1 = input.nextDouble();    
    
    Functions answer = new Functions(a1, b1, c1, d1, e1, f1, g1);
    
    System.out.println("The answer to function a is:" + answer.getFunction_a() );
    
    System.out.println("The answer to function b is:" + answer.getFunction_b() );
    
    System.out.println("The answer to function c is:" + answer.getFunction_c() );
    
    System.out.println("The answer to function d is:" + answer.getFunction_d() );
    
    System.out.println("The answer to function e is:" + answer.getFunction_e() );
    
    System.out.println("The answer to function f is:" + answer.getFunction_f() );
    
    System.out.println("The answer to function g is:" + answer.getFunction_g() );
    
    }
}

  class Functions{
    Function(){
    }
    
    double a2 = 0;
    double b2 = 0;
    double c2 = 0;
    double d2 = 0;
    double e2 = 0;
    double f2 = 0;
    double g2 = 0;
    
    
    Function( double a1, double b1, double c1, double d1, double e1, double f1, double g1){
      a2 = a1;
      b2 = b1;
      c2 = c1;
      d2 = d1;
      e2 = e1;
      f2 = f1;
      g2 = g1;
    }
    
    double getFunction_a(){
      return (Math.pow(a2, 2));
    }
    
    double getFunction_b(){
      return (Math.sin(b2));
    }
    
    double getFunction_c(){
      return (Math.cos(c2));
    }
    
    double getFunction_d(){
      return (Math.tan(d2))
    }

    double getFunction_e(){
      return (Math.cos(e2) + 5 * Math.sin(e2));
    }
    
    double getFunction_f(){
      return (5 * Math.cos(f2) + Math.sin(f2));
    }    
    
    double getFunction_g(){
      return (Math.log(g2) + g2);
    }
  
  }
