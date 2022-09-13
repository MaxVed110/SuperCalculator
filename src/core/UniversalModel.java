package core;

import program.Log;

public abstract class UniversalModel {

    private final Log log = new Log("core.ComplexCalcModel");
    double x, y, a, b;

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
}
