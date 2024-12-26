/*
  Write a java program which accept number from user and return 
  difference between summation of even digits and Summation of
  odd digits:

     Example: 
            Input: 2395
            Output:-15 (2 - 17)

*/


import java.util.*;

class Digit
{
    public int iNo;

    Digit(int iNum)
    {
        iNo = iNum;
    }

    public int CountDiff()
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iEvenSum = 0;
        int iOddSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNo = iNo / 10;    
        }
        return iEvenSum - iOddSum;
    }
}

class DigitDemo5
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        iValue = sobj.nextInt();

        Digit obj = new Digit(iValue);
        iRet = obj.CountDiff();

        System.out.println("Count Difference is: "+iRet);
    }
}