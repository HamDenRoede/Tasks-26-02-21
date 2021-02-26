/*
1.a Create a file and name it Main.java, include a main method.
        1.b Write a function that prints an empty line and call it from main();
        1.c Write a function that receives a string as a parameter and prints it. call this function from main()
        1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age.
        Have the function print the text "My name is \<name\>, I am <age> years old".

// 1.a - done.
public class Main
{
    public static void main(String[] args)
    {
        // 1.b - empty line function call:
        printEmpty();

        // 1. c - string parameter function call:
        printParameter("Exercise 1.c solution");

        // 1.d - string and in parameter function call:
        printNameAndAge("Jonas", 28);
    }

    // 1.b - empty line function:
    static void printEmpty()
    {
        System.out.println("");
    }

    // 1.c - string parameter function:
    public static void printParameter(String parameter)
    {
        System.out.println(parameter);
    }

    // 1.d - string & int parameter function:
    public static void printNameAndAge(String name, int age)
    {
        System.out.println("My name is "+ name +", I am " + age + " years old.");
    }

}


2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
        2.b Write a function that receives to integers as parameters and returns the sum of them.
        2.c Write a function that receives a string and returns it as uppercase.
        (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )

        2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
        (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )


import java.util.Locale;

// 2.a - I have completed the if-statement, beginning @ line 71.
class Main
{
    public static boolean happy = true;

    public static void main(String[] args)
    {
        if (iAmHappy())
        {
            System.out.println("I clap my hands");
        } else
        {
            System.out.println("I don't clap my hands");
        }

        // 2.b - function call for the "two integer parameter" function
        System.out.println(returnSum(4, 8));

        // 2.c - lowercase to upper case function call.
        upperCaseConverter("test af lowercase til uppercase");

        // 2.d - true if first letter is uppercase function call: - UNFINISHED
        trueIfUppercase("test");
    }

    public static boolean iAmHappy()
    {
        // fill out what is missing here:
        if (happy == true)
        {
            return true;
        } else return false;
    }

    int a;
    int b;

    // 2.b. - two integers parameter function
    public static int returnSum(int a, int b)
    {
        return a + b;
    }

    // 2.c - lower case to upper case string function
    public static void upperCaseConverter(String lowerCase)
    {
        System.out.println(lowerCase.toUpperCase());
    }

    //2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
    //  (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )

    public static boolean isUpperCase;

    // 2.d - true if first letter is uppercase function - UNFINISHED
    public static void trueIfUppercase(String output)
    {
        char ch1 = output.charAt(0);
        Character.isUpperCase('T');
        System.out.println("Character at first position is:" + output + ". Therefore uppercase");

        Character.isUpperCase('t');
        System.out.println("Character at first position is:" + output + ". Therefore lowercase");
    }
    */

}