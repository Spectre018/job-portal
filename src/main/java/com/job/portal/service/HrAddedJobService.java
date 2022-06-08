package com.job.portal.service;


import com.job.portal.model.HrAddedJob;

import java.util.List;

public interface HrAddedJobService {
    HrAddedJob getHrAddedJobById(Long id);
    List<HrAddedJob> getAllHrAddedJobs();
    void saveHrAddedJob(HrAddedJob hrAddedJob);
    void deleteHrAddedJobById(Long id);
}
