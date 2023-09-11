package com.issue_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailDto {
    private Long id;
    private String about;
    private String contact1;
    private String contact2;
}
