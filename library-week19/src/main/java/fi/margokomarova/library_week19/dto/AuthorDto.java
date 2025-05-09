package fi.margokomarova.library_week19.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthorDto {
    private String name;
    private String surname;
    private Long id;
}
