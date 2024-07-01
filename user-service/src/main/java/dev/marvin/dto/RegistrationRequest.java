package dev.marvin.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegistrationRequest(
        @NotEmpty(message = "username must not be null or empty")
        @NotBlank(message = "username must not be blank")
        @Size(min = 3, message = "username must have at least 3 characters")
        String username,

        @NotEmpty(message = "name must not be null or empty")
        @NotBlank(message = "name must not be blank")
        @Size(min = 6, message = "name must have at least 6 characters")
        String fullName,

        @Email(message = "provide a valid email address")
        @NotBlank(message = "email must not be blank")
        String email,

        @NotEmpty(message = "password must not be null or empty")
        @NotBlank(message = "password must not be blank")
        @Size(min = 6, message = "password must have at least 6 characters")
        String password,

        @NotEmpty(message = "mobile number must not be null or empty")
        @NotBlank(message = "mobile number must not be blank")
        @Min(value = 12, message = "provide valid mobile number")
        @Pattern(regexp = "254[0-9]{9}")
        String mobileNumber,

        @NotEmpty(message = "government id must not be null or empty")
        @NotBlank(message = "government id must not be blank")
        String governmentId,

        @NotEmpty(message = "kra pin must not be null or empty")
        @NotBlank(message = "kra pin must not be blank")
        String kraPin
) {
}
