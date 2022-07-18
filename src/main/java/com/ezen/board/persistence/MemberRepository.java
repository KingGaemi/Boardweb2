package com.ezen.board.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ezen.board.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
