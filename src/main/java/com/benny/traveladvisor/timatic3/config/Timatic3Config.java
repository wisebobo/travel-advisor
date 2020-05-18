package com.benny.traveladvisor.timatic3.config;

import com.benny.traveladvisor.timatic3.service.Timatic3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * TODO
 *
 * @author benny.li
 * @data 2020/5/11
 */
@Configuration
public class Timatic3Config {

    @Value("timatic3.url")
    private String timatic3_url;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.benny.traveladvisor.timatic3.dto");
        return marshaller;
    }

    @Bean
    public Timatic3Client timatic3Client(Jaxb2Marshaller marshaller) {
        Timatic3Client client = new Timatic3Client();
        client.setDefaultUri(timatic3_url);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
