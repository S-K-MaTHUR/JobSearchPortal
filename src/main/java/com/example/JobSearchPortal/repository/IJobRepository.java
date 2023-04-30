package com.example.JobSearchPortal.repository;

import com.example.JobSearchPortal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job,Integer> {
    List<Job> findBy();

//    List<Job> searchJobByType();

//    List<Job> findBy();
}
