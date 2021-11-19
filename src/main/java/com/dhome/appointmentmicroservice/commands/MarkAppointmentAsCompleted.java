package com.dhome.appointmentmicroservice.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
@Value
public class MarkAppointmentAsCompleted {
    @TargetAggregateIdentifier
    private String appointmentId;
}
