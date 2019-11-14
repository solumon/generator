package top.solumon.mapper;

import java.util.List;
import top.solumon.pojo.StuManager;

public interface StuManagerMapper {

    int insert(StuManager record);

    List<StuManager> selectAll();
}