package ac.za.cput.project;

public class Company implements TaxPayer {
    @Override
    public String getTaxNumber(){
        return "Co2233";
    }

    @Override
    public String getName(){
        return "Lettuce Eat Takeaways";
    }
}
