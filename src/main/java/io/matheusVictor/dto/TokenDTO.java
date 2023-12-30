package io.matheusVictor.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class TokenDTO {

    @JsonbProperty("access_token")
    public String accessToken;
    @JsonbProperty("expires_in")
    public int expiresIn;
    @JsonbProperty("token_type")
    public String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
