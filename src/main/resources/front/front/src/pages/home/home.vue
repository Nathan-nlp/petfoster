<template>
<div class="home-preview" :style='{"margin":"0px auto","flexWrap":"wrap","flexDirection":"row","background":"#fff","display":"flex","width":"100%","justifyContent":"center"}'>






<!--   宠物信息推荐 -->
<div id="animate_recommendchongwuxinxi" class="recommend animate__animated" :style='{"padding":"60px 7% 40px","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
    <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
        <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物信息推荐</span>
        <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
    </div>
    
    <!-- 信息列表 -->
    <div class="info-list">
        <div :style='{"width":"100%","padding":"20px 0","margin":"0 auto","background":"transparent","height":"auto"}' class="swiper-container" id="recommendchongwuxinxi">
            <div class="swiper-wrapper">
                <div class="swiper-slide info-card" 
                     :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","position":"relative","margin":"0 15px","width":"280px","overflow":"hidden","transition":"all 0.3s ease"}' 
                     v-for="(item,index) in chongwuxinxiRecommend" 
                     :key="index" 
                     @click="toDetail('chongwuxinxiDetail', item)">
                    
                    <!-- 宠物封面 -->
                    <div class="info-image">
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-if="preHttp(item.fengmian)" 
                             :src="item.fengmian.split(',')[0]" 
                             alt="宠物封面" />
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-else 
                             :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
                             alt="宠物封面" />
                    </div>
                    
                    <!-- 宠物信息 -->
                    <div :style='{"padding":"20px","background":"#fff"}'>
                        <!-- 宠物名称 -->
                        <div class="info-name" :style='{"margin":"0 0 10px 0","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
                            宠物名称：{{item.chongwumingcheng}}
                        </div>
                        <!--  -->
												<div :style='{"margin":"0 0 12px 0","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
                            <span class="icon iconfont icon-fenlei" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                            宠物类型：{{item.chongwuleixing}}
                        </div>
												<div :style='{"margin":"0 0 12px 0","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
                            <span class="icon iconfont icon-fenlei" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                            品种：{{item.pinzhong}}
                        </div>
                        <!-- 信息底部 -->
                        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
                            <!-- 点赞数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-zan07" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>点赞数：{{item.thumbsupnum}}</span>
                            </div>
                            
                            <!-- 收藏数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
                                <span :style='{"color":"#ffca61","fontSize":"12px"}'>收藏量:{{item.storeupnum}}</span>
                            </div>
                            
                            <!-- 浏览数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 导航按钮 -->
            <div class="swiper-button-prev" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","left":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
            <div class="swiper-button-next" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","right":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
        </div>
    </div>
    
    <!-- 查看更多按钮 -->
    <div @click="moreBtn('chongwuxinxi')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多信息</span>
    </div>
</div>

<!--   推荐 -->


<!--   宠物养护知识推荐 -->
<div id="animate_recommendchongwuyanghuzhishi" class="recommend animate__animated" :style='{"padding":"60px 7% 40px","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
    <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
        <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物养护知识推荐</span>
        <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
    </div>
    
    <!-- 知识列表 -->
    <div class="knowledge-list">
        <div :style='{"width":"100%","padding":"20px 0","margin":"0 auto","background":"transparent","height":"auto"}' class="swiper-container" id="recommendchongwuyanghuzhishi">
            <div class="swiper-wrapper">
                <div class="swiper-slide knowledge-card" 
                     :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","position":"relative","margin":"0 15px","width":"280px","overflow":"hidden","transition":"all 0.3s ease"}' 
                     v-for="(item,index) in chongwuyanghuzhishiRecommend" 
                     :key="index" 
                     @click="toDetail('chongwuyanghuzhishiDetail', item)">
                    
                    <!-- 知识图片 -->
                    <div class="knowledge-image">
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-if="preHttp(item.tupian)" 
                             :src="item.tupian.split(',')[0]" 
                             alt="养护知识图片" />
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-else 
                             :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" 
                             alt="养护知识图片" />
                    </div>
                    
                    <!-- 知识信息 -->
                    <div :style='{"padding":"20px","background":"#fff"}'>
                        <!-- 标题 -->
                        <div class="knowledge-title" :style='{"margin":"0 0 10px 0","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
                            {{item.biaoti}}
                        </div>
                        
                        <!-- 养护分类 -->
                        <div :style='{"margin":"0 0 12px 0","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
                            <span class="icon iconfont icon-fenlei" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                            {{item.yanghufenlei}}
                        </div>
                        
                        <!-- 信息底部 -->
                        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
                            <!-- 发布时间 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
                            </div>
                            
                            <!-- 点赞数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-zan07" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
                            </div>
                            
                            <!-- 收藏数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
                                <span :style='{"color":"#ffca61","fontSize":"12px"}'>{{item.storeupnum}}</span>
                            </div>
                            
                            <!-- 浏览数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 导航按钮 -->
            <div class="swiper-button-prev" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","left":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
            <div class="swiper-button-next" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","right":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
        </div>
    </div>
    
    <!-- 查看更多按钮 -->
    <div @click="moreBtn('chongwuyanghuzhishi')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多知识</span>
    </div>
