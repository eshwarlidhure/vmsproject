package com.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import com.app.entity.PaymentStatus;

@Getter
@Setter
public class CarBookingPaymentStatusDTO {

    private PaymentStatus status;
}
