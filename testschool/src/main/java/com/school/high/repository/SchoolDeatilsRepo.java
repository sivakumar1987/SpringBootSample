package com.school.high.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.high.response.ResponseSchoolDetails;

@Repository
public interface SchoolDeatilsRepo extends JpaRepository<ResponseSchoolDetails,Integer> {

}
