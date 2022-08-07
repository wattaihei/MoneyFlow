package com.wattaihei.MoneyFlow.service;

import org.springframework.stereotype.Service;

import com.wattaihei.MoneyFlow.fetcher.EposFetcher;

@Service
public class BillFetchServiceImpl implements BillFetchService {
    private final EposFetcher eposFetcher;

    public BillFetchServiceImpl(EposFetcher eposFetcher) {
        this.eposFetcher = eposFetcher;
    }

    
    @Override
    public void run() {
        System.out.println("Hello, World!");

        eposFetcher.run();
    }
}
