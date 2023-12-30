package io.matheusVictor.dto;

import java.util.Date;

public class RegisterDataDTO {
    public String documentRecipient;
    public String documentPayer;
    public Date payDueDate;
    public Object nextBusinessDay;
    public Date dueDateRegister;
    public boolean allowChangeValue;
    public String recipient;
    public String payer;
    public int discountValue;
    public int interestValueCalculated;
    public int maxValue;
    public double minValue;
    public int fineValueCalculated;
    public double originalValue;
    public double totalUpdated;
    public int totalWithDiscount;
    public int totalWithAdditional;

    public String getDocumentRecipient() {
        return documentRecipient;
    }

    public void setDocumentRecipient(String documentRecipient) {
        this.documentRecipient = documentRecipient;
    }

    public String getDocumentPayer() {
        return documentPayer;
    }

    public void setDocumentPayer(String documentPayer) {
        this.documentPayer = documentPayer;
    }

    public Date getPayDueDate() {
        return payDueDate;
    }

    public void setPayDueDate(Date payDueDate) {
        this.payDueDate = payDueDate;
    }

    public Object getNextBusinessDay() {
        return nextBusinessDay;
    }

    public void setNextBusinessDay(Object nextBusinessDay) {
        this.nextBusinessDay = nextBusinessDay;
    }

    public Date getDueDateRegister() {
        return dueDateRegister;
    }

    public void setDueDateRegister(Date dueDateRegister) {
        this.dueDateRegister = dueDateRegister;
    }

    public boolean isAllowChangeValue() {
        return allowChangeValue;
    }

    public void setAllowChangeValue(boolean allowChangeValue) {
        this.allowChangeValue = allowChangeValue;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public int getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(int discountValue) {
        this.discountValue = discountValue;
    }

    public int getInterestValueCalculated() {
        return interestValueCalculated;
    }

    public void setInterestValueCalculated(int interestValueCalculated) {
        this.interestValueCalculated = interestValueCalculated;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public int getFineValueCalculated() {
        return fineValueCalculated;
    }

    public void setFineValueCalculated(int fineValueCalculated) {
        this.fineValueCalculated = fineValueCalculated;
    }

    public double getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(double originalValue) {
        this.originalValue = originalValue;
    }

    public double getTotalUpdated() {
        return totalUpdated;
    }

    public void setTotalUpdated(double totalUpdated) {
        this.totalUpdated = totalUpdated;
    }

    public int getTotalWithDiscount() {
        return totalWithDiscount;
    }

    public void setTotalWithDiscount(int totalWithDiscount) {
        this.totalWithDiscount = totalWithDiscount;
    }

    public int getTotalWithAdditional() {
        return totalWithAdditional;
    }

    public void setTotalWithAdditional(int totalWithAdditional) {
        this.totalWithAdditional = totalWithAdditional;
    }
}
