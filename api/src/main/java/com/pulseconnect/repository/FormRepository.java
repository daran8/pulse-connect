package com.pulseconnect.repository;

import com.pulseconnect.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FormRepository extends JpaRepository<Form, UUID> {
    List<Form> findByNameLikeIgnoreCase(String name);
}
