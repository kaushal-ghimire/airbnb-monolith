package com.airbnb.airbnb_monolith.service;


import com.airbnb.airbnb_monolith.model.Listing;
import com.airbnb.airbnb_monolith.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    @Autowired
    private ListingRepository repository;

    public List<Listing> getAllListings() {
        return repository.findAll();
    }

    public Optional<Listing> getListingById(Long id) {
        return repository.findById(id);
    }

    public Listing createListing(Listing listing) {
        return repository.save(listing);
    }

    public void deleteListing(Long id) {
        repository.deleteById(id);
    }
}

