class Fraction {
  //Private states
  private int numerator;
  private int denominator;
  //accessors
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public double getDecimal(){
    return ((double)numerator)/((double)denominator);
  }
  //mutators
  public void setNumerator(int n){
    numerator = n;
  }
  public void setDenominator(int d){
    denominator = d;
  }
  //add
  public Fraction add(Fraction f){
    int n = numerator * f.getDenominator();
    int d = denominator * f.getDenominator();
    n += f.getNumerator() * denominator;
    return new Fraction(n,d);
  }
  //subtract
  public Fraction subtract(Fraction f){
    int n = numerator * f.getDenominator();
    int d = denominator * f.getDenominator();
    n -= f.getNumerator() * denominator;
    return new Fraction(n,d);
  }
  //divide
  public Fraction divide(Fraction f){
    int n = numerator * f.getDenominator();
    int d = denominator * f.getNumerator();
    return new Fraction(n,d);
  }
  //multiply
  public Fraction multiply(Fraction f){
    int n = numerator * f.getNumerator();
    int d = denominator * f.getDenominator();
    return new Fraction(n,d);
  }
  //compareTo
  public int compareTo (Fraction f){
    if (this.getDecimal() > f.getDecimal())
      return 1;
    else if (this.getDecimal() < f.getDecimal())
      return -1;
    else
      return 0;
  }
  //toString
  @Override public String toString(){
  //  doSimplify();
    String s = numerator + "/" + denominator;
    return s;
  }
  //gcd helper function
  public static int gcd (int b, int s){
    try {
      int r = b % s;
      b = s;
      s = r;
      if (s == 0)
        return b;
      else
        return gcd (b,s);
      }
      catch (Exception e){
        System.out.println("division by zero exception");
        return 1;
      }
    }
  //simplify fractions
/*  public void doSimplify() {
    if (denominator != 0){
      int g = 1; //stores gcd
      if (numerator > denominator)
        g = gcd(numerator, denominator);
      else if (denominator > numerator)
        g= gcd(denominator, numerator);
      numerator /= g;
      denominator /= g;
    }
  }*/
  //Constructors
  Fraction(){
    numerator = 1;
    denominator = 1;
  }
  Fraction(Fraction f){
    numerator = f.getNumerator();
    denominator = f.getDenominator();
    //doSimplify();
  }
  Fraction(int n){
    numerator = n;
    denominator = 1;
  }
  Fraction(int n, int d){
    numerator = n;
    denominator = d;
  }
}
