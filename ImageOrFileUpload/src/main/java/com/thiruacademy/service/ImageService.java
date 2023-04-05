package com.thiruacademy.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.thiruacademy.entity.Image;
import com.thiruacademy.repository.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;
	
	public String saveImage(MultipartFile file, String name, String description) throws IOException {
		Image image = new Image();
		image.setName(name);
		image.setDescription(description);
		image.setImage(file.getBytes());
		imageRepository.save(image);
		return "Image saved in DB";
	}
}
