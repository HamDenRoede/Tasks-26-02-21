/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size.
But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work,
if the array received as a parameter would not have a fixed length.

        4.a create arrays of the following type and assign it at least 3 different values:
        - Integer array
        - String array
        - boolean array
        4.b Write a function that takes in an array of strings as parameter and prints each string.
        4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
        4.d Write a function that receives an integer array as a parameter and returns the average value.
        4.e Consider how you could write a function that takes in an integer array as a parameter
        and returns the array sorted from lowest to highest value.

 */

public class Main
{
    // 4.a - Arrays of different data types:
    static int[] intArray = {0, 1, 2};
    static String[] stringArrayTypes = {"Int","Boolean", "Array"};
    boolean[] booleanArray;

    public static void main(String[] args)
    {
        printStringArray(stringArrayTypes);
        printIntArray(intArray);
    }

    // 4.b - Function which prints the strings in the array:
    static void printStringArray(String[] args)
    {
        System.out.println(stringArrayTypes[0] + stringArrayTypes[1] + stringArrayTypes[2]);
    }

    // 4.c - Function whichs prints the sum of all elements in the array:
    public static int printIntArray(int[] intArray)
    {
        int arraySum = 0;
        for (intArray : intArray)
        {
            arraySum += intArray;
        }
        return arraySum;
        System.out.println(arraySum);
    }
}