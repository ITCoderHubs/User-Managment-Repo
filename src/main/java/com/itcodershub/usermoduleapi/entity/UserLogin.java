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
@Table(
        name = "tbl_user_Login"
)
public class UserLogin {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userLoginId;
    private String userLoginPassword;
    private Boolean active;
    @OneToOne
    private User user;
    @ManyToOne
    private User createdByUser;
    private Instant createDate = Instant.now();
    @ManyToOne
    private User modifiedByUser;
    private Instant modifiedDate = Instant.now();
}
