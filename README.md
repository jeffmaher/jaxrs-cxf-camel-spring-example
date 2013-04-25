# jaxrs-cxf-camel-spring-example

An implementation of a simple REST service using JAX-RS, Apache CXF, Apache Camel, and Spring

# View CXF Services Page

Go to: 

	http://{app server URL}:{app server port}/jaxrs-cxf-camel-spring-example/services

Example:
	
	http://localhost:8080/jaxrs-cxf-camel-spring-example/services

# Call the service

An example call:

	http://localhost:9080/jaxrs-cxf-camel-spring-example/example/send?text=testing
	
# Components

## Service Defintion

`net.jeffsbox.services.ExampleService` is simply the defintion of the service.

## Camel Route

`net.jeffsbox.routes.Routes` connects the JAX-RS/CXF service bean to Camel. Camel intercepts the web service call
and outputs the JSON request to the console, then responds with `['SUCCESS']`.

# Note

If deploying on JBoss AS 4.2.3, wait a few minutes for all the wiring to complete. You may get 500 errors if it has not completed. Not sure why this is.