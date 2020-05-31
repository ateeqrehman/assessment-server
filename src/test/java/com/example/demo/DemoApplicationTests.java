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
		
		//Note: The number 7 has 4 options instead of 3 so the whenever 7 is in the phone number the results for the number 7 should be times 5, for example if the input number is 
		 //27 the number of combinations will be 4*5 which is 20
		 this.mockMvc.perform(get("/api/v1//phonenumbers/27")).andDo(print()).andExpect(status().isOk(
				  )) .andExpect(content().string(containsString("[\"27\",\"2P\",\"2Q\",\"2R\",\"2S\",\"A7\",\"AP\",\"AQ\",\"AR\",\"AS\",\"B7\",\"BP\",\"BQ\",\"BR\",\"BS\",\"C7\",\"CP\",\"CQ\",\"CR\",\"CS\"]")));
		 
	}
}