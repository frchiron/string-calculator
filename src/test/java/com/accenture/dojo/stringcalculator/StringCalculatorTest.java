package com.accenture.dojo.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void check_setup_ready() {
		StringCalculator stringCalculator = new StringCalculator();
		
		// Test
        int result = stringCalculator.add("1");

        // Assertions
        assertThat(result).isEqualTo(-1);
	}

}
