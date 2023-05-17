package com.hong.ITBloging.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query("select p from Posts p order by p.regDate desc")
    List<Posts> findAllDesc();

    List<Posts> findTop100ByOrderByRegDateDesc();
}
