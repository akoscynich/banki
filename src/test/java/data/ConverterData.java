package data;

import java.util.Objects;

public class ConverterData {

    private String leftField;
    private String rightField;
    private String rate;
    private String leftCurrency;
    private String rightCurrency;

    public String getLeftField() {
        return leftField;
    }

    public ConverterData withLeftField(String leftField) {
        this.leftField = leftField;
        return this;
    }

    public String getLeftCurrency() {
        return leftCurrency;
    }

    public ConverterData withLeftCurrency(String leftCurrency) {
        this.leftCurrency = leftCurrency;
        return this;
    }

    public String getRightField() {
        return rightField;
    }

    public ConverterData withRightField(String rightField) {
        this.rightField = rightField;
        return this;
    }

    public String getRightCurrency() {
        return rightCurrency;
    }

    public ConverterData withRightCurrency(String rightCurrency) {
        this.rightCurrency = rightCurrency;
        return this;
    }

    public String getRate() {
        return rate;
    }

    public ConverterData withRate(String rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return "ConverterData{" +
                "leftField='" + leftField + '\'' +
                ", rightField='" + rightField + '\'' +
                ", rate='" + rate + '\'' +
                ", leftCurrency='" + leftCurrency + '\'' +
                ", rightCurrency='" + rightCurrency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConverterData that = (ConverterData) o;
        return Objects.equals(leftField, that.leftField) &&
                Objects.equals(rightField, that.rightField) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(leftCurrency, that.leftCurrency) &&
                Objects.equals(rightCurrency, that.rightCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftField, rightField, rate, leftCurrency, rightCurrency);
    }
}
