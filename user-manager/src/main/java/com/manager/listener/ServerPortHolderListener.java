package com.manager.listener;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.context.WebServerPortFileWriter;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 10281
 * @title
 * @Date 2020-11-21 22:46
 * @Description
 */
@Component
public class ServerPortHolderListener implements ApplicationListener<WebServerInitializedEvent> {

    private static int port;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        port = event.getWebServer().getPort();
    }

    public static void printPort() {
        System.out.println("当前服务器的端口号是:" +port);
    }
}