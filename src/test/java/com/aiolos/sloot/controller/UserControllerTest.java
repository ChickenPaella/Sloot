package com.aiolos.sloot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.aiolos.sloot.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/root-context.xml", "classpath:servlet-context.xml"})
public class UserControllerTest {

	private static final String ID = "lhbv1421";
	private static final String PASSWORD = "1234";
	private static final int STUDENT_NUM = 12109369;
	private static final String NAME = "이희백";
	private static final String SEX = "남";
	private static final String PHONE_NUMBER = "010-4455-4006";
	
	@Autowired
    private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Autowired
	private UserDao userDao;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void insert() throws Exception {
		userDao.deleteUser(ID);
    	
        String jsonParm = "{" +
                "\"id\" : \"" + ID + "\"," +
                "\"password\" : \"" + PASSWORD + "\"," +
                "\"student_num\" : \"" + STUDENT_NUM + "\"," +
                "\"name\" : \"" + NAME + "\"," +
                "\"sex\" : \"" + SEX + "\"," +
                "\"phone_number\" : \"" + PHONE_NUMBER + "\"" +
                "}";

        this.mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(jsonParm))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.code").value("200"))
                .andReturn();

	}

}
