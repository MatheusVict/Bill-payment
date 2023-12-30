package io.matheusVictor.dto;

import java.util.Date;

public class QueryBilletDataResponse {
    public String assignor;
    public RegisterDataDTO registerData;
    public String settleDate;
    public Date dueDate;
    public String endHour;
    public String initeHour;
    public String nextSettle;
    public String digitable;
    public int transactionId;
    public int type;
    public double value;
    public Object maxValue;
    public Object minValue;
    public String errorCode;
    public Object message;
    public int status;

    public String getAssignor() {
        return assignor;
    }

    public void setAssignor(String assignor) {
        this.assignor = assignor;
    }

    public RegisterDataDTO getRegisterData() {
        return registerData;
    }

    public void setRegisterData(RegisterDataDTO registerData) {
        this.registerData = registerData;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getIniteHour() {
        return initeHour;
    }

    public void setIniteHour(String initeHour) {
        this.initeHour = initeHour;
    }

    public String getNextSettle() {
        return nextSettle;
    }

    public void setNextSettle(String nextSettle) {
        this.nextSettle = nextSettle;
    }

    public String getDigitable() {
        return digitable;
    }

    public void setDigitable(String digitable) {
        this.digitable = digitable;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Object getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    public Object getMinValue() {
        return minValue;
    }

    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
