# JSP-Servlet-Tutorial
JSP Servlet Tutorial

Lesson 1: Create a JSP Servlet project
- Install java 8: https://drive.google.com/file/d/1Jj8TB39VNWCeHjx3sQC_T-rqY92la4mV/view
+ Create JAVA_HOME -> Add Path
- Install Maven 3.6: https://drive.google.com/file/d/1Yh_tut8yETuMnwHIUHT6gruEpjBIDJ_-/view
+ Create MAVEN_HOME -> Add Path
- Install Tomcat 8: https://drive.google.com/file/d/1z5u4igaH1uIapUW-kHCqfL2MRfwthQ-N/view
- Install Eclipse JEE 2018: https://drive.google.com/file/d/1K0xN6kWR1okHZpcWh8hplotauNrNBqPq/view

Create a project with the .war extension:
- Install libraries: JSP, Servlet, JSTL

- In the "webapp" folder:
+ Create folder "WEB-INF" and create file "web.xml", install file "web.xml" to launch file "index.jsp"
+ Create file "index.jsp", install file "index.jsp" to link to the content of controller files using webServlet url
+ Create a folder "views" containing folders "admin" and "web". The "admin" folder contains the admin's FE code file "home.jsp". Folder "web" contains the FE code file "home.jsp" of the web.
+ Create a "common" folder containing the file "taglib.jsp" containing the necessary libraries to include in future code files

- In src/main/java section, create 3 packages: com.quan.controller.admin, com.quan.controller.web, com.quan.controller. Package controller directs the function to the index to return results to the screen. The package model contains information about the objects that need to be initialized.

** RUNCODE **
- In CMD: enter the command "mvn clean install"
- Press the key combination "Alt F5" to update the project
- Install the server by clicking on "servers" below, install Tomcat 8.5 and then Run, a bit time consuming if running for the first time
- Run on Server or Debug on Server

--- Sample code is available above ---
