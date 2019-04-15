package com.xlsf.website.service;

import com.xlsf.website.dao.ImgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 网站图片服务
 * 1.加载图片
 * 2.上传图片
 */
@Service(value = "imgService")
public class ImgService {

    @Autowired
    @Qualifier(value = "imgDao")
    private ImgDao imgDao;

    //网站每一个页面加载时，获取页面中的一张图片
    @RequestMapping(value = "/page/getOneImg",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public BufferedImage getPageOneImageService() throws IOException {
        return ImageIO.read(new FileInputStream(new File("D:/test.jpg")));
    }

    //网站每一个页面加载时，获取页面中的图片List
    @RequestMapping(value = "/page/getListImg",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public BufferedImage getPageListImageService() throws IOException {
        return ImageIO.read(new FileInputStream(new File("D:/test.jpg")));
    }
}
