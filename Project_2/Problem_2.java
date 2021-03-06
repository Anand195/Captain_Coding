/**Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.**/
import java.util.*;

public class Problem_2{

  // public static void main(String[] args){
  //   long i,f1=0,f2=1;
  //   long sum=0,temp=0;
  //   for (i=1; i<=400000; i++){
  //       temp=f1+f2;
  //       if(temp%2 == 0){
  //         sum = sum + temp;
  //         System.out.println("Case#"+i+" : "+temp);
  //       }
  //       f1 = f2;
  //       f2 = temp;
  //   }
  //   System.out.println("Total: "+sum);
  //
  // }

public static void main(String[] args){
  long fib[] = new long[3];
  fib[0] = 0;
  fib[1] = 1;
  long total = 0;
  while(true) {
  fib[2] = fib[0]+fib[1];
  fib[0] = fib[1];
  fib[1] = fib[2];
  if(fib[2]>=4000000)
  break;
  if(fib[2]%2==0)
  total+=fib[2];
  }
  System.out.println(total);
}

  // static int evenFibSum(int limit)
  //  {
  //      if (limit < 2)
  //          return 0;
  //
  //      // Initialize first two even prime numbers
  //      // and their sum
  //      long ef1 = 0, ef2 = 2;
  //      long sum = ef1 + ef2;
  //
  //      // calculating sum of even Fibonacci value
  //      while (ef2 <= limit)
  //      {
  //          // get next even value of Fibonacci sequence
  //          long ef3 = 4 * ef2 + ef1;
  //
  //          // If we go beyond limit, we break loop
  //          if (ef3 > limit)
  //              break;
  //
  //          // Move to next even number and update sum
  //          ef1 = ef2;
  //          ef2 = ef3;
  //          sum += ef2;
  //      }
  //
  //      return(int) sum;
  //  }
  //
  //  // Driver code
  //  public static void main (String[] args)
  //  {
  //      int limit = 4000000;
  //      System.out.println(evenFibSum(limit));
  //
  //  }
}
