package com.onlinepantry.common.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMessage {

    @NotBlank
    private String username;
    @NotBlank
    @Size(min=8)
    private String password;
    @NotBlank
    @Email
    private String userEmail;

}
