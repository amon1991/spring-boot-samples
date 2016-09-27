package netgloo.controllers;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 *
 * 修改servlet容器配置信息
 *
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/9/26.
 */
@Component
public class MyCustomizationBean implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {

        container.setContextPath("/springboot");
        container.setPort(8081);
        container.setSessionTimeout(30);

    }
}
