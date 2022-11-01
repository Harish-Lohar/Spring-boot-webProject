package com.mobiloitte.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.webapp.model.Students;

public interface StudentRepository extends JpaRepository<Students, Long>{

}
