package com.dhome.appointmentmicroservice.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CreateAppointment {
    @TargetAggregateIdentifier
    private String appointmentId;
    private String paymentId;
    private String date;
    private String description;

}
