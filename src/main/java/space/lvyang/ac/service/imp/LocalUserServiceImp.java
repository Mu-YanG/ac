package space.lvyang.ac.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.lvyang.ac.entities.LocalUser;
import space.lvyang.ac.mapper.LocalUserMapper;
import space.lvyang.ac.service.LocalUserService;
@Service
public class LocalUserServiceImp implements LocalUserService {
    @Autowired
    LocalUserMapper localUserMapper;

    @Override
    public Boolean selectUserByName(LocalUser localUser) {

        return   localUserMapper.selectByUser(localUser)>0;
    }
}
