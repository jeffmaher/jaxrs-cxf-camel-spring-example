package net.jeffsbox.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

  @Override
  public void configure() throws Exception {

      from("cxfrs:bean:jaxRsServer")
          .process(new Processor() {
              public void process(Exchange exchange) throws Exception {
                System.err.println("SOMETHING HAPPENED!!!");
              }
          })
          .setBody(constant("['SUCCESS']"));
      }
  }
