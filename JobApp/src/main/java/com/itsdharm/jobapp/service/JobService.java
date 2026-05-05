package com.itsdharm.jobapp.service;

import com.itsdharm.jobapp.model.JobPost;

import java.util.List;

public interface JobService {

    void addJob(JobPost job);
    List<JobPost> getAllJobs();
}
