public class Fraction {
  //Private helper functions, states, and other variables and methods
      private int numerator;
      private int denominator;

    //Mutators
    public void setNumerator(int n){
      numerator = n;
    }
    public void setDenominator(int d) {
      denominator = d;
    }
    public void setFraction(int n, int d) {
      numerator = n;
      denominator = d;
    }
    public void reduceFraction(){
      if (denominator<0){
        denominator*= -1;
        numerator*= -1;
      }
      if ((denominator==0)&&(denominator==1))
        return;
      int b, s, greatestCommonDenominator; //Stores the biggest term in the fraction and the gcd
      if (numerator > denominator){
        b = numerator;
        s = denominator;
      }
      else {
        s = numerator;
        b = denominator;
      }
      greatestCommonDenominator = gcd(b,s);
      numerator = (numerator/greatestCommonDenominator);
      denominator = (denominator/greatestCommonDenominator);
    }
    public static int gcd (int b, int s){
      int r = b % s;
      b = s;
      s = r;
      if (s == 0)
        return b;
      else
        return gcd (b,s);
    }
    //Accesors
    public boolean isValid (){
      return !(denominator == 0);
    }
    public int getNumerator(){
      return numerator;
    }
    public int getDenominator(){
      return denominator;
    }
    public String toString(){
      if (isValid())
        return (numerator + "/" + denominator);
      else
        return("INVALID DENOMINATOR");
    }
    public double getDecimal(){
      return ((double)numerator/(double)denominator);
    }
    //Operational methods
    public Fraction add(Fraction f2){
      //Numerator and Denominator of the first fraction
      int n1 = numerator;
      int d1 = denominator;
      //Numerator and Denominator of the second fraction
      int n2 = f2.getNumerator();
      int d2 = f2.getDenominator();
      //Numerator and Denominator of the fraction returned
      int nf = (n1*d2) + (n2+d1);
      int df = (d1*d2);
      nf /= this.gcd(d1, d2);
      df /= this.gcd(d1, d2);
      return new Fraction(nf,df);
    }
    public Fraction subtract(Fraction f2){
      //Numerator and Denominator of the first fraction
      int n1 = numerator;
      int d1 = denominator;
      //Numerator and Denominator of the second fraction
      int n2 = f2.getNumerator();
      int d2 = f2.getDenominator();
      //Numerator and Denominator of the fraction returned
      int nf = (n1*d2) - (n2+d1);
      int df = (d1*d2);
      nf /= this.gcd(d1, d2);
      df /= this.gcd(d1, d2);
      return new Fraction(nf,df);
    }
    public Fraction multiply(Fraction f2){
      int nf = numerator * f2.getNumerator();
      int df = denominator * f2.getDenominator();
      return new Fraction(nf,df);
    }
    public Fraction divide(Fraction f2){
      int nf = numerator * f2.getDenominator();
      int df = denominator * f2.getNumerator();
      return new Fraction(nf,df);
    }
    //Written to please the Java Gods
    public int compareTo(Fraction f){
      if (this.greaterThan(f))
        return 1;
      else if (this.lessThan(f))
        return -1;
      else
        return 0;
    }
    //Returns this fraction > that fraction
    public boolean greaterThan(Fraction f){
      int thisNumerator = numerator * f.getDenominator();
      int thatNumerator = f.getNumerator() * denominator;
      return (thisNumerator > thatNumerator);
    }
    //Returns this fraction < that fraction
    public boolean lessThan(Fraction f){
      int thisNumerator = numerator * f.getDenominator();
      int thatNumerator = f.getNumerator() * denominator;
      return (thisNumerator < thatNumerator);
    }
    //Returns this fraction == that fraction
    public boolean isEqual(Fraction f){
      int thisNumerator = numerator * f.getDenominator();
      int thatNumerator = f.getNumerator() * denominator;
      return (thisNumerator == thatNumerator);
    }

    //Constructors
    Fraction(){
      setNumerator(0);
      setDenominator(0);
    }
    Fraction(int n){
      setNumerator(n);
      setDenominator(1);
    }
    Fraction(int n, int d){
      setNumerator(n);
      setDenominator(d);
    }
}
