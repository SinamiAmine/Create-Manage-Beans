package com.domestic.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    public Person person4Parameters(String name,int age,Address address) {//name,age,YourCustomAddressNameOfBean
        return new Person(name,age,address);
    }

    @Bean
    @Primary
    public Person person5Qualifier(String name,int age,  @Qualifier("address3Qualifier") Address address) {//name,age,YourCustomAddressNameOfBean
        return new Person(name,age,address);
    }

    @Primary
    @Bean("YourCustomAddressNameOfBean")
    public Address address() {
        return new Address("Baler Street","London");
    }

    @Bean("address3")
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Gueliz Street","Marrakech");
    }


}
