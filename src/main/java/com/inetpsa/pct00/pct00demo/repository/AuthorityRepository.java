package com.inetpsa.pct00.pct00demo.repository;

import com.inetpsa.pct00.pct00demo.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
