package com.issue_tracker.dto;

import com.issue_tracker.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryDto {
    private Long id;
    private Long issueId;
    private String issueName;
    private Status status;
    private LocalDateTime time;
}
