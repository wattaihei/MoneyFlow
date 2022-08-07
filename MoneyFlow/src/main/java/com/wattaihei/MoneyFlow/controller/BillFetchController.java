package com.wattaihei.MoneyFlow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wattaihei.MoneyFlow.service.BillFetchService;

@RestController
@RequestMapping("api/v1/bf")
public class BillFetchController {

    private final BillFetchService billfetchService;

    public BillFetchController(BillFetchService service) {
        this.billfetchService = service;
    }
    
    @GetMapping(path = "")
    public void fetch() {
        this.billfetchService.run();
    }
}
