package io.prong.uid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 平台管理微服务
 * 
 * @author tangyz
 *
 */
@SpringBootApplication
@MapperScan({ "io.prong.uid.worker.dao" })
public class UidConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UidConsumerApplication.class, args);
	}
	
}
