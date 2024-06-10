package com.touhousoft.projectjd.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * ApplicationListener
 */

@WebListener
public class ApplicationListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("[+] Application Started");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("Application Stopped");
  }
}
