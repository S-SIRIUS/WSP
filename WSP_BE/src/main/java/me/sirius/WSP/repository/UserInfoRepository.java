package me.sirius.WSP.repository;

// import me.sirius.WSP.domain.Article;
import me.sirius.WSP.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 유저에 대한 정보 가지고 오는 레포지토리
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
