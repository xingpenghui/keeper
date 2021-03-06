package com.qfedu.keep.service;

import com.qfedu.keep.domain.ClassAchieve;
import com.qfedu.keep.vo.PageVo;

public interface ClassService {
    // 展示所有的商品类型
    PageVo showClassType(String level);

    // 展示课程的具体步骤
    PageVo showClassDetail(String sid);

    // 参加具体的某个课程
    PageVo joinClass(String sid);

    // 添加用户的课程成果
    PageVo addClassAchieve(ClassAchieve classAchieve);

    // 用户参加完课程的展示
    PageVo showClassAchieve(String sid);
}
