public class ComplexCalcModel extends RealModel implements Model<ImaginaryModel> {

    double a, b;

    public ImaginaryModel resultSum() {
        return new ImaginaryModel((x + y), (a + b));
    }

    public ImaginaryModel resultDif() {
        return new ImaginaryModel((x - y), (a - b));
    }

    public ImaginaryModel resultMult() {
        return new ImaginaryModel((x * a - y * b), (x * b + y * a));
    }

    public ImaginaryModel resultDiv() {
        return new ImaginaryModel((Math.round((x * a + y * b) / (b * b + a * a) * 100d) / 100d),
                (Math.round((y * a - x * b) / (b * b + a * a) * 100d) / 100d));
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
