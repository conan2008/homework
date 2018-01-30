package com.springboot.homework.dao;

import com.springboot.homework.entity.Praise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("praiseDao")
public interface PraiseDao extends JpaRepository<Praise, Integer> {
}
