package com.bguneser.weblux.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Person {

    @javax.persistence.Id
    @SequenceGenerator(name="seq_person",allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "surname")
    private String surname;

    @OneToMany
    @JoinColumn(name = "person_address_id")
    List<Address> addressList;
}
