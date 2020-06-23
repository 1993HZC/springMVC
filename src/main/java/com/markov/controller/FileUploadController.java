package com.markov.controller;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(path="user")
public class FileUploadController {
    @RequestMapping(path="fileupload")
    public void fileupload(HttpServletRequest request, HttpServletResponse response) throws Exception{

        //上传文件的目录
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        File file =new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        // 创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        List<FileItem> list = fileUpload.parseRequest(request);
        for (FileItem fileItem:list){
            if(fileItem.isFormField()){

            }else{
                String filename = fileItem.getName();
                // 上传文件
                fileItem.write(new File(file, filename));
                // 删除临时文件
                fileItem.delete();
            }
        }
        System.out.println(path);
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//        return "success";
    }
    @RequestMapping(value="/fileupload2")
    public String fileupload2(HttpServletRequest request, HttpServletResponse response, MultipartFile upload) throws Exception{
        System.out.println();
        String path=request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        upload.transferTo(new File(file,filename));
        System.out.println(path);

        return "success";
    }
    @RequestMapping(value="/fileupload3")
    public String fileupload3(MultipartFile upload) throws Exception {
        System.out.println("SpringMVC跨服务器方式的文件上传...");
        // 定义图片服务器的请求路径
        String path = "http://localhost:9091/fileupload_war_exploded/uploads/";
        // 获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        // 把文件的名称唯一化
        // 向图片服务器上传文件
        // 创建客户端对象
        Client client = Client.create();
        //连接图片服务器
        WebResource webResource = client.resource(path+filename);
        // 上传文件
        webResource.put(upload.getBytes());
        return "success";    }




    }
