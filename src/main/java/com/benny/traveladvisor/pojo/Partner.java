package com.benny.traveladvisor.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统权限配置表
 * </p>
 *
 * @author benny
 * @since 2020-05-17
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Partner implements Serializable {

    private static final long serialVersionUID = -646017981565158112L;

    private Integer id;

    /**
     * 业务名称
     */
    private String name;

    /**
     * 业务编码 appId
     */
    private String code;

    /**
     * RSA Public Key
     */
    private String rsaPublicKey;

    /**
     * RSA Private Key
     */
    private String rsaPrivateKey;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改者
     */
    private String lastModifiedBy;

    /**
     * 修改时间
     */
    private Date lastModifiedTime;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 数据状态: 0：正常 1：删除
     */
    private String isDeleted;

    /**
     * 备注
     */
    private String remarks;

}

