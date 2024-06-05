package com.spring.jdbc.springdata.jdbc.mapper;

import com.spring.jdbc.springdata.jdbc.dto.AuthorRequestDTO;
import com.spring.jdbc.springdata.jdbc.entity.Author;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AuthorMapper   {

    Author AuthorDtoToAuthor(AuthorRequestDTO authorRequestDTO);
}
