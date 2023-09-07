package com.kshrd.registration.payload.request;

import com.kshrd.registration.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserReq {
    private String id;
    private String fullname;
    private String email;
    private String nationalCard;
    private String pobId;
    private String phone;
    private String emergencyPhone;
    private String educationId;
    private String gender;
    private LocalDateTime dob;
    private String addressId;
    private String relativeId;
    private String universityId;
    private String referenceUrl;
    private LocalDateTime createDate;
    private Boolean status;
    private String photoUrl;
    private String generationId;
}
