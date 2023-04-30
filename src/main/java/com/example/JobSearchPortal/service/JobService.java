package com.example.JobSearchPortal.service;

import com.example.JobSearchPortal.model.Job;
import com.example.JobSearchPortal.model.JobType;
import com.example.JobSearchPortal.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class JobService {

    @Autowired
    IJobRepository jobRepo;

    public List<Job> getJobBasedOnType(JobType jobType) {
        return jobRepo.findBy();
    }

    public String searchJobs(List<Job> jobList) {
        Iterator<Job> list = jobRepo.saveAll(jobList).iterator();
        if(list != null)
        {
            return "Job Search .....!!!";
        }
        else{
            return "UnSearched.....!!!";
        }
    }
}
