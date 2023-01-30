package com.SchoolParentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolParentService.Entity.Parent;

public interface ParentRepo extends JpaRepository<Parent,Long>{

}
