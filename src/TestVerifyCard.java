import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestVerifyCard {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
	//valid card
		VerifyCard card1 = new VerifyCard("1234501234512344");
		assertTrue("checkCard method shows that the valid card(card1) is invalid", card1.checkCard());
	}
	@Test
	public void test2(){
		//invalid card
		VerifyCard card2 = new VerifyCard("1234501234512345");
		assertFalse("checkCard method shows that the invalid card(card2) is valid", card2.checkCard());
	}
}
