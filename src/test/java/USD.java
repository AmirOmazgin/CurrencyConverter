public class USD extends Coin {
    final double value = 3.52;

    public double GetValue(){

        return value;
    }

    public USD() {
    }

    public double calculate(double input) {

        return input * GetValue();
    }


}
