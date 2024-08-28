package TroubleShooter;

public class Model
{
    String modelId = "";
    double timeFactor = 0;
    double defaultRiskValue = 1.0;
    double defaultInconvenienceValue = 1.0;

    public Model(String modelid)
    {
        this.modelId = new String(modelid);
    }

    public double getLocalTimeFactor()
    {
        return timeFactor;
    }

    public double getDefaultRiskValue()
    {
        return defaultRiskValue;
    }
    public double getDefaultInconvenienceValue()
    {
        return defaultInconvenienceValue;
    }
}
