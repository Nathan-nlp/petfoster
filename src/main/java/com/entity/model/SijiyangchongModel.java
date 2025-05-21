package com.entity.model;

import com.entity.SijiyangchongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 四季养宠
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-04-25 17:19:24
 */
public class SijiyangchongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 四季分类
	 */
	
	private String sijifenlei;
		
	/**
	 * 养宠内容
	 */
	
	private String yangchongneirong;

	/**
	 * 封面
	 */

	private String fengmian;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：四季分类
	 */
	 
	public void setSijifenlei(String sijifenlei) {
		this.sijifenlei = sijifenlei;
	}
	
	/**
	 * 获取：四季分类
	 */
	public String getSijifenlei() {
		return sijifenlei;
	}
				
	
	/**
	 * 设置：养宠内容
	 */
	 
	public void setYangchongneirong(String yangchongneirong) {
		this.yangchongneirong = yangchongneirong;
	}
	
	/**
	 * 获取：养宠内容
	 */
	public String getYangchongneirong() {
		return yangchongneirong;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
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
			
}
