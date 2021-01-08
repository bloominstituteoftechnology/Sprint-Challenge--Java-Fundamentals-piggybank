package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.PiggybankApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PiggybankApplication.class)
@AutoConfigureMockMvc
public class CoinControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTotal() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/total"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("7.3", result.getResponse().getContentAsString());
    }

    @Test
    public void getMoney() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/money/2.50"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("The piggy bank holds 4.8", result.getResponse().getContentAsString());
    }

//    @Test
//    Stretch Goal
//    public void getMoneyNotEnough() throws Exception {
//        MvcResult result = this.mockMvc.perform(get("/money/10.50"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andReturn();
//
//        assertEquals("Money not available", result.getResponse().getContentAsString());
//    }
}