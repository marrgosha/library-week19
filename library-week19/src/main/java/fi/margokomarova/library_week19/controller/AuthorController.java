package fi.margokomarova.library_week19.controller;

import fi.margokomarova.library_week19.dto.AuthorDto;
import fi.margokomarova.library_week19.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/author")
    AuthorDto getAuthorByName(@RequestParam("name") String name){
        return authorService.getByNameV1(name);
    }

    @GetMapping("/author/V2")
    AuthorDto getAuthorByNameV2(@RequestParam("name") String name){
        return authorService.getByNameV2(name);
    }

    @GetMapping("/author/V3")
    AuthorDto getAuthorByNameV3(@RequestParam("name") String name){
        return authorService.getByNameV3(name);
    }

}
