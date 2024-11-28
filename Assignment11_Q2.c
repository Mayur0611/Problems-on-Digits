/*
  1. Write a program which accept number from user and check whether it contains 0 
     in it or not.
*/

#include<stdio.h>
#include<stdbool.h>

bool ChkZero(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit == 0)
        {
            return true;
        }

        iNo = iNo /10;
        
    }
}


int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter Number: ");
    scanf("%d",&iValue);

    bRet = ChkZero(iValue);

    if(bRet == true)
    {
        printf("it Contains Zero");
    }
    else
    {
        printf("There is no Zero"); 
    }
    
    return 0;
}