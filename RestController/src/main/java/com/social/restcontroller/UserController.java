package com.social.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.social.FlexBackend.dao.UserDao;
import com.social.FlexBackend.model.User;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao; 
	@RequestMapping(value="/") 
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
	//@GetMapping("/user/{userId}")	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("userId") int userId) {
		User entity= userDao.find(userId);
		if (entity == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<User>(entity, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public @ResponseBody User getUserN(@PathVariable("userId") int userId) {
		User entity= userDao.find(userId);
		if (entity == null) {
			return null;
		}		
		return entity;
	}
	/*
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public ResponseEntity<Void>  addUser(@RequestBody User user){
		userDao.save(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String demo(){
		return "Hello World";
	}	
	*/
	
}




