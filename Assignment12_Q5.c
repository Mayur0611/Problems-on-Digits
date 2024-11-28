/*
   5. Write a program which accept number from user and return the
   difference between summation of even digits and odd digits.
*/


#include<stdio.h>

int CountDiff(int iNo)
{
    int iDigit = 0;
    int EvenSum = 0;
    int OddSum  = 0;
    int SumDiff = 0;

    while(iNo > 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 == 0)
        {
            EvenSum = EvenSum + iDigit;
        }
        else
        {
            if(iDigit % 2 != 0)
            {
                OddSum = OddSum + iDigit;
            }
        }

        iNo = iNo/10;    


    }

    SumDiff = EvenSum - OddSum;
    return SumDiff;


}


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d",iRet);

    return 0;
}