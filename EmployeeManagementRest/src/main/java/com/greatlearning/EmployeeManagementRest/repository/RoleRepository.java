package com.greatlearning.EmployeeManagementRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagementRest.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
