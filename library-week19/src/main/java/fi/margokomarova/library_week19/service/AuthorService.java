package fi.margokomarova.library_week19.service;

import fi.margokomarova.library_week19.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getByNameV1(String name);

    AuthorDto getByNameV2(String name);

    AuthorDto getByNameV3(String name);
}
