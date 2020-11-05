package com.jobapp.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Job {

  @Id
  private String id = null;
  private String company;
  private Status status;

  enum Status {
    NO_RESPONSE,
    DECLINED,
    INTERVIEW
  }
}
