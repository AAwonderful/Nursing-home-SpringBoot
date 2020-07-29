package com.lijie.bs_healthy.controller;


import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

//import org.apache.commons.io.FilenameUtils;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Value("${web.upload-path}")
    private String path;

    /**
     * 上传文件
     * @param file
     * @return
     */
    @RequestMapping("upload")
    public ResultVO upload(MultipartFile file){
        try {

            String name = file.getOriginalFilename();
            String  ext = name.substring(name.lastIndexOf("."));
            //String extension = FilenameUtils.getExtension(file.getOriginalFilename());
            String newFileName = UUID.randomUUID() + ext;

            //把上传的文件制复到本地目录
            FileOutputStream desc = new FileOutputStream(path+newFileName);
            FileCopyUtils.copy(file.getInputStream(),desc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ResultVO resultVO = new ResultVO(200,file.getOriginalFilename());
        return resultVO;
    }
}
