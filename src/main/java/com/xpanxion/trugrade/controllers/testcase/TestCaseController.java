package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xpanxion.trugrade.controllers.ControllerConstants;
import com.xpanxion.trugrade.objects.TestCase;

@Controller
@RequestMapping(value = "/{projectName}/testcase/{testCaseId}")
public class TestCaseController extends BaseTestCaseController {
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public TestCase addTestCase(@PathVariable Long testCaseId, TestCase testCase) {
		testCase.setId(testCaseId);
		return this.addTestCase(testCase);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public void updateTestCase(@PathVariable Long testCaseId, TestCase testCase) {
		testCase.setId(testCaseId);
		this.projectService.updateTestCase(testCase);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteTestCase(@PathVariable Long testCaseId) {
		this.projectService.removeTestCase(testCaseId);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getTestCase(@PathVariable Long id, Model model) {
		model.addAttribute("testcase", this.projectService.getTestCase(id));
		return ControllerConstants.VIEW_INDIVIDUAL_TEST_CASE;
	}
}
