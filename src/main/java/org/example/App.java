package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = BinarySearchAndrii.search(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }

}
