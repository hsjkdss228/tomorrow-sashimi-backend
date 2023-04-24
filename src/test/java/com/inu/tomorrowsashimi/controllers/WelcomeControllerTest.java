package com.inu.tomorrowsashimi.controllers;

import com.inu.tomorrowsashimi.TomorrowSashimiApplication;
import com.inu.tomorrowsashimi.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(WelcomeController.class)
@ContextConfiguration(classes = {TomorrowSashimiApplication.class, SecurityConfig.class})
class WelcomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void home() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
