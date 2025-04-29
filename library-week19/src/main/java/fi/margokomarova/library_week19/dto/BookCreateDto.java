package fi.margokomarova.library_week19.dto;

import fi.margokomarova.library_week19.model.Author;
import fi.margokomarova.library_week19.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookCreateDto {
    private String name;
    private Genre genre;


}
