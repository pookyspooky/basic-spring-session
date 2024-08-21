package org.sparta.basicspringsession.repostory;

import org.sparta.basicspringsession.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
