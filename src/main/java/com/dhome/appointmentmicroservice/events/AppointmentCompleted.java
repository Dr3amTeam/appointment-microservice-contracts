package com.dhome.appointmentmicroservice.events;

import lombok.Value;

import java.time.Instant;

@Value
public class AppointmentCompleted {
    private String appointmentId;
    private Instant occurredOn;
}
