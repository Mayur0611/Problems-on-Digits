/*
  Write a java program which accept number from user and return 
  the count of even digits:

     Example: 
            Input: 2190
            Output: 2
*/



import java.util.*;

class Digit
{
    public int iNo;

    Digit(int iNum)
    {
        iNo =iNum;
    }

    public int CountEven()
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

            if(iDigit % 2 == 0)
            {
                iCount++;
            }

            iNo = iNo / 10;    
        }
        return iCount;
    }
}

class DigitDemo1
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        iValue = sobj.nextInt();

        Digit obj = new Digit(iValue);
        iRet = obj.CountEven();

        System.out.println("Count of Even Digits is: "+iRet);
    }
}