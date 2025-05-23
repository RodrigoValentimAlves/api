package com.eventstec.api.domain.adress;

import com.eventstec.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "adress")
@Entity
public class Adress {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
