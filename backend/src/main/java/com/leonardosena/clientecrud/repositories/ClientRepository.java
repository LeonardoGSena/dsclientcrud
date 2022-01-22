package com.leonardosena.clientecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardosena.clientecrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
