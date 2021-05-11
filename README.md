
Lab SetUp
------------------------------
    JDK8
    STS     IDE
    Maven   Build Tool
    MySQL   RDBMS

Pre-Requisites
------------------------------
    JPA & Hibernate
    Spring Core And IoC
    Spring SpEL

Objectives
--------------------------------------------
Spring Boot
    Spring Web
    Spring Data
    Spring REST
    Spring Security

Spring Boot
---------------------------------------------------

        is one of the modules in spring framework,
        that supprot RAD.

        RAD ------?
                    Rapid Application Development

                    Project Structure   +
                    Dependency Management +
                    Configuaration +
                    App development

                [   Project Structure   +
                    Dependency Management +
                    Configuaration ] - automated + App development ....


    Spring Boot
                    spring-starter-web             = req spring dependencies + default config
                    spring-starter-validations
                    spring starter-data-jpa
                    
        
        1. AutoConfiguaration
        2. choosen naming convention over customized config
        3. Embeded Server
        4. Serverless Applications
        5. highly support containarization.


    Create a Spring Boot App
    ------------------------------------
        1. start.spring.io      spring initiazer app
        2. STS  Spring STarter Project Wizard

Case Study - ExpensesTracker
----------------------------------------------------------------------------------
        
        1. A user has to register himself/herslef
        2. A registered user can login
        3. A logged in user can
            4. Record any incoem he got
            5. Record any spending he did
            6. Generate a balance sheet monthly.

@SpringBootApplication
            = @ComponentScan("thatPackageWhere theSpringBoot main class lies")
            + @AutoConfiguaration
            + @PropertySource("classpath:application.properties")

