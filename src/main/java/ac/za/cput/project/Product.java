package ac.za.cput.project;

public class Product implements TaxPayer {
    @Override
    public String getTaxNumber(){
        return "Pr2789";
    }

    @Override
    public String getName(){
        return "Spicy Butter";
    }
}
