package com.entity.model;

import com.entity.ChongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-04-25 17:19:23
 */
public class ChongwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;




	/**
	 * 宠物名称
	 */

	private String chongwumingcheng;

	/**
	 * 宠物类型
	 */
	
	private String chongwuleixing;


	/**
	 * 生活习惯
	 */

	private String shenghuoxiguan;

	/**
	 * 饮食习惯
	 */

	private String yinshixiguan;



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
	 * 是否打针
	 */

	private String shifoudazhen;


	/**
	 * 是否节育
	 */

	private String shifoujieyu;

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

	public String getChongwumingcheng() {
		return chongwumingcheng;
	}

	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}

	public String getShenghuoxiguan() {
		return shenghuoxiguan;
	}

	public void setShenghuoxiguan(String shenghuoxiguan) {
		this.shenghuoxiguan = shenghuoxiguan;
	}

	public String getYinshixiguan() {
		return yinshixiguan;
	}

	public void setYinshixiguan(String yinshixiguan) {
		this.yinshixiguan = yinshixiguan;
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

	public String getShifoudazhen() {
		return shifoudazhen;
	}

	public void setShifoudazhen(String shifoudazhen) {
		this.shifoudazhen = shifoudazhen;
	}

	public String getShifoujieyu() {
		return shifoujieyu;
	}

	public void setShifoujieyu(String shifoujieyu) {
		this.shifoujieyu = shifoujieyu;
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
}
