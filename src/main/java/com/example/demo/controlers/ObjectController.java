package com.example.demo.controlers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ObjectModel;
import com.example.demo.services.ObjectService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "TZD's Objects", description = "TZD Objects API REST")
public class ObjectController {

	@Autowired
	ObjectService objectService;

	// all objects
	@Operation(summary = "TZD Objects", description = "Lists all TZD's Objects", tags = { "TZD's Objects" })
	@GetMapping("/objects")
	public @ResponseBody ArrayList<ObjectModel> getObjects() {
		return objectService.getAllObjects();
	}

	// Object by id
	@Operation(summary = "TZD Object", description = "Get a object by id", tags = { "TZD's Objects" })
	@GetMapping("/objects/{id}")
	public ObjectModel getObjectbyId(@PathVariable("id") long id) {
		return objectService.getObjectById(id);
	}

	// Add object
	@Operation(summary = "Add objects", description = "Add a new object", tags = { "TZD's Objects" })
	@PostMapping("/objects")
	public ObjectModel saveObject(@RequestBody ObjectModel object) {
		return this.objectService.saveObject(object);
	}

	// Delete object
	@Operation(summary = "Delete objects", description = "Deletes a object by id ", tags = { "TZD's Objects" })
	@DeleteMapping("/objects/{id}")
	public void deleteObject(@PathVariable("id") int id) {
		objectService.deleteObjectbyId(id);
	}

	// Delete all
	@Operation(summary = "Delete all", description = "Deletes all of the items", tags = { "TZD's Objects" })
	@DeleteMapping("/objects")
	public void deleteAllObjects() {
		objectService.deleteAllObjects();
	}

//	// Update object
//	@Operation(summary = "Update objects", description = "Update objec")
//	@PutMapping("/objects/{id}")
//	public ObjectModel updateObject(@RequestBody ObjectModel object, @PathVariable("id") long id) {
//		return object.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> {
//			ObjectModel createdObject = service.create(object);
//			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//					.buildAndExpand(createdItem.getId()).toUri();
//			return ResponseEntity.created(location).body(createdItem);
//		});
//
//	}

}
