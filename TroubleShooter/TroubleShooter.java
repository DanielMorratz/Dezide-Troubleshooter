package TroubleShooter;

class TroubleShooter
{
    public static void main(String []args)
    {

        double time = Double.valueOf(args[0]);
        double money = Double.valueOf(args[1]);
        Model model = new Model(args[2]);


        Costconverter costconverter = new Costconverter();
        double result = costconverter.converter(time, money, model);
        System.out.println(result);
    }
};



