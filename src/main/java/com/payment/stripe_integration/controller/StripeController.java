package com.payment.stripe_integration.controller;

import com.payment.stripe_integration.dto.StripeChargeDto;
import com.payment.stripe_integration.dto.StripeTokenDto;
import com.payment.stripe_integration.service.StripeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/stripe")
public class StripeController {

    private final StripeService stripeService;

    @PostMapping("/card/token")
    @ResponseBody
    public StripeTokenDto createCardToken(@RequestBody StripeTokenDto model) {
        return stripeService.createCardToken(model);
    }

    @PostMapping("/charge")
    @ResponseBody
    public StripeChargeDto charge(@RequestBody StripeChargeDto model) {
        return stripeService.charge(model);
    }

}

