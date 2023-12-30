package io.matheusVictor;

import io.matheusVictor.dto.TokenDTO;
import io.matheusVictor.requests.CelcoinRequests;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/v1")
public class CelcoinController {

    @Inject
    @RestClient
    CelcoinRequests celcoinRequests;

    @ConfigProperty(name = "celcoin.client-id")
    String clientId;

    @ConfigProperty(name = "celcoin.grant_type")
    String grantType;

    @ConfigProperty(name = "celcoin.client-secret")
    String clientSecret;

    @POST
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        Form form = new Form();
        form.param("client_id", clientId);
        form.param("grant_type", grantType);
        form.param("client_secret", clientSecret);

        TokenDTO tokenDTO = celcoinRequests.getToken(form);

        return Response.ok(tokenDTO).build();
    }
}
