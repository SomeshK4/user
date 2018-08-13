package org.test.configuration;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public abstract class AbstractMockitoTest {

	@Before
	public void mockSetup() {
		MockitoAnnotations.initMocks(this);
	}

}
