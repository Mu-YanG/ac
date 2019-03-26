package space.lvyang.ac.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import space.lvyang.ac.entities.LocalUser;

import java.util.List;
@Mapper
@Repository
public interface LocalUserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(LocalUser record);

    LocalUser selectByPrimaryKey(Long userid);

    List<LocalUser> selectAll();

    int updateByPrimaryKey(LocalUser record);

    int selectByUser(LocalUser user);

}