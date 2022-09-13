package core;

import program.Log;

public class RealCalcModel extends UniversalModel implements Model<Double> {

    private final Log log = new Log("core.RealCalcModel");

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
        return Math.round(x / y * 100d) / 100d;
    }
}
