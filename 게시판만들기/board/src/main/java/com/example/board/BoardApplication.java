package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.example.board",
    "com.example.user",
    "com.example.todo"
})
@EntityScan(basePackages = {
	"com.example.user.entity",
	"com.example.board.entity",
	"com.example.todo.entity"
})
@EnableJpaRepositories(basePackages = {
	"com.example.user.repository",
	"com.example.board.repository",
	"com.example.todo.repository"
})
@EnableJpaAuditing // JPA Auditing 기능을 활성화 하는 어노테이션, 엔티티의 생성 시간, 수정 시간 등을 자동으로 관리
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
