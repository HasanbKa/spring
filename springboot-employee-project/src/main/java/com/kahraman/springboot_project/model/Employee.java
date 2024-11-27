package com.kahraman.springboot_project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="email")
    private String email;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="birthday")
    private Date birthday;
}
