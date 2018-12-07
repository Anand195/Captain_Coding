//import  all neccesory files
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

//create main function
int main(){

  //create local variable to take inut
    long t,sum=0;
    scanf("%ld",&t);
    //For loop having main logic
    for(long a0 = 0; a0 < t; a0++){
      //create local variable to take inut
        long n;
        scanf("%ld",&n);
        //main logic goes here
          long a=0, b=0, d=0;
            a=(n-1)%3;
            a=n-1-a;
            a=a/3;
            b=(n-1)%5;
            b=n-1-b;
            b=b/5;
            d=(n-1)%15;
            d=n-1-d;
            d=d/15;
            long c= 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;
            //Generate output
        printf("%ld\n",c);
    }
    return 0;
}

//Time complexity O(n)
//This logic pass all the test cases located on HackerRank.com
