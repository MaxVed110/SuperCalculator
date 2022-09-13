package core;

import program.Log;

public class ComplexCalcModel extends UniversalModel implements Model<ImaginaryModel> {

    private final Log log = new Log("core.ComplexCalcModel");

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
