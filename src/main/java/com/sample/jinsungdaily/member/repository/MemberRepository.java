package com.sample.jinsungdaily.member.repository;

import com.sample.jinsungdaily.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
