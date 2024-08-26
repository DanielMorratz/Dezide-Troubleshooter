package TroubleShooter;
// Gør dette til singletong? https://www.geeksforgeeks.org/singleton-class-java/
public class Model {
    String modelid = "";
    double timefactor = 0;

    public Model(String modelid)
    {
        this.modelid = modelid;

        if (modelid == "model1234")
        {
            this.timefactor = 500;
        }

    }
    public double gettimefactor()
    {
        return timefactor;
    }
}
