package com.hoangtien2k3.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    @Schema(description = "User First Name")
    @NotEmpty(message = "User firstName should not be null or empty")
    private String firstName;

    @Schema(description = "User Last Name")
    @NotEmpty(message = "User last name should not be null or empty")
    private String lastName;

    @Schema(description = "User Email Address")
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
