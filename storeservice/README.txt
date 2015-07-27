
Usage
===============================================================================

Note: Please follow the parent README.txt first for common build and container setup instructions.

1) Building the task
-------------------------------------------------------------------------------
  
Using either UNIX or Windows, from the command line, run:
> mvn install


2) Running the JMS Broker
-------------------------------------------------------------------------------

The task requires a JMS broker to be running:

  * From the command line, run:
> mvn -Pjms.broker

  That will create a new broker (using the default configuration) and will start it.

Alternatively, you can start a broker as standalone application or using containers.

3) Starting the Service
-------------------------------------------------------------------------------

3.1) Standalone
  * From the command line, run:
> cd server ; mvn exec:java

3.2) In Jetty
  * From the command line, run:
> cd war ; mvn jetty:run


4) Running the Client
-------------------------------------------------------------------------------

  * From the command line:
     cd client ; mvn exec:java


5) Cleaning up
-------------------------------------------------------------------------------
  * Press ^C in the server and broker windows to stop the running processes
  * To remove the code generated from the WSDL file and the .class files, run:
> mvn clean