package com.job.portal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
