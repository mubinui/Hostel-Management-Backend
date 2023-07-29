package com.example.hostelmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="sch_hostel")
@Data
public class Hostel {
    @Id
    private Long id;
    private String name;
    private String addressLocation;
    private Boolean isActive;
}
