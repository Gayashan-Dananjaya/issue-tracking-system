package com.issue_tracker.mapper;

import com.issue_tracker.dto.*;
import com.issue_tracker.entity.*;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    //    Detail
    DetailDto detailToDetailDto(Detail detail);
    Detail detailDtoToDetail(DetailDto detailDto);

    //    Developer
    DeveloperDto developerToDeveloperDto(Developer developer);
    Developer developerDtoToDeveloper(DeveloperDto developerDto);

    //    Faq
    FaqDto faqToFaqDto(Faq faq);
    Faq faqDtoToFaq(FaqDto faqDto);

    //    History
    @Mapping(source = "issue.id", target = "issueId")
    @Mapping(source = "issue.title", target = "issueName")
    HistoryDto historyToHistoryDto(History history);
    //    History historyDtoToHistory(HistoryDto historyDto);

    //    Issue
    @Mapping(source = "project.id", target = "projectId")
    @Mapping(source = "developer.id", target = "developerId")
    IssueDto issueToIssueDto(Issue issue);
    @Mapping(source = "projectId", target = "project.id")
    @Mapping(source = "developerId", target = "developer.id")
    Issue issueDtoToIssue(IssueDto issueDto);

    //    Project
    ProjectDto projectToProjectDto(Project project);
    Project projectDtoToProject(ProjectDto projectDto);
}
