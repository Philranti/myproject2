package ac.za.cput.project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
    TaxPayer tax;

    @Before
    public void setUp() {
        tax = new Company();
    }
    @Test
    public void getTaxNumber() {
        String taxNum  = tax.getTaxNumber();
        Assert.assertEquals(taxNum,"Co2233");
    }

    @Test
    public void getName() {
        String name = tax.getName();
        Assert.assertEquals(name, "Lettuce Eat Takeaways");
    }
}
