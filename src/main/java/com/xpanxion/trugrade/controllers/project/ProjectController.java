package com.xpanxion.trugrade.controllers.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xpanxion.trugrade.controllers.ControllerConstants;
import com.xpanxion.trugrade.services.ProjectService;

@Controller
@RequestMapping(value = "/{projectName}")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getProject(Model model, @PathVariable String projectName) {
		model.addAttribute("projects", this.projectService.getProjectByName(projectName));
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
