package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xpanxion.trugrade.objects.TestCase;

@Controller
@RequestMapping(value = "/testcase/{id}")
public class IndividualTestCaseController extends BaseTestCaseController {

	public static final String INDIVIDUAL_TEST_CASE_VIEW = "test-case-individual";
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public TestCase addTestCase(@PathVariable Long id, TestCase testCase) {
		testCase.setId(id);
		return this.addTestCase(testCase);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public void updateTestCase(@PathVariable Long id, TestCase testCase) {
		testCase.setId(id);
		this.testCaseDao.save(testCase);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteTestCase(@PathVariable Long id) {
		this.testCaseDao.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getTestCase(@PathVariable Long id, Model model) {
		model.addAttribute("testcase", this.testCaseDao.findOne(id));
		return INDIVIDUAL_TEST_CASE_VIEW;
	}
}
