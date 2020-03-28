package com.leave.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leave.entity.LeaveType;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveType, Long>{

}
