package me.sirius.WSP.dto;

import lombok.Builder;
import me.sirius.WSP.domain.UserInfo;

public class UserInfoResponse {

    private int total_points;
    private int rank;
    private String introduction;

    public UserInfoResponse(UserInfo userinfo){
        this.total_points = userinfo.getTotal_points();
        this.rank = userinfo.getRanking();
        this.introduction = userinfo.getIntroduction();
    }
}
