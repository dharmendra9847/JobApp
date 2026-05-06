package com.itstech.dharm.springboot_rest.controller;

import com.itstech.dharm.springboot_rest.model.JobPost;
import com.itstech.dharm.springboot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    private JobService jobService;

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    /*@PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost job) {
        jobService.addJob(job);
        return job;
    }*/

    @PostMapping(path = "jobPost", consumes = {"application/xml"})
    public JobPost addJob(@RequestBody JobPost job) {
        jobService.addJob(job);
        return job;
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobByPostId(@PathVariable  int postId) {
        return jobService.getJobByJobPostId(postId);
    }

//    @GetMapping("jobPosts")
//    //@ResponseBody
//    public List<JobPost> getAllJobs() {
//        return jobService.getAllJobs();
//    }

    @GetMapping(path = "jobPosts", produces = {"application/json"})
    //@ResponseBody
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost job) {
        jobService.updateJob(job);
        return jobService.getJobByJobPostId(job.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJobByPostId(@PathVariable int postId) {
        jobService.deleteJob(postId);
        return "data deleted successfully";
    }
}
