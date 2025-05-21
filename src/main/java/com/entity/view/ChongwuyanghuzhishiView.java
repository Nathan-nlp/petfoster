package com.entity.view;

import com.entity.ChongwuyanghuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 宠物养护知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@TableName("chongwuyanghuzhishi")
public class ChongwuyanghuzhishiView  extends ChongwuyanghuzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuyanghuzhishiView(){
	}
 
 	public ChongwuyanghuzhishiView(ChongwuyanghuzhishiEntity chongwuyanghuzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuyanghuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
