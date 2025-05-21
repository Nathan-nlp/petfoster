package com.entity.view;

import com.entity.DiscusssijiyangchongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 四季养宠评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:25
 */
@TableName("discusssijiyangchong")
public class DiscusssijiyangchongView  extends DiscusssijiyangchongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssijiyangchongView(){
	}
 
 	public DiscusssijiyangchongView(DiscusssijiyangchongEntity discusssijiyangchongEntity){
 	try {
			BeanUtils.copyProperties(this, discusssijiyangchongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
