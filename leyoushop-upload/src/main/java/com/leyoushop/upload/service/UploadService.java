package com.leyoushop.upload.service;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {
    private static final List<String> CONTENT_TYPES = Arrays.asList("image/gif", "image/jpeg");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);

    public String uploadImage(MultipartFile file) {

        String fileName = file.getOriginalFilename();
        //校验文件类型
        String contentType = file.getContentType();
        if (!CONTENT_TYPES.contains(contentType)) {
            LOGGER.info("文件类型不合法：{}", fileName);
            return null;
        }

        try {
            //校验文件的内容
            BufferedImage bufferedread = ImageIO.read(file.getInputStream());
            if (bufferedread == null) {
                LOGGER.info("文件内容不合法：{}", fileName);
                return null;
            }

            //保存到文件服务器
            file.transferTo(new File("D:\\github\\repository\\leyouImage\\" + fileName));
            //返回url,进行回显
            return "http://image.leyoushop.com/" + fileName;
        } catch (IOException e) {
            LOGGER.info("服务器内部错误：" + fileName);
            e.printStackTrace();
        }
        return null;
    }
}
