package tests;

import data.ConverterData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConverterTest extends TestBase {

    @Test
    public void testConverter() throws InterruptedException {
        app.converter().setState(new ConverterData().withLeftField("10000"));
        Assert.assertEquals(app.converter().getRate(), app.converter().getCost());
    }

}




