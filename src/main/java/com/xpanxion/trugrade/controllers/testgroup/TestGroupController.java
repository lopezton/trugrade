package com.xpanxion.trugrade.controllers.testgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xpanxion.trugrade.controllers.ControllerConstants;
import com.xpanxion.trugrade.services.ProjectService;

@Controller
@RequestMapping(value = "/{projectName}/testgroup/{testGroupName}")
public class TestGroupController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getTestGroup(Model model, @PathVariable String projectName, @PathVariable String testGroupName) {
		model.addAttribute("testGroup", this.projectService.getTestGroup(projectName, testGroupName));
		return ControllerConstants.VIEW_PROJECT;
	}

	/**
	 * @return the projectService
	 */
	public ProjectService getProjectService() {
		return projectService;
	}

	/**
	 * @param projectService the projectService to set
	 */
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
}
