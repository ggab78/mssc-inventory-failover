package com.gabriel.msscbeerinventoryfailover.controller;

import com.gabriel.msscbeerinventoryfailover.model.InventoryFailoverDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jt on 2019-05-31.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class InventoryFailoverController {


    @GetMapping("api/v1/inventory-failover")
    List<InventoryFailoverDto> listBeersById() {

        List<InventoryFailoverDto> list = new ArrayList<>();
        InventoryFailoverDto dto= InventoryFailoverDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .quantityOnHand(999)
                .build();

        list.add(dto);

        return list;
    }
}
