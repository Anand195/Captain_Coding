//The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
import java.util.*;
import java.lang.*;

class Problem_3{

  public static void primeFactor(long numm){

      long newnumm = numm;
      long largestFact = 0;

      int counter = 2;
      while (counter * counter <= newnumm) {
    if (newnumm % counter == 0) {
        newnumm = newnumm / counter;
        largestFact = counter;
    } else {
        counter++;
    }
  }
  if (newnumm > largestFact) { // the remainder is a prime number
    largestFact = newnumm;
    System.out.println(newnumm+"");
  }
  }

  public static void main(String[] args) {

    long n = 600851475143L;
    primeFactor(n);

  }
}
