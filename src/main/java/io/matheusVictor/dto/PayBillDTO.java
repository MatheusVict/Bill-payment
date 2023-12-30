package io.matheusVictor.dto;

import java.util.Date;

public class PayBillDTO {
    public String cpfCnpj;
    public BillDataDTO billData;
    public QueryBilletDTO barCode;
    public Date dueDate;
    public int transactionIdAuthorize;
}
