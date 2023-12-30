package io.matheusVictor.requests;

import io.matheusVictor.dto.PayBillDTO;
import io.matheusVictor.dto.QueryBilletDTO;
import io.matheusVictor.dto.QueryBilletDataResponse;
import io.matheusVictor.dto.TokenDTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CelcoinRequests {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    TokenDTO getToken(Form form);

    @POST
    @Path("/v5/transactions/billpayments/authorize")
    QueryBilletDataResponse consultBillet(
            @HeaderParam("Authorization")
            String token,
            QueryBilletDTO dto
    );

    @POST
    @Path("/v5/transactions/billpayments")
    String payBillet(
            @HeaderParam("Authorization")
            String token,
            PayBillDTO dto
    );

}
