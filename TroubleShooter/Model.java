package TroubleShooter;
// Gør dette til singletong? https://www.geeksforgeeks.org/singleton-class-java/
public class Model {
    String modelid;
    double timefactor;

    public Model(String modelid)
    {
        // if modelid = 1234
        // this.stimefactor = 500
        // etc...
        this.timefactor = 500;
        this.modelid = modelid;
    }
    public double gettimefactor()
    {
        // return timefactor ? timefactor : return globaltimefactor
        return timefactor;
    }
}
