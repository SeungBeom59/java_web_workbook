package org.zerock.b01.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.b01.dto.MemberJoinDTO;
import org.zerock.b01.service.MemberService;

@Controller
@RequestMapping("/member")
@Log4j2
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public void loginGET(String error, String logout){
        log.info("login get.................................");
        log.info("logout: " + logout);

        if(logout != null){
            log.info("user logout.....................");
        }
    }

    @GetMapping("/join")
    public void joinGET(){
        log.info("jogin get......................");

    }

    @PostMapping("/join")
    public String joinPOST(MemberJoinDTO memberJoinDTO, RedirectAttributes redirectAttributes){
        log.info("join post............................");
        log.info("memberJoinDTO::{}" , memberJoinDTO);

        try{
            memberService.join(memberJoinDTO);
        }
        catch (MemberService.MidExistException e){  // 에러 발생시 다시 회원가입 화면으로 error 들고
            redirectAttributes.addFlashAttribute("error" , "mid");
            return "redirect:/member/join";
        }

        redirectAttributes.addFlashAttribute("result", "success");

        return "redirect:/member/login"; // 회원 가입 후 로그인
    }

}
