package TroubleShooter;
import java.lang.reflect.InvocationTargetException;

class TroubleShooter
{
    public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
    {
        double time = Double.valueOf(args[0]);
        double money = Double.valueOf(args[1]);
        Model model = ModelFactory.createModel(args[2]);
        Costconverter costconverter = new Costconverter();


        // for task 2; if additional arguments are present they'll be stored here
        String[] additionalArgs = new String[args.length - 3];
        if(args.length > 3)
        {
            System.arraycopy(args, 3, additionalArgs, 0, additionalArgs.length);
        }

        double result = costconverter.converter(time, money, model, additionalArgs);
        // System.out.println(result);
    }
};



