package net.jeffsbox.services;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService
{
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/send")
  public String send(@HeaderParam("text") String text)
  {
    // this does nothing -- just a shell for CXF and Camel
    return null;
  }
}
