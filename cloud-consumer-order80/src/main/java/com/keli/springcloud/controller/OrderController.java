package com.keli.springcloud.controller;

import com.keli.springcloud.entities.CommonResult;
import com.keli.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    //public static final  String payment_url ="http://localhost:8001/";
    public static final String payment_url="http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public CommonResult <Payment> create(Payment payment){
        return  restTemplate.postForObject(payment_url+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return  restTemplate.getForObject(payment_url+"/payment/get/"+id,CommonResult.class);
    }

}
