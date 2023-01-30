package com.SchoolParentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolParentService.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Long> {

}
