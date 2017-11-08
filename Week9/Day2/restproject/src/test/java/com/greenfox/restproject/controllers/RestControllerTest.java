package com.greenfox.restproject.controllers;

import com.greenfox.restproject.RestprojectApplication;
import com.greenfox.restproject.model.ArrayRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestprojectApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    private HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    void setConverters(HttpMessageConverter<?>[] converters) {

        this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
                .filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
                .findAny()
                .orElse(null);

        assertNotNull("the JSON message converter must not be null",
                this.mappingJackson2HttpMessageConverter);
    }

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void doublingWithFour() throws Exception {
        mockMvc.perform(get("/doubling?input=4")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(4)))
                .andExpect(jsonPath("$.result", is(8)));
    }

    @Test
    public void doublingisNull() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void greeterWithPetikeAndStudent() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike&title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void greeterWithoutPetike() throws Exception {
        mockMvc.perform(get("/greeter?title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void greeterWithoutStudent() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void appendaKuty() throws Exception {
        mockMvc.perform(get("/appenda/kuty")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.appended", is("kutya")));
    }

    @Test
    public void appendaError() throws Exception {
        mockMvc.perform(get("/appenda")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }


    @Test
    public void doUntilSum() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .accept(MediaType.APPLICATION_JSON).content("4")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(10)));
    }

    @Test
    public void doUntilFactor() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\":4}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(24)));
    }


    @Test
    public void arrayHandlerMultiply() throws Exception {

        Integer[] testArray = new Integer[] {1,2,5,10};
        ArrayRequest arrayRequest = new ArrayRequest("multiply", testArray);

        mockMvc.perform(post("/arrays")
                .accept(MediaType.APPLICATION_JSON).content(this.json(arrayRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(100)));
    }

    @Test
    public void arrayHandlerSum() throws Exception {

        Integer[] testArray = new Integer[] {1,2,5,10};
        ArrayRequest arrayRequest = new ArrayRequest("sum", testArray);

        mockMvc.perform(post("/arrays")
                .accept(MediaType.APPLICATION_JSON).content(this.json(arrayRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(18)));
    }

    protected String json(Object o) throws IOException {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        this.mappingJackson2HttpMessageConverter.write(
                o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }
}