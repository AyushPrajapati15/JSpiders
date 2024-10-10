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
import com.jsp.medimart.Service.AdminService;
import com.jsp.medimart.util.SuccessResponse;

@RestController
@RequestMapping("/admin")  //base URL FOR THIS CLASS
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@PostMapping("/registeradmin")
	private ResponseEntity<SuccessResponse> saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);

	}

	@PostMapping("/updateadmin")
	private ResponseEntity<SuccessResponse> updateAdmin(@RequestBody Admin admin) {
		return adminService.updateAdmin(admin);
		
	}
	@GetMapping("/fetchadmin")
	private ResponseEntity<SuccessResponse> fetchAdmin(@RequestParam int id) {
		return adminService.fetchAdmin(id);
	}

	@GetMapping("/loginadmin")
	private ResponseEntity<SuccessResponse> loginAdmin(@RequestParam String email, String password) {
		return adminService.adminLogin(email, password);
	}
	
	
	@DeleteMapping("/deleteadmin")
	private ResponseEntity<SuccessResponse> delteAdmin(@RequestParam int id) {
		return adminService.adminDelete(id);
	}
	
	@DeleteMapping("/enablemember")
	private ResponseEntity<SuccessResponse> enableMember(@RequestParam int adminId,@RequestParam int memberId) {
		return adminService.enableMemberByAdmin(adminId,memberId);
	}
	
	
}
