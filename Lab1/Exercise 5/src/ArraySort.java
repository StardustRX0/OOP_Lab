import java.util.*;

public class ArraySort
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = Input.nextInt();

        System.out.print("Enter array items: ");

        int[] my_array1 = new int[n];

        for (int i = 0; i < n; i++)
        {
            my_array1[i] = Input.nextInt();
            if (i < n-1)
            {
                System.out.print("Enter next items: ");
            }
        }

        Arrays.sort(my_array1);

        int Sum = 0;
        int numbers = 0;
        for (int num : my_array1)
        {
            Sum += num;
            numbers += 1;
        }

        int Avg = Sum/numbers;

        System.out.print(Arrays.toString(my_array1) + "\n");
        System.out.print("Sum of the array is: " + Sum + "\n");
        System.out.print("The average value of the array is: " + Avg + "\n");
    }
}