package com.jobapp.controllers;

import com.jobapp.models.Job;
import com.jobapp.services.JobServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("jobs")
@RequiredArgsConstructor
public class JobController {

  private final JobServiceInterface jobService;

  @GetMapping()
  public ResponseEntity<Flux<Job>> getAll() {
    return ResponseEntity.ok(jobService.getJobs());
  }

  @PostMapping()
  public ResponseEntity<Mono<Job>> createJob(@RequestBody Job job) {
    return ResponseEntity.ok(jobService.createJob(job));
  }
}
