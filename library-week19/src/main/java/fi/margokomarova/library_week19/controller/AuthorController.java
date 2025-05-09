package fi.margokomarova.library_week19.controller;

import fi.margokomarova.library_week19.repository.AuthorRepository;
import fi.margokomarova.library_week19.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    String getAuthorsView(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors";
    }


}
