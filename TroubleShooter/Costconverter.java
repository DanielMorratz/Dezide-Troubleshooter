package TroubleShooter;
import TroubleShooter.Model;

public class Costconverter {

    public int converter(int time, int money, Model model)
    {

        int timefactor = model.gettimefactor();

        return time * timefactor + money;
    }
}


