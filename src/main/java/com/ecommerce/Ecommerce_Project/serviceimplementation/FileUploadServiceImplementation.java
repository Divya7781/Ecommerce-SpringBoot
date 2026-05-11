package com.ecommerce.Ecommerce_Project.serviceimplementation;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.Ecommerce_Project.service.FileUploadService;


@Service
public class FileUploadServiceImplementation implements FileUploadService{

	private static final String UPLOAD_DIR = "src/main/resources/static/images/";

	@Override
	public String uploadImage(MultipartFile file) {
		try {
			String fileName=file.getOriginalFilename();
			
			Path path=java.nio.file.Paths.get(UPLOAD_DIR + fileName);
			
			Files.write(path, file.getBytes());
			
			return fileName;
		} catch (Exception e) {
			throw new RuntimeException("Image Upload Failed");
		}
	}

}
