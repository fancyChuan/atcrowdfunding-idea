package com.atguigu.atcrowdfunding.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 服务器启动监听器
 * @author 18801
 *
 */
public class ServerStartupListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		// 将WEB应用路径保存在APPLICATION范围中
		ServletContext application = sce.getServletContext();
		
		String appPath = application.getContextPath();
		
		application.setAttribute("APP_PATH", appPath);
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

}
