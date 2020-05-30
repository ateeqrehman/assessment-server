package com.example.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@ContextConfiguration(classes = DemoApplication.class)
@WebMvcTest
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		
		 this.mockMvc.perform(get("/api/v1//phonenumbers/22")).andDo(print()).andExpect(status().isOk(
		  )) .andExpect(content().string(containsString("[\"22\",\"2a\",\"2b\",\"2c\",\"a2\",\"aa\",\"ab\",\"ac\",\"b2\",\"ba\",\"bb\",\"bc\",\"c2\",\"ca\",\"cb\",\"cc\"]")));
		 
	}
}