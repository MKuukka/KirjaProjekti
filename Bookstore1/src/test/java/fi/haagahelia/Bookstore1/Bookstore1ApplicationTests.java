package fi.haagahelia.Bookstore1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import fi.haagahelia.Bookstore1.web.Bookstore1Controller;


@SpringBootTest
class Bookstore1ApplicationTests {

	@Autowired
	Bookstore1Controller bookstore1Controller;
	
	
	@Test
	void contextLoads() throws Exception {
		
		assertThat(bookstore1Controller).isNotNull();
	}

}
