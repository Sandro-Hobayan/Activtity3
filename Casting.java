public class Casting {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0





int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)     //nag add po ako operators
int sum3 = sum2 + sum2;     // 800 (400 + 400)







String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"    // add strings
System.out.println(txt.toLowerCase());   // Outputs "hello world"





boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true     // add booleans
System.out.println(isFishTasty);   // Outputs false


  }
}
