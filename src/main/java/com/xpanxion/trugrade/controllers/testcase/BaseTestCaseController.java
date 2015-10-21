package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.beans.factory.annotation.Autowired;

import com.xpanxion.trugrade.dao.TestCaseDao;
import com.xpanxion.trugrade.objects.TestCase;

public class BaseTestCaseController {

	@Autowired
	protected TestCaseDao testCaseDao;
	
	protected TestCase addTestCase(TestCase testCase) {
		return this.testCaseDao.save(testCase);
	}
}
