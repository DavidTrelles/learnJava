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