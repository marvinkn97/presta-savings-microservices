package dev.marvin.model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Builder
@Document(collection = "users")
public class AppUser {
    @Id
    private Integer id;

    @Field(name = "username")
    private String username;

    @Field(name = "password")
    private String password;

    @Field(name = "full name")
    private String name;

    @Indexed
    @Field(name = "member number")
    private String memberNumber;

    @Indexed
    @Field(name = "email")
    private String email;

    @Field(name = "mobile number")
    private String mobileNumber;

    @Field(name = "government id")
    private String governmentId;


    private String kraPin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
