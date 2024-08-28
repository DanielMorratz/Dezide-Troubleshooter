package TroubleShooter;

public class Model1234 extends Model
{
    double timeFactor = 500;
    double defaultRiskValue = 1.0; // high
    double defaultInconvenienceValue = 1.0;

    public Model1234(String modelId)
    {
        super(modelId);
    }

    public double getLocalTimeFactor()
    {
        return timeFactor;
    }


}