</div>

<!--   推荐 -->

<!--   宠物分享推荐 -->
<div id="animate_recommendchongwufenxiang" class="recommend animate__animated" :style='{"padding":"60px 7% 40px","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
    <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
        <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物分享推荐</span>
        <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
    </div>
    
    <!-- 分享列表 -->
    <div class="share-list">
        <div :style='{"width":"100%","padding":"20px 0","margin":"0 auto","background":"transparent","height":"auto"}' class="swiper-container" id="recommendchongwufenxiang">
            <div class="swiper-wrapper">
                <div class="swiper-slide share-card" 
                     :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","position":"relative","margin":"0 15px","width":"280px","overflow":"hidden","transition":"all 0.3s ease"}' 
                     v-for="(item,index) in chongwufenxiangRecommend" 
                     :key="index" 
                     @click="toDetail('chongwufenxiangDetail', item)">
                    
                    <!-- 分享封面 -->
                    <div class="share-image">
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-if="preHttp(item.fengmian)" 
                             :src="item.fengmian.split(',')[0]" 
                             alt="分享封面" />
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-else 
                             :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
                             alt="分享封面" />
                    </div>
                    
                    <!-- 分享信息 -->
                    <div :style='{"padding":"20px","background":"#fff"}'>
                        <!-- 标题 -->
                        <div class="share-title" :style='{"margin":"0 0 10px 0","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
                            {{item.biaoti}}
                        </div>
                        
                        <!-- 用户信息 -->
                        <div :style='{"display":"flex","alignItems":"center","marginBottom":"12px"}'>
                            <span class="icon iconfont icon-geren11" :style='{"padding":"4px","marginRight":"8px","color":"#8b8b8b","borderRadius":"100%","background":"#f0f0f0","fontSize":"14px"}'></span>
                            <span :style='{"color":"#666","fontSize":"14px"}'>发布人：{{item.yonghuzhanghao}}</span>
                        </div>
                        
                        <!-- 信息底部 -->
                        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
                            <!-- 发布时间 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
                            </div>
                            
                            <!-- 点赞数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-zan07" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
                            </div>
                            
                            <!-- 收藏数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
                                <span :style='{"color":"#ffca61","fontSize":"12px"}'>{{item.storeupnum}}</span>
                            </div>
                            
                            <!-- 浏览数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 导航按钮 -->
            <div class="swiper-button-prev" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","left":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
            <div class="swiper-button-next" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","right":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
        </div>
    </div>
    
    <!-- 查看更多按钮 -->
    <div @click="moreBtn('chongwufenxiang')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多分享</span>
    </div>
</div>

<!--   推荐 -->

