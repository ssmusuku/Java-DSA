package com.practice.service;

import org.springframework.stereotype.Service;

@Service
public class MyService implements ApplicationService {

  private final ExternalService externalService;

  public MyService(ExternalService externalService) {
    this.externalService = externalService;
  }

  @Override
  public String greet() {
    String localGreeting = "Hello";
    String externalInfo = externalService.getExternalInfo();
    return localGreeting + " " + externalInfo;
  }
}
