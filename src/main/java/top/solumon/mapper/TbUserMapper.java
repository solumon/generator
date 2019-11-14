package top.solumon.mapper;

import java.util.List;
import top.solumon.pojo.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
}