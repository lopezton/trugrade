package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xpanxion.trugrade.controllers.ControllerConstants;
import com.xpanxion.trugrade.objects.TestCase;

@Controller
@RequestMapping(value = "/testcase/add")
public class AddTestCaseController extends BaseTestCaseController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAddTestCase() {
		return ControllerConstants.VIEW_ADD_TEST_CASE;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public TestCase getAddTestCase(TestCase testCase) {
		return this.addTestCase(testCase);
	}
}
