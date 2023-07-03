public class Review{
  public static void main (String[] args){
    //The main method executes the tasks of the class
    System.out.print("My first Java program from scratch.");
  };
}

//you can Declare and assign variables in the same line - for example:
public class Creator{
    public static void main(String[]args)
    {
        String name = "James Gosling";
        //we declared a name variable of string type and gave it a value of James gosling
        //the creater of Java
        System.out.println(name);
        //that should print the variable to the console
    }
}
//to declasre a variable type, you simply put it before the 
//variable decleration - boolean for boolean, int for integer
//and double for a special type of integer, either a decimal
//or a very large or small number
public class Booleans {
	public static void main(String[] args) {    
    boolean intsCanHoldDecimals = false;
    System.out.println(intsCanHoldDecimals);
	}
}
//today went through various datatypes - Java will not compile
//remember to use javac command - if you declare a variable incorrectly
//it's important to use specific naming conventions, and camelCasing - 
//variables names must start with $,_or letter, other names will not compile and are illegal
public class Operations {
	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
     System.out.println(expression1);
//expected answer -6
    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
     System.out.println(expression2);
//3
    int expression3 = 5 * 4 % 3 - 2 + 1;
     System.out.println(expression3);
//2
	}
}

//at each level of pemdas you evaluate left to right
// (for example Modulo/multiplication/division doesn't mean to do modulo first, 
//you do whatever is on the left first)