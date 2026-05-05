package com.itsdharm.jobapp.service;

import com.itsdharm.jobapp.model.JobPost;
import com.itsdharm.jobapp.repositories.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private JobRepo jobRepo;

    @Autowired
    public void setJobRepo(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    @Override
    public void addJob(JobPost job) {
        jobRepo.addJob(job);
    }

    @Override
    public List<JobPost> getAllJobs() {
        return jobRepo.getAllJobs();
    }
}
