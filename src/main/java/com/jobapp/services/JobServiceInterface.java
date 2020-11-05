package com.jobapp.services;

import com.jobapp.models.Job;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface JobServiceInterface {

  Flux<Job> getJobs();
  Mono<Job> getJob(String id);
  Mono<Job> createJob(Job job);
}
