import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;
   private int case;
   public Fraction(){
      numerator = denominator = 0;
      case = 0;
   }

   public fraction(int num) {
      numerator = num;
      denominator = 0;
      case = 1;
   }

   public fraction(int denom) {
      denominator = denom;
      case = 2;
   }

   public fraction(int num, int denom) {
      numerator = num;
      denominator = denom;
      case = 3;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();

         // set the values
         if(count == 0) {
            frac.setNumerator(1);
            frac.setDenominator(3);
         }
         else if(count == 1) {
            frac.setDenominator(2);
         }
         else if(count == 2) {
            frac.setNumerator(2);
         }
         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

