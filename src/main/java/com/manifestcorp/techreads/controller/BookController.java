package com.manifestcorp.techreads.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping({"","/"})
	public ModelAndView books() {
		ModelAndView mav = new ModelAndView("books");
		List<Book> books = bookRepository.findAll();
		mav.addObject("books", books);
		mav.addObject("bookForm", new Book());
		return mav;
	}
	
	@RequestMapping("/add")
	public String add (Model model) {
		model.addAttribute("bookForm", new Book());
		return "add";
	}
	
	@RequestMapping(value = {"", "/"}, method=POST)
	public RedirectView addBook(Book book) {
		bookRepository.saveAndFlush(book);
		return new RedirectView("books");
	}
	
	@RequestMapping("/details")
		public ModelAndView detail(@RequestParam(name="book", required=true, defaultValue="1")String book) {
			// I think I dont actually need the model here string/jsp return with add attrib should work!
			Long id = Long.parseLong(book);
			ModelAndView mav = new ModelAndView("detail");
			Book details = bookRepository.getOne(id);
			mav.addObject("details", details);
			return mav;
	}
	
	@GetMapping("/edit{id}")
	public String editBookPage(@PathVariable Long id, Model model) {
		Book book = bookRepository.getOne(id);
		System.out.println(book.getBookStatus());
		model.addAttribute("bookForm", book);
		return "edit";
	}
	
	@PostMapping("/edit")
	public RedirectView editBook(Book book) {
		bookRepository.saveAndFlush(book);
		return new RedirectView("/");
	}
}
