package com.jsp.medimart.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.medimart.Model.Member;
import com.jsp.medimart.Repository.MemberRepo;

@Repository
public class MemberDao {
	
	@Autowired
	MemberRepo memberRepo;
	
	public Member saveMember(Member member) {
		return memberRepo.save(member);

	}
	public Member updateMember(Member member) {
		Optional<Member> op = memberRepo.findById(member.getId());
		if(op!=null)
		{
			return memberRepo.save(member);
			
		}
		return null;
		
	}

	public Member fetchMember(int id) {
		Optional<Member> op=memberRepo.findById(id);
		if(op.isPresent()){
			Member member = op.get();
			return member;
		}
		return null;
	}
	public Member loginMember(String emailid, String password) {
		Optional<Member> op=memberRepo.findByEmailidAndPassword(emailid, password);
		if(op.isPresent()){
			Member admin=op.get();
			return admin;
		}
		return null;
	}
	public Member deleteMember(int id) {
		Optional<Member> op=memberRepo.findById(id);
		if(op.isPresent()){
			Member admin=op.get();
			memberRepo.delete(admin);
			return admin;
		}
		return null;
	}

}
//NO-38