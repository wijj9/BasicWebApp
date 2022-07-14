package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final QueryProcessor queryProcessor = new QueryProcessor();

//	@Test
//	void testEmptyStringIfCannotProcessQuery() {
//		assertEquals("", queryProcessor.process("test"));
//	}
//
//	@Test
//	void testKnowsAboutShakespeare() {
//		String actual = queryProcessor.process("Shakespeare");
//		assertEquals("Shakespeare",actual);
//	}


	@Test
	void answertheQuestion() {
		String actual = queryProcessor.process("what is your name");
		assertEquals("BigUnit",actual);
	}

}
