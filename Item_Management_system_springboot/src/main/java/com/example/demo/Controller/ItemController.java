package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Item;
import com.example.demo.Service.ItemService;

@RestController
public class ItemController {
	
	
		@Autowired
		ItemService is;
		
//		@PostMapping(value="/Items")
//		public String addItem(@PathVariable String name)
//		{
//			return name;
//		}
		
		@GetMapping(value="/Items")
		public List<Item> getAllStudents() {
			return is.getAllItems();

		}

		@GetMapping(value = "/Items/{id}")
		public Item getItem(@PathVariable int id) {
			return is.getItem(id);

		}

		@PostMapping(value = "/Items")

		public Item addStudent(@RequestBody Item item) {

			return is.addNewItem(item);

		}

		@DeleteMapping(value = "/Items/{id}")
		public Item deleteItem(@PathVariable int id) {
			return is.deleteItem(id);

		}

		@PutMapping(value = "/Items")
		public Item updateStudent(@RequestBody Item item) {

			return is.updateItem(item);

		}
	}
