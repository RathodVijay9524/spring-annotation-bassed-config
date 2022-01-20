package in.vijay.javabased.config;

import com.vijay.annotaion.config.Airtel;
import com.vijay.annotaion.config.Jivo;
import com.vijay.annotaion.config.Sim;
import com.vijay.annotaion.config.Vadafone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Sim s7=context.getBean(Vadafone.class);
        s7.calling();
        s7.surfingData();


    }
}


