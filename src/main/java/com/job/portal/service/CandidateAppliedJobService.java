package com.job.portal.service;


import com.job.portal.model.CandidateAppliedJob;

import java.util.List;

public interface CandidateAppliedJobService {
    List<CandidateAppliedJob> getAllAppliedJobs();
    CandidateAppliedJob getCandidateAppliedJobById(Long id);
    void saveCandidateAppliedJob(CandidateAppliedJob candidateAppliedJob);
}
