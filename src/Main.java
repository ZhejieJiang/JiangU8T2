import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        /* --- 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5,
        for(int rows = 0; rows< testArr1.length; rows++)
        {
            for(int columns = 0; columns< testArr1[0].length; columns++)
            {
                System.out.println(testArr1[rows][columns]);
            }
        }
        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6
            for(int[] rows: testArr1)
            {
                for(int element: rows)
                {
                    System.out.println(element);
                }
            }
        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6
            for(int columns = 0; columns< testArr1[0].length; columns++)
            {
                for(int rows = 0; rows< testArr1.length; rows++)
                {
                System.out.println(testArr1[rows][columns]);
            }
        }
        /* --- 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");
        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish
        for(String[] rows: testArr2)
        {
            for(String element: rows)
            {
                System.out.println(element);
            }
        }
        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish
        for(int columns = 0; columns< testArr2[0].length; columns++)
        {
            for(int rows = 0; rows< testArr2.length; rows++)
            {
                System.out.println(testArr2[rows][columns]);
            }
        }
    }
}
