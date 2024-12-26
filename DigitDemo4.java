/*
  Write a java program which accept number from user and return 
  the multiplication of all digits:

    Example: 
            Input: 2395
            Output: 210

            Input: 1018
            Output: 8
*/


import java.util.*;

class Digit
{
    public int iNo;

    Digit(int iNum)
    {
        iNo =iNum;
    }

    public int Digitmult()
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iMult = 1;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            iMult = iMult * iDigit;

            iNo = iNo / 10;    
        }
        return iMult;
    }
}

class DigitDemo4
{
    public static void main(String Arg[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        iValue = sobj.nextInt();

        Digit obj = new Digit(iValue);
        iRet = obj.DigitMult();

        System.out.println("Multiplication of Digits is: "+iRet);
    }
}