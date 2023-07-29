package com.example.hostelmanagement.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class HostelRequest {
    @NotNull
    @NotEmpty
    private String name;
    @NotEmpty
    @NotNull
    private String address;
}
