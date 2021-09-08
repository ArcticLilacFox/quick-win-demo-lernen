package com.example.quickwindemo.C03;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class ListEntitiesController {

    private ListEntityService listEntityService;

    public ListEntitiesController(ListEntityService listEntityService) {this.listEntityService = listEntityService; }

    @GetMapping
    public List<C03Entity> getList() {
        listEntityService.createEntities();
        return listEntityService.getList();
    }
}
