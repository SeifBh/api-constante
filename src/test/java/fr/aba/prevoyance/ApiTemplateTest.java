package fr.aba.prevoyance;

import com.aviva.prevoyance.utilsmicroservice.component.avenant.TestUnitaireAPIAvenant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test-rest.yaml")
public class ApiTemplateTest {

	@Autowired private TestUnitaireAPIAvenant api;

	@LocalServerPort private int randomServerPort;

	@Value("${server.servlet.contextPath}") private String contextPath;

	@Value("${prevoyance.api.consumers}") private String appConsumers;

	@Value("${prevoyance.api.userKey}") private String appKey;

	@DisplayName("Test Example")
	@Test
	void whenFalseReturnFalse() {
		assertFalse(false);
	}

}
