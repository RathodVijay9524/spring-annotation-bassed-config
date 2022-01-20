package in.vijay.javabased.config;

import com.vijay.annotaion.config.Airtel;
import com.vijay.annotaion.config.Jivo;
import com.vijay.annotaion.config.Vadafone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean   // no need for @component for Artel class
    public Airtel getPhone(){
        return new Airtel();
    }

    @Bean  // no need for @component for Artel class
    public Jivo getPhoneJivo(){
        return new Jivo();
    }
    @Bean  // no need for @component for Artel class
    public Vadafone getVadafone(){
        return new Vadafone();
    }
}
