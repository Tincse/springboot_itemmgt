package com.example.demo.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Item;

@Service
public class ItemService {
	
	public static int itemcount=5;
	private static List<Item> items=new ArrayList<>();
	
	static{
		
		items.add(new Item(1, "Mobile phone"));
		items.add(new Item(2, "Laptop"));
		items.add(new Item(3, "Washing Machine"));
		items.add(new Item(4, "Microven"));
		items.add(new Item(5, "Refrigerator"));
	}
	
	public List<Item> getAllItems() {
		return items;
	}
	
	public Item getItem(int id)
	{
		for (Item i : items) {
			if (i.getItem_id() == id) {
				return i;
			}
		}
		return null;
	}
	
	public Item addNewItem(Item item) {
		item.setItem_id(++itemcount);
		items.add(item);
		return item;
	}

	public Item deleteItem(int id) {
		for (Item i : items) {
			if (i.getItem_id() == id) {
				items.remove(i);
				return i;
			}
		}
		return null;
	}

	public Item updateItem(Item item) {
		for (Item i :items) {
			if (i.getItem_id() == i.getItem_id()) {
				i.setItem_name(i.getItem_name());
				return i;
			}

		}
		return null;
			
			
	}		

}
