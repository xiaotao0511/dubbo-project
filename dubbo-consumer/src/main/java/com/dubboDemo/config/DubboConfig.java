package com.dubboDemo.config;

import org.springframework.stereotype.Service;
import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

/**
 * dubbo配置
 * @author xiaotao
 *
 */
@Service
@DisconfFile(filename = "dubbo.properties")
public class DubboConfig {
	
	private String center;

	@DisconfFileItem(name = "dubbo.registry.center", associateField = "center")
	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}
}
