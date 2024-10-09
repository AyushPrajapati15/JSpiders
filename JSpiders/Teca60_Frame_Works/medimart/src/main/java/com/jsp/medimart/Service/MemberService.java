package com.jsp.medimart.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.medimart.DAO.MemberDao;
import com.jsp.medimart.Exception.NotFoundException;
import com.jsp.medimart.Model.Admin;
import com.jsp.medimart.Model.Member;
import com.jsp.medimart.util.SuccessResponse;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public ResponseEntity<SuccessResponse> saveMember(Member member) {
		
		 SuccessResponse data=SuccessResponse.builder()
				.status(HttpStatus.CREATED.value())
				.dateTime(LocalDate.now())
				.data(memberDao.saveMember(member))
				.message("Member saved successful")
				.build()
				;
		return new ResponseEntity<SuccessResponse>(data,HttpStatus.CREATED);

	}
	
	
//	*******************************
public ResponseEntity<SuccessResponse> updateMember(Member member) {
		
		SuccessResponse data=SuccessResponse.builder()
				.status(HttpStatus.CREATED.value())
				.dateTime(LocalDate.now())
				.data(memberDao.updateMember(member))
				.message("Member updated successful")
				.build()
				;
		return new ResponseEntity<SuccessResponse>(data,HttpStatus.CREATED);
		
	}
	
	public ResponseEntity<SuccessResponse> fetchMember(int id) {
		Member fetchMember = memberDao.fetchMember(id);
		if(fetchMember!=null) {
			
		
		SuccessResponse data=SuccessResponse.builder()
				.status(HttpStatus.FOUND.value())
				.dateTime(LocalDate.now())
				.data(memberDao.fetchMember(id))
				.message("Member found successful")
				.build()
				;
		return new ResponseEntity<SuccessResponse>(data,HttpStatus.FOUND);
		}
		throw new NotFoundException("Member with "+id+" not found");
	}
	
	public ResponseEntity<SuccessResponse> memberLogin(String email,String password) {
		Member loginMember = memberDao.loginMember(email, password);
		if(loginMember!=null) {
			
			
			SuccessResponse data=SuccessResponse.builder()
					.status(HttpStatus.FOUND.value())
					.dateTime(LocalDate.now())
					.data(memberDao.loginMember(email, password))
					.message("Member login successful")
					.build()
					;
			return new ResponseEntity<SuccessResponse>(data,HttpStatus.FOUND);
		}
		throw new NotFoundException("Member with "+email+" and "+password+" not found");
	}
	
	
	public ResponseEntity<SuccessResponse> MemberDelete(int id) {
		  Member deleteMember = memberDao.deleteMember(id);
		if(deleteMember!=null) {
			
			
			SuccessResponse data=SuccessResponse.builder()
					.status(HttpStatus.FOUND.value())
					.dateTime(LocalDate.now())
					.data(memberDao.deleteMember(id))
					.message("admin d   eleted successful;y")
					.build()
					;
			return new ResponseEntity<SuccessResponse>(data,HttpStatus.FOUND);
		}
		throw new NotFoundException("Member with "+id+" not found");
	}

}
