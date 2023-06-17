package serv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "serv")
public class ServerApp {
    public static void main(String[] args){
        SpringApplication.run(ServerApp.class, args);
    }
}
