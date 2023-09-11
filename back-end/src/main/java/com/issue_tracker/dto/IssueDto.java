package com.issue_tracker.dto;

import com.issue_tracker.util.Priority;
import com.issue_tracker.util.Status;
import com.issue_tracker.util.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IssueDto {
    private Long id;
    private String title;
    private String submitterName;
    private String submitterEmail;
    private LocalDateTime publishTime;
    private Long projectId;
    private Long developerId;
    private Type type;
    private Priority priority;
    private Status status;
}
