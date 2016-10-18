class MixedNumber extends Fraction{
  //new private states
  private int wholeNumber;
  //mutators
  public void setWholeNumber(int w){
    wholeNumber = w;
  }
  //accessors
  public int getWholeNumber(){
    return wholeNumber;
  }
  //converts mixedNumber into improper fraction
  public Fraction getFraction(){
    int newN = wholeNumber * this.getDenominator();
    newN += this.getNumerator();
    return new Fraction(newN, this.getDenominator());
  }
  //helper function
  public void simplifyMixedNumber(){
    int newW = wholeNumber + (this.getNumerator() / this.getDenominator());
    int newN = this.getNumerator() % this.getDenominator();
    wholeNumber = newW;
    this.setNumerator(newN);
  }
  //add
  public MixedNumber add(MixedNumber m){
    Fraction f1 = this.getFraction();
    Fraction f2 = m.getFraction();
    return new MixedNumber(f1.add(f2));
  }
  //subtract
  public MixedNumber subtract(MixedNumber m){
    Fraction f1 = this.getFraction();
    Fraction f2 = m.getFraction();
    return new MixedNumber(f1.subtract(f2));
  }
  //multiply
  public MixedNumber multiply(MixedNumber m){
    Fraction f1 = this.getFraction();
    Fraction f2 = m.getFraction();
    return new MixedNumber(f1.multiply(f2));
  }
  //divide
  public MixedNumber divide(MixedNumber m){
    Fraction f1 = this.getFraction();
    Fraction f2 = m.getFraction();
    return new MixedNumber(f1.divide(f2));
  }
  //compareTo
  public int compareTo(MixedNumber m){
    Fraction f1 = this.getFraction();
    Fraction f2 = m.getFraction();
    return (f1.compareTo(f2));
  }
  //toString
  @Override public String toString(){
    String s = "Error";
    if (this.getDenominator() != 0){
      if (wholeNumber == 0){
        s = this.getNumerator() + "/" + this.getDenominator();
      }
      else if (this.getNumerator() == 0){
        s = String.valueOf(wholeNumber);
      }
      else
        s = wholeNumber + " " + this.getNumerator() + "/" + this.getDenominator();
    }
     return s;
  }
  //Constructors
  MixedNumber(){
    this.setNumerator(1);
    this.setDenominator(1);
    wholeNumber = 1;
  }
  MixedNumber(int w){
    this.setNumerator(1);
    this.setDenominator(1);
    wholeNumber = w;
  }
  MixedNumber(int n, int d){
    this.setNumerator(n);
    this.setDenominator(d);
    wholeNumber = 0;
  }
  MixedNumber(int w, int n, int d){
    this.setNumerator(n);
    this.setDenominator(d);
    wholeNumber = w;
  }
  MixedNumber(MixedNumber m){
    wholeNumber = m.getWholeNumber();
    this.setNumerator(m.getNumerator());
    this.setDenominator(m.getDenominator());
    simplifyMixedNumber();
  }
  MixedNumber(Fraction f){
    this.setNumerator(f.getNumerator());
    this.setDenominator(f.getDenominator());
    wholeNumber = 0;
    this.simplifyMixedNumber();
  }
}
