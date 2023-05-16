package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 전체 부서 리스트.
    List<DeptDTO> selectAll();

    // deptno 컬럼으로 검색 => DeptDTO
    DeptDTO selectByDeptno(int deptno);

    // DeptRegistRequest를 받아서 insert 해주는 메소드
    int insertDept(DeptRegistRequest request);

    // DeptDTO를 전달 받고 utdate하는 메소드
    int updateDept(DeptDTO deptDTO);

    // delete 메소드
    int deleteDept(int deptno);

}