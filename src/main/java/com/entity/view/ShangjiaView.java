package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ShangjiaEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 商家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@TableName("shangjia")
public class ShangjiaView extends ShangjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiaView(){
	}

 	public ShangjiaView(ShangjiaEntity shangjiaEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
