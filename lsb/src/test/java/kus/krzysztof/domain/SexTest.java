package kus.krzysztof.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SexTest {
	Sex sex;
	
	@BeforeEach
	public void setUp() {
		sex = new Sex();
	}
	
	@Test
	public void testId() {
		Long idVal = 100L;
		
		sex.setId(idVal);
		
		assertEquals(idVal, sex.getId());
	}
	
	@Test
	public void testSex() {
		String sexVal = "Male";
		
		sex.setSex(sexVal);
		
		assertEquals(sexVal, sex.getSex());
	}
}
