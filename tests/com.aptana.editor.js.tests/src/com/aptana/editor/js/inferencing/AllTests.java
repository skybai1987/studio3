package com.aptana.editor.js.inferencing;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite("Tests for com.aptana.editor.js.contentassist");
		//$JUnit-BEGIN$
		suite.addTestSuite(InferencingTests.class);
		suite.addTestSuite(ScopeTests.class);
		//$JUnit-END$
		return suite;
	}

}