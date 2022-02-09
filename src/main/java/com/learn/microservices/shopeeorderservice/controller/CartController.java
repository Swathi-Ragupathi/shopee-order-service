package com.learn.microservices.shopeeorderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class CartController {

//	@Autowired
//	private UsersService usersService;
//
//	@PostMapping("/register")
//	public ResponseEntity<ResponseData> register(@RequestBody @Valid UserInfoRequest userInfoRequest) {
//		usersService.register(userInfoRequest);
//		return ResponseEntity.status(HttpStatus.CREATED)
//				.body(new ResponseData(HttpStatus.CREATED.name(), "User Created Successfully"));
//	}
//
//	@GetMapping("/all")
//	public ResponseEntity<List<UserInfoDTO>> allUsers() {
//		return ResponseEntity.ok().body(usersService.getAllUsers());
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<UserInfoDTO> userById(@PathVariable("id") Long userId) {
//		return ResponseEntity.ok().body(usersService.getUserById(userId));
//	}
//	
//	@PutMapping("/{id}")
//	public ResponseEntity<UserInfoDTO> updateUser(@PathVariable("id") Long userId,
//			@RequestBody UserInfoRequest userInfoRequest) {
//		return ResponseEntity.ok().body(usersService.updateUser(userId, userInfoRequest));
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<ResponseData> disableUser(@PathVariable("id") Long userId) {
//		if(usersService.disableUser(userId)) {
//			return ResponseEntity.ok()
//					.body(new ResponseData(HttpStatus.OK.name(), "User Delete Successfully"));
//		}
//		throw new OrderServiceException(ErrorConstants.UNABLE_TO_PROCESS);
//		
//	}
}
