
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
            7. logout

@SpringBootApplication
            = @ComponentScan("thatPackageWhere theSpringBoot main class lies")
            + @AutoConfiguaration
            + @PropertySource("classpath:application.properties")


Spring Data
----------------------------------

             CrudRepository
                JpaRespository


            JpaRepository
                        save            Entity              insert and update
                        findById        Optional<Entity>    fetech entity given id
                        findAll         List<Entity>        fetech all the entities from the db
                        existsById      boolean             check if an entity exists given id
                        count           long                number of entities in the db
                        deleteById      void                delete the entity given id

            Spring Data can implement method declared by the user, if
            the method name follows Spring Data Specs...

               Entity findByFieldName(Type fieldName)           Employee findByMobile(String mobile);

               List<Entity> findAllByFieldName(Type fieldName)  List<Employee> findAllByFirstName(String firstName);

               long countByFieldName(Type fieldName)            long countByFirstName(String firstName);

               boolean existsByFieldName(Type fieldName)        boolean existsByFirstName(String firstName);

            Spring data also can execute a customized query for a method if declared.....

                @Query("jpql")
                method declaration..;

                @Query("SELECT e FROM Employee e WHERE e.salary between :lb and :ub")
                List<Employee> getEmployeesHavingSalInRange(double lb,double ub);

Spring Security
----------------------------------------------------------
    
    Foprm Based Authentication

    Secruity Configuaration
        
        AuthenticationManager
            a. UserDetailService interface to be used by authentication manger
                to loadUserByUserName(String username),
            b. Encryptor is used for excrypting and decrypting password

        HttpSecurity
                Enablked Form based Authentication
            a. where do you have the login page.
            b. what page msut appera if login fails
            c. what page must appear if login is successful
            d. what url should trigger logout
            f. Which url mus tbe authenticated...!

        WebSecurity
            a. the set of urls of static resources to be ignored out of security.

 Spring Security on REST API (using JWT)
----------------------------------------------------------
     
        Token Based Authentiction....!

    Secruity Configuaration
        
        AuthenticationManager
            a. UserDetailService interface to be used by authentication manger
                to loadUserByUserName(String username),
            b. Encryptor is used for excrypting and decrypting password

        HttpSecurity
            a. Which url mus tbe authenticated...!
            b. State less sesssion . and diable csrf
            c. User Entry Filter
                    is to check if an incoming jwt token is valid or not
            d. User Entry point
                    when login fails, this entrypoint will raise a
                    401 status.

        Authentication Filter
        Authentication Entry Point
        Model to ship the jwt token
        we need to ahndle the post reqruest ot login url,which shall generate the jwt token.








