package org.sparta.basicspringsession.repository;

import org.sparta.basicspringsession.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
