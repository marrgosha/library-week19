package fi.margokomarova.library_week19.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegistrationRequest {
    private String username;
    private String password;
}
