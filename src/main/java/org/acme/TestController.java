package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/nothello")
public class TestController {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String nothello() {
        return """
                <html>
                <head>
                </head>
                <body>
                    <h1>test</h1>
                </body>
                </html>
                """;
    }
}
