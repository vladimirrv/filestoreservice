JMS to files example case

Task from two parts
 1.1. Web service SOAP with one method,which should receive one SOAP header “MyAction" and SOAP body “MyBody" 
 1.2. All incoming SOAP requests should be stored in the files in directory. One request - one file.
 2.1 Consumer which are reading message from Active MQ queue
 2.2 Extracting header “MyAction and body
 2.3. Prepairing and sending SOAP request to first part 

Prerequisite
===============================================================================
1. Maven
2. JDK 7 

Build
===============================================================================
Execute from the current directory using Maven
> mvn clean install


