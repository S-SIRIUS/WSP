package me.sirius.WSP.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.sirius.WSP.domain.UserInfo;
import org.springframework.stereotype.Service;


@Getter
public class UserInfoResponse {

    private int total_points;
    private int ranking;
    private String introduction;

    public UserInfoResponse(UserInfo userinfo){
        this.total_points = userinfo.getTotal_points();
        this.ranking = userinfo.getRanking();
        this.introduction = userinfo.getIntroduction();
    }
}
