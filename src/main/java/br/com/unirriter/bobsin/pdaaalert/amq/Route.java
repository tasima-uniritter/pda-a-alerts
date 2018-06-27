package br.com.unirriter.bobsin.pdaaalert.amq;

import org.apache.camel.LoggingLevel;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends SpringRouteBuilder {

    @Override
    public void configure() {

        onException(Exception.class)
                .handled(false)
                .log(LoggingLevel.ERROR, "Error in processing route!");

        from("amqp:queue:a-monitor-alerts")
                .log("message received");
    }
}