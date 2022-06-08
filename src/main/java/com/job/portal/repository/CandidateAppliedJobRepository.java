package com.job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.model.CandidateAppliedJob;

public interface CandidateAppliedJobRepository extends JpaRepository<CandidateAppliedJob, Long> {
}