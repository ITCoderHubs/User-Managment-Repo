package com.itcodershub.usermoduleapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_role")
public class Role {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long roleId;
    private String roleName;
    private boolean active;
    @ManyToOne
    private User createdByUser;
    private Instant createDate = Instant.now();
    @ManyToOne
    private User modifiedByUser;
    private Instant modifiedDate = Instant.now();
}
