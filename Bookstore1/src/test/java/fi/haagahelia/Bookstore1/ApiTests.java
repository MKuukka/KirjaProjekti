package fi.haagahelia.Bookstore1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class ApiTests {
	
	@Autowired
	
	private WebApplicationContext webAppContext;
	
	@BeforeEach
	public void SetUp() {
		
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
	}
	
	@Test 
	public void checkStatus() throws Exception {
		this.mockMvc.perform(get("/books")).andExpect(status().isOk());
	}
	
	@Test 
	public void checkResponseTypeJSON() throws Exception {
		this.mockMvc.perform(get("/books")).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	@Test 
	public void apiStatusIsOk() throws Exception {
		this.mockMvc.perform(get("/api/books")).andExpect(status().isOk());
	}
}
