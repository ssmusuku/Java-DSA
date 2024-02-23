package com.practice.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultExternalService implements ExternalService {
  @Override
  public String getExternalInfo() {
    return "world";
  }
}
