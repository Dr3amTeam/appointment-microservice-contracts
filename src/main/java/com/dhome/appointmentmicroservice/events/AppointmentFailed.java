package com.dhome.appointmentmicroservice.events;

import lombok.Value;

import java.time.Instant;
@Value
public class AppointmentFailed {
    private String appointmentId;
    private Instant occurredOn;
}
