package fi.margokomarova.library_week19.controller;

import fi.margokomarova.library_week19.dto.BookCreateDto;
import fi.margokomarova.library_week19.dto.BookDto;
import fi.margokomarova.library_week19.dto.BookUpdateDto;
import fi.margokomarova.library_week19.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/book/create")
    BookDto createBook(@RequestBody BookCreateDto bookCreateDto) {
        return bookService.createBook(bookCreateDto);
    }

    @PutMapping("/book/update")
    BookDto updateBook(@RequestBody BookUpdateDto bookUpdateDto) {
        return bookService.updateBook(bookUpdateDto);
    }

    @DeleteMapping("/book/delete/{id}")
    void updateBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
