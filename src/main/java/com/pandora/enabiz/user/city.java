package com.pandora.enabiz.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cityId;


}
