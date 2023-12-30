package io.matheusVictor.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class QueryBilletDTO {

    @JsonbProperty("barCode")
    private QueryBilletDataDTO data;

    public QueryBilletDataDTO getData() {
        return data;
    }

    public void setData(QueryBilletDataDTO data) {
        this.data = data;
    }
}
