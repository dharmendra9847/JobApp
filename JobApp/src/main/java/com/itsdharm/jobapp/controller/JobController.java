package com.itsdharm.jobapp.controller;

import com.itsdharm.jobapp.model.JobPost;
import com.itsdharm.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    private JobService jobService;

    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost job) {
        jobService.addJob(job);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model) {
        List<JobPost> allJobs = jobService.getAllJobs();
        model.addAttribute("jobPosts", allJobs);
        return "viewalljobs";
    }
}
