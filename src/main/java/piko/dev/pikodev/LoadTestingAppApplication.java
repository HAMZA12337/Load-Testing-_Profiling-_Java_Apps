package piko.dev.pikodev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import piko.dev.pikodev.entities.Customer;
import piko.dev.pikodev.repositories.CustomerRepository;

@SpringBootApplication
public class LoadTestingAppApplication {


    public static void main(String[] args) {

        SpringApplication.run(LoadTestingAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){

        return args->{

            customerRepository.save(new Customer(null,"Hamza","Braimi","Braimi@gmail.com"));
            customerRepository.save(new Customer(null,"Hamid","Braimi","imi@gmail.com"));
            customerRepository.save(new Customer(null,"Hassan","Braimi","Brai@gmail.com"));


        };

    }













}
