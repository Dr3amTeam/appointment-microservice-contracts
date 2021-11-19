package com.dhome.appointmentmicroservice.events;

import lombok.Value;

import java.time.Instant;

@Value
public class AppointmentEdited {
    private String appointmentId;
    private String paymentId;
    private String date;
    private String description;
    private Instant occurredOn;
}
