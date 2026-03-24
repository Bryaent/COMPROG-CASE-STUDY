public class Electronics extends Product {

    public Electronics(String itemLabel, int baseCost){
        super(itemLabel, baseCost);
    }

    @Override
    public double getTaxRate(){
        return 0.12;
    }

    @Override
    public String getProductType(){
        return "Electronics";
    }
}
