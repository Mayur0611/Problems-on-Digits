/*
  Write a java program which accept number from user and return 
  the count of  digits in between 3 and 7:

    Example: 
            Input: 2395
            Output: 1
*/


import java.util.*;

class Digit
{
    public int iNo;

    Digit(int iNum)
    {
        iNo =iNum;
    }

    public int CountRange()
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCount = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > 3 && iDigit < 7 )
            {
                iCount++;
            }

            iNo = iNo / 10;    
        }
        return iCount;
    }
}

class DigitDemo3
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        iValue = sobj.nextInt();

        Digit obj = new Digit(iValue);
        iRet = obj.CountRange();

        System.out.println("Count of Digits between 3 & 7 is: "+iRet);
    }
}