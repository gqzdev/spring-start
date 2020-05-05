package com.gqz.mapper;

import com.gqz.bean.User;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName User
 * @Description
 * @Author ganquanzhong
 * @Date2020/2/2 21:08
 * @Version
 **/
@Mapper
public interface UserMapper {
    /**
     * 删除
     */
    @Delete("DELETE FROM user WHERE uid = #{uid}")
    public void delete(int uid);

    @Insert("insert into user(uid,name,password) value(#{uid},#{name},#{password})")
    public int add(User user);

    @Update("update user set name=#{name} WHERE uid = #{uid}")
    public void update(User user);

    public User getUserByUid();

    @Select("select * from user where uid =#{uid}")
    User select(Integer uid);
}
