package com.benny.traveladvisor.dao;

import com.benny.traveladvisor.pojo.Partner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description: DAO class for accessing the partner table
 * @author benny.li
 * Date: 2020/5/18
 */
@Mapper
public interface PartnerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Partner record);

    int insertSelective(Partner record);

    Partner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);

    @Select("select * from sys_partner where is_deleted = '0' order by create_time desc")
    List<Partner> getAllPartner();

    @Select("select * from sys_partner where is_deleted = '0' and code=#{code}")
    Partner getPartnerByCode(@Param("code") String code);
}
