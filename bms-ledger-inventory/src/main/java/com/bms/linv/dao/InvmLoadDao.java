/*
 * 2017/04/14 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
 package com.bms.linv.dao;
import com.bms.linv.bean.entity.InvmLoad;
import com.bms.linv.bean.result.LINV0117IResultParam;
import com.framework.boot.base.BaseDao;

import java.util.List;

/**
 * <p>InvmLoadDao接口。</p>
 *
 * @author 自动生成
 * @version 1.00
 */
 public interface InvmLoadDao extends BaseDao{
     InvmLoad querySumQty(InvmLoad param);

     void saveLoadSync( LINV0117IResultParam params);

     List<InvmLoad> findAllSkuCode();

    void setDelFlag();
 }