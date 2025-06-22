package com.airbnb.airbnb_monolith.repository;


import com.airbnb.airbnb_monolith.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
}

