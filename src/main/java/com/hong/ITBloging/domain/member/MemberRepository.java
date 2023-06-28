package com.hong.ITBloging.domain.member;

import com.hong.ITBloging.model.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    Optional<MemberDto> findByEmail(String email);
}
