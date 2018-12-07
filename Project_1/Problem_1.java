
//import  all neccesory files
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Create new class having same name as source file name
public class Problem_1 {

    public static void main(String[] args) {
      //create scanner to take inut
       Scanner sc = new Scanner(System.in);
       //Create variable to accept input
        long t = sc.nextLong();
        //For loop having main logic
        for(long i=0;i<t;i++){
          //scan input and store it into variable
            long n = sc.nextLong();
            //create local variabe
            long a=0, b=0, d=0;
            //main logic goes here
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
            System.out.println(c);
        }
    }
}

//This logic pass all the test cases located on HackerRank.com
