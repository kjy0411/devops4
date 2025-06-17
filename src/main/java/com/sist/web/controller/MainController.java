package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import com.sist.web.service.*;
import com.sist.web.vo.*;
/*  
 * 	docker
 * 	=> 가상머신처림 => 독립적인 실행환경을 만들어주는 운영체제
 * 	파일을 이미지화 해서 저장하는 용도
 *  
 *  1. swap
 *  2. update
 *  3. root 계정
 *  4. java 설치
 *  5. docker 설치
 *  => 도구 설치 curl... 등
 *  6. docker hub 등록
 *  7. 저장 => docker hub에 이미지를 저장
 *  8. docker-compose에 등록 => git Actions에서 전송
 *  -------------------------------------------- ubuntu와 통신 => ssh키 (ed25519)
 *  
 *  => 필요시마다 docker hub에서 출력
 *  
 *  1. Image : => 프로그램 => read-only
 *  2. Dockerfile : 도커 이미지를 만드는 설명서
 *  3. Container : 프로세스 => 휘발성 => 메모리에 상주
 *  4. 저장 => Docker Hub에 주로 저장
 *  
 *  AWS
 *  	=> ubuntu => root => sudo us-
 *  	=> root : => ubuntu가 사용 가능하게 ...
 *  				 usemode -a -G docker ubuntu
 *  	=> docker version => 1.7이상
 *  	   상태 확인
 *  		systemctl status docker
 *  		8080 포트 동작 확인
 *  		netstate -tnlp | grep 8080
 *  		=> kill -9 id명(PID)
 *  
 *  	=> 도커 종료 systemctl stop docker
 *  	=> 도커 실행 systemctl start docker
 *  	=> docker enabled
 *  
 *  	=> image 만드는 방법 / image 실행 / docker hun에 저장 방법
 */
@Controller
public class MainController {
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("main_html","main/home");
		return "main";
	}
}
