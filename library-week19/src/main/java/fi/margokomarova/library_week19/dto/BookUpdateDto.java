package fi.margokomarova.library_week19.dto;

import fi.margokomarova.library_week19.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookUpdateDto {
    private Long id;
    private String name;
    private Genre genre;
}
