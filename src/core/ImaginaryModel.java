package core;

import program.Log;

public class ImaginaryModel extends UniversalModel {

    public ImaginaryModel(double x, double a) {
        this.x = x;
        this.a = a;
        Log log = new Log("core.ImaginaryModel");
        log.LogDebug("Create imaginary result");
    }
}
