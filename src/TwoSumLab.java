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

    //brute force
    public int[] twoSum(int[] num, int sum)
    {
        int firstIndex = -1;
        int secondIndex = -1;
        int count = 0;
        int[] onlyOneValidAnswer = new int[]{-1,-1};
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num.length; j++)
            {
                if(num[i] != num[j])
                {
                    if((num[i] + num[j]) == sum)
                    {
                        firstIndex = j;
                        secondIndex = i;
                        count++;
                        count++;
                        onlyOneValidAnswer[0] = firstIndex;
                        onlyOneValidAnswer[1] = secondIndex;
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
        System.out.println(tSL.print(tSL.twoSum(nums1,target)));

        //Example 2
        int[] nums2 = new int[]{1,13,18,20,30};
        target = 40;
        System.out.println(tSL.print(tSL.twoSum(nums2,target)));

    }
}
