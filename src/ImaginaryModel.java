public class ImaginaryModel extends RealModel {
    double a;

    public ImaginaryModel(double x, double a){
        this.x = x;
        this.a = a;
        Log log = new Log("ImaginaryModel");
        log.LogDebug("Create imaginary result");
    }
}
