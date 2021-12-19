package com.jhblock.tjk_block.dao;

import com.jhblock.tjk_block.pojo.Door;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DoorMapper {
    /** 1、查询所有门店信息 */
    public List<Door> finduser(String username);
    public List<Door> findemail(String email);
    public void userinsert(@Param("username") String username, @Param("password") String password,@Param("email") String email);
}
