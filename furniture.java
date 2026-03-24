public class Furniture extends Product {

    public Furniture(String itemLabel, int baseCost){
        super(itemLabel, baseCost);
    }

    @Override
    public double getTaxRate(){
        return 0.07;
    }

    @Override
    public String getProductType(){
        return "Furniture";
    }
}
