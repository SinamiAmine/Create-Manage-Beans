package com.domestic.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address){ }
record Address(String firstLine,String city){ }
@Configuration
public class HelloWorldConfiguration {

    // Creating shared instance of singleton bean 'name'
    @Bean
    public String name() {
        return "Amine Sinami";
    }

    @Bean
    public int age() {
        return 26;
    }

    @Bean
    public Person person() {
        return new Person("Amine",20,new Address("Main Street","Utrecht"));
    }


    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name,int age,Address address3) {//name,age,YourCustomAddressNameOfBean
        return new Person(name,age,address3);
    }
    @Bean("YourCustomAddressNameOfBean")
    public Address address() {
        return new Address("Baler Street","London");
    }

    @Bean("address3")
    public Address address3() {
        return new Address("Gueliz Street","Marrakech");
    }


}
