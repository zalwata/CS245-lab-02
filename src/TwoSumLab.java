/**
 * Lab Assignment 2
 *
 * requirements:
 * - make a function called TwoSum that takes in an array of numbers called num and an integer variable named sum.
 *
 * assumptions:
 * - only one valid answer exists
 * - the array is only integers
 */

public class TwoSumLab {

    //brute force - return the indices of the two numbers whose sum is equal to a given target.
    public int[] twoSum(int[] num, int sum)
    {
        int[] onlyOneValidAnswer = new int[]{-1,-1};
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num.length; j++)
            {
                if(num[i] != num[j])
                {
                    if((num[i] + num[j]) == sum)
                    {
                        onlyOneValidAnswer[0] = j;
                        onlyOneValidAnswer[1] = i;
                    }
                }
            }
        }

        return onlyOneValidAnswer;
    }

    //To print for debugging
    public String print(int[] array)
    {
        StringBuilder inputSB = new StringBuilder();
        String input;

        for(int i = 0; i < array.length; i++)
        {
            inputSB.append(array[i]);
            if(i != (array.length - 1))
            {
                inputSB.append(",");
            }
        }

        input = inputSB.toString();
        return input;
    }

    public static void main(String[] args)
    {
        TwoSumLab tSL = new TwoSumLab();
        //Example 1
        int[] nums1 = new int[]{2,12,8,7};
        int target = 9;
        System.out.println("Given nums: " + tSL.print(nums1)  + " target = " + target);
        System.out.println("output: " + "[" + tSL.print(tSL.twoSum(nums1,target)) + "]");

        //Example 2
        int[] nums2 = new int[]{1,13,18,20,30};
        target = 40;
        System.out.println("Given nums: " + tSL.print(nums2)  + " target = " + target);
        System.out.println("output: " + "[" + tSL.print(tSL.twoSum(nums2,target)) + "]");
    }
}
