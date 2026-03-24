public class Book extends Product {

    public Book(String itemLabel, int baseCost){
        super(itemLabel, baseCost);
    }

    @Override
    public double getTaxRate(){
        return 0.02;
    }

    @Override
    public String getProductType(){
        return "Book";
    }
}
