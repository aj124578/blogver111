package shop.mtcoding.blog.service;

import org.springframework.stereotype.Service;

import shop.mtcoding.blog.dto.user.UserReq.JoinReqDto;

@Service
public class UserService {
    
    public int 회원가입(JoinReqDto joinReqDto){
        // username 중복체크
        return -1;
    }
}