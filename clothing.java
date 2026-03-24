public class Clothing extends Product {

    public Clothing(String itemLabel, int baseCost){
        super(itemLabel, baseCost);
    }

    @Override
    public double getTaxRate(){
        return 0.05;
    }

    @Override
    public String getProductType(){
        return "Clothing";
    }
}
