package com.example.keerthi;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service
public class service
{
	@Autowired
	repository re;
	
	@Transactional
public List<entity> getdata()
{
	return re.findAll();
}
public entity savedata(entity e) {
	entity f = this.re.save(e);
	return f;
}
void empdel(int id){
	 
	  re.deleteById(id);;
	
}
entity updatedata(entity e,int id) {
	entity d = re.findById(id).get();
	if(Objects.nonNull(e.getName()) && !"".equalsIgnoreCase(e.getName()))
	{
						d.setName(e.getName());	
						d.setPass(e.getPass());
						d.setId(e.getId());
					}
	return re.save(d);
	
}
//get(retrive)
//put(update)
//delete(delete)
}
