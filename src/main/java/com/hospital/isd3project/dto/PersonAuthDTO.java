package com.hospital.isd3project.dto;

import lombok.Data;

@Data
public class PersonAuthDTO {
    private String username;
    private String password;
    private String rePassword;
}
