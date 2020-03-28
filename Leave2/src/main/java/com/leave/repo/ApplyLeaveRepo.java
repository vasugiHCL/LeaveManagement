package com.leave.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leave.entity.ApplyLeave;


@Repository
public interface ApplyLeaveRepo extends JpaRepository<ApplyLeave, Long>{
	
	

}
