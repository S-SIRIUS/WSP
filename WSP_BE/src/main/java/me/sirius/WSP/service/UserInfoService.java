package me.sirius.WSP.service;

import lombok.RequiredArgsConstructor;
import me.sirius.WSP.domain.UserInfo;
import me.sirius.WSP.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserInfoService {
    private final UserInfoRepository userInfoRepository;

    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }
}
