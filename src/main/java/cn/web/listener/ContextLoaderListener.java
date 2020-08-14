package cn.web.listener;


//import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        //  读取web.xml中的全局参数
        String contextApplication = servletContext.getInitParameter("contextApplication");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextApplication);

        //  将  Spring的上下文对象  存储到ServletContext中
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕！");

        /*  一般会将    setAttribute步骤隐藏，使用工具类代替*/
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
