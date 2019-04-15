package com.xlsf.website.controller;

import com.xlsf.website.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 图片处理控制器
 * 1.加载图片
 * 2.上传图片
 */
@Controller
@RequestMapping(value = "/img")
public class ImgController {
    @Autowired
    @Qualifier(value = "imgService")
    private ImgService imgService;

    //网站每一个页面加载时，获取页面中的一张图片
    @RequestMapping(value = "/page/getOneImg",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public BufferedImage getPageOneImage() throws IOException {
        return imgService.getPageOneImageService();
    }

    //网站每一个页面加载时，获取页面中的图片List
    @RequestMapping(value = "/page/getListImg",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public BufferedImage getPageListImage() throws IOException {
        return imgService.getPageListImageService();
    }
}
