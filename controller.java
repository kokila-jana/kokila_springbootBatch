package com.example.keerthi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller 
{
	@Autowired
service se;
	
	@GetMapping("/h")
	public List<entity> demo()
	{
		return se.getdata();
	}
	
	@PostMapping("/data")
	public ResponseEntity<entity> saved(@RequestBody entity e){
		entity SaveToDB=this.se.savedata(e);
		return new ResponseEntity<entity>(SaveToDB,HttpStatus.CREATED);	
	}
	
	@PutMapping("/dataid/{id}")
	public entity updateemp(@RequestBody entity e,@PathVariable("id")  int id)
	{
		return se.updatedata(e, id);
	}
	
	@DeleteMapping("/delid/{id}")
	public String ByID(@PathVariable("id") int id) {
		se.empdel(id);
		return "Data Deleted";
		}
}
	
