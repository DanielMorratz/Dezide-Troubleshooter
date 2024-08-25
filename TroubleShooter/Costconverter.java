package TroubleShooter;
import TroubleShooter.Model;

public class Costconverter
{

    public double converter(double time, double money, Model model)
    {

        double timefactor = model.gettimefactor();

        return time * timefactor + money;
    }
}


