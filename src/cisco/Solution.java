package  cisco;
import java.util.*;
import java.lang.*;
import java.io.*;

/*
 *
 */
public class Solution
{
    public static int  maximumDifference(int[] inputArr)
    {
        int  answer = 0;
        int i=0,j=1;
        answer=inputArr[j]-inputArr[i];
        int minElement=inputArr[0];

        for(int k=1;k<inputArr.length;k++) {
            if ((inputArr[k] - minElement) > answer) {
                answer = inputArr[k] - minElement;
            }
            if (inputArr[k] < minElement) {
                minElement = inputArr[k];
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for inputArr
        int inputArr_size = in.nextInt();
        int inputArr[] = new int[inputArr_size];
        for(int idx = 0; idx < inputArr_size; idx++)
        {
            inputArr[idx] = in.nextInt();
        }

        int result = maximumDifference(inputArr);
        System.out.print(result);

    }
}
