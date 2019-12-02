package com.nana.conferencedemo.repositories;

import com.nana.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SessionRepository extends JpaRepository<Session, Long> {
}
