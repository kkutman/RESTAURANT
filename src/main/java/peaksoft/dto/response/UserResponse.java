package peaksoft.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.enums.Role;

import java.time.LocalDate;
import java.time.Year;

/**
 * name : kutman
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String fullName;
    private int dateOfBirth;
    private String email;
    private String phoneNumber;
    private Role role;

}
