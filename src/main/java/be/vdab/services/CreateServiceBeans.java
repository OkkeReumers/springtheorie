package be.vdab.services; // enkele imports

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:services.xml")
public class CreateServiceBeans {
}