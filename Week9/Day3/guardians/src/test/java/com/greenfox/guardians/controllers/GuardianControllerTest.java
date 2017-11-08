package com.greenfox.guardians.controllers;

import com.greenfox.guardians.GuardiansApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardiansApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void grootHeyTest() throws Exception {
        mockMvc.perform(get("/groot?message=hey")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is("hey")))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));
    }

    @Test
    public void grootErrorTest() throws Exception {
        mockMvc.perform(get("/groot")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

    @Test
    public void yonduNineAndTwentySevenTest() throws Exception {
        mockMvc.perform(get("/yondu?distance=27&time=9")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.distance", is(27)))
                .andExpect(jsonPath("$.time", is(9)))
                .andExpect(jsonPath("$.speed", is(3)));
    }

    @Test
    public void yonduDivideZeroTest() throws Exception {
        mockMvc.perform(get("/yondu?distance=27&time=0")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Time cannot be zero!")));
    }
}