package com.mentorship.assignment1;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 1, 4, 2, 9, 2, 5, 2, 9, 5, 3};
        int sum = 4;
        System.out.println("Question 1");
        getKeyPairs(numbers, sum);
        System.out.println("\nQuestion 2");
        getCount(numbers);
        System.out.println("\nQuestion 3");
        sumOfArray(numbers);
        System.out.println("\nQuestion 4");
        smallestNum(numbers);
        System.out.println("\nQuestion 5");
        largestNum(numbers);
        System.out.println("\nQuestion 6");
        arraySquared(numbers);
    }

    //Question 1
    private static void getKeyPairs(int[] numbers, int sum)
    {
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == sum)
                {
                    System.out.println("The Key pairs that give the target sum are: " + numbers[i] + " and " + numbers[j]);
                }
            }
        }
    }

    //Question 2
    private static void getCount(int[] numbers)
    {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    count++;
                }
            }
            System.out.println(numbers[i] + " occurs " + count + ((count > 1) ?  " times" : " time"));
            i += (count - 1);
        }
    }

    //Question 3
    private static void sumOfArray(int[] numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
                sum += numbers[i];
        }
        System.out.println("The sum of the entire array is: " + sum);
    }

    //Question 4
    private static void smallestNum(int[] numbers)
    {
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
    }

    //Question 5
    private static void largestNum(int[] numbers)
    {
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }

    //Question 6
    private static void arraySquared(int[] numbers)
    {
        System.out.println("Sorted Original Array   |   Sorted Squared Array");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("\t\t" + numbers[i] + "\t\t\t\t|\t\t" + (int)Math.pow(numbers[i], 2));
        }
    }

}
