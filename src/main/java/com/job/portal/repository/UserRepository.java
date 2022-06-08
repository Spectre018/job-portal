package com.job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
}