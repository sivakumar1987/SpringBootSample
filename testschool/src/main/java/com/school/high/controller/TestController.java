package com.school.high.controller;



import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.high.repository.SchoolDeatilsRepo;
import com.school.high.response.ResponseSchoolDetails;

import javassist.NotFoundException;

@RestController
@RequestMapping("/school")
public class TestController {
	
	@Autowired
	SchoolDeatilsRepo schoolRepo;
	Logger logger = LoggerFactory.getLogger(TestController.class);
	@GetMapping("/getSchoolName/{schoolId}")
	 ResponseSchoolDetails getSchoolName(@PathVariable int schoolId) throws NotFoundException  {
		logger.info(" Get School Name  :: getSchoolName() ");
		return schoolRepo.findById(schoolId).orElseThrow(() -> new NotFoundException("school not found with id " + schoolId));
		
		
	}
	
	@PostMapping("/setNewSchool")
	ResponseSchoolDetails setNewSchool(@RequestBody ResponseSchoolDetails responseSchoolDetails)
	{
		logger.info(" Get School Name  :: setNewSchool() Started");
		responseSchoolDetails = schoolRepo.save(responseSchoolDetails);
		logger.info(" Get School Name  :: setNewSchool() Completed");
		return responseSchoolDetails;
	}
	
	

}
