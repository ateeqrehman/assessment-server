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
	public void shouldReturnResponsFor2Digit() throws Exception {


		//Note: The number 7 has 4 options instead of 3 so the whenever 7 is in the phone number the results for the number 7 should be times 5, for example if the input number is 
		//27 the number of combinations will be 4*5 which is 20
		this.mockMvc.perform(get("/api/v1//phonenumbers/27")).andDo(print()).andExpect(status().isOk(
				)) .andExpect(content().string(containsString("[\"27\",\"2P\",\"2Q\",\"2R\",\"2S\",\"A7\",\"AP\",\"AQ\",\"AR\",\"AS\",\"B7\",\"BP\",\"BQ\",\"BR\",\"BS\",\"C7\",\"CP\",\"CQ\",\"CR\",\"CS\"]")));


	}

	@Test
	public void shouldReturnResponsFor3Digit() throws Exception {

		this.mockMvc.perform(get("/api/v1//phonenumbers/222")).andDo(print()).andExpect(status().isOk(
				)) .andExpect(content().string(containsString("[\"222\",\"22A\",\"22B\",\"22C\",\"2A2\",\"2AA\",\"2AB\",\"2AC\",\"2B2\",\"2BA\",\"2BB\",\"2BC\",\"2C2\",\"2CA\",\"2CB\",\"2CC\",\"A22\",\"A2A\",\"A2B\",\"A2C\",\"AA2\",\"AAA\",\"AAB\",\"AAC\",\"AB2\",\"ABA\",\"ABB\",\"ABC\",\"AC2\",\"ACA\",\"ACB\",\"ACC\",\"B22\",\"B2A\",\"B2B\",\"B2C\",\"BA2\",\"BAA\",\"BAB\",\"BAC\",\"BB2\",\"BBA\",\"BBB\",\"BBC\",\"BC2\",\"BCA\",\"BCB\",\"BCC\",\"C22\",\"C2A\",\"C2B\",\"C2C\",\"CA2\",\"CAA\",\"CAB\",\"CAC\",\"CB2\",\"CBA\",\"CBB\",\"CBC\",\"CC2\",\"CCA\",\"CCB\",\"CCC\"]")));


	}

	@Test
	public void shouldReturnResponsFor7Digit() throws Exception {

		this.mockMvc.perform(get("/api/v1//phonenumbers/7032097")).andDo(print()).andExpect(status().isOk(
				)) .andExpect(content().string(containsString("[\"7032097\",\"703209P\",\"703209Q\",\"703209R\",\"703209S\",\"70320W7\",\"70320WP\",\"70320WQ\",\"70320WR\",\"70320WS\",\"70320X7\",\"70320XP\",\"70320XQ\",\"70320XR\",\"70320XS\",\"70320Y7\",\"70320YP\",\"70320YQ\",\"70320YR\",\"70320YS\",\"70320Z7\",\"70320ZP\",\"70320ZQ\",\"70320ZR\",\"70320ZS\",\"703A097\",\"703A09P\",\"703A09Q\",\"703A09R\",\"703A09S\",\"703A0W7\",\"703A0WP\",\"703A0WQ\",\"703A0WR\",\"703A0WS\",\"703A0X7\",\"703A0XP\",\"703A0XQ\",\"703A0XR\",\"703A0XS\",\"703A0Y7\",\"703A0YP\",\"703A0YQ\",\"703A0YR\",\"703A0YS\",\"703A0Z7\",\"703A0ZP\",\"703A0ZQ\",\"703A0ZR\",\"703A0ZS\",\"703B097\",\"703B09P\",\"703B09Q\",\"703B09R\",\"703B09S\",\"703B0W7\",\"703B0WP\",\"703B0WQ\",\"703B0WR\",\"703B0WS\",\"703B0X7\",\"703B0XP\",\"703B0XQ\",\"703B0XR\",\"703B0XS\",\"703B0Y7\",\"703B0YP\",\"703B0YQ\",\"703B0YR\",\"703B0YS\",\"703B0Z7\",\"703B0ZP\",\"703B0ZQ\",\"703B0ZR\",\"703B0ZS\",\"703C097\",\"703C09P\",\"703C09Q\",\"703C09R\",\"703C09S\",\"703C0W7\",\"703C0WP\",\"703C0WQ\",\"703C0WR\",\"703C0WS\",\"703C0X7\",\"703C0XP\",\"703C0XQ\",\"703C0XR\",\"703C0XS\",\"703C0Y7\",\"703C0YP\",\"703C0YQ\",\"703C0YR\",\"703C0YS\",\"703C0Z7\",\"703C0ZP\",\"703C0ZQ\",\"703C0ZR\",\"703C0ZS\",\"70D2097\",\"70D209P\",\"70D209Q\",\"70D209R\",\"70D209S\",\"70D20W7\",\"70D20WP\",\"70D20WQ\",\"70D20WR\",\"70D20WS\",\"70D20X7\",\"70D20XP\",\"70D20XQ\",\"70D20XR\",\"70D20XS\",\"70D20Y7\",\"70D20YP\",\"70D20YQ\",\"70D20YR\",\"70D20YS\",\"70D20Z7\",\"70D20ZP\",\"70D20ZQ\",\"70D20ZR\",\"70D20ZS\",\"70DA097\",\"70DA09P\",\"70DA09Q\",\"70DA09R\",\"70DA09S\",\"70DA0W7\",\"70DA0WP\",\"70DA0WQ\",\"70DA0WR\",\"70DA0WS\",\"70DA0X7\",\"70DA0XP\",\"70DA0XQ\",\"70DA0XR\",\"70DA0XS\",\"70DA0Y7\",\"70DA0YP\",\"70DA0YQ\",\"70DA0YR\",\"70DA0YS\",\"70DA0Z7\",\"70DA0ZP\",\"70DA0ZQ\",\"70DA0ZR\",\"70DA0ZS\",\"70DB097\",\"70DB09P\",\"70DB09Q\",\"70DB09R\",\"70DB09S\",\"70DB0W7\",\"70DB0WP\",\"70DB0WQ\",\"70DB0WR\",\"70DB0WS\",\"70DB0X7\",\"70DB0XP\",\"70DB0XQ\",\"70DB0XR\",\"70DB0XS\",\"70DB0Y7\",\"70DB0YP\",\"70DB0YQ\",\"70DB0YR\",\"70DB0YS\",\"70DB0Z7\",\"70DB0ZP\",\"70DB0ZQ\",\"70DB0ZR\",\"70DB0ZS\",\"70DC097\",\"70DC09P\",\"70DC09Q\",\"70DC09R\",\"70DC09S\",\"70DC0W7\",\"70DC0WP\",\"70DC0WQ\",\"70DC0WR\",\"70DC0WS\",\"70DC0X7\",\"70DC0XP\",\"70DC0XQ\",\"70DC0XR\",\"70DC0XS\",\"70DC0Y7\",\"70DC0YP\",\"70DC0YQ\",\"70DC0YR\",\"70DC0YS\",\"70DC0Z7\",\"70DC0ZP\",\"70DC0ZQ\",\"70DC0ZR\",\"70DC0ZS\",\"70E2097\",\"70E209P\",\"70E209Q\",\"70E209R\",\"70E209S\",\"70E20W7\",\"70E20WP\",\"70E20WQ\",\"70E20WR\",\"70E20WS\",\"70E20X7\",\"70E20XP\",\"70E20XQ\",\"70E20XR\",\"70E20XS\",\"70E20Y7\",\"70E20YP\",\"70E20YQ\",\"70E20YR\",\"70E20YS\",\"70E20Z7\",\"70E20ZP\",\"70E20ZQ\",\"70E20ZR\",\"70E20ZS\",\"70EA097\",\"70EA09P\",\"70EA09Q\",\"70EA09R\",\"70EA09S\",\"70EA0W7\",\"70EA0WP\",\"70EA0WQ\",\"70EA0WR\",\"70EA0WS\",\"70EA0X7\",\"70EA0XP\",\"70EA0XQ\",\"70EA0XR\",\"70EA0XS\",\"70EA0Y7\",\"70EA0YP\",\"70EA0YQ\",\"70EA0YR\",\"70EA0YS\",\"70EA0Z7\",\"70EA0ZP\",\"70EA0ZQ\",\"70EA0ZR\",\"70EA0ZS\",\"70EB097\",\"70EB09P\",\"70EB09Q\",\"70EB09R\",\"70EB09S\",\"70EB0W7\",\"70EB0WP\",\"70EB0WQ\",\"70EB0WR\",\"70EB0WS\",\"70EB0X7\",\"70EB0XP\",\"70EB0XQ\",\"70EB0XR\",\"70EB0XS\",\"70EB0Y7\",\"70EB0YP\",\"70EB0YQ\",\"70EB0YR\",\"70EB0YS\",\"70EB0Z7\",\"70EB0ZP\",\"70EB0ZQ\",\"70EB0ZR\",\"70EB0ZS\",\"70EC097\",\"70EC09P\",\"70EC09Q\",\"70EC09R\",\"70EC09S\",\"70EC0W7\",\"70EC0WP\",\"70EC0WQ\",\"70EC0WR\",\"70EC0WS\",\"70EC0X7\",\"70EC0XP\",\"70EC0XQ\",\"70EC0XR\",\"70EC0XS\",\"70EC0Y7\",\"70EC0YP\",\"70EC0YQ\",\"70EC0YR\",\"70EC0YS\",\"70EC0Z7\",\"70EC0ZP\",\"70EC0ZQ\",\"70EC0ZR\",\"70EC0ZS\",\"70F2097\",\"70F209P\",\"70F209Q\",\"70F209R\",\"70F209S\",\"70F20W7\",\"70F20WP\",\"70F20WQ\",\"70F20WR\",\"70F20WS\",\"70F20X7\",\"70F20XP\",\"70F20XQ\",\"70F20XR\",\"70F20XS\",\"70F20Y7\",\"70F20YP\",\"70F20YQ\",\"70F20YR\",\"70F20YS\",\"70F20Z7\",\"70F20ZP\",\"70F20ZQ\",\"70F20ZR\",\"70F20ZS\",\"70FA097\",\"70FA09P\",\"70FA09Q\",\"70FA09R\",\"70FA09S\",\"70FA0W7\",\"70FA0WP\",\"70FA0WQ\",\"70FA0WR\",\"70FA0WS\",\"70FA0X7\",\"70FA0XP\",\"70FA0XQ\",\"70FA0XR\",\"70FA0XS\",\"70FA0Y7\",\"70FA0YP\",\"70FA0YQ\",\"70FA0YR\",\"70FA0YS\",\"70FA0Z7\",\"70FA0ZP\",\"70FA0ZQ\",\"70FA0ZR\",\"70FA0ZS\",\"70FB097\",\"70FB09P\",\"70FB09Q\",\"70FB09R\",\"70FB09S\",\"70FB0W7\",\"70FB0WP\",\"70FB0WQ\",\"70FB0WR\",\"70FB0WS\",\"70FB0X7\",\"70FB0XP\",\"70FB0XQ\",\"70FB0XR\",\"70FB0XS\",\"70FB0Y7\",\"70FB0YP\",\"70FB0YQ\",\"70FB0YR\",\"70FB0YS\",\"70FB0Z7\",\"70FB0ZP\",\"70FB0ZQ\",\"70FB0ZR\",\"70FB0ZS\",\"70FC097\",\"70FC09P\",\"70FC09Q\",\"70FC09R\",\"70FC09S\",\"70FC0W7\",\"70FC0WP\",\"70FC0WQ\",\"70FC0WR\",\"70FC0WS\",\"70FC0X7\",\"70FC0XP\",\"70FC0XQ\",\"70FC0XR\",\"70FC0XS\",\"70FC0Y7\",\"70FC0YP\",\"70FC0YQ\",\"70FC0YR\",\"70FC0YS\",\"70FC0Z7\",\"70FC0ZP\",\"70FC0ZQ\",\"70FC0ZR\",\"70FC0ZS\",\"P032097\",\"P03209P\",\"P03209Q\",\"P03209R\",\"P03209S\",\"P0320W7\",\"P0320WP\",\"P0320WQ\",\"P0320WR\",\"P0320WS\",\"P0320X7\",\"P0320XP\",\"P0320XQ\",\"P0320XR\",\"P0320XS\",\"P0320Y7\",\"P0320YP\",\"P0320YQ\",\"P0320YR\",\"P0320YS\",\"P0320Z7\",\"P0320ZP\",\"P0320ZQ\",\"P0320ZR\",\"P0320ZS\",\"P03A097\",\"P03A09P\",\"P03A09Q\",\"P03A09R\",\"P03A09S\",\"P03A0W7\",\"P03A0WP\",\"P03A0WQ\",\"P03A0WR\",\"P03A0WS\",\"P03A0X7\",\"P03A0XP\",\"P03A0XQ\",\"P03A0XR\",\"P03A0XS\",\"P03A0Y7\",\"P03A0YP\",\"P03A0YQ\",\"P03A0YR\",\"P03A0YS\",\"P03A0Z7\",\"P03A0ZP\",\"P03A0ZQ\",\"P03A0ZR\",\"P03A0ZS\",\"P03B097\",\"P03B09P\",\"P03B09Q\",\"P03B09R\",\"P03B09S\",\"P03B0W7\",\"P03B0WP\",\"P03B0WQ\",\"P03B0WR\",\"P03B0WS\",\"P03B0X7\",\"P03B0XP\",\"P03B0XQ\",\"P03B0XR\",\"P03B0XS\",\"P03B0Y7\",\"P03B0YP\",\"P03B0YQ\",\"P03B0YR\",\"P03B0YS\",\"P03B0Z7\",\"P03B0ZP\",\"P03B0ZQ\",\"P03B0ZR\",\"P03B0ZS\",\"P03C097\",\"P03C09P\",\"P03C09Q\",\"P03C09R\",\"P03C09S\",\"P03C0W7\",\"P03C0WP\",\"P03C0WQ\",\"P03C0WR\",\"P03C0WS\",\"P03C0X7\",\"P03C0XP\",\"P03C0XQ\",\"P03C0XR\",\"P03C0XS\",\"P03C0Y7\",\"P03C0YP\",\"P03C0YQ\",\"P03C0YR\",\"P03C0YS\",\"P03C0Z7\",\"P03C0ZP\",\"P03C0ZQ\",\"P03C0ZR\",\"P03C0ZS\",\"P0D2097\",\"P0D209P\",\"P0D209Q\",\"P0D209R\",\"P0D209S\",\"P0D20W7\",\"P0D20WP\",\"P0D20WQ\",\"P0D20WR\",\"P0D20WS\",\"P0D20X7\",\"P0D20XP\",\"P0D20XQ\",\"P0D20XR\",\"P0D20XS\",\"P0D20Y7\",\"P0D20YP\",\"P0D20YQ\",\"P0D20YR\",\"P0D20YS\",\"P0D20Z7\",\"P0D20ZP\",\"P0D20ZQ\",\"P0D20ZR\",\"P0D20ZS\",\"P0DA097\",\"P0DA09P\",\"P0DA09Q\",\"P0DA09R\",\"P0DA09S\",\"P0DA0W7\",\"P0DA0WP\",\"P0DA0WQ\",\"P0DA0WR\",\"P0DA0WS\",\"P0DA0X7\",\"P0DA0XP\",\"P0DA0XQ\",\"P0DA0XR\",\"P0DA0XS\",\"P0DA0Y7\",\"P0DA0YP\",\"P0DA0YQ\",\"P0DA0YR\",\"P0DA0YS\",\"P0DA0Z7\",\"P0DA0ZP\",\"P0DA0ZQ\",\"P0DA0ZR\",\"P0DA0ZS\",\"P0DB097\",\"P0DB09P\",\"P0DB09Q\",\"P0DB09R\",\"P0DB09S\",\"P0DB0W7\",\"P0DB0WP\",\"P0DB0WQ\",\"P0DB0WR\",\"P0DB0WS\",\"P0DB0X7\",\"P0DB0XP\",\"P0DB0XQ\",\"P0DB0XR\",\"P0DB0XS\",\"P0DB0Y7\",\"P0DB0YP\",\"P0DB0YQ\",\"P0DB0YR\",\"P0DB0YS\",\"P0DB0Z7\",\"P0DB0ZP\",\"P0DB0ZQ\",\"P0DB0ZR\",\"P0DB0ZS\",\"P0DC097\",\"P0DC09P\",\"P0DC09Q\",\"P0DC09R\",\"P0DC09S\",\"P0DC0W7\",\"P0DC0WP\",\"P0DC0WQ\",\"P0DC0WR\",\"P0DC0WS\",\"P0DC0X7\",\"P0DC0XP\",\"P0DC0XQ\",\"P0DC0XR\",\"P0DC0XS\",\"P0DC0Y7\",\"P0DC0YP\",\"P0DC0YQ\",\"P0DC0YR\",\"P0DC0YS\",\"P0DC0Z7\",\"P0DC0ZP\",\"P0DC0ZQ\",\"P0DC0ZR\",\"P0DC0ZS\",\"P0E2097\",\"P0E209P\",\"P0E209Q\",\"P0E209R\",\"P0E209S\",\"P0E20W7\",\"P0E20WP\",\"P0E20WQ\",\"P0E20WR\",\"P0E20WS\",\"P0E20X7\",\"P0E20XP\",\"P0E20XQ\",\"P0E20XR\",\"P0E20XS\",\"P0E20Y7\",\"P0E20YP\",\"P0E20YQ\",\"P0E20YR\",\"P0E20YS\",\"P0E20Z7\",\"P0E20ZP\",\"P0E20ZQ\",\"P0E20ZR\",\"P0E20ZS\",\"P0EA097\",\"P0EA09P\",\"P0EA09Q\",\"P0EA09R\",\"P0EA09S\",\"P0EA0W7\",\"P0EA0WP\",\"P0EA0WQ\",\"P0EA0WR\",\"P0EA0WS\",\"P0EA0X7\",\"P0EA0XP\",\"P0EA0XQ\",\"P0EA0XR\",\"P0EA0XS\",\"P0EA0Y7\",\"P0EA0YP\",\"P0EA0YQ\",\"P0EA0YR\",\"P0EA0YS\",\"P0EA0Z7\",\"P0EA0ZP\",\"P0EA0ZQ\",\"P0EA0ZR\",\"P0EA0ZS\",\"P0EB097\",\"P0EB09P\",\"P0EB09Q\",\"P0EB09R\",\"P0EB09S\",\"P0EB0W7\",\"P0EB0WP\",\"P0EB0WQ\",\"P0EB0WR\",\"P0EB0WS\",\"P0EB0X7\",\"P0EB0XP\",\"P0EB0XQ\",\"P0EB0XR\",\"P0EB0XS\",\"P0EB0Y7\",\"P0EB0YP\",\"P0EB0YQ\",\"P0EB0YR\",\"P0EB0YS\",\"P0EB0Z7\",\"P0EB0ZP\",\"P0EB0ZQ\",\"P0EB0ZR\",\"P0EB0ZS\",\"P0EC097\",\"P0EC09P\",\"P0EC09Q\",\"P0EC09R\",\"P0EC09S\",\"P0EC0W7\",\"P0EC0WP\",\"P0EC0WQ\",\"P0EC0WR\",\"P0EC0WS\",\"P0EC0X7\",\"P0EC0XP\",\"P0EC0XQ\",\"P0EC0XR\",\"P0EC0XS\",\"P0EC0Y7\",\"P0EC0YP\",\"P0EC0YQ\",\"P0EC0YR\",\"P0EC0YS\",\"P0EC0Z7\",\"P0EC0ZP\",\"P0EC0ZQ\",\"P0EC0ZR\",\"P0EC0ZS\",\"P0F2097\",\"P0F209P\",\"P0F209Q\",\"P0F209R\",\"P0F209S\",\"P0F20W7\",\"P0F20WP\",\"P0F20WQ\",\"P0F20WR\",\"P0F20WS\",\"P0F20X7\",\"P0F20XP\",\"P0F20XQ\",\"P0F20XR\",\"P0F20XS\",\"P0F20Y7\",\"P0F20YP\",\"P0F20YQ\",\"P0F20YR\",\"P0F20YS\",\"P0F20Z7\",\"P0F20ZP\",\"P0F20ZQ\",\"P0F20ZR\",\"P0F20ZS\",\"P0FA097\",\"P0FA09P\",\"P0FA09Q\",\"P0FA09R\",\"P0FA09S\",\"P0FA0W7\",\"P0FA0WP\",\"P0FA0WQ\",\"P0FA0WR\",\"P0FA0WS\",\"P0FA0X7\",\"P0FA0XP\",\"P0FA0XQ\",\"P0FA0XR\",\"P0FA0XS\",\"P0FA0Y7\",\"P0FA0YP\",\"P0FA0YQ\",\"P0FA0YR\",\"P0FA0YS\",\"P0FA0Z7\",\"P0FA0ZP\",\"P0FA0ZQ\",\"P0FA0ZR\",\"P0FA0ZS\",\"P0FB097\",\"P0FB09P\",\"P0FB09Q\",\"P0FB09R\",\"P0FB09S\",\"P0FB0W7\",\"P0FB0WP\",\"P0FB0WQ\",\"P0FB0WR\",\"P0FB0WS\",\"P0FB0X7\",\"P0FB0XP\",\"P0FB0XQ\",\"P0FB0XR\",\"P0FB0XS\",\"P0FB0Y7\",\"P0FB0YP\",\"P0FB0YQ\",\"P0FB0YR\",\"P0FB0YS\",\"P0FB0Z7\",\"P0FB0ZP\",\"P0FB0ZQ\",\"P0FB0ZR\",\"P0FB0ZS\",\"P0FC097\",\"P0FC09P\",\"P0FC09Q\",\"P0FC09R\",\"P0FC09S\",\"P0FC0W7\",\"P0FC0WP\",\"P0FC0WQ\",\"P0FC0WR\",\"P0FC0WS\",\"P0FC0X7\",\"P0FC0XP\",\"P0FC0XQ\",\"P0FC0XR\",\"P0FC0XS\",\"P0FC0Y7\",\"P0FC0YP\",\"P0FC0YQ\",\"P0FC0YR\",\"P0FC0YS\",\"P0FC0Z7\",\"P0FC0ZP\",\"P0FC0ZQ\",\"P0FC0ZR\",\"P0FC0ZS\",\"Q032097\",\"Q03209P\",\"Q03209Q\",\"Q03209R\",\"Q03209S\",\"Q0320W7\",\"Q0320WP\",\"Q0320WQ\",\"Q0320WR\",\"Q0320WS\",\"Q0320X7\",\"Q0320XP\",\"Q0320XQ\",\"Q0320XR\",\"Q0320XS\",\"Q0320Y7\",\"Q0320YP\",\"Q0320YQ\",\"Q0320YR\",\"Q0320YS\",\"Q0320Z7\",\"Q0320ZP\",\"Q0320ZQ\",\"Q0320ZR\",\"Q0320ZS\",\"Q03A097\",\"Q03A09P\",\"Q03A09Q\",\"Q03A09R\",\"Q03A09S\",\"Q03A0W7\",\"Q03A0WP\",\"Q03A0WQ\",\"Q03A0WR\",\"Q03A0WS\",\"Q03A0X7\",\"Q03A0XP\",\"Q03A0XQ\",\"Q03A0XR\",\"Q03A0XS\",\"Q03A0Y7\",\"Q03A0YP\",\"Q03A0YQ\",\"Q03A0YR\",\"Q03A0YS\",\"Q03A0Z7\",\"Q03A0ZP\",\"Q03A0ZQ\",\"Q03A0ZR\",\"Q03A0ZS\",\"Q03B097\",\"Q03B09P\",\"Q03B09Q\",\"Q03B09R\",\"Q03B09S\",\"Q03B0W7\",\"Q03B0WP\",\"Q03B0WQ\",\"Q03B0WR\",\"Q03B0WS\",\"Q03B0X7\",\"Q03B0XP\",\"Q03B0XQ\",\"Q03B0XR\",\"Q03B0XS\",\"Q03B0Y7\",\"Q03B0YP\",\"Q03B0YQ\",\"Q03B0YR\",\"Q03B0YS\",\"Q03B0Z7\",\"Q03B0ZP\",\"Q03B0ZQ\",\"Q03B0ZR\",\"Q03B0ZS\",\"Q03C097\",\"Q03C09P\",\"Q03C09Q\",\"Q03C09R\",\"Q03C09S\",\"Q03C0W7\",\"Q03C0WP\",\"Q03C0WQ\",\"Q03C0WR\",\"Q03C0WS\",\"Q03C0X7\",\"Q03C0XP\",\"Q03C0XQ\",\"Q03C0XR\",\"Q03C0XS\",\"Q03C0Y7\",\"Q03C0YP\",\"Q03C0YQ\",\"Q03C0YR\",\"Q03C0YS\",\"Q03C0Z7\",\"Q03C0ZP\",\"Q03C0ZQ\",\"Q03C0ZR\",\"Q03C0ZS\",\"Q0D2097\",\"Q0D209P\",\"Q0D209Q\",\"Q0D209R\",\"Q0D209S\",\"Q0D20W7\",\"Q0D20WP\",\"Q0D20WQ\",\"Q0D20WR\",\"Q0D20WS\",\"Q0D20X7\",\"Q0D20XP\",\"Q0D20XQ\",\"Q0D20XR\",\"Q0D20XS\",\"Q0D20Y7\",\"Q0D20YP\",\"Q0D20YQ\",\"Q0D20YR\",\"Q0D20YS\",\"Q0D20Z7\",\"Q0D20ZP\",\"Q0D20ZQ\",\"Q0D20ZR\",\"Q0D20ZS\",\"Q0DA097\",\"Q0DA09P\",\"Q0DA09Q\",\"Q0DA09R\",\"Q0DA09S\",\"Q0DA0W7\",\"Q0DA0WP\",\"Q0DA0WQ\",\"Q0DA0WR\",\"Q0DA0WS\",\"Q0DA0X7\",\"Q0DA0XP\",\"Q0DA0XQ\",\"Q0DA0XR\",\"Q0DA0XS\",\"Q0DA0Y7\",\"Q0DA0YP\",\"Q0DA0YQ\",\"Q0DA0YR\",\"Q0DA0YS\",\"Q0DA0Z7\",\"Q0DA0ZP\",\"Q0DA0ZQ\",\"Q0DA0ZR\",\"Q0DA0ZS\",\"Q0DB097\",\"Q0DB09P\",\"Q0DB09Q\",\"Q0DB09R\",\"Q0DB09S\",\"Q0DB0W7\",\"Q0DB0WP\",\"Q0DB0WQ\",\"Q0DB0WR\",\"Q0DB0WS\",\"Q0DB0X7\",\"Q0DB0XP\",\"Q0DB0XQ\",\"Q0DB0XR\",\"Q0DB0XS\",\"Q0DB0Y7\",\"Q0DB0YP\",\"Q0DB0YQ\",\"Q0DB0YR\",\"Q0DB0YS\",\"Q0DB0Z7\",\"Q0DB0ZP\",\"Q0DB0ZQ\",\"Q0DB0ZR\",\"Q0DB0ZS\",\"Q0DC097\",\"Q0DC09P\",\"Q0DC09Q\",\"Q0DC09R\",\"Q0DC09S\",\"Q0DC0W7\",\"Q0DC0WP\",\"Q0DC0WQ\",\"Q0DC0WR\",\"Q0DC0WS\",\"Q0DC0X7\",\"Q0DC0XP\",\"Q0DC0XQ\",\"Q0DC0XR\",\"Q0DC0XS\",\"Q0DC0Y7\",\"Q0DC0YP\",\"Q0DC0YQ\",\"Q0DC0YR\",\"Q0DC0YS\",\"Q0DC0Z7\",\"Q0DC0ZP\",\"Q0DC0ZQ\",\"Q0DC0ZR\",\"Q0DC0ZS\",\"Q0E2097\",\"Q0E209P\",\"Q0E209Q\",\"Q0E209R\",\"Q0E209S\",\"Q0E20W7\",\"Q0E20WP\",\"Q0E20WQ\",\"Q0E20WR\",\"Q0E20WS\",\"Q0E20X7\",\"Q0E20XP\",\"Q0E20XQ\",\"Q0E20XR\",\"Q0E20XS\",\"Q0E20Y7\",\"Q0E20YP\",\"Q0E20YQ\",\"Q0E20YR\",\"Q0E20YS\",\"Q0E20Z7\",\"Q0E20ZP\",\"Q0E20ZQ\",\"Q0E20ZR\",\"Q0E20ZS\",\"Q0EA097\",\"Q0EA09P\",\"Q0EA09Q\",\"Q0EA09R\",\"Q0EA09S\",\"Q0EA0W7\",\"Q0EA0WP\",\"Q0EA0WQ\",\"Q0EA0WR\",\"Q0EA0WS\",\"Q0EA0X7\",\"Q0EA0XP\",\"Q0EA0XQ\",\"Q0EA0XR\",\"Q0EA0XS\",\"Q0EA0Y7\",\"Q0EA0YP\",\"Q0EA0YQ\",\"Q0EA0YR\",\"Q0EA0YS\",\"Q0EA0Z7\",\"Q0EA0ZP\",\"Q0EA0ZQ\",\"Q0EA0ZR\",\"Q0EA0ZS\",\"Q0EB097\",\"Q0EB09P\",\"Q0EB09Q\",\"Q0EB09R\",\"Q0EB09S\",\"Q0EB0W7\",\"Q0EB0WP\",\"Q0EB0WQ\",\"Q0EB0WR\",\"Q0EB0WS\",\"Q0EB0X7\",\"Q0EB0XP\",\"Q0EB0XQ\",\"Q0EB0XR\",\"Q0EB0XS\",\"Q0EB0Y7\",\"Q0EB0YP\",\"Q0EB0YQ\",\"Q0EB0YR\",\"Q0EB0YS\",\"Q0EB0Z7\",\"Q0EB0ZP\",\"Q0EB0ZQ\",\"Q0EB0ZR\",\"Q0EB0ZS\",\"Q0EC097\",\"Q0EC09P\",\"Q0EC09Q\",\"Q0EC09R\",\"Q0EC09S\",\"Q0EC0W7\",\"Q0EC0WP\",\"Q0EC0WQ\",\"Q0EC0WR\",\"Q0EC0WS\",\"Q0EC0X7\",\"Q0EC0XP\",\"Q0EC0XQ\",\"Q0EC0XR\",\"Q0EC0XS\",\"Q0EC0Y7\",\"Q0EC0YP\",\"Q0EC0YQ\",\"Q0EC0YR\",\"Q0EC0YS\",\"Q0EC0Z7\",\"Q0EC0ZP\",\"Q0EC0ZQ\",\"Q0EC0ZR\",\"Q0EC0ZS\",\"Q0F2097\",\"Q0F209P\",\"Q0F209Q\",\"Q0F209R\",\"Q0F209S\",\"Q0F20W7\",\"Q0F20WP\",\"Q0F20WQ\",\"Q0F20WR\",\"Q0F20WS\",\"Q0F20X7\",\"Q0F20XP\",\"Q0F20XQ\",\"Q0F20XR\",\"Q0F20XS\",\"Q0F20Y7\",\"Q0F20YP\",\"Q0F20YQ\",\"Q0F20YR\",\"Q0F20YS\",\"Q0F20Z7\",\"Q0F20ZP\",\"Q0F20ZQ\",\"Q0F20ZR\",\"Q0F20ZS\",\"Q0FA097\",\"Q0FA09P\",\"Q0FA09Q\",\"Q0FA09R\",\"Q0FA09S\",\"Q0FA0W7\",\"Q0FA0WP\",\"Q0FA0WQ\",\"Q0FA0WR\",\"Q0FA0WS\",\"Q0FA0X7\",\"Q0FA0XP\",\"Q0FA0XQ\",\"Q0FA0XR\",\"Q0FA0XS\",\"Q0FA0Y7\",\"Q0FA0YP\",\"Q0FA0YQ\",\"Q0FA0YR\",\"Q0FA0YS\",\"Q0FA0Z7\",\"Q0FA0ZP\",\"Q0FA0ZQ\",\"Q0FA0ZR\",\"Q0FA0ZS\",\"Q0FB097\",\"Q0FB09P\",\"Q0FB09Q\",\"Q0FB09R\",\"Q0FB09S\",\"Q0FB0W7\",\"Q0FB0WP\",\"Q0FB0WQ\",\"Q0FB0WR\",\"Q0FB0WS\",\"Q0FB0X7\",\"Q0FB0XP\",\"Q0FB0XQ\",\"Q0FB0XR\",\"Q0FB0XS\",\"Q0FB0Y7\",\"Q0FB0YP\",\"Q0FB0YQ\",\"Q0FB0YR\",\"Q0FB0YS\",\"Q0FB0Z7\",\"Q0FB0ZP\",\"Q0FB0ZQ\",\"Q0FB0ZR\",\"Q0FB0ZS\",\"Q0FC097\",\"Q0FC09P\",\"Q0FC09Q\",\"Q0FC09R\",\"Q0FC09S\",\"Q0FC0W7\",\"Q0FC0WP\",\"Q0FC0WQ\",\"Q0FC0WR\",\"Q0FC0WS\",\"Q0FC0X7\",\"Q0FC0XP\",\"Q0FC0XQ\",\"Q0FC0XR\",\"Q0FC0XS\",\"Q0FC0Y7\",\"Q0FC0YP\",\"Q0FC0YQ\",\"Q0FC0YR\",\"Q0FC0YS\",\"Q0FC0Z7\",\"Q0FC0ZP\",\"Q0FC0ZQ\",\"Q0FC0ZR\",\"Q0FC0ZS\",\"R032097\",\"R03209P\",\"R03209Q\",\"R03209R\",\"R03209S\",\"R0320W7\",\"R0320WP\",\"R0320WQ\",\"R0320WR\",\"R0320WS\",\"R0320X7\",\"R0320XP\",\"R0320XQ\",\"R0320XR\",\"R0320XS\",\"R0320Y7\",\"R0320YP\",\"R0320YQ\",\"R0320YR\",\"R0320YS\",\"R0320Z7\",\"R0320ZP\",\"R0320ZQ\",\"R0320ZR\",\"R0320ZS\",\"R03A097\",\"R03A09P\",\"R03A09Q\",\"R03A09R\",\"R03A09S\",\"R03A0W7\",\"R03A0WP\",\"R03A0WQ\",\"R03A0WR\",\"R03A0WS\",\"R03A0X7\",\"R03A0XP\",\"R03A0XQ\",\"R03A0XR\",\"R03A0XS\",\"R03A0Y7\",\"R03A0YP\",\"R03A0YQ\",\"R03A0YR\",\"R03A0YS\",\"R03A0Z7\",\"R03A0ZP\",\"R03A0ZQ\",\"R03A0ZR\",\"R03A0ZS\",\"R03B097\",\"R03B09P\",\"R03B09Q\",\"R03B09R\",\"R03B09S\",\"R03B0W7\",\"R03B0WP\",\"R03B0WQ\",\"R03B0WR\",\"R03B0WS\",\"R03B0X7\",\"R03B0XP\",\"R03B0XQ\",\"R03B0XR\",\"R03B0XS\",\"R03B0Y7\",\"R03B0YP\",\"R03B0YQ\",\"R03B0YR\",\"R03B0YS\",\"R03B0Z7\",\"R03B0ZP\",\"R03B0ZQ\",\"R03B0ZR\",\"R03B0ZS\",\"R03C097\",\"R03C09P\",\"R03C09Q\",\"R03C09R\",\"R03C09S\",\"R03C0W7\",\"R03C0WP\",\"R03C0WQ\",\"R03C0WR\",\"R03C0WS\",\"R03C0X7\",\"R03C0XP\",\"R03C0XQ\",\"R03C0XR\",\"R03C0XS\",\"R03C0Y7\",\"R03C0YP\",\"R03C0YQ\",\"R03C0YR\",\"R03C0YS\",\"R03C0Z7\",\"R03C0ZP\",\"R03C0ZQ\",\"R03C0ZR\",\"R03C0ZS\",\"R0D2097\",\"R0D209P\",\"R0D209Q\",\"R0D209R\",\"R0D209S\",\"R0D20W7\",\"R0D20WP\",\"R0D20WQ\",\"R0D20WR\",\"R0D20WS\",\"R0D20X7\",\"R0D20XP\",\"R0D20XQ\",\"R0D20XR\",\"R0D20XS\",\"R0D20Y7\",\"R0D20YP\",\"R0D20YQ\",\"R0D20YR\",\"R0D20YS\",\"R0D20Z7\",\"R0D20ZP\",\"R0D20ZQ\",\"R0D20ZR\",\"R0D20ZS\",\"R0DA097\",\"R0DA09P\",\"R0DA09Q\",\"R0DA09R\",\"R0DA09S\",\"R0DA0W7\",\"R0DA0WP\",\"R0DA0WQ\",\"R0DA0WR\",\"R0DA0WS\",\"R0DA0X7\",\"R0DA0XP\",\"R0DA0XQ\",\"R0DA0XR\",\"R0DA0XS\",\"R0DA0Y7\",\"R0DA0YP\",\"R0DA0YQ\",\"R0DA0YR\",\"R0DA0YS\",\"R0DA0Z7\",\"R0DA0ZP\",\"R0DA0ZQ\",\"R0DA0ZR\",\"R0DA0ZS\",\"R0DB097\",\"R0DB09P\",\"R0DB09Q\",\"R0DB09R\",\"R0DB09S\",\"R0DB0W7\",\"R0DB0WP\",\"R0DB0WQ\",\"R0DB0WR\",\"R0DB0WS\",\"R0DB0X7\",\"R0DB0XP\",\"R0DB0XQ\",\"R0DB0XR\",\"R0DB0XS\",\"R0DB0Y7\",\"R0DB0YP\",\"R0DB0YQ\",\"R0DB0YR\",\"R0DB0YS\",\"R0DB0Z7\",\"R0DB0ZP\",\"R0DB0ZQ\",\"R0DB0ZR\",\"R0DB0ZS\",\"R0DC097\",\"R0DC09P\",\"R0DC09Q\",\"R0DC09R\",\"R0DC09S\",\"R0DC0W7\",\"R0DC0WP\",\"R0DC0WQ\",\"R0DC0WR\",\"R0DC0WS\",\"R0DC0X7\",\"R0DC0XP\",\"R0DC0XQ\",\"R0DC0XR\",\"R0DC0XS\",\"R0DC0Y7\",\"R0DC0YP\",\"R0DC0YQ\",\"R0DC0YR\",\"R0DC0YS\",\"R0DC0Z7\",\"R0DC0ZP\",\"R0DC0ZQ\",\"R0DC0ZR\",\"R0DC0ZS\",\"R0E2097\",\"R0E209P\",\"R0E209Q\",\"R0E209R\",\"R0E209S\",\"R0E20W7\",\"R0E20WP\",\"R0E20WQ\",\"R0E20WR\",\"R0E20WS\",\"R0E20X7\",\"R0E20XP\",\"R0E20XQ\",\"R0E20XR\",\"R0E20XS\",\"R0E20Y7\",\"R0E20YP\",\"R0E20YQ\",\"R0E20YR\",\"R0E20YS\",\"R0E20Z7\",\"R0E20ZP\",\"R0E20ZQ\",\"R0E20ZR\",\"R0E20ZS\",\"R0EA097\",\"R0EA09P\",\"R0EA09Q\",\"R0EA09R\",\"R0EA09S\",\"R0EA0W7\",\"R0EA0WP\",\"R0EA0WQ\",\"R0EA0WR\",\"R0EA0WS\",\"R0EA0X7\",\"R0EA0XP\",\"R0EA0XQ\",\"R0EA0XR\",\"R0EA0XS\",\"R0EA0Y7\",\"R0EA0YP\",\"R0EA0YQ\",\"R0EA0YR\",\"R0EA0YS\",\"R0EA0Z7\",\"R0EA0ZP\",\"R0EA0ZQ\",\"R0EA0ZR\",\"R0EA0ZS\",\"R0EB097\",\"R0EB09P\",\"R0EB09Q\",\"R0EB09R\",\"R0EB09S\",\"R0EB0W7\",\"R0EB0WP\",\"R0EB0WQ\",\"R0EB0WR\",\"R0EB0WS\",\"R0EB0X7\",\"R0EB0XP\",\"R0EB0XQ\",\"R0EB0XR\",\"R0EB0XS\",\"R0EB0Y7\",\"R0EB0YP\",\"R0EB0YQ\",\"R0EB0YR\",\"R0EB0YS\",\"R0EB0Z7\",\"R0EB0ZP\",\"R0EB0ZQ\",\"R0EB0ZR\",\"R0EB0ZS\",\"R0EC097\",\"R0EC09P\",\"R0EC09Q\",\"R0EC09R\",\"R0EC09S\",\"R0EC0W7\",\"R0EC0WP\",\"R0EC0WQ\",\"R0EC0WR\",\"R0EC0WS\",\"R0EC0X7\",\"R0EC0XP\",\"R0EC0XQ\",\"R0EC0XR\",\"R0EC0XS\",\"R0EC0Y7\",\"R0EC0YP\",\"R0EC0YQ\",\"R0EC0YR\",\"R0EC0YS\",\"R0EC0Z7\",\"R0EC0ZP\",\"R0EC0ZQ\",\"R0EC0ZR\",\"R0EC0ZS\",\"R0F2097\",\"R0F209P\",\"R0F209Q\",\"R0F209R\",\"R0F209S\",\"R0F20W7\",\"R0F20WP\",\"R0F20WQ\",\"R0F20WR\",\"R0F20WS\",\"R0F20X7\",\"R0F20XP\",\"R0F20XQ\",\"R0F20XR\",\"R0F20XS\",\"R0F20Y7\",\"R0F20YP\",\"R0F20YQ\",\"R0F20YR\",\"R0F20YS\",\"R0F20Z7\",\"R0F20ZP\",\"R0F20ZQ\",\"R0F20ZR\",\"R0F20ZS\",\"R0FA097\",\"R0FA09P\",\"R0FA09Q\",\"R0FA09R\",\"R0FA09S\",\"R0FA0W7\",\"R0FA0WP\",\"R0FA0WQ\",\"R0FA0WR\",\"R0FA0WS\",\"R0FA0X7\",\"R0FA0XP\",\"R0FA0XQ\",\"R0FA0XR\",\"R0FA0XS\",\"R0FA0Y7\",\"R0FA0YP\",\"R0FA0YQ\",\"R0FA0YR\",\"R0FA0YS\",\"R0FA0Z7\",\"R0FA0ZP\",\"R0FA0ZQ\",\"R0FA0ZR\",\"R0FA0ZS\",\"R0FB097\",\"R0FB09P\",\"R0FB09Q\",\"R0FB09R\",\"R0FB09S\",\"R0FB0W7\",\"R0FB0WP\",\"R0FB0WQ\",\"R0FB0WR\",\"R0FB0WS\",\"R0FB0X7\",\"R0FB0XP\",\"R0FB0XQ\",\"R0FB0XR\",\"R0FB0XS\",\"R0FB0Y7\",\"R0FB0YP\",\"R0FB0YQ\",\"R0FB0YR\",\"R0FB0YS\",\"R0FB0Z7\",\"R0FB0ZP\",\"R0FB0ZQ\",\"R0FB0ZR\",\"R0FB0ZS\",\"R0FC097\",\"R0FC09P\",\"R0FC09Q\",\"R0FC09R\",\"R0FC09S\",\"R0FC0W7\",\"R0FC0WP\",\"R0FC0WQ\",\"R0FC0WR\",\"R0FC0WS\",\"R0FC0X7\",\"R0FC0XP\",\"R0FC0XQ\",\"R0FC0XR\",\"R0FC0XS\",\"R0FC0Y7\",\"R0FC0YP\",\"R0FC0YQ\",\"R0FC0YR\",\"R0FC0YS\",\"R0FC0Z7\",\"R0FC0ZP\",\"R0FC0ZQ\",\"R0FC0ZR\",\"R0FC0ZS\",\"S032097\",\"S03209P\",\"S03209Q\",\"S03209R\",\"S03209S\",\"S0320W7\",\"S0320WP\",\"S0320WQ\",\"S0320WR\",\"S0320WS\",\"S0320X7\",\"S0320XP\",\"S0320XQ\",\"S0320XR\",\"S0320XS\",\"S0320Y7\",\"S0320YP\",\"S0320YQ\",\"S0320YR\",\"S0320YS\",\"S0320Z7\",\"S0320ZP\",\"S0320ZQ\",\"S0320ZR\",\"S0320ZS\",\"S03A097\",\"S03A09P\",\"S03A09Q\",\"S03A09R\",\"S03A09S\",\"S03A0W7\",\"S03A0WP\",\"S03A0WQ\",\"S03A0WR\",\"S03A0WS\",\"S03A0X7\",\"S03A0XP\",\"S03A0XQ\",\"S03A0XR\",\"S03A0XS\",\"S03A0Y7\",\"S03A0YP\",\"S03A0YQ\",\"S03A0YR\",\"S03A0YS\",\"S03A0Z7\",\"S03A0ZP\",\"S03A0ZQ\",\"S03A0ZR\",\"S03A0ZS\",\"S03B097\",\"S03B09P\",\"S03B09Q\",\"S03B09R\",\"S03B09S\",\"S03B0W7\",\"S03B0WP\",\"S03B0WQ\",\"S03B0WR\",\"S03B0WS\",\"S03B0X7\",\"S03B0XP\",\"S03B0XQ\",\"S03B0XR\",\"S03B0XS\",\"S03B0Y7\",\"S03B0YP\",\"S03B0YQ\",\"S03B0YR\",\"S03B0YS\",\"S03B0Z7\",\"S03B0ZP\",\"S03B0ZQ\",\"S03B0ZR\",\"S03B0ZS\",\"S03C097\",\"S03C09P\",\"S03C09Q\",\"S03C09R\",\"S03C09S\",\"S03C0W7\",\"S03C0WP\",\"S03C0WQ\",\"S03C0WR\",\"S03C0WS\",\"S03C0X7\",\"S03C0XP\",\"S03C0XQ\",\"S03C0XR\",\"S03C0XS\",\"S03C0Y7\",\"S03C0YP\",\"S03C0YQ\",\"S03C0YR\",\"S03C0YS\",\"S03C0Z7\",\"S03C0ZP\",\"S03C0ZQ\",\"S03C0ZR\",\"S03C0ZS\",\"S0D2097\",\"S0D209P\",\"S0D209Q\",\"S0D209R\",\"S0D209S\",\"S0D20W7\",\"S0D20WP\",\"S0D20WQ\",\"S0D20WR\",\"S0D20WS\",\"S0D20X7\",\"S0D20XP\",\"S0D20XQ\",\"S0D20XR\",\"S0D20XS\",\"S0D20Y7\",\"S0D20YP\",\"S0D20YQ\",\"S0D20YR\",\"S0D20YS\",\"S0D20Z7\",\"S0D20ZP\",\"S0D20ZQ\",\"S0D20ZR\",\"S0D20ZS\",\"S0DA097\",\"S0DA09P\",\"S0DA09Q\",\"S0DA09R\",\"S0DA09S\",\"S0DA0W7\",\"S0DA0WP\",\"S0DA0WQ\",\"S0DA0WR\",\"S0DA0WS\",\"S0DA0X7\",\"S0DA0XP\",\"S0DA0XQ\",\"S0DA0XR\",\"S0DA0XS\",\"S0DA0Y7\",\"S0DA0YP\",\"S0DA0YQ\",\"S0DA0YR\",\"S0DA0YS\",\"S0DA0Z7\",\"S0DA0ZP\",\"S0DA0ZQ\",\"S0DA0ZR\",\"S0DA0ZS\",\"S0DB097\",\"S0DB09P\",\"S0DB09Q\",\"S0DB09R\",\"S0DB09S\",\"S0DB0W7\",\"S0DB0WP\",\"S0DB0WQ\",\"S0DB0WR\",\"S0DB0WS\",\"S0DB0X7\",\"S0DB0XP\",\"S0DB0XQ\",\"S0DB0XR\",\"S0DB0XS\",\"S0DB0Y7\",\"S0DB0YP\",\"S0DB0YQ\",\"S0DB0YR\",\"S0DB0YS\",\"S0DB0Z7\",\"S0DB0ZP\",\"S0DB0ZQ\",\"S0DB0ZR\",\"S0DB0ZS\",\"S0DC097\",\"S0DC09P\",\"S0DC09Q\",\"S0DC09R\",\"S0DC09S\",\"S0DC0W7\",\"S0DC0WP\",\"S0DC0WQ\",\"S0DC0WR\",\"S0DC0WS\",\"S0DC0X7\",\"S0DC0XP\",\"S0DC0XQ\",\"S0DC0XR\",\"S0DC0XS\",\"S0DC0Y7\",\"S0DC0YP\",\"S0DC0YQ\",\"S0DC0YR\",\"S0DC0YS\",\"S0DC0Z7\",\"S0DC0ZP\",\"S0DC0ZQ\",\"S0DC0ZR\",\"S0DC0ZS\",\"S0E2097\",\"S0E209P\",\"S0E209Q\",\"S0E209R\",\"S0E209S\",\"S0E20W7\",\"S0E20WP\",\"S0E20WQ\",\"S0E20WR\",\"S0E20WS\",\"S0E20X7\",\"S0E20XP\",\"S0E20XQ\",\"S0E20XR\",\"S0E20XS\",\"S0E20Y7\",\"S0E20YP\",\"S0E20YQ\",\"S0E20YR\",\"S0E20YS\",\"S0E20Z7\",\"S0E20ZP\",\"S0E20ZQ\",\"S0E20ZR\",\"S0E20ZS\",\"S0EA097\",\"S0EA09P\",\"S0EA09Q\",\"S0EA09R\",\"S0EA09S\",\"S0EA0W7\",\"S0EA0WP\",\"S0EA0WQ\",\"S0EA0WR\",\"S0EA0WS\",\"S0EA0X7\",\"S0EA0XP\",\"S0EA0XQ\",\"S0EA0XR\",\"S0EA0XS\",\"S0EA0Y7\",\"S0EA0YP\",\"S0EA0YQ\",\"S0EA0YR\",\"S0EA0YS\",\"S0EA0Z7\",\"S0EA0ZP\",\"S0EA0ZQ\",\"S0EA0ZR\",\"S0EA0ZS\",\"S0EB097\",\"S0EB09P\",\"S0EB09Q\",\"S0EB09R\",\"S0EB09S\",\"S0EB0W7\",\"S0EB0WP\",\"S0EB0WQ\",\"S0EB0WR\",\"S0EB0WS\",\"S0EB0X7\",\"S0EB0XP\",\"S0EB0XQ\",\"S0EB0XR\",\"S0EB0XS\",\"S0EB0Y7\",\"S0EB0YP\",\"S0EB0YQ\",\"S0EB0YR\",\"S0EB0YS\",\"S0EB0Z7\",\"S0EB0ZP\",\"S0EB0ZQ\",\"S0EB0ZR\",\"S0EB0ZS\",\"S0EC097\",\"S0EC09P\",\"S0EC09Q\",\"S0EC09R\",\"S0EC09S\",\"S0EC0W7\",\"S0EC0WP\",\"S0EC0WQ\",\"S0EC0WR\",\"S0EC0WS\",\"S0EC0X7\",\"S0EC0XP\",\"S0EC0XQ\",\"S0EC0XR\",\"S0EC0XS\",\"S0EC0Y7\",\"S0EC0YP\",\"S0EC0YQ\",\"S0EC0YR\",\"S0EC0YS\",\"S0EC0Z7\",\"S0EC0ZP\",\"S0EC0ZQ\",\"S0EC0ZR\",\"S0EC0ZS\",\"S0F2097\",\"S0F209P\",\"S0F209Q\",\"S0F209R\",\"S0F209S\",\"S0F20W7\",\"S0F20WP\",\"S0F20WQ\",\"S0F20WR\",\"S0F20WS\",\"S0F20X7\",\"S0F20XP\",\"S0F20XQ\",\"S0F20XR\",\"S0F20XS\",\"S0F20Y7\",\"S0F20YP\",\"S0F20YQ\",\"S0F20YR\",\"S0F20YS\",\"S0F20Z7\",\"S0F20ZP\",\"S0F20ZQ\",\"S0F20ZR\",\"S0F20ZS\",\"S0FA097\",\"S0FA09P\",\"S0FA09Q\",\"S0FA09R\",\"S0FA09S\",\"S0FA0W7\",\"S0FA0WP\",\"S0FA0WQ\",\"S0FA0WR\",\"S0FA0WS\",\"S0FA0X7\",\"S0FA0XP\",\"S0FA0XQ\",\"S0FA0XR\",\"S0FA0XS\",\"S0FA0Y7\",\"S0FA0YP\",\"S0FA0YQ\",\"S0FA0YR\",\"S0FA0YS\",\"S0FA0Z7\",\"S0FA0ZP\",\"S0FA0ZQ\",\"S0FA0ZR\",\"S0FA0ZS\",\"S0FB097\",\"S0FB09P\",\"S0FB09Q\",\"S0FB09R\",\"S0FB09S\",\"S0FB0W7\",\"S0FB0WP\",\"S0FB0WQ\",\"S0FB0WR\",\"S0FB0WS\",\"S0FB0X7\",\"S0FB0XP\",\"S0FB0XQ\",\"S0FB0XR\",\"S0FB0XS\",\"S0FB0Y7\",\"S0FB0YP\",\"S0FB0YQ\",\"S0FB0YR\",\"S0FB0YS\",\"S0FB0Z7\",\"S0FB0ZP\",\"S0FB0ZQ\",\"S0FB0ZR\",\"S0FB0ZS\",\"S0FC097\",\"S0FC09P\",\"S0FC09Q\",\"S0FC09R\",\"S0FC09S\",\"S0FC0W7\",\"S0FC0WP\",\"S0FC0WQ\",\"S0FC0WR\",\"S0FC0WS\",\"S0FC0X7\",\"S0FC0XP\",\"S0FC0XQ\",\"S0FC0XR\",\"S0FC0XS\",\"S0FC0Y7\",\"S0FC0YP\",\"S0FC0YQ\",\"S0FC0YR\",\"S0FC0YS\",\"S0FC0Z7\",\"S0FC0ZP\",\"S0FC0ZQ\",\"S0FC0ZR\",\"S0FC0ZS\"]")));


	}

	@Test
	public void shouldReturnNotFound() throws Exception {
		this.mockMvc.perform(get("/api/v1//phonenumbers/")).andDo(print()).andExpect(status().isNotFound(
				)) .andExpect(content().string(containsString("")));

	}
}