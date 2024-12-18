package com.quizapp.repository;

import com.quizapp.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Integer> {
    // Custom query methods can be added if needed
}