package com.entity.view;

import com.entity.YanghufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 养护分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@TableName("yanghufenlei")
public class YanghufenleiView  extends YanghufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YanghufenleiView(){
	}
 
 	public YanghufenleiView(YanghufenleiEntity yanghufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yanghufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
