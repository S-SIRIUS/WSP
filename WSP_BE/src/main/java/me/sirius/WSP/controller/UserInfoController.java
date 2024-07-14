package me.sirius.WSP.controller;

import lombok.RequiredArgsConstructor;
import me.sirius.WSP.service.UserInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import me.sirius.WSP.dto.UserInfoResponse;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class UserInfoController {
    private final UserInfoService userInfoService;

    @GetMapping("/wsp/ranking")
    public ResponseEntity<List<UserInfoResponse>> findAllUserInfo(){
        List<UserInfoResponse> userinfo = userInfoService.findAll()
                .stream()
                .map(UserInfoResponse::new)
                .toList();
        return ResponseEntity.ok().body(userinfo);
    }
}
