package com.ecommerce.Ecommerce_Project.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	String uploadImage(MultipartFile file);
}
