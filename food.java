public class Food extends Product {

    public Food(String itemLabel, int baseCost){
        super(itemLabel, baseCost);
    }

    @Override
    public double getTaxRate(){
        return 0.03;
    }

    @Override
    public String getProductType(){
        return "Food";
    }
}
