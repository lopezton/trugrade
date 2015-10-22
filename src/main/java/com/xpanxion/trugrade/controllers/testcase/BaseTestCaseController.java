package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.beans.factory.annotation.Autowired;

import com.xpanxion.trugrade.objects.TestCase;
import com.xpanxion.trugrade.services.ProjectService;

public class BaseTestCaseController {

	@Autowired
	protected ProjectService projectService;
	
	protected TestCase addTestCase(TestCase testCase) {
		return this.projectService.addTestCase(testCase);
	}
}
