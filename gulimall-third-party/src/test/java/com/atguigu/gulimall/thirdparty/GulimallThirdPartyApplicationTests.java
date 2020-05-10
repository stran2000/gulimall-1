package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

//    @Autowired
//    private OSSClient ossClient;
    @Test
    void contextLoads() {

    }
    @Test
    public void test(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-qingdao.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
//        String accessKeyId = "LTAI4G75xDF2GRqYQANxJwTw";
//        String accessKeySecret = "2dP8NBwzFTJP5mNmP64dNqKbfpaBqg";
        String bucketName = "gulimall-ossdemo";
// <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String objectName = "D:\\笔记\\1-分布式基础_全栈开发篇\\docs\\pics\\8bf441260bffa42f.jpg";

// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
// 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
//        String content = "Hello OSS";
//        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));
//
//        System.out.println("上传成功");

// 关闭OSSClient。
//        ossClient.shutdown();
    }

}
