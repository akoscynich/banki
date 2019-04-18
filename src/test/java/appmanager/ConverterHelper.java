package appmanager;

import data.ConverterData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;

public class ConverterHelper extends HelperBase {

    public ConverterHelper(WebDriver wd) {
        super(wd);
    }

    public void setState(ConverterData converterData) throws InterruptedException {
        if (converterData.getLeftField() != null) {
            clear(By.cssSelector("input[data-bind='first-input']"));
            type(By.cssSelector("input[data-bind='first-input']"), converterData.getLeftField());
            sleep(1000);
        }
        /*if (converterData.getRightField() != null) {
            clear(By.cssSelector("input[data-bind='second-input']"));
            type(By.cssSelector("input[data-bind='second-input']"), converterData.getRightField());
            sleep(1000);
        }*/
        /*if (converterData.getLeftCurrency() != null) {
            click(By.cssSelector(".select-input-field__selected-value"));
            click(By.cssSelector(converterData.getLeftCurrency()));
        }
        if (converterData.getRightCurrency() != null) {
            click(By.cssSelector(".select-input-field__selected-value"));
            click(By.linkText(converterData.getRightCurrency()));
        }*/
    }

    public int getRate() {
        String[] rateToday = getText(By.cssSelector(".cb-current-rates__list__item.font-bold")).split(" ");
        return (int)(parseFloat(rateToday[1])*10000);
    }

    public int getCost() {
        List<String> formattedString = new ArrayList<>(asList(getValue(By.cssSelector("input[data-bind='second-input']")).split(" ")));
        return parseInt(formattedString.stream().map(String::toString).collect(Collectors.joining("")));
    }

}
