package com.codingbox.test.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingbox.test.web.repository.StudentRepository;
import com.codingbox.test.web.student.Student;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("basic/students")
@RequiredArgsConstructor
public class BasicStudentController {
	
	private final StudentRepository studentRepository;
	
	
	@PostConstruct
	public void init() {
		studentRepository.save(new Student("testA",20,6,"01076765252","동동주동"));
		studentRepository.save(new Student("testB",42,7,"01051235123","고길2동"));
	}
	
	@GetMapping
	public String students(Model model) {
		List<Student> students = studentRepository.findAll();
		model.addAttribute("students", students);
		return "basic/students";
	}
	
	@GetMapping("/add")
	public String addFrom() {
		return "basic/studentAddForm";
	}
	
	@PostMapping("/add")
	public String save(Student student) {
		studentRepository.save(student);
		return "redirect:/basic/students/" + student.getId();
	}
	
	
	@GetMapping("/{Id}")
	public String student(@PathVariable long Id, Model model) {
		Student student = studentRepository.findById(Id);
		model.addAttribute("student", student);
		return "basic/student";
	}
	@GetMapping("/{Id}/edit")     
	public String edit(@PathVariable Long Id,Model model) {
		Student student = studentRepository.findById(Id);
		model.addAttribute("student", student);
		return "basic/studentEditForm";
	}
	@PostMapping("/{Id}/edit")
	public String update(@PathVariable Long Id,
						 @ModelAttribute Student student) {
		studentRepository.update(Id, student);
		return "redirect:/basic/students/{Id}";
	}
	
	

}
