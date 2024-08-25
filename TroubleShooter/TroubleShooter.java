package TroubleShooter;
class TroubleShooter
{
    public static void main(String []args)
    {
        System.out.println("Hello World!");
        //int time = Integer.valueOf(args[0]);
        //int money = Integer.valueOf(args[1]);
        //Model model = new Model(args[2]);
        Model model = new Model("model1234");


        Costconverter costconverter = new Costconverter();
        double result = costconverter.converter(0.5, 275.5, model);
        System.out.println(Math.round(result));
    }
};



