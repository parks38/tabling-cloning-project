package com.project.tabling.repository;

import com.project.tabling.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 클라이언트(고객용) repository
 *
 * writer @suna.park
 *
 * JpaRepository 안의 SQL dialect 를 implement 받아 이용
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

