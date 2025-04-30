package fi.margokomarova.library_week19.dto;

import fi.margokomarova.library_week19.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDto {
    private Long id;
    private String name;
    private String genre;

}
