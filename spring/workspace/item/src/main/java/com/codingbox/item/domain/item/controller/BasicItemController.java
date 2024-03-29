package com.codingbox.item.domain.item.controller;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingbox.item.domain.item.repository.ItemRepository;
import com.codingbox.item.item.domain.item.Item;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("basic/items")
@RequiredArgsConstructor 		//생성자를 자동으로 만듬 
public class BasicItemController {

	private final ItemRepository itemRepository;
	
//	@Autowired <-생성자가 딱 1개만 있으면 생략 가능 
//	public BasicItemController(ItemRepository inItemRepository) {
//		this.itemRepository= inItemRepository;
//	} <- @RequiredArgsConstructor = 생성자를 자동으로 만들어준다 
	
	//테스트용 데이터를 추가
	@PostConstruct			
	public void init() {
		itemRepository.save(new Item("testA", 10000, 10));
		itemRepository.save(new Item("testB", 20000, 20));
	}
	
	@PostConstruct			
	public void init2() {
//		System.out.println("초기화 메서드");
	}
	@PreDestroy
	public void destory() {
//		System.out.println("종료 메서드 호출");
	}
	
	@GetMapping      //("/") 생략됨
	public String items(Model model) {
		List<Item> items = itemRepository.findAll();
		model.addAttribute("items", items);
		return "basic/items";
	}
	@GetMapping("/{itemId}")     
	public String item(@PathVariable long itemId, Model model) {
		Item item = itemRepository.findById(itemId);
		model.addAttribute("item",item);
		return "basic/item";
	}
	
	@GetMapping("/add")     
	public String addForm() {
		return "basic/addForm";
	}
	
	@PostMapping("/add")
	public String save(@RequestParam String itemName,
					   @RequestParam int price,
					   @RequestParam Integer quantity,
					   Model model) {
		Item item =new Item();
		item.setItemName(itemName);
		item.setPrice(price);
		item.setQuantity(quantity);
		itemRepository.save(item);
		model.addAttribute("item", item);
		return "basic/item";
	}
	@GetMapping("/edit")     
	public String edit() {
		return "basic/editForm";
	}
	
}
