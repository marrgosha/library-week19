package fi.margokomarova.library_week19.service.impl;

import fi.margokomarova.library_week19.dto.AuthorDto;
import fi.margokomarova.library_week19.model.Author;
import fi.margokomarova.library_week19.repository.AuthorRepository;
import fi.margokomarova.library_week19.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public List<AuthorDto> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    private AuthorDto convertEntityToDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
                .build();
    }

}
