package fi.margokomarova.library_week19.service;

import fi.margokomarova.library_week19.dto.BookCreateDto;
import fi.margokomarova.library_week19.dto.BookDto;
import fi.margokomarova.library_week19.dto.BookUpdateDto;

public interface BookService {
    public BookDto createBook(BookCreateDto bookCreateDto);

    public BookDto updateBook(BookUpdateDto bookUpdateDto);

    public void deleteBook(Long id);

}
