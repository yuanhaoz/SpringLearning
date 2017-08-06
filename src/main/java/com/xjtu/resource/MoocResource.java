package com.xjtu.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 *
 * Created by 18710 on 2017/8/6.
 */
public class MoocResource implements ApplicationContextAware{

    // 获取上下文信息
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws Exception{

        // 通过文件加载配置信息
//        Resource resource = applicationContext.getResource("file:C:/workspace/java/SpringLearning/src/main/resource/config.xml");

        // 通过链接加载配置信息
//        Resource resource = applicationContext.getResource("url:http://blog.csdn.net/qyf_5445/article/details/8737913");

        // 通过classpath类路径加载配置信息
        // 类路径信息都是最最终都为在target下，需要将某个文件夹标记为resources或者src类别的目录
        Resource resource = applicationContext.getResource("classpath:config.xml");

        System.out.println(resource.getFilename());
        System.out.println(resource.getURI());
        System.out.println(resource.getInputStream().toString());
    }

}
