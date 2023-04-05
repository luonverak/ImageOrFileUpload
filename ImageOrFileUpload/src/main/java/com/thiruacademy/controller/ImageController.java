package com.thiruacademy.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.thiruacademy.service.ImageService;

@RestController
@RequestMapping("/imageOrFile")
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@PostMapping("/save")
	public String saveIMageOrFile(@RequestParam("file") MultipartFile file,
			@RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException {
		return imageService.saveImage(file, name, description);
	}

}
