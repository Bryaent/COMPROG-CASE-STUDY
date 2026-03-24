public class Product {
    private String itemLabel;
    private int baseCost;

    public Product(String itemLabel, int baseCost){
        this.itemLabel = itemLabel;
        this.baseCost = baseCost;
    }

    public String getItemLabel(){ 
        return itemLabel; 
    }

    public int getBaseCost(){ 
        return baseCost; 
    }

    public double getTaxRate(){ 
        return 0; 
    }

    public double getNetAmount(){ 
        return getBaseCost() + (getBaseCost() * getTaxRate()); 
    }

    public String getProductType(){ 
        return "Product"; 
    }

    public String getTaxPercentage(){ 
        return (int)(getTaxRate() * 100) + "%"; 
    }
}
