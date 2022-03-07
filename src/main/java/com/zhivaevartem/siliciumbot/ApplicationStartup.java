package com.zhivaevartem.siliciumbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point class.
 */
@SpringBootApplication
public class ApplicationStartup {
  /**
   * Entry point method.
   *
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    SpringApplication.run(ApplicationStartup.class, args);
  }
}
