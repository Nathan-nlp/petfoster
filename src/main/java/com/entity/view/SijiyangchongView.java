package com.entity.view;

import com.entity.SijiyangchongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 四季养宠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
@TableName("sijiyangchong")
public class SijiyangchongView  extends SijiyangchongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SijiyangchongView(){
	}
 
 	public SijiyangchongView(SijiyangchongEntity sijiyangchongEntity){
 	try {
			BeanUtils.copyProperties(this, sijiyangchongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
