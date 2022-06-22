package com.pandora.enabiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="clinic")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "clinic_name")
    private String clinicName;

    @ManyToOne
    private Hospital hospital;
}
