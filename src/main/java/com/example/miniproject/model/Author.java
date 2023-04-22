package com.example.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private int id;
    private String name;
    private String username;
    private String profileURL;
    private String coverURL;
    private String bio;
}
