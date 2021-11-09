/*package com.example.PSP3.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.PSP3.model.Vartotojas;
import com.example.PSP3.repository.VartotojasRepository;



@Component
public class VartotojasCommandLineRunner {
private static final Logger log = LoggerFactory.getLogger(VartotojasCommandLineRunner.class);
	
	@Autowired
	private VartotojasRepository repository;
	
	public void run(String... args) throws Exception {
		System.out.println("~~~~~~ ZmogusCommandLineRunner ~~~~~~");
		repository.save(new Vartotojas(0, "Jonas", "Admin", null, null, null, null));
		repository.save(new Vartotojas(1, "Petras", "User", null, null, null, null));
		repository.save(new Vartotojas(2, "Maryte", "Admin", null, null, null, null));
		repository.save(new Vartotojas(3, "Janina", "User", null, null, null, null));

		for (Vartotojas o : repository.findAll()) {
			log.info(o.toString());
		}

		log.info("Admin users are.....");
		for (Vartotojas user : repository.findByRole("Admin")) {
			log.info(user.toString());
		}
	}
}
*/