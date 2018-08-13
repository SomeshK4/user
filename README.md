# Application with Jersey(JAX-RS), Hibernate, JUnit, Mockito, Jersey json and JerseyTest Framework

### 1. Prerequisites to run the application
  * Jdk 1.8
  * Hibernate
  * JerseyTest Framework
  * Jersey(JAX-RS)
  * JUnit
  * Mockito
  
 ### 2. _Steps to run the application_
   - Set up the database
     - Navigate to **user-dao** module
       ```
       mvn clean install -P ddl-user
       ```
      
  - Navigate to parent project (i.e user)
     ```
     mvn clean install
     ```
  - Navigate to **user-run** module
    ```
    mvn tomcat7:run
    ``` 
      
### 3. _Run Integration tests_ ###   
   - Navigate to **user-rs** module
   
     ```
     mvn clean install -P live
     ```
     
#### Endpoints
   - **_Create user_**
     - POST Request
        - _http://localhost:18080/test/rest/user/create_
      
   - **_Create player_**
     - POST Request
       - _http://localhost:18080/test/rest/player/create_
   
  
