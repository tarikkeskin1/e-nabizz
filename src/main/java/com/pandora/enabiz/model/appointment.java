package com.pandora.enabiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID appointmentId;
    private UUID userId;
    private UUID cityId;
    private UUID doctorId;
    private Date appointmentDate;


}
