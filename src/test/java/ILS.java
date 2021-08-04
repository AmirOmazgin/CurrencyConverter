public class ILS extends Coin {
    final double value = 0.28;
  public double GetValue(){

      return value;
  }


    public double calculate(double input) {

        return input * GetValue();
    }

    public ILS() {
    }
}
