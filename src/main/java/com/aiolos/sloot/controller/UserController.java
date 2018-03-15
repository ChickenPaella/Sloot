package com.aiolos.sloot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aiolos.sloot.service.UserService;
import com.aiolos.sloot.util.ResultView;
import com.aiolos.sloot.vo.UserVO;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json; charset=utf-8")
	public ResultView insertUser(@RequestBody UserVO user) {
		if(userService.insertUser(user)) {
			return new ResultView(200, "SUCESS", user);
		} else {
			return new ResultView(500, "FAIL", null);
		}	
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResultView updateUser(@RequestBody UserVO user) {
		if(userService.updateUser(user)) {
			return new ResultView(200, "SUCESS", null);
		} else {
			return new ResultView(500, "FAIL", null);
		}
	}

	@RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE, consumes = "application/json")
	public ResultView deleteUser(@PathVariable("user_id") String id) {
		if(userService.deleteUser(id) > 0) {
			return new ResultView(200, "SUCESS", null);
		} else {
			return new ResultView(500, "FAIL", null);
		}
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json")
	public ResultView getUser() {
		return null;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET, consumes = "application/json; charset=utf-8")
	public ResultView getUserList() {
		try{
			return new ResultView(200, "SUCESS", userService.getUserList());
		} catch(Exception e) {
			return new ResultView(500, "FAIL", null);
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public ResultView login(@RequestBody UserVO user) {
		if(userService.login(user.getId(), user.getPassword())) {
			return new ResultView(200, "SUCESS", null);
		} else {
			return new ResultView(500, "FAIL", null);
		}
	}
}
