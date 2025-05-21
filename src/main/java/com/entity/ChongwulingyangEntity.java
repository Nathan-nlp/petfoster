package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 宠物领养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
@TableName("chongwulingyang")
public class ChongwulingyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwulingyangEntity() {
		
	}
	
	public ChongwulingyangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;


	/**
	 * 宠物名称
	 */

	private String chongwumingcheng;

	/**
	 * 宠物类型
	 */

	private String chongwuleixing;






	/**
	 * 是否领养
	 */

	private String shifoulingyang;

	/**
	 * 性别
	 */

	private String xingbie;

	/**
	 * 年龄
	 */

	private String nianling;







	/**
	 * 商家账号
	 */

	private String shangjiazhanghao;


	/**
	 * 商家姓名
	 */

	private String shangjiaxingming;

	/**
	 * 品种
	 */

	private String pinzhong;

	/**
	 * 封面
	 */

	private String fengmian;



	/**
	 * 领养申请
	 */

	private String lingyangshenqing;


	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;


	/**
	 * 用户账号
	 */

	private String yonghuzhanghao;


	/**
	 * 用户姓名
	 */

	private String yonghuxingming;

	public String getLingyangshenqing() {
		return lingyangshenqing;
	}

	public void setLingyangshenqing(String lingyangshenqing) {
		this.lingyangshenqing = lingyangshenqing;
	}

	public String getSfsh() {
		return sfsh;
	}

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	public String getShhf() {
		return shhf;
	}

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}

	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}

	public String getYonghuxingming() {
		return yonghuxingming;
	}

	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}

	/**
	 * 设置：宠物类型
	 */

	public void setChongwuleixing(String chongwuleixing) {
		this.chongwuleixing = chongwuleixing;
	}

	/**
	 * 获取：宠物类型
	 */
	public String getChongwuleixing() {
		return chongwuleixing;
	}


	public String getPinzhong() {
		return pinzhong;
	}

	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}

	/**
	 * 设置：封面
	 */

	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}

	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}






	public String getChongwumingcheng() {
		return chongwumingcheng;
	}

	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}



	public String getShifoulingyang() {
		return shifoulingyang;
	}

	public void setShifoulingyang(String shifoulingyang) {
		this.shifoulingyang = shifoulingyang;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getNianling() {
		return nianling;
	}

	public void setNianling(String nianling) {
		this.nianling = nianling;
	}





	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}

	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}

	public String getShangjiaxingming() {
		return shangjiaxingming;
	}

	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
