package com.example.springbootreactive.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;



@NonNull
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Document(collection = "movieDB")
public class Movie {

    @MongoId
    @Id
    private String id;

    @NonNull
    private String title;
}
