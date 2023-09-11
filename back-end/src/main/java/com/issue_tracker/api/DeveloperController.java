package com.issue_tracker.api;

import com.issue_tracker.dto.DeveloperDto;
import com.issue_tracker.mapper.Mapper;
import com.issue_tracker.repository.DeveloperRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/developers")
public class DeveloperController {
    //todo: get all developers
    //todo: get specific developer
    //todo: post developer
    //todo: update developer
    //todo: delete developer

    private final DeveloperRepository devRepo;
    private final Mapper mapper;

    public DeveloperController(DeveloperRepository devRepo, Mapper mapper) {
        this.devRepo = devRepo;
        this.mapper = mapper;
    }

    @GetMapping
    public List<DeveloperDto> getAllDevelopers() {
        return devRepo.findAll().stream().map(mapper::developerToDeveloperDto).collect(Collectors.toList());
//        System.out.println("WORKSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
//        return "works";
    }
}
