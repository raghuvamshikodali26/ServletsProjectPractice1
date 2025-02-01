package com.raghu;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class App
{
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);
        tomcat.getConnector();  // Ensure the connector is created

        Context context = tomcat.addContext("", null);
        System.out.println("Context initialized at /");

        Tomcat.addServlet(context, "HelloPage", new ServletClass());
        context.addServletMappingDecoded("/hello", "HelloPage");
        System.out.println("Servlet added and mapped to /hello");

        tomcat.start();
        System.out.println("Tomcat started and waiting...");

        tomcat.getServer().await();
    }
}
