package com.delip.service;

import com.delip.domain.Member;

public interface MemberService {
	
	public void register(Member member);
	
	public Member getMemberIdAndPw(Member member);

	public Integer checkId(String uid);
	
}
