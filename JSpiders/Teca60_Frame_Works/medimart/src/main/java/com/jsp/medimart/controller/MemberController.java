package com.jsp.medimart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.medimart.Model.Admin;
import com.jsp.medimart.Model.Member;
import com.jsp.medimart.Service.MemberService;
import com.jsp.medimart.util.SuccessResponse;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@PostMapping("/registermember")
	private ResponseEntity<SuccessResponse> saveMember(@RequestBody Member member) {
		return memberService.saveMember(member);

	}
	
	@PostMapping("/updatemember")
	private ResponseEntity<SuccessResponse> updateMember(@RequestBody Member member) {
		return memberService.updateMember(member);
		
	}
	@GetMapping("/fetchmember")
	private ResponseEntity<SuccessResponse> fetchMember(@RequestParam int id) {
		return memberService.fetchMember(id);
	}

	@GetMapping("/loginmember")
	private ResponseEntity<SuccessResponse> loginMember(@RequestParam String email, String password) {
		return memberService.memberLogin(email, password);
	}
	
	
	@DeleteMapping("/deletemember")
	private ResponseEntity<SuccessResponse> delteMember(@RequestParam int id) {
		return memberService.MemberDelete(id);
	}
	
	private void fetchllMember() {
		// TODO Auto-generated method stub

	}
}