<!--   四季宠物推荐 -->
<div id="animate_recommendsijiyangchong" class="recommend animate__animated" :style='{"padding":"60px 7% 40px","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
    <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
        <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>四季宠物养护</span>
        <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
    </div>
    
    <!-- 季节养护列表 -->
    <div class="season-list">
        <div :style='{"width":"100%","padding":"20px 0","margin":"0 auto","background":"transparent","height":"auto"}' class="swiper-container" id="recommendsijiyangchong">
            <div class="swiper-wrapper">
                <div class="swiper-slide season-card" 
                     :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","position":"relative","margin":"0 15px","width":"280px","overflow":"hidden","transition":"all 0.3s ease"}' 
                     v-for="(item,index) in sijiyangchongRecommend" 
                     :key="index" 
                     @click="toDetail('sijiyangchongDetail', item)">
                    
                    <!-- 季节宠物封面 -->
                    <div class="season-image">
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-if="preHttp(item.fengmian)" 
                             :src="item.fengmian.split(',')[0]" 
                             alt="季节宠物封面" />
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-else 
                             :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
                             alt="季节宠物封面" />
                    </div>
                    
                    <!-- 季节养护信息 -->
                    <div :style='{"padding":"20px","background":"#fff"}'>
                        <!-- 标题 -->
                        <div class="season-title" :style='{"margin":"0 0 10px 0","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
                            {{item.yangchongbiaoti}}
                        </div>
                        
                        <!-- 季节分类 -->
                        <div :style='{"display":"flex","alignItems":"center","marginBottom":"12px","padding":"8px 12px","background":"#f5f5f5","borderRadius":"4px"}'>
                            <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
                            <span :style='{"color":"#666","fontSize":"14px"}'>{{item.sijifenlei}}</span>
                        </div>
                        
                        <!-- 信息底部 -->
                        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
                            <!-- 发布时间 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>发布时间：{{item.addtime}}</span>
                            </div>
                            
                            <!-- 收藏数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
                                <span :style='{"color":"#ffca61","fontSize":"12px"}'>{{item.storeupnum}}</span>
                            </div>
                            
                          
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 导航按钮 -->
            <div class="swiper-button-prev" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","left":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
            <div class="swiper-button-next" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","right":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
        </div>
    </div>
    
    <!-- 查看更多按钮 -->
    <div @click="moreBtn('sijiyangchong')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多养护知识</span>
    </div>
</div>


<!--   推荐 -->

<!--   宠物产品推荐 -->
<div id="animate_recommendchongwuchanpin" class="recommend animate__animated" :style='{"padding":"60px 7% 40px","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
    <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
        <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物产品推荐</span>
        <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
    </div>
    
    <!-- 产品列表 -->
    <div class="product-list">
        <div :style='{"width":"100%","padding":"20px 0","margin":"0 auto","background":"transparent","height":"auto"}' class="swiper-container" id="recommendchongwuchanpin">
            <div class="swiper-wrapper">
                <div class="swiper-slide product-card" 
                     :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","position":"relative","margin":"0 15px","width":"280px","overflow":"hidden","transition":"all 0.3s ease"}' 
                     v-for="(item,index) in chongwuchanpinRecommend" 
                     :key="index" 
                     @click="toDetail('chongwuchanpinDetail', item)">
                    
                    <!-- 产品图片 -->
                    <div class="product-image">
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-if="preHttp(item.chanpintupian)" 
                             :src="item.chanpintupian.split(',')[0]" 
                             alt="产品图片" />
                        <img :style='{"objectFit":"cover","width":"100%","height":"200px","borderRadius":"8px 8px 0 0","transition":"all 0.3s ease"}' 
                             v-else 
                             :src="baseUrl + (item.chanpintupian?item.chanpintupian.split(',')[0]:'')" 
                             alt="产品图片" />
                    </div>
                    
                    <!-- 产品信息 -->
                    <div :style='{"padding":"20px","background":"#fff"}'>
                        <!-- 产品名称 -->
                        <div class="product-name" :style='{"margin":"0 0 10px 0","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
                            {{item.chanpinmingcheng}}
                        </div>

												<div :style='{"margin":"0 0 12px 0","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
                            <span class="icon iconfont icon-fenlei" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                           {{item.chanpinfenlei}}
                        </div>

                        
                        <!-- 产品信息底部 -->
                        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
                            <!-- 发布时间 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
                            </div>
                            
                            <!-- 收藏数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
                                <span :style='{"color":"#ffca61","fontSize":"12px"}'>{{item.storeupnum}}</span>
                            </div>
                            
                            <!-- 浏览数 -->
                            <div :style='{"display":"flex","alignItems":"center"}'>
                                <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
                                <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- 导航按钮 -->
            <div class="swiper-button-prev" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","left":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
            <div class="swiper-button-next" :style='{"color":"#fff","background":"rgba(30,60,79,0.7)","width":"40px","height":"40px","borderRadius":"50%","right":"10px","top":"50%","transform":"translateY(-50%)"}'></div>
        </div>
    </div>
    
    <!-- 查看更多按钮 -->
    <div @click="moreBtn('chongwuchanpin')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多产品</span>
    </div>
</div>

<!--   推荐 -->


