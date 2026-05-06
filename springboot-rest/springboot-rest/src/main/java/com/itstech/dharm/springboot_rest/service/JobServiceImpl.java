package com.itstech.dharm.springboot_rest.service;

import com.itstech.dharm.springboot_rest.model.JobPost;
import com.itstech.dharm.springboot_rest.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private JobRepository  jobRepository;

    @Autowired
    public void setJobRepository(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void addJob(JobPost job) {
        jobRepository.addJob(job);
    }

    @Override
    public JobPost getJobByJobPostId(int postId) {
        return jobRepository.getJobByJobPostId(postId);
    }

    @Override
    public List<JobPost> getAllJobs() {
        return jobRepository.getAllJobs();
    }

    @Override
    public void updateJob(JobPost job) {
        jobRepository.updateJob(job);
    }

    @Override
    public void deleteJob(int postId) {
        jobRepository.deleteJob(postId);
    }
}
