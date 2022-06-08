package com.job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.model.CandidateSkill;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Long> {
}