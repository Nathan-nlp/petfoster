package com.entity.view;

import com.entity.DiscusschongwuchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 宠物产品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
@TableName("discusschongwuchanpin")
public class DiscusschongwuchanpinView  extends DiscusschongwuchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwuchanpinView(){
	}
 
 	public DiscusschongwuchanpinView(DiscusschongwuchanpinEntity discusschongwuchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwuchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
