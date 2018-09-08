package sample.ws;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sample.ws.bussines.StudentService;
import sample.ws.model.Student;
import sample.ws.model.StudentDto;
import sample.ws.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JaxwsSpringBootApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(JaxwsSpringBootApplicationTests.class);

	@Autowired
	private StudentService studentService;



	@Before
	public void init() {

	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void StudentServiceImplTest() {
		Long id = 1L;
		Student s = studentService.getStudentById(id);
	
		logger.info(s.toString());
		assert (s.getId() == id.longValue());
	}
	
	@Test
	public void StudentServiceImplIndexTest() {
		String expected = "Index default message";
		String s = studentService.index();
		assert(s.equals(expected));
		
	}
}
