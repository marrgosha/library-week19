package fi.margokomarova.library_week19.controller;

import fi.margokomarova.library_week19.dto.BookCreateDto;
import fi.margokomarova.library_week19.dto.BookDto;
import fi.margokomarova.library_week19.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/book/create")
    BookDto createBook (@RequestBody BookCreateDto bookCreateDto){
        return bookService.createBook(bookCreateDto);
    }

}
