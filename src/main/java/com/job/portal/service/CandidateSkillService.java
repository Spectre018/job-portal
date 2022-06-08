package com.job.portal.service;


import com.job.portal.model.CandidateSkill;

public interface CandidateSkillService {
    void saveCandidateSkill(CandidateSkill candidateSkill);
    CandidateSkill findById(Long id);
}
