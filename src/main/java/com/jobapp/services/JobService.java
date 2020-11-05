package com.jobapp.services;

import com.jobapp.models.Job;
import com.jobapp.repositories.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class JobService implements JobServiceInterface {

  private final JobRepository jobRepository;

  @Override
  public Flux<Job> getJobs() {
    return jobRepository.findAll();
  }

  @Override
  public Mono<Job> getJob(String id) {
    return jobRepository.findById(id);
  }

  @Override
  public Mono<Job> createJob(Job job) {
    return jobRepository.save(job);
  }
}
