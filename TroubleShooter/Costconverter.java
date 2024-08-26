package TroubleShooter;

public class Costconverter
{
    double globaltimefactor = 300.0;

    public double converter(double time, double money, Model model)
    {
        double timefactor = globaltimefactor;

        if (model.gettimefactor() > 0)
        {
            timefactor = model.gettimefactor();
        }
        else
        {
            System.out.println("Unable to find local timefactor. Using global timefactor Instead");
        }

        return Math.round(time * timefactor + money);
    }

    //optional customer specific costs
    // The basic output must be the total cost calculated as
    // Total cost = customCostAdjustments( time x timeFactor + money

    // inconvenience and Risk factors adjustments:
    // low  = 10% increase
    // medium = 30% increase
    // high = 100% increase
    // none = 0% increase
    public double customCostAdjustments(double time, double timefactor, double money)
    {
        double totalcost = 0.0;
        return totalcost;
    }
}


