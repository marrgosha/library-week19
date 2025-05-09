package fi.margokomarova.library_week19.service;

import fi.margokomarova.library_week19.dto.AuthorDto;
import fi.margokomarova.library_week19.dto.BookDto;

import java.util.List;

public interface AuthorService {
    public List<AuthorDto> getAllAuthors();
}
