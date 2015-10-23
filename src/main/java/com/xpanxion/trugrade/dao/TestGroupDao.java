package com.xpanxion.trugrade.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.xpanxion.trugrade.objects.TestGroup;

public interface TestGroupDao extends CrudRepository<TestGroup, Long> {

	/**
	 * 
	 * @param name 
	 * @param project 
	 * @return
	 */
	@Query("SELECT tg FROM TestGroup tg, Project p WHERE tg.project = p.id AND p.name = :projectName AND tg.name = :name")
	TestGroup findOneByProjectNameAndName(@Param("projectName") String projectName, @Param("name") String name);

	/**
	 * 
	 * @param project
	 * @return
	 */
	@Query("SELECT tg FROM TestGroup tg, Project p WHERE tg.project = p.id AND p.name = :projectName")
	Iterable<TestGroup> findByProjectName(String projectName);

}
