package com.entity.model;

import com.entity.ChongwuyanghuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物养护知识
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public class ChongwuyanghuzhishiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 养护分类
	 */
	
	private String yanghufenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 预防疾病
	 */
	
	private String yufangjibing;
		
	/**
	 * 护理频率
	 */
	
	private String hulipinlv;
		
	/**
	 * 适用于
	 */
	
	private String shiyong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 知识详情
	 */
	
	private String zhishixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：养护分类
	 */
	 
	public void setYanghufenlei(String yanghufenlei) {
		this.yanghufenlei = yanghufenlei;
	}
	
	/**
	 * 获取：养护分类
	 */
	public String getYanghufenlei() {
		return yanghufenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：预防疾病
	 */
	 
	public void setYufangjibing(String yufangjibing) {
		this.yufangjibing = yufangjibing;
	}
	
	/**
	 * 获取：预防疾病
	 */
	public String getYufangjibing() {
		return yufangjibing;
	}
				
	
	/**
	 * 设置：护理频率
	 */
	 
	public void setHulipinlv(String hulipinlv) {
		this.hulipinlv = hulipinlv;
	}
	
	/**
	 * 获取：护理频率
	 */
	public String getHulipinlv() {
		return hulipinlv;
	}
				
	
	/**
	 * 设置：适用于
	 */
	 
	public void setShiyong(String shiyong) {
		this.shiyong = shiyong;
	}
	
	/**
	 * 获取：适用于
	 */
	public String getShiyong() {
		return shiyong;
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
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：知识详情
	 */
	 
	public void setZhishixiangqing(String zhishixiangqing) {
		this.zhishixiangqing = zhishixiangqing;
	}
	
	/**
	 * 获取：知识详情
	 */
	public String getZhishixiangqing() {
		return zhishixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
			
}
