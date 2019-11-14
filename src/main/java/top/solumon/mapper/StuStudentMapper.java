package top.solumon.mapper;

import java.util.List;
import top.solumon.pojo.StuStudent;

public interface StuStudentMapper {
    int insert(StuStudent record);

    List<StuStudent> selectAll();
}