package ac.za.cput.project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IndividualTest {
    TaxPayer tax;

    @Before
    public void setUp() {
        tax = new Individual();
    }
            @Test
            public void getTaxNumber() {
                String taxNum  = tax.getTaxNumber();
                Assert.assertEquals(taxNum,"In9988");
            }

            @Test
            public void getName() {
                String name = tax.getName();
                Assert.assertEquals(name, "Miriam Jones");
            }

    }


