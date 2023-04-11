package com.questions.questions.repositories;

import com.questions.questions.models.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Integer> {

    @Query("SELECT b FROM Badge b where b.name = ?1")
    Optional<Badge>findBadgeByName(String name);

}
