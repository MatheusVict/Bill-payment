package io.matheusVictor.dto;

public class BillDataDTO {
    public double value;
    public int originalValue;
    public int valueWithDiscount;
    public int valueWithAdditional;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(int originalValue) {
        this.originalValue = originalValue;
    }

    public int getValueWithDiscount() {
        return valueWithDiscount;
    }

    public void setValueWithDiscount(int valueWithDiscount) {
        this.valueWithDiscount = valueWithDiscount;
    }

    public int getValueWithAdditional() {
        return valueWithAdditional;
    }

    public void setValueWithAdditional(int valueWithAdditional) {
        this.valueWithAdditional = valueWithAdditional;
    }
}
