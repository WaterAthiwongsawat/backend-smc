package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reserveroom;
import com.example.demo.repository.ReserveroomRepository;

@RestController
@CrossOrigin(origins = "*")
public class ReserveroomController {
    
    @Autowired
    ReserveroomRepository reserveroomRepository;
    
    @GetMapping("/reservehistory")
    public ResponseEntity<Object> getHistory() {
        try {
            List<Reserveroom> history = reserveroomRepository.findAll();
            return new ResponseEntity<>(history, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

	
	@PostMapping("/reserveroom")
public ResponseEntity<Object> addReserve(@RequestBody Reserveroom body) {
	
	try {		
		Reserveroom reserveroom =  reserveroomRepository.save(body);
		return new ResponseEntity<>(reserveroom, HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@DeleteMapping("reserveroom/{id}")
	public ResponseEntity<Object> deleteReserve(@PathVariable Integer reserveroom_id ) {
        
		try {
			Optional<Reserveroom> reserveroom = reserveroomRepository.findById(reserveroom_id );

			if (reserveroom.isPresent()) {
				reserveroomRepository.delete(reserveroom.get());

				return  new ResponseEntity<>("Delete Successful", HttpStatus.OK );
			} else {
				return new ResponseEntity<>("student not found", HttpStatus.BAD_REQUEST);
			}			
		} catch (Exception e) {
			return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}