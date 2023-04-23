
Q1 : Spring Container vs Spring Context vs IOC Container vs Application Context
Spring Container : Manage Spring Beans & their lifecycle :
1. Bean Factory : Basic Spring Container
2. Application Context : Advanced Spring Container with entreprise-specific features

     [ x ] Easy to use in web applications
     [ x ]Easy internationalization
     [ x ]Easy intergration with Spring AOP

            Which one to use ? : Most Entreprise applications use Application Context
               * Recomended for Web Applications, web services , Rest API and microservices
Q2 : Java Bean vs Spring Bean : 

**_NB : Any Java object is a POJO_**
  * Java Bean is a class that 1 . Have an public no-args contructor
2 . Have Getter & Sette
3 . Implements Serializable
  * POJO : Plain old java object
1 . No Constraints
2 . Any java objects is a POJO
  * Spring Bean : Any Java Object that is managed by spring
1 . Spring uses IOC container (Bean Factory or Application Context) to manage objects

Q3 : How Can I list all beans managed by spring Framework
// List of all Spring Beans
Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println);

Q4 : What if multiple matching beans are available ?
Use @Primary & @Qualifier

Q5 : Spring is managing objects and performing autro-wiring

