package com.touhousoft.projectjd.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;



/**
 * SessionListener
 */

@WebListener
public class SessionListener implements HttpSessionListener {
  private static int activeSessions = 0;

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    activeSessions++;

    System.out.println("[!] Sesion Creada -> " + se.getSession().getId());
    System.out.println("[+] Sesion Activa -> " + activeSessions);
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    activeSessions--;

    System.out.println("[!] Sesion Destruida -> " + se.getSession().getId());
    System.out.println("[-] Sesion Activa ->" + activeSessions);
  }
}
