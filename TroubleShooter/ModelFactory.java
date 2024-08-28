package TroubleShooter;

public class ModelFactory {
    public static Model createModel(String modelName){
        switch (modelName) {
            case "Model1234":
                return new Model1234(modelName);
            default:
                return new Model(modelName);
        }
    }

}
