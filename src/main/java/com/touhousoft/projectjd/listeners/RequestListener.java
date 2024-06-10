package com.touhousoft.projectjd.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;



/**
 * RequestListener
 */
@WebListener
public class RequestListener implements ServletRequestListener {

  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println("Request inicializado desde la IP ->" + sre.getServletRequest().getRemoteAddr());
  }

  @Override
  public void requestDestroyed(ServletRequestEvent sre) {
    System.out.println("Request destruido desde la IP -> " + sre.getServletRequest().getRemoteAddr());
  }
}
