package com.empresa.poc.iptuapi.repository;

import com.empresa.poc.iptuapi.domain.Iptu;
import org.springframework.data.repository.CrudRepository;

public interface IptuRepository extends CrudRepository<Iptu, Integer> {

    Iptu findByContribuinte(String contribuinte);
}

