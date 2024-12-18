package com.quizapp.controller;

import com.quizapp.entity.Result;
import com.quizapp.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @PostMapping
    public ResponseEntity<Result> saveResult(@RequestBody Result result) {
        return ResponseEntity.ok(resultService.saveResult(result));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Result>> getResultsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(resultService.findResultsByUserId(userId));
    }

    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        return ResponseEntity.ok(resultService.getAllResults());
    }
}
