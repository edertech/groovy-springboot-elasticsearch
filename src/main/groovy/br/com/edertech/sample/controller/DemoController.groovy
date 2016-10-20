package br.com.edertech.sample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

import br.com.edertech.sample.model.SongRepository

@RestController
@RequestMapping("sample")
class DemoController {

	@Autowired
	private SongRepository repository;

	@GetMapping("songs")
	def songs() {

		repository.findAll()
	}
}
