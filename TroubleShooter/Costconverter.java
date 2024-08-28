package TroubleShooter;
import java.util.HashMap;
import java.util.Map;
// Gør dette til singletong? https://www.geeksforgeeks.org/singleton-class-java/
public class Costconverter
{
    double GLOBAL_TIME_FACTOR = 300.0;

    public double converter(double time, double money, Model model, String[] additionalArgs)
    {
        double timeFactor = setTimeFactor(model);
        double result = costCalculator(time, timeFactor, money);
        System.out.println("Standard cost is: " + Math.round(result));

        if(additionalArgs.length > 0)
        {
            result *= customCostAdjustments(model, additionalArgs);
            System.out.println("The new cost with Adjustments is: " + Math.round(result));
        }

        return Math.round(result);
    }

    private double costCalculator(double time, double timeFactor, double money)
    {
        return time * timeFactor + money;
    }

    private double setTimeFactor(Model model)
    {
        if (model.getLocalTimeFactor() > 0)
        {
            return model.getLocalTimeFactor();
        }

        System.out.println("Unable to find local timefactor. Using global timefactor Instead");
        return GLOBAL_TIME_FACTOR;
    }


    public double customCostAdjustments(Model model, String[] additionalArgs)
    {
        HashMap<String, Double> adjustmentValues = adjustmentHashMap();
        double riskValue = model.getDefaultRiskValue();
        double inconvenienceValue = model.getDefaultInconvenienceValue();

        for (String arg : additionalArgs)
        {
            String[] parts = arg.split(":");
            String name = parts[0].trim().toLowerCase();
            String value = parts[1].trim().toLowerCase();
            // System.out.println("Name: " + name);
            // System.out.println("value: " + value);

            if(name.equals("risk"))
            {
                riskValue = adjustmentValues.get(value);
            }
            else if(name.equals("inconvenience"))
            {
                inconvenienceValue = adjustmentValues.get(value);
            }
        }

        return riskValue * inconvenienceValue;
    }

    private HashMap<String, Double> adjustmentHashMap()
    {
        HashMap<String, Double> adjustmentValues = new HashMap<>();
        adjustmentValues.put("low", 1.1);
        adjustmentValues.put("medium", 1.3);
        adjustmentValues.put("high", 2.0);
        adjustmentValues.put("none", 1.0);

        return adjustmentValues;

    }
}


