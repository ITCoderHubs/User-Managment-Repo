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
        name = "tbl_user_address"
)
public class UserAddress {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userAddressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String region;
    private int zip;
    private String country;
    private String AddressType;
    private Boolean active;
    @ManyToOne
    private User user;
    @ManyToOne
    private User createdByUser;
    private Instant createDate = Instant.now();
    @ManyToOne
    private User modifiedByUser;
    private Instant modifiedDate = Instant.now();
}
