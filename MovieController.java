package com.movieplatform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

  @GetMapping
  public String getMovies() {
    return "[{'id': 1, 'title': 'Inception', 'year': 2010}, {'id': 2, 'title': 'The Matrix', 'year': 1999}]";
  }
}