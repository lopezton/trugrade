package com.xpanxion.trugrade.controllers.testcase;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xpanxion.trugrade.objects.TestCase;

@Controller
@RequestMapping(value = "/testcase/add")
public class AddTestCaseController extends BaseTestCaseController {

	public static final String ADD_TEST_CASE_VIEW = "add-testcase";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAddTestCase() {
		return ADD_TEST_CASE_VIEW;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public TestCase getAddTestCase(TestCase testCase) {
		System.out.println(ToStringBuilder.reflectionToString(testCase));
		return this.addTestCase(testCase);
	}
}
