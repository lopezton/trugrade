package com.xpanxion.trugrade.services;

import java.util.List;

import com.xpanxion.trugrade.objects.Project;
import com.xpanxion.trugrade.objects.TestCase;
import com.xpanxion.trugrade.objects.TestGroup;

public interface ProjectService {

	/**
	 * 
	 * @param testCaseId
	 * @return
	 */
	TestCase getTestCase(Long testCaseId);

	/**
	 * 
	 * @param projectName
	 * @return
	 */
	Iterable<TestCase> getTestCasesByProjectName(Long projectName);

	/**
	 * 
	 * @param projectName
	 * @return
	 */
	TestGroup getTestGroupsByProject(String projectName);

	/**
	 * 
	 * @param projectName
	 * @param testGroupName
	 * @return
	 */
	Iterable<TestGroup> getTestGroup(Long projectName, String testGroupName);

	/**
	 * 
	 * @param projectName
	 * @return
	 */
	TestGroup getProjectByName(String projectName);

	/**
	 * 
	 * @return
	 */
	Iterable<Project> getProjects();

	/**
	 * 
	 * @param testCase
	 * @return
	 */
	TestCase addTestCase(TestCase testCase);

	/**
	 * 
	 * @param testCase
	 */
	void updateTestCase(TestCase testCase);

	/**
	 * 
	 * @param testCaseId
	 */
	void removeTestCase(Long testCaseId);

	/**
	 * 
	 * @return
	 */
	Iterable<TestCase> getAllTestCases();

	/**
	 * 
	 * @param testCases
	 * @return
	 */
	Iterable<TestCase> addAllTestCases(List<TestCase> testCases);

}
