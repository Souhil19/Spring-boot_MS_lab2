package com.esisba.msscolarite;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation",url ="localhost:8081")
public interface FormationProxy {
    @GetMapping("formations/{idf}")
    Formation getFormation(@PathVariable("idf") Long idf);
}
