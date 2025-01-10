package com.embarkxclone.clonejobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@RestController

public class JobController {
    private List<Job> jobs=new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobs.add(job);
        return "Job Created Successfully";
    }
}

/*
GET /jobs: Get all jobs
GET /jobs/{id}:Get a specific job by id
POST /jobs: Create a new job
DELETE /jobs/{id}: Delete a specific job by id
PUT /jobs/{id}:Update a specific job by ID


Example API Url
Get {base_url}/jobs
Get {base_url}/jobs/1
Post {base_url}/jobs
Delete {base_url}/jobs/1
Put {base_url}/jobs/1



 */
