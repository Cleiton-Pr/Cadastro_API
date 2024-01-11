package config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct
    public void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("america/Sao_Paulo"));
    }


}
