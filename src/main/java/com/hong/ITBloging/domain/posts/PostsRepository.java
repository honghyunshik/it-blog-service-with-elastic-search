package com.hong.ITBloging.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM POSTS p ORDER BY p.regDate DESC")
    List<Posts> findAllDesc();
}
