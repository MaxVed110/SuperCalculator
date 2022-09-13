public class RealCalcModel extends RealModel implements Model<Double>{

    private final Log log = new Log("RealCalcModel");

    @Override
    public void setX(double x) {
        this.x = x;
        log.LogDebug("Set real x");
    }

    @Override
    public void setY(double y) {
        this.y = y;
        log.LogDebug("Set real y");
    }
    @Override
    public Double resultSum() {
        log.LogInfo("Sum");
        return x + y;
    }

    @Override
    public Double resultDif() {
        log.LogInfo("Dif");
        return x - y;
    }

    @Override
    public Double resultMult() {
        log.LogInfo("Mult");
        return x * y;
    }

    @Override
    public Double resultDiv() {
        log.LogInfo("Div");
        return Math.round(x/y * 100d) / 100d;
    }
}