<!-- 宠物信息展示 -->
<div id="animate_listchongwuxinxi" class="lists animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物信息展示</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"32%","marginBottom":"30px","cursor":"pointer","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","overflow":"hidden","transition":"all 0.3s ease"}' 
         v-for="(item,index) in chongwuxinxiList" 
         :key="index" 
         @click="toDetail('chongwuxinxiDetail', item)">
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-if="preHttp(item.fengmian)" 
           :src="item.fengmian.split(',')[0]" 
           alt="宠物图片" />
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-else 
           :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
           alt="宠物图片" />
      
      <div :style='{"padding":"20px"}'>
        <div :style='{"margin":"0 0 10px","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
          宠物名称：{{item.chongwumingcheng}}
        </div>
        


				<div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          宠物类型：{{item.chongwuleixing}}
        </div>

				<div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          品种：{{item.pinzhong}}
        </div>

				<div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          性别：{{item.xingbie}}
        </div>

        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shoucang12" :style='{"marginRight":"5px","fontSize":"14px","color":"#ffca61"}'></span>
            <span :style='{"color":"#ffca61","fontSize":"12px"}'>{{item.storeupnum}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <div @click="moreBtn('chongwuxinxi')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
    <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多宠物</span>
  </div>
</div>

<!-- 宠物养护知识展示 -->
<div id="animate_listchongwuyanghuzhishi" class="lists animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #c3cfe2 0%, #f5f7fa 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物养护知识</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"32%","marginBottom":"30px","cursor":"pointer","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","overflow":"hidden","transition":"all 0.3s ease"}' 
         v-for="(item,index) in chongwuyanghuzhishiList" 
         :key="index" 
         @click="toDetail('chongwuyanghuzhishiDetail', item)">
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-if="preHttp(item.tupian)" 
           :src="item.tupian.split(',')[0]" 
           alt="养护知识图片" />
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-else 
           :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" 
           alt="养护知识图片" />
      
      <div :style='{"padding":"20px"}'>
        <div :style='{"margin":"0 0 10px","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
          {{item.biaoti}}
        </div>
        
        <div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          {{item.yanghufenlei}}
        </div>
        

				<div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          适用于：{{item.shiyong}}
        </div>

        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <div @click="moreBtn('chongwuyanghuzhishi')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
    <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多知识</span>
  </div>
</div>

<!-- 宠物分享展示 -->
<div id="animate_listchongwufenxiang" class="lists animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>宠物分享展示</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"32%","marginBottom":"30px","cursor":"pointer","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","overflow":"hidden","transition":"all 0.3s ease"}' 
         v-for="(item,index) in chongwufenxiangList" 
         :key="index" 
         @click="toDetail('chongwufenxiangDetail', item)">
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-if="preHttp(item.fengmian)" 
           :src="item.fengmian.split(',')[0]" 
           alt="分享图片" />
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-else 
           :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
           alt="分享图片" />
      
      <div :style='{"padding":"20px"}'>
        <div :style='{"margin":"0 0 10px","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
          {{item.biaoti}}
        </div>
        
        <div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-geren11" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          发布人：{{item.yonghuzhanghao}}
        </div>
        
        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <div @click="moreBtn('chongwufenxiang')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
    <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多分享</span>
  </div>
</div>

<!-- 四季养宠展示 -->
<div id="animate_listsijiyangchong" class="lists animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #c3cfe2 0%, #f5f7fa 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>四季养宠指南</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"32%","marginBottom":"30px","cursor":"pointer","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","overflow":"hidden","transition":"all 0.3s ease"}' 
         v-for="(item,index) in sijiyangchongList" 
         :key="index" 
         @click="toDetail('sijiyangchongDetail', item)">
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-if="preHttp(item.fengmian)" 
           :src="item.fengmian.split(',')[0]" 
           alt="四季养宠图片" />
      <img :style='{"width":"100%","height":"240px","objectFit":"cover"}' 
           v-else 
           :src="baseUrl + (item.fengmian?item.fengmian.split(',')[0]:'')" 
           alt="四季养宠图片" />
      
      <div :style='{"padding":"20px"}'>
        <div :style='{"margin":"0 0 10px","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
          {{item.yangchongbiaoti}}
        </div>
        
        <div :style='{"margin":"0 0 12px","fontSize":"14px","color":"#666","lineHeight":"1.5","display":"flex","alignItems":"center"}'>
          <span class="icon iconfont icon-fenlei" :style='{"marginRight":"8px","fontSize":"14px","color":"#666"}'></span>
          {{item.sijifenlei}}
        </div>
        
        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  
	<div @click="moreBtn('sijiyangchong')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'> <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多指南</span> </div> </div>
	

	<!-- 公告信息 -->
<div id="news" class="animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>公告信息</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"32%","marginBottom":"30px","cursor":"pointer","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff","overflow":"hidden","transition":"all 0.3s ease"}' 
         v-for="(item,index) in newsList" 
         :key="index" 
         @click="toDetail('newsDetail', item)">
      <img :style='{"width":"100%","height":"200px","objectFit":"cover"}' :src="baseUrl + item.picture" alt="公告图片">
      
      <div :style='{"padding":"20px"}'>
        <div :style='{"margin":"0 0 10px","fontSize":"18px","color":"#333","fontWeight":"bold","lineHeight":"1.4","height":"50px","overflow":"hidden","textOverflow":"ellipsis","display":"-webkit-box","WebkitLineClamp":"2","WebkitBoxOrient":"vertical"}'>
          {{item.title}}
        </div>
        
        <div :style='{"display":"flex","justifyContent":"space-between","alignItems":"center","borderTop":"1px solid #f5f5f5","paddingTop":"12px"}'>
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-shijian21" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.addtime}}</span>
          </div>
          
          <div :style='{"display":"flex","alignItems":"center"}'>
            <span class="icon iconfont icon-chakan2" :style='{"marginRight":"5px","fontSize":"14px","color":"#999"}'></span>
            <span :style='{"color":"#999","fontSize":"12px"}'>{{item.clicknum}}</span>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <div @click="moreBtn('news')" :style='{"border":"0","cursor":"pointer","margin":"40px auto 0","textAlign":"center","background":"none","display":"block","width":"auto"}'>
    <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>查看更多公告</span>
  </div>
</div>
<!-- 关于我们 -->
<div id="about" class="animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>关于我们</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap","justifyContent":"space-between","alignItems":"center","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"48%","padding":"20px","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff"}'>
      <img :style='{"width":"100%","height":"400px","objectFit":"cover","borderRadius":"8px"}' :src="baseUrl + aboutUsDetail.picture1" alt="关于我们">
    </div>
    
    <div :style='{"width":"48%","padding":"20px"}'>
      <div :style='{"marginBottom":"20px","fontSize":"24px","color":"#1e3c4f","fontWeight":"bold"}'>{{aboutUsDetail.title}}</div>
      <div :style='{"color":"#666","lineHeight":"1.8","fontSize":"16px","marginBottom":"30px"}' v-html="aboutUsDetail.content"></div>
      
      <div @click="toDetail('aboutusDetail',aboutUsDetail)" :style='{"border":"0","cursor":"pointer","margin":"20px 0 0","textAlign":"center","background":"none","display":"inline-block"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>了解更多</span>
      </div>
    </div>
  </div>
</div>

<!-- 系统简介 -->
<div id="system" class="animate__animated" :style='{"padding":"60px 7%","margin":"0 auto","background":"linear-gradient(135deg, #c3cfe2 0%, #f5f7fa 100%)","width":"100%","position":"relative"}'>
  <div class="title" :style='{"width":"100%","margin":"0 auto 40px","lineHeight":"1.2","textAlign":"center"}'>
    <span :style='{"padding":"0","fontSize":"36px","color":"#333","fontWeight":"600","display":"block","letterSpacing":"1px"}'>系统简介</span>
    <div :style='{"width":"80px","height":"3px","background":"#1e3c4f","margin":"15px auto 0"}'></div>
  </div>
  
  <div :style='{"display":"flex","flexWrap":"wrap-reverse","justifyContent":"space-between","alignItems":"center","margin":"0 auto","maxWidth":"1200px"}'>
    <div :style='{"width":"48%","padding":"20px"}'>
      <div :style='{"marginBottom":"20px","fontSize":"24px","color":"#1e3c4f","fontWeight":"bold"}'>{{systemIntroductionDetail.title}}</div>
      <div :style='{"color":"#666","lineHeight":"1.8","fontSize":"16px","marginBottom":"30px"}' v-html="systemIntroductionDetail.content"></div>
      
      <div @click="toDetail('systemintroDetail',systemIntroductionDetail)" :style='{"border":"0","cursor":"pointer","margin":"20px 0 0","textAlign":"center","background":"none","display":"inline-block"}'>
        <span :style='{"color":"#1e3c4f","fontSize":"16px","fontWeight":"500","padding":"10px 20px","border":"1px solid #1e3c4f","borderRadius":"4px","transition":"all 0.3s"}'>了解更多</span>
      </div>
    </div>
    
    <div :style='{"width":"48%","padding":"20px","boxShadow":"0 5px 15px rgba(0,0,0,0.1)","borderRadius":"8px","background":"#fff"}'>
      <img :style='{"width":"100%","height":"400px","objectFit":"cover","borderRadius":"8px"}' :src="baseUrl + systemIntroductionDetail.picture1" alt="系统简介">
    </div>
  </div>
</div>


</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],
        chongwuxinxiRecommend: [],
        chongwuyanghuzhishiRecommend: [],
        chongwufenxiangRecommend: [],
        sijiyangchongRecommend: [],
        chongwuchanpinRecommend: [],

        chongwuxinxiList: [],
        chongwuyanghuzhishiList: [],
        chongwufenxiangList: [],
        sijiyangchongList: [],




      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getAboutUs();
		this.getSystemIntroduction();
		this.getList();
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},


		handleScroll() {
			let arr = [
				{id:'search',css:'animate__'},
				{id:'about',css:'animate__'},
				{id:'system',css:'animate__'},
				{id:'animate_recommendchongwuxinxi',css:'animate__'},
				{id:'animate_listchongwuxinxi',css:'animate__'},
				{id:'animate_recommendchongwuyanghuzhishi',css:'animate__'},
				{id:'animate_listchongwuyanghuzhishi',css:'animate__'},
				{id:'animate_recommendchongwufenxiang',css:'animate__'},
				{id:'animate_listchongwufenxiang',css:'animate__'},
				{id:'animate_recommendsijiyangchong',css:'animate__'},
				{id:'animate_listsijiyangchong',css:'animate__'},
				{id:'animate_recommendchongwuchanpin',css:'animate__'},
				{id:'animate_newsnews',css:'animate__'},
				{id:'msgs',css:'animate__'},
				{id:'friendly',css:'animate__'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 4,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "chongwuxinxi/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "chongwuxinxi/autoSort2";
          }
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuxinxiRecommend = res.data.data.list;
					
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":false,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper('#recommendchongwuxinxi', options)
					})
					
					//   列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 8,
			}

          autoSortUrl = "chongwuyanghuzhishi/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "chongwuyanghuzhishi/autoSort2";
          }
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuyanghuzhishiRecommend = res.data.data.list;
					
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":false,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper('#recommendchongwuyanghuzhishi', options)
					})
					
					//   列表样式五
					
				}
			});
          autoSortUrl = "chongwufenxiang/autoSort";
			data = {
				page: 1,
				limit: 8,
			}
			data['sfsh'] = '是'
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwufenxiangRecommend = res.data.data.list;
					
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":false,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper('#recommendchongwufenxiang', options)
					})
					
					//   列表样式五
					
				}
			});
          autoSortUrl = "sijiyangchong/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "sijiyangchong/autoSort2";
          }
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.sijiyangchongRecommend = res.data.data.list;
					
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":false,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper('#recommendsijiyangchong', options)
					})
					
					//   列表样式五
					
				}
			});
          autoSortUrl = "chongwuchanpin/autoSort";
			data = {
				page: 1,
				limit: 8,
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuchanpinRecommend = res.data.data.list;
					
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":false,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper('#recommendchongwuchanpin', options)
					})
					
					//   列表样式五
					
				}
			});
			
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('chongwuxinxi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuxinxiList = res.data.data.list;
					
					//   列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}

			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('chongwuyanghuzhishi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwuyanghuzhishiList = res.data.data.list;
					
					//   列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}
			data['sfsh']= '是'
			this.$http.get('chongwufenxiang/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.chongwufenxiangList = res.data.data.list;
					
					//   列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}

			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('sijiyangchong/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.sijiyangchongList = res.data.data.list;
					
					//   列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 2px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 32px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 2px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 280px;
			font-size: 14px;
			height: 32px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: #0c5f62;
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: #0c5f62;
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(0.96) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(0.96) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	










</style>
