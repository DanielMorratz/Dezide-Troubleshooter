package TroubleShooter;
import TroubleShooter.Model;

public class Costconverter {

    public int converter(int time, int money, Model model)
    {
        int modelId = model.id;
        //int timefactor == timefactor(modelId)

        return time * model.timefactor + money;
    }
}


