package com.xpanxion.trugrade.controllers.testcase;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xpanxion.trugrade.controllers.ControllerConstants;
import com.xpanxion.trugrade.objects.TestCase;

@Controller
@RequestMapping(value = "/testcase")
public class TestCaseController extends BaseTestCaseController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getTestCases(HttpServletRequest request, Model model) {
		model.addAttribute("testCases", this.projectService.getAllTestCases());
		return ControllerConstants.VIEW_TEST_CASE;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Iterable<TestCase> addTestCases(@Valid @RequestBody List<TestCase> testCases) {
		return this.projectService.addAllTestCases(testCases);
	}
}
