package fi.margokomarova.library_week19.service;

import fi.margokomarova.library_week19.dto.BookCreateDto;
import fi.margokomarova.library_week19.dto.BookDto;

public interface BookService {
    public BookDto createBook (BookCreateDto bookCreateDto);

}
