package io.vipin.dtc;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouchbasedbController {
	
	@Autowired
	private TestRepository testRepository;
	
	@PostMapping("/addtest")
	public String addUser(@RequestBody Test test) {
		testRepository.save(test);
		return "Test Added Successfully";
	}
	
	@GetMapping("/gettest")
	public Test getTest() {
		return testRepository.findById("1").get();
	}
	
}
