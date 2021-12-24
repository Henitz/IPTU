package com.empresa.poc.iptuapi.service;

import com.empresa.poc.iptuapi.domain.Iptu;
import com.empresa.poc.iptuapi.repository.IptuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IptuService {

    @Autowired
    IptuRepository iptuRepository;




    public Iptu findByContribuinte(String contribuinte) {
        return iptuRepository.findByContribuinte(contribuinte);
    }
}
