public class FractionTest{
    public static void main (String[] argv){
      //FractionTest Variables
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(2,3);
      Fraction f3 = new Fraction(100,0);
      Fraction fSum;
      Fraction fDifference;
      Fraction fProduct;
      Fraction fQuotient;
      //Prints out initial fractions
      System.out.println("Fraction 1 is " + f1.toString());
      System.out.println("Fraction 2 is " + f2.toString());
      //Testing addition method
      fSum = f1.add(f2);
      System.out.println("The sum of the fractions is " + fSum.toString());
      //Testing subtraction method
      fDifference = f2.subtract(f2);
      System.out.println("The difference of the fractions is " + fDifference.toString());
      //Testing multipication method and reduction method
      fProduct = f1.multiply(f2);
      fProduct.reduceFraction();
      System.out.println("The product of the fractions is " + fProduct.toString());
      fQuotient = f1.divide(f2);
      System.out.println("The quotient of the fractions is " + fQuotient.toString());
      System.out.print(f1.toString() + " is ");
      if (f1.greaterThan(f2))
        System.out.println("greater than " + f2.toString());
      else if (f1.lessThan(f2)){
        System.out.println("less than " + f2.toString());
      }
      else if (f1.isEqual(f2)){
        System.out.println("is equal to " + f2.toString());
      }

      //Testing MixedFraction

      MixedFraction m1 = new MixedFraction(5);
      MixedFraction m2 = new MixedFraction(3,2);
      MixedFraction m3 = new MixedFraction(100,0);
      MixedFraction m4 = new MixedFraction(7,1,2);
      MixedFraction mf= new MixedFraction(m2.getFraction());

      //Prints Mixed Fractions and tests 0 denominator
      System.out.println("Mixed Fraction 1 is " + m1.toString());
      System.out.println("Mixed Fraction 1 is " + m2.toString());
      System.out.println("Mixed Fraction 1 is " + m3.toString());
      System.out.println("Mixed Fraction 1 is " + m4.toString());
      //Tests Mixed Fraction conversion
      System.out.println(m2.toString() + " is " + mf.toString());
      //Tests arthimetic operators
      System.out.println("Mixed Fraction 1 + Mixed Fraction 2 is " + m1.add(m2).toString());
      System.out.println("Mixed Fraction 1 - Mixed Fraction 2 is " + m1.subtract(m2).toString());
      System.out.println("Mixed Fraction 1 * Mixed Fraction 2 is " + m1.multiply(m2).toString());
      System.out.println("Mixed Fraction 1 / Mixed Fraction 2 is " + m1.divide(m2).toString());
      //Tests relational operators
      System.out.println("Mixed Fraction 1 and 2 " + m1.compareTo(m2));
      System.out.println("Mixed Fraction 1 and 4 " + m1.compareTo(m4));
    }
}
