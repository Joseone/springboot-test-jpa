package com.qianmi.hello.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.hello.domain.StoreInfo</p>
 * <p>Date: 2017-08-17 09:48.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Entity
@Table(name = "tb_user_scene_rel")
@Setter
@Getter
public class StoreInfo {

    /**
     * 店铺id
     */
    @Id
    @Column(name = "userid")
    private String adminId;

    /**
     * id（暂时冗余，后期换新表表主键就是adminId）
     */
    @Column(name = "id")
    private String id;

    /**
     * 千米id
     */
    @Column(name = "ticket_id")
    private String ticketId;

    /**
     * 店铺码
     */
    @Column(name = "store_code")
    private String storeCode;

    /**
     * 店铺名称
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * 场景编号：1 云订货， 2 云商城， 3 社区店
     */
    @Column(name = "sid")
    private String sid;

    /**
     * 主营类目
     */
    @Column(name = "job_type")
    private String jobType;

    /**
     * 店铺logo
     */
    @Column(name = "store_logo")
    private String storeLogo;

    /**
     * 失效时间
     */
    @Column(name = "expiretime")
    private Date expireTime;

    /**
     * 创建时间
     */
    @Column(name = "addtime")
    private Date addTime;

    /**
     * 店铺绑定手机号码（联系人电话）
     */
    @Column(name = "cellphone")
    private String cellphone;
}
