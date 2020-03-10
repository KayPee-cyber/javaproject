package com.example.DatabaseConnection.repository;

import com.example.DatabaseConnection.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NamesRepository extends JpaRepository<Users, Long>
{
}
