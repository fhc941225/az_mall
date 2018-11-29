package com.az.manager.iService;


import java.util.Map;

/**
 * 用于处理商品的业务逻辑层接口
 * User: DHC
 * Date: 2018/10/29
 * Time: 14:27
 * Version:V1.0
 */
public interface ItemService {


    /**
     * 一键导入索引库
     * @return
     */
    Map<String,Object> importIndex();
}
