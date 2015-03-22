/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.web;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ardodonk
 */
public class FileUpload {
     
 
    private List<MultipartFile> fileUploads;
 
    public List<MultipartFile> getFiles() {
        return fileUploads;
    }
 
    public void setFiles(List<MultipartFile> files) {
        this.fileUploads = files;
    }

}
