package com.practice.Controller;

import static org.mockito.Mockito.when;

import com.practice.controller.Controller;
import com.practice.service.ApplicationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(Controller.class)
class ControllerTest {

  @Autowired private MockMvc mockMvc;

  @Mock private ApplicationService applicationService;

  @Test
  void getMessage_shouldReturnGreeting() throws Exception {

    when(applicationService.greet()).thenReturn("Mocked method");

    mockMvc
        .perform(MockMvcRequestBuilders.get("/api/greet"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("Mocked method"));
  }
}
