const menu = {
    list() {
        return [
            {
                "backMenu": [
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-form",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "用户",
                                "menuJump": "列表",
                                "tableName": "yonghu"
                            }
                        ],
                        "menu": "用户管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-shop",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "养护分类",
                                "menuJump": "列表",
                                "tableName": "yanghufenlei"
                            }
                        ],
                        "menu": "养护分类管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-album",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "产品分类",
                                "menuJump": "列表",
                                "tableName": "chanpinfenlei"
                            }
                        ],
                        "menu": "产品分类管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-newshot",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "宠物类型",
                                "menuJump": "列表",
                                "tableName": "chongwuleixing"
                            }
                        ],
                        "menu": "宠物类型管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "宠物信息类型占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-link",
                                "buttons": ["新增", "查看", "修改", "删除", "查看评论", "首页总数", "首页统计"],
                                "menu": "宠物信息",
                                "menuJump": "列表",
                                "tableName": "chongwuxinxi"
                            }
                        ],
                        "menu": "宠物信息管理"
                    },
                    
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "养护分类占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-newshot",
                                "buttons": ["新增", "查看", "修改", "删除", "查看评论", "首页总数", "首页统计"],
                                "menu": "宠物养护知识",
                                "menuJump": "列表",
                                "tableName": "chongwuyanghuzhishi"
                            }
                        ],
                        "menu": "宠物养护知识管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "审核", "宠物分享类型统计", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-cardboard",
                                "buttons": ["新增", "查看", "修改", "删除", "审核", "查看评论", "首页总数", "首页统计"],
                                "menu": "宠物分享",
                                "menuJump": "列表",
                                "tableName": "chongwufenxiang"
                            }
                        ],
                        "menu": "宠物分享管理"
                    },
                    
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-attentionfavor",
                                "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "menu": "四季养宠",
                                "menuJump": "列表",
                                "tableName": "sijiyangchong"
                            }
                        ],
                        "menu": "四季养宠管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-qrcode",
                                "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "menu": "宠物产品",
                                "menuJump": "列表",
                                "tableName": "chongwuchanpin"
                            }
                        ],
                        "menu": "宠物产品管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-vip",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "论坛管理",
                                "tableName": "forum"
                            }
                        ],
                        "menu": "论坛管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["查看", "修改"],
                                "appFrontIcon": "cuIcon-pic",
                                "buttons": ["查看", "修改"],
                                "menu": "关于我们",
                                "tableName": "aboutus"
                            },
                            {
                                "allButtons": ["查看", "修改"],
                                "appFrontIcon": "cuIcon-qrcode",
                                "buttons": ["查看", "修改"],
                                "menu": "系统简介",
                                "tableName": "systemintro"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-present",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "轮播图管理",
                                "tableName": "config"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-news",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "公告信息",
                                "tableName": "news"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-news",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "公告信息分类",
                                "tableName": "newstype"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除"],
                                "appFrontIcon": "cuIcon-service",
                                "buttons": ["新增", "查看", "修改", "删除"],
                                "menu": "在线咨询",
                                "tableName": "chat"
                            }
                        ],
                        "menu": "系统管理"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "导出", "日销量", "月销量", "年销量", "品销量", "类销量", "日销额", "月销额", "年销额", "品销额", "类销额", "发货", "物流", "核销"],
                                "appFrontIcon": "cuIcon-discover",
                                "buttons": ["查看", "发货", "物流"],
                                "menu": "已支付订单",
                                "tableName": "orders/已支付"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "导出", "日销量", "月销量", "年销量", "品销量", "类销量", "日销额", "月销额", "年销额", "品销额", "类销额", "物流", "退货审核"],
                                "appFrontIcon": "cuIcon-link",
                                "buttons": ["查看", "退货审核"],
                                "menu": "已完成订单",
                                "tableName": "orders/已完成"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "导出", "日销量", "月销量", "年销量", "品销量", "类销量", "日销额", "月销额", "年销额", "品销额", "类销额", "物流"],
                                "appFrontIcon": "cuIcon-phone",
                                "buttons": ["查看"],
                                "menu": "已退款订单",
                                "tableName": "orders/已退款"
                            },
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "导出", "日销量", "月销量", "年销量", "品销量", "类销量", "日销额", "月销额", "年销额", "品销额", "类销额", "确认收货", "物流"],
                                "appFrontIcon": "cuIcon-keyboard",
                                "buttons": ["查看"],
                                "menu": "已发货订单",
                                "tableName": "orders/已发货"
                            }
                        ],
                        "menu": "订单管理"
                    }
                ],
                "frontMenu": [
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "宠物信息类型占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-rank",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物信息列表",
                                "menuJump": "列表",
                                "tableName": "chongwuxinxi"
                            }
                        ],
                        "menu": "宠物信息模块"
                    },
                    
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "养护分类占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-skin",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物养护知识列表",
                                "menuJump": "列表",
                                "tableName": "chongwuyanghuzhishi"
                            }
                        ],
                        "menu": "宠物养护知识模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "审核", "宠物分享类型统计", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-clothes",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物分享列表",
                                "menuJump": "列表",
                                "tableName": "chongwufenxiang"
                            }
                        ],
                        "menu": "宠物分享模块"
                    },
                   
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-qrcode",
                                "buttons": ["查看"],
                                "menu": "四季养宠列表",
                                "menuJump": "列表",
                                "tableName": "sijiyangchong"
                            }
                        ],
                        "menu": "四季养宠模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-link",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物产品列表",
                                "menuJump": "列表",
                                "tableName": "chongwuchanpin"
                            }
                        ],
                        "menu": "宠物产品模块"
                    }
                ],
                "hasBackLogin": "是",
                "hasBackRegister": "否",
                "hasFrontLogin": "否",
                "hasFrontRegister": "否",
                "roleName": "管理员",
                "tableName": "users"
            },
            {
                "backMenu": [
                    {
                        "child": [
                          {
                            "allButtons": [ "查看", "审核", "宠物领养类型统计", "查看评论", "首页总数", "首页统计"],
                            "appFrontIcon": "cuIcon-cardboard",
                            "buttons": ["查看",  "查看评论"],
                            "menu": "宠物领养",
                            "menuJump": "列表",
                            "tableName": "chongwulingyang"
                          }
                        ],
                        "menu": "宠物领养管理"
                      },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "审核", "宠物分享类型统计", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-cardboard",
                                "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "menu": "宠物分享",
                                "menuJump": "列表",
                                "tableName": "chongwufenxiang"
                            }
                        ],
                        "menu": "宠物分享管理"
                    },
                  
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "导出", "日销量", "月销量", "年销量", "品销量", "类销量", "日销额", "月销额", "年销额", "品销额", "类销额", "确认收货", "物流"],
                                "appFrontIcon": "cuIcon-keyboard",
                                "buttons": ["确认收货"],
                                "menu": "已发货订单",
                                "tableName": "orders/已发货"
                            }
                        ],
                        "menu": "订单管理"
                    }
                ],
                "frontMenu": [
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "宠物信息类型占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-rank",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物信息列表",
                                "menuJump": "列表",
                                "tableName": "chongwuxinxi"
                            }
                        ],
                        "menu": "宠物信息模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "宠物领养类型占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-rank",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物领养列表",
                                "menuJump": "列表",
                                "tableName": "chongwulingyang"
                            }
                        ],
                        "menu": "宠物领养模块"
                    },
                    
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "养护分类占比", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-skin",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物养护知识列表",
                                "menuJump": "列表",
                                "tableName": "chongwuyanghuzhishi"
                            }
                        ],
                        "menu": "宠物养护知识模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "审核", "宠物分享类型统计", "查看评论", "首页总数", "首页统计"],
                                "appFrontIcon": "cuIcon-clothes",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物分享列表",
                                "menuJump": "列表",
                                "tableName": "chongwufenxiang"
                            }
                        ],
                        "menu": "宠物分享模块"
                    },
                    
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-qrcode",
                                "buttons": ["查看"],
                                "menu": "四季养宠列表",
                                "menuJump": "列表",
                                "tableName": "sijiyangchong"
                            }
                        ],
                        "menu": "四季养宠模块"
                    },
                    {
                        "child": [
                            {
                                "allButtons": ["新增", "查看", "修改", "删除", "查看评论"],
                                "appFrontIcon": "cuIcon-link",
                                "buttons": ["查看", "查看评论"],
                                "menu": "宠物产品列表",
                                "menuJump": "列表",
                                "tableName": "chongwuchanpin"
                            }
                        ],
                        "menu": "宠物产品模块"
                    }
                ],
                "hasBackLogin": "否",
                "hasBackRegister": "否",
                "hasFrontLogin": "是",
                "hasFrontRegister": "是",
                "roleName": "用户",
                "tableName": "yonghu"
            }
        ]

    }
}
export default menu;
