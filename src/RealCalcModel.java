public class RealCalcModel extends RealModel implements Model<Double>{

    public RealCalcModel() {

    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public Double resultSum() {
        return x + y;
    }

    @Override
    public Double resultDif() {
        return x - y;
    }

    @Override
    public Double resultMult() {
        return x * y;
    }

    @Override
    public Double resultDiv() {
        return Math.round(x/y * 100d) / 100d;
    }
}
