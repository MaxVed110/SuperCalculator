public class ComplexCalcModel extends RealModel implements Model<ImaginaryModel> {

    double a, b;
    private final Log log = new Log("ComplexCalcModel");

    public void setX(double x) {
        log.LogDebug("Set x");
        this.x = x;
    }

    public void setY(double y) {
        log.LogDebug("Set y");
        this.y = y;
    }

    public void setA(double a) {
        log.LogDebug("Set a");
        this.a = a;
    }

    public void setB(double b) {
        log.LogDebug("Set b");
        this.b = b;
    }

    public ImaginaryModel resultSum() {
        log.LogInfo("Sum");
        return new ImaginaryModel((x + y), (a + b));
    }

    public ImaginaryModel resultDif() {
        log.LogInfo("Dif");
        return new ImaginaryModel((x - y), (a - b));
    }

    public ImaginaryModel resultMult() {
        log.LogInfo("ult");
        return new ImaginaryModel((x * a - y * b), (x * b + y * a));
    }

    public ImaginaryModel resultDiv() {
        log.LogInfo("Div");
        return new ImaginaryModel((Math.round((x * a + y * b) / (b * b + a * a) * 100d) / 100d),
                (Math.round((y * a - x * b) / (b * b + a * a) * 100d) / 100d));
    }
}
