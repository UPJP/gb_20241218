package com.codingbox.mylogin.domain.item;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;




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
	
//	@PostMapping("/add")
	public String saveV1(@RequestParam String itemName,
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
//	@PostMapping("/add")
	public String saveV2(@ModelAttribute("item") Item item) {   //모델이 생략되는이유
		//@ModelAttribute가 해주는 역활
//		Item item =new Item();
//		item.setItemName(itemName);
//		item.setPrice(price);
//		item.setQuantity(quantity);
		itemRepository.save(item);
//		model.addAttribute("item", item);
		return "basic/item";
	}
	/*
	 * @ModelAttribute name 생략가능
	 * model.addAttribute("item", item); 자동추가 생략가능
	 * 생략시 model에 저장되는 name은 클래스명 첫 글자만 소문자로 등록
	 * 즉, Item -> item
	 */
//	@PostMapping("/add")
//	public String saveV3(@ModelAttribute Hellodata item) { 
//		itemRepository.save(item);
//		model.addAttribute("helloData",item);
//		return "basic/item";
//	}
//	@PostMapping("/add")
	public String saveV3(@ModelAttribute Item item) { 
		itemRepository.save(item);
		return "basic/item";
	}
	/*
	 * @ModelAttribute 자체도 생략가능
	 * model.addAttribute("item",item); 자동추가
	 * 가독성을 위해서 적당히 줄이는 것을 권장
	 */
//	@PostMapping("/add")
	public String saveV4( Item item) { 
		itemRepository.save(item);
		return "basic/item";
	}
	@PostMapping("/add")
	public String saveV5( Item item) { 
		itemRepository.save(item);
		return "redirect:/basic/items/"+ item.getId();
	}
	@GetMapping("/{itemId}/edit")     
	public String edit(@PathVariable Long itemId,Model model) {
		Item item=itemRepository.findById(itemId);
		model.addAttribute("item", item);
		return "basic/editForm";
	}
	@PostMapping("/{itemId}/edit")
	public String update(@PathVariable Long itemId,
						 @ModelAttribute Item item) {
		itemRepository.update(itemId, item);
		return "redirect:/basic/items/{itemId}";
	}
}
