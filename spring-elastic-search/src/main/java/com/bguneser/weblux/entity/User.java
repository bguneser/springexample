package com.bguneser.weblux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "kisiler",type = "kisi")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    @Id
    private String id ;

    @Field(name = "name",type= FieldType.Text)
    private String name ;

    @Field(name = "surname",type= FieldType.Text)
    private String surname;

    @Field(name = "adress",type= FieldType.Text)
    private String adress;

   /* @Field(name = "birthDate",type= FieldType.Date)
    private Date birthDate;*/


}
