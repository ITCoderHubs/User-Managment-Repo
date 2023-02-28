package com.itcodershub.usermoduleapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_user_role"
)
public class UserRole {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userRoleId;
    private Date beginDate;
    private Date endDate;

    @ManyToOne
    private User user;
    private boolean active;
    @ManyToOne
    private User createdByUser;
    private Instant createDate = Instant.now();
    @ManyToOne
    private User modifiedByUser;
    private Instant modifiedDate = Instant.now();
}
