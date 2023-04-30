package com.example.JobSearchPortal.controller;

import com.example.JobSearchPortal.model.Job;
import com.example.JobSearchPortal.model.JobType;
import com.example.JobSearchPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {

    @Autowired
    JobService jobService;

    // get job by type
    @GetMapping(value = "/type/{jobType}")
    public List<Job> getJobBasedOnType(@PathVariable JobType jobType)
    {
        return jobService.getJobBasedOnType(jobType);
    }
    // post
    @PostMapping(value = "/")
    public String searchJobs(@RequestBody List<Job> jobList)
    {
        return jobService.searchJobs(jobList);
    }


}
