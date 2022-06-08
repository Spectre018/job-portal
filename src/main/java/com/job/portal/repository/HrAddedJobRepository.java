package com.job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.model.HrAddedJob;

public interface HrAddedJobRepository extends JpaRepository<HrAddedJob, Long> {
}