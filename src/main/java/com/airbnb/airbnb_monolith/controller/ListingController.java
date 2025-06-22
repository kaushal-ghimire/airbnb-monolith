package com.airbnb.airbnb_monolith.controller;


import com.airbnb.airbnb_monolith.model.Listing;
import com.airbnb.airbnb_monolith.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {

    @Autowired
    private ListingService service;

    @GetMapping
    public List<Listing> getAllListings() {
        return service.getAllListings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Listing> getListingById(@PathVariable Long id) {
        return service.getListingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public Listing createListing(@RequestBody Listing listing) {
        return service.createListing(listing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListing(@PathVariable Long id) {
        service.deleteListing(id);
        return ResponseEntity.noContent().build();
    }
}