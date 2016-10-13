public class MixedFraction extends Fraction {
    //Private states, helper functions, and other variables and functions
    private int wholeNumber;
    //Mutators
    public void setWholeNumber(int w) {
      wholeNumber = w;
    }
    //Accessors
    public int getWholeNumber(){
      return wholeNumber;
    }
    //Converts mixed fraction into normal fraction
    public Fraction getFraction(){
      Fraction newFraction = new Fraction(1,1);
      if (!(this.getNumerator()==1))
        newFraction.setNumerator((wholeNumber*this.getDenominator())+this.getNumerator());
      else
        newFraction.setNumerator(wholeNumber);
      newFraction.setDenominator(this.getDenominator());
      return newFraction;
    }

    public String toString(){
      if (this.isValid()){
        if ((this.getNumerator() == this.getDenominator())||(this.getNumerator()==0))
          return String.valueOf(wholeNumber);
        else if (wholeNumber == 0)
          return String.valueOf(this.getNumerator()) + "/" + String.valueOf(this.getDenominator());
        else
          return (String.valueOf(wholeNumber-1) + " " + String.valueOf(this.getNumerator()) + "/" + String.valueOf(this.getDenominator()));
      }
      else
          return("INVALID DENOMINATOR");
    }
    //Arthimetic
    public MixedFraction multiply(MixedFraction m){
      Fraction f1 = this.getFraction();
      Fraction f2 = m.getFraction();
      return new MixedFraction(f1.multiply(f2));
    }
    public MixedFraction divide(MixedFraction m){
      Fraction f1 = this.getFraction();
      Fraction f2 = m.getFraction();
      return new MixedFraction(f1.divide(f2));
    }
    public MixedFraction add(MixedFraction m){
      Fraction f1 = this.getFraction();
      Fraction f2 = m.getFraction();
      return new MixedFraction(f1.add(f2));
    }
    public MixedFraction subtract(MixedFraction m){
      Fraction f1 = this.getFraction();
      Fraction f2 = m.getFraction();
      return new MixedFraction(f1.subtract(f2));
    }
    //Relationships
    public int compareTo(MixedFraction m){
      return this.getFraction().compareTo(m.getFraction());
    }
    public boolean greaterThan(MixedFraction m){
      return this.getFraction().greaterThan(m.getFraction());
    }
    public boolean lessThan(MixedFraction m){
      return this.getFraction().greaterThan(m.getFraction());
    }

    //Constructors
    MixedFraction(int w){
      wholeNumber = w;
      this.setNumerator(1);
      this.setDenominator(1);
    }
    MixedFraction(int n, int d){
      if (!(d==0)){
          int tNumerator;
          wholeNumber = n/d;
          tNumerator = n%d;
          this.setNumerator(tNumerator);
          this.setDenominator(d);
        }
      else{
        this.setNumerator(n);
        this.setDenominator(d);
      }
    }
    MixedFraction(Fraction f){
      int n = f.getNumerator();
      int d = f.getDenominator();
      int tNumerator;
      wholeNumber = n/d;
      tNumerator = n%d;
      if (tNumerator == d)
        wholeNumber -= 1;
      this.setNumerator(tNumerator);
      this.setDenominator(d);
    }
    MixedFraction(int w,int n,int d){
      this.setWholeNumber(w);
      Fraction f = new Fraction(n,d);
      f.reduceFraction();
      this.setNumerator(f.getNumerator());
      this.setDenominator(f.getDenominator());
    }

}
