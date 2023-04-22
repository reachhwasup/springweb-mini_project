package com.example.miniproject.service.serviceImp;

import com.example.miniproject.model.Author;
import com.example.miniproject.repository.AuthorRepository;
import com.example.miniproject.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImp implements AuthorService {

     AuthorRepository authorRepository;
    AuthorServiceImp(){
        authorRepository = new AuthorRepository();
    }
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthor();
    }
}
