package com.geekster.UserManagementSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Management")
public class User {
        @Id
        private Integer userId;

        @Size(min = 8,max = 50,message = "User name must be 8 to 50 character")
        private String userName;

        @DateTimeFormat(pattern = "yyyy-mm-dd")
        private LocalDate userDateOfBirth;
        @NotNull(message = "Email is required")
        @Email(message = "Invalid Email format")
        private String userEmail;
        @Size(min = 12,max = 12)
        @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
        @Pattern( regexp = "91[0-9]{10}$",message = "Enter a Valid Phone Number,Phone number must start with 91 and be followed by 10 digits")
        private String phoneNumber;
        private LocalDateTime dateTime;

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber=phoneNumber;
        }
}
