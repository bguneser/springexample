package com.bguneser.weblux.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PersonAddress")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode (of = {"id"})
@ToString
public class Address implements Serializable {

    @Id
    @SequenceGenerator(name="seq_person_address",allocationSize = 1)
    @GeneratedValue(generator = "seq_person_address", strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(length = 500, name = "address")
    private String address;

    @Enumerated
    private AddressType addressType;

    @Column(name = "active")
    private Boolean active;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_address_id")
    private Person person;

    public enum AddressType{
        HOME_ADD,
        WORK_ADD,
        OTHER
    }
}
