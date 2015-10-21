package com.xpanxion.trugrade.controllers.testcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/testcase/{id}/edit")
public class EditTestCaseController2 extends BaseTestCaseController {

	public static final String EDIT_TEST_CASE_VIEW = "edit-testcase";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAddTestCase(@PathVariable Long id, Model model) {
		model.addAttribute("testcase", this.testCaseDao.findOne(id));
		return EDIT_TEST_CASE_VIEW;
	}
}
