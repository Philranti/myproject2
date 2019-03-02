package ac.za.cput.project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {
    TaxPayer tax;

    @Before
    public void setUp() {
        tax = new Product();
    }
    @Test
    public void getTaxNumber() {
        String taxNum  = tax.getTaxNumber();
        Assert.assertEquals(taxNum,"Pr2789");
    }

    @Test
    public void getName() {
        String name = tax.getName();
        Assert.assertEquals(name, "Spicy Butter");
    }
}
