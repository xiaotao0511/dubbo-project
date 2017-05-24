package com.dubboDemo.config.callback;

import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.dubboDemo.config.RedisConfig;

/**
 * 更新Redis配置时的回调函数
 * @author xiaotao
 *
 */
@Service
@DisconfUpdateService(classes = {RedisConfig.class})
public class RedisConfigCallback implements IDisconfUpdate {

	@Override
	public void reload() throws Exception {
		// TODO Auto-generated method stub
		//监听到配置变化，做相应的逻辑处理
		
	}

}
