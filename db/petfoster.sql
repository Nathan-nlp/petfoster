/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : petfoster

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 02/05/2025 20:17:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for aboutus
-- ----------------------------
DROP TABLE IF EXISTS `aboutus`;
CREATE TABLE `aboutus`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '关于我们' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of aboutus
-- ----------------------------
INSERT INTO `aboutus` VALUES (1, '2025-04-25 17:19:51', '关于我们', 'ABOUT US', '当你设想门外是寒冷可怕的世界时，你还应该开门出去看看，是否真的如此。如果你有信心，你对前途就不犹豫了。如果你有勇气，你就不怕前途是否有困难或危险了每个人心中都应有两盏灯，一盏是希望的灯，一盏是勇气的灯。有了这两盏灯，我们就不怕海上的黑暗和风涛的险恶了。人的一生很像是在雾中行走。远远望去，只是迷蒙一片，辨不出方向和吉凶。可是，当你鼓起勇气，放下恐惧和怀疑，一步一步向前走去的时候，你就会发现，每走一步，你都能把下一步路看得清楚一点。“往前走，别站在远远的地方观望！”你就可以找到你的方向。', 'upload/aboutus_picture1.jpg', 'upload/aboutus_picture2.jpg', 'upload/aboutus_picture3.jpg');

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人',
  `phone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `isdefault` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地址' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '2025-04-25 17:19:51', 11, '宇宙银河系金星1号', '金某', '13823888881', '是');
INSERT INTO `address` VALUES (2, '2025-04-25 17:19:51', 12, '宇宙银河系木星1号', '木某', '13823888882', '是');
INSERT INTO `address` VALUES (3, '2025-04-25 17:19:51', 13, '宇宙银河系水星1号', '水某', '13823888883', '是');
INSERT INTO `address` VALUES (4, '2025-04-25 17:19:51', 14, '宇宙银河系火星1号', '火某', '13823888884', '是');
INSERT INTO `address` VALUES (5, '2025-04-25 17:19:51', 15, '宇宙银河系土星1号', '土某', '13823888885', '是');
INSERT INTO `address` VALUES (6, '2025-04-25 17:19:51', 16, '宇宙银河系月球1号', '月某', '13823888886', '是');
INSERT INTO `address` VALUES (7, '2025-04-25 17:19:51', 17, '宇宙银河系黑洞1号', '黑某', '13823888887', '是');
INSERT INTO `address` VALUES (8, '2025-04-25 17:19:51', 18, '宇宙银河系地球1号', '地某', '13823888888', '是');
INSERT INTO `address` VALUES (9, '2025-02-04 20:08:32', 1737390466763, '南理工', 'a1', '15995521234', '是');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'chongwuchanpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NULL DEFAULT NULL COMMENT '单价',
  `goodtype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类型',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家账号',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (5, '2025-04-29 00:42:39', 'chongwuchanpin', 1737390466763, 126, '宠物除臭喷雾（Nature’s Miracle）', 'upload/chongwuchanpin8.jpg', 1, 89, NULL, 'b3', 'b3');
INSERT INTO `cart` VALUES (6, '2025-04-29 00:42:43', 'chongwuchanpin', 1737390466763, 122, '宠物食盆（PetSafe）', 'upload/chongwuchanpin4.jpg', 1, 65, NULL, 'b2', 'b2');

-- ----------------------------
-- Table structure for chanpinfenlei
-- ----------------------------
DROP TABLE IF EXISTS `chanpinfenlei`;
CREATE TABLE `chanpinfenlei`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `chanpinfenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chanpinfenlei
-- ----------------------------
INSERT INTO `chanpinfenlei` VALUES (39, '2025-04-25 17:52:59', '宠物食品');
INSERT INTO `chanpinfenlei` VALUES (40, '2025-04-25 17:53:02', ' 宠物护理用品');
INSERT INTO `chanpinfenlei` VALUES (41, '2025-04-25 17:53:05', '宠物玩具');
INSERT INTO `chanpinfenlei` VALUES (42, '2025-04-25 17:53:10', '宠物用品');
INSERT INTO `chanpinfenlei` VALUES (43, '2025-04-25 17:53:14', '宠物健康护理');
INSERT INTO `chanpinfenlei` VALUES (44, '2025-04-25 17:53:18', '宠物旅行用品');
INSERT INTO `chanpinfenlei` VALUES (45, '2025-04-25 17:53:21', '宠物家具');
INSERT INTO `chanpinfenlei` VALUES (46, '2025-04-25 17:53:25', '宠物环境清洁用品');
INSERT INTO `chanpinfenlei` VALUES (47, '2025-04-25 17:53:28', '宠物训练用品');

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) NULL DEFAULT NULL COMMENT '管理员id',
  `ask` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '提问',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复',
  `isreply` int(11) NULL DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 139 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '在线咨询' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chat
-- ----------------------------
INSERT INTO `chat` VALUES (131, '2025-04-25 17:19:51', 1, 1, '提问1', '回复1', 1);
INSERT INTO `chat` VALUES (132, '2025-04-25 17:19:51', 2, 2, '提问2', '回复2', 2);
INSERT INTO `chat` VALUES (133, '2025-04-25 17:19:51', 3, 3, '提问3', '回复3', 3);
INSERT INTO `chat` VALUES (134, '2025-04-25 17:19:51', 4, 4, '提问4', '回复4', 4);
INSERT INTO `chat` VALUES (135, '2025-04-25 17:19:51', 5, 5, '提问5', '回复5', 5);
INSERT INTO `chat` VALUES (136, '2025-04-25 17:19:51', 6, 6, '提问6', '回复6', 6);
INSERT INTO `chat` VALUES (137, '2025-04-25 17:19:51', 7, 7, '提问7', '回复7', 7);
INSERT INTO `chat` VALUES (138, '2025-04-25 17:19:51', 8, 8, '提问8', '回复8', 8);
INSERT INTO `chat` VALUES (139, '2025-02-04 20:11:49', 1737390466763, NULL, '购买的产品什么时候发货', NULL, 1);

-- ----------------------------
-- Table structure for chongwuchanpin
-- ----------------------------
DROP TABLE IF EXISTS `chongwuchanpin`;
CREATE TABLE `chongwuchanpin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `chanpinmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品名称',
  `chanpinfenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品分类',
  `chanpintupian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '产品图片',
  `chanpinpinpai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品品牌',
  `chanpinguige` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品规格',
  `chanpinchangjia` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品厂家',
  `shangjiariqi` date NULL DEFAULT NULL COMMENT '上架日期',
  `chanpinjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '产品介绍',
  `onelimittimes` int(11) NULL DEFAULT NULL COMMENT '单限',
  `alllimittimes` int(11) NOT NULL COMMENT '库存',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) NULL DEFAULT 0 COMMENT '点击次数',
  `discussnum` int(11) NULL DEFAULT 0 COMMENT '评论数',
  `price` double NOT NULL COMMENT '价格',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家账号',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '商家姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物产品' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwuchanpin
-- ----------------------------
INSERT INTO `chongwuchanpin` VALUES (119, '2025-04-26 23:07:33', '皇家犬粮（Royal Canin）', '宠物食品', 'upload/chongwuchanpin1.jpg', 'Royal Canin', '2kg', '皇家宠物食品有限公司', '2025-04-26', '<p>皇家犬粮专为成年犬设计，富含高质量蛋白质和维生素，帮助增强狗狗免疫力，保持健康的皮肤和毛发。适合不同体型的犬种，特别关注犬类的口腔健康和消化系统。</p>', 3, 149, '2025-04-29 00:14:00', 4, 0, 200, 0, 'b1', 'b1');
INSERT INTO `chongwuchanpin` VALUES (120, '2025-04-26 23:08:44', '宠物沐浴露（Vet’s Best）', ' 宠物护理用品', 'upload/chongwuchanpin2.jpg', 'Vet’s Best', '500ml', 'Vet’s Best公司', '2025-04-26', '<p>Vet’s Best宠物沐浴露含有天然植物精华，如芦荟、茶树油和薰衣草，温和清洁宠物毛发，缓解皮肤过敏和瘙痒。无刺激配方，适用于狗狗和猫咪。</p>', 2, 80, '2025-04-29 15:47:44', 1, 0, 98, 0, 'b1', 'b1');
INSERT INTO `chongwuchanpin` VALUES (121, '2025-04-26 23:10:48', '宠物互动玩具（KONG Classic）', '宠物玩具', 'upload/chongwuchanpin3.jpg', 'KONG', 'S/M/L', 'KONG公司', '2025-04-26', '<p>KONG经典宠物玩具，适合狗狗咀嚼，耐用且弹性十足。内置空心设计，可以放入狗狗喜欢的小吃，增加互动性和娱乐性，帮助减缓焦虑、提高智力。</p>', 4, 200, '2025-04-29 15:41:35', 2, 0, 120, 0, 'b1', 'b1');
INSERT INTO `chongwuchanpin` VALUES (122, '2025-04-26 23:12:15', '宠物食盆（PetSafe）', '宠物用品', 'upload/chongwuchanpin4.jpg', 'PetSafe', '500ml', 'PetSafe公司', '2025-04-26', '<p>PetSafe不锈钢宠物食盆，防滑设计，耐用且易于清洁。适用于各种中小型犬猫，食品级材料确保宠物食物安全，底部防滑设计避免翻倒。</p>', 3, 98, '2025-04-29 00:42:42', 5, 0, 65, 0, 'b2', 'b2');
INSERT INTO `chongwuchanpin` VALUES (123, '2025-04-26 23:13:27', '宠物维生素补充剂（Zesty Paws）', '宠物健康护理', 'upload/chongwuchanpin5.jpg', 'Zesty Paws', '120颗', 'Zesty Paws公司', '2025-04-26', '<p>Zesty Paws宠物维生素补充剂，含有Omega-3脂肪酸和抗氧化剂，有助于维持宠物的皮肤健康，增强免疫力。适合狗狗和猫咪，尤其是老年宠物。</p><p><br></p>', 2, 50, '2025-04-29 02:08:01', 1, 0, 199, 1, 'b2', 'b2');
INSERT INTO `chongwuchanpin` VALUES (124, '2025-04-26 23:14:53', '宠物旅行包（PetMate）', '宠物旅行用品', 'upload/chongwuchanpin6.jpg', 'PetMate', '适合小型宠物', 'PetMate公司', '2025-04-26', '<p>PetMate宠物旅行包，采用透气网眼和加固底部设计，适合短途旅行或飞机托运。包内设计有舒适垫层，确保宠物在旅途中的舒适体验。</p>', 1, 60, '2025-04-29 15:41:43', 2, 0, 350, 0, 'b2', 'b2');
INSERT INTO `chongwuchanpin` VALUES (125, '2025-04-26 23:15:50', '宠物沙发床（MerryPet）', '宠物家具', 'upload/chongwuchanpin7.jpg', 'MerryPet', '中型', 'MerryPet公司', '2025-04-26', '<p>MerryPet宠物沙发床，优质布料和记忆泡沫材料，帮助宠物获得更好的休息。设计现代，适合客厅、卧室等不同环境，易于清洁，适合中型犬和猫咪。</p>', 2, 28, '2025-04-29 00:13:46', 9, 0, 599, 1, 'b3', 'b3');
INSERT INTO `chongwuchanpin` VALUES (126, '2025-04-26 23:16:50', '宠物除臭喷雾（Nature’s Miracle）', '宠物环境清洁用品', 'upload/chongwuchanpin8.jpg', 'Nature’s Miracle', '500ml', 'Nature’s Miracle公司', '2025-04-26', '<p>Nature’s Miracle宠物除臭喷雾，采用天然配方，有效去除宠物尿液、粪便或体味，保持家中空气清新。安全无害，适用于狗狗、猫咪及其环境的清洁。</p>', 2, 119, '2025-04-29 20:14:02', 6, 0, 89, 0, 'b3', 'b3');
INSERT INTO `chongwuchanpin` VALUES (127, '2025-04-26 23:17:49', '宠物训练喷雾（PetSafe）', '宠物训练用品', 'upload/chongwuchanpin9.jpg', 'PetSafe', '200ml', 'PetSafe公司', '2025-04-26', '<p>PetSafe宠物训练喷雾，采用无害配方，帮助训练宠物避免不良行为，如乱咬、乱抓。适用于狗狗和猫咪，轻松改变宠物行为。</p>', 1, 78, '2025-04-29 00:43:34', 32, 0, 99, 1, 'b3', 'b3');

-- ----------------------------
-- Table structure for chongwufenxiang
-- ----------------------------
DROP TABLE IF EXISTS `chongwufenxiang`;
CREATE TABLE `chongwufenxiang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `biaoti` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `neirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `fenxiangleixing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '宠物类型',
  `fengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '封面',
  `faburiqi` date NULL DEFAULT NULL COMMENT '发布日期',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '审核回复',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) NULL DEFAULT 0 COMMENT '点击次数',
  `discussnum` int(11) NULL DEFAULT 0 COMMENT '评论数',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物分享' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwufenxiang
-- ----------------------------
INSERT INTO `chongwufenxiang` VALUES (96, '2025-04-27 00:33:18', '金毛Lucky的成长故事', '“Lucky”是我家的金毛犬，刚到家时还是一只小奶狗，眼睛闪闪发亮，非常活泼。刚开始养它时，我们经历了一些挑战，比如它喜欢咬东西，特别是鞋子和家具。但经过耐心的训练，它学会了基本的指令，逐渐变得更加乖巧。每天早上，我都会带Lucky去公园跑步，午餐时间给它准备新鲜的食物。它也特别喜欢和家里其他成员互动，尤其是我的小妹妹，它们俩是最佳搭档。通过与Lucky相处，我不仅学会了如何照顾狗狗，还学会了耐心和责任。希望大家能分享你们养犬的经验，一起探讨如何让狗狗更快乐、更健康！', '犬类', 'upload/chongwufenxiang1.jpg', '2025-04-27', 'a1', 'a1', '是', '同意', 2, 0, '2025-04-29 00:42:55', 19, 2, 1);
INSERT INTO `chongwufenxiang` VALUES (97, '2025-04-27 00:38:57', '我家猫咪‘雪球‘的故事', '  我家有只非常聪明的猫咪，名字叫“雪球”。它从小就非常独立，经常在家里四处探索，也喜欢自己找地方待着。但它的独立并不意味着它不喜欢亲近我们，每当我放下工作，坐到沙发上时，它就会悄悄跑过来，用爪子轻轻抓我，要求摸摸它。它喜欢早晨阳光透进窗户时蜷缩在阳光下，享受温暖的时光。它的饮食很简单，我每天给它准备猫粮，并偶尔给它一些罐头。雪球的陪伴让我感到非常温暖，也让我学会了如何与猫咪建立信任和默契。大家是否也有类似的经验呢？快来分享你们的猫咪故事吧！', '猫类', 'upload/chongwufenxiang2.jpg', '2025-04-27', 'a2', 'a2', '是', '同意', 0, 0, '2025-04-27 00:57:58', 2, 0, 0);
INSERT INTO `chongwufenxiang` VALUES (98, '2025-04-27 00:40:06', '鹦鹉小蓝的故事', '  我家有只非常聪明的鹦鹉，名叫“小蓝”。它有着鲜艳的蓝色羽毛，性格非常活泼。最让我惊讶的是，它非常喜欢与我互动，不仅会模仿我说话，还会学会一些小动作。每当我回到家，它总是会在笼子里兴奋地叫我一声“你好”，让我感到特别温暖。每天，我都会和它一起玩耍，给它喂食各种水果和鸟粮。它尤其喜欢吃葡萄和苹果，还很享受在阳光下飞翔的时光。通过养“小蓝”，我了解到了鹦鹉的社交需求，也学会了如何照顾它们。大家有什么养鸟的小窍门吗？欢迎一起分享！', '鸟类', 'upload/chongwufenxiang3.jpg', '2025-04-27', 'a3', 'a3', '是', '同意', 0, 0, '2025-04-29 17:43:41', 4, 0, 1);
INSERT INTO `chongwufenxiang` VALUES (99, '2025-04-27 00:41:51', '我的小兔子‘萝卜’', ' 我的宠物兔子“萝卜”是一只非常温顺的小家伙。它最喜欢在家里的小窝里待着，也喜欢跳跃在客厅里，尤其喜欢啃食胡萝卜和新鲜的蔬菜。我每天会为它准备清水和新鲜的食物，同时定期更换兔子的垫料，保持它的生活环境干净。尽管它不像狗狗那样需要很多运动，但我仍然每天会带它在院子里溜达，确保它活动足够。通过和雪球的互动，我学习到了如何照顾一只小兔子，让它快乐健康地成长。其他有兔子的小伙伴们，欢迎分享你们的养兔经验！', '小型哺乳动物', 'upload/chongwufenxiang4.jpg', '2025-04-27', 'a4', 'a4', '是', '同意', 0, 0, '2025-04-29 17:36:18', 3, 0, 0);
INSERT INTO `chongwufenxiang` VALUES (100, '2025-04-27 00:43:51', '热带鱼缸里的宁静世界', '  我家的热带鱼缸是我最放松的地方。缸里有各种各样的热带鱼，每一条鱼都有独特的颜色和形态。每天，我都会观察它们的活动，喂它们一些鱼粮。养鱼也让我学到了很多关于水质管理和水族设备的知识。我会定期更换水并检查水质，确保它们的生长环境健康。除了日常的维护，热带鱼的游动也给我带来了无限的宁静和愉悦。希望其他喜欢养鱼的朋友们也能分享你们的水族缸经验，大家一起交流如何让鱼儿们生活得更好！', '鱼类', 'upload/chongwufenxiang5.jpg', '2025-04-27', 'a5', 'a5', '是', '同意', 1, 0, '2025-04-29 15:38:28', 16, 1, 1);

-- ----------------------------
-- Table structure for chongwuleixing
-- ----------------------------
DROP TABLE IF EXISTS `chongwuleixing`;
CREATE TABLE `chongwuleixing`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `chongwuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宠物类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwuleixing
-- ----------------------------
INSERT INTO `chongwuleixing` VALUES (57, '2025-04-25 18:19:41', '犬类（狗）');
INSERT INTO `chongwuleixing` VALUES (59, '2025-04-25 18:19:46', '猫类');
INSERT INTO `chongwuleixing` VALUES (60, '2025-04-25 18:20:16', '鸟类');
INSERT INTO `chongwuleixing` VALUES (61, '2025-04-25 18:21:00', '小型哺乳动物');
INSERT INTO `chongwuleixing` VALUES (62, '2025-04-25 18:21:06', '爬行动物');
INSERT INTO `chongwuleixing` VALUES (63, '2025-04-25 18:21:11', '鱼类');

-- ----------------------------
-- Table structure for chongwulingyang
-- ----------------------------
DROP TABLE IF EXISTS `chongwulingyang`;
CREATE TABLE `chongwulingyang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `chongwumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宠物名称',
  `chongwuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宠物类型',
  `fengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '封面',
  `pinzhong` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品种',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `nianling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `shifoulingyang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否领养',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家账号',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家姓名',
  `lingyangshenqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '领养申请',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '审核回复',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 80 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物饮食推荐' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwulingyang
-- ----------------------------
INSERT INTO `chongwulingyang` VALUES (78, '2025-04-29 23:24:33', '彩虹', '鸟类', 'upload/chongwu9.jpg', '玄凤鹦鹉', '母', '1岁', '否', 'b3', 'b3', '想要领养', '待审核', '', 'a1', 'a1');
INSERT INTO `chongwulingyang` VALUES (79, '2025-04-29 23:28:43', '旺财', '犬类（狗）', 'upload/chongwu7.jpg', '柯基犬', '公', '3岁', '否', 'b3', 'b3', '想要领养可以吗', '待审核', '', 'a2', 'a2');
INSERT INTO `chongwulingyang` VALUES (80, '2025-04-29 23:32:21', '豆豆', '犬类（狗）', 'upload/chongwu1.jpg', '金毛寻回犬', '公', '2岁', '是', 'b1', 'b1', '可以领养吗', '是', '可以领养', 'a1', 'a1');

-- ----------------------------
-- Table structure for chongwuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `chongwuxinxi`;
CREATE TABLE `chongwuxinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `chongwumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宠物名称',
  `chongwuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宠物类型',
  `fengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '封面',
  `pinzhong` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品种',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `shifoudazhen` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否打针',
  `shifoujieyu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否节育',
  `shifoulingyang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否领养',
  `shenghuoxiguan` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '生活习惯',
  `yinshixiguan` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '饮食习惯',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家账号',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家姓名',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) NULL DEFAULT 0 COMMENT '点击次数',
  `discussnum` int(11) NULL DEFAULT 0 COMMENT '评论数',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 78 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物饮食推荐' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwuxinxi
-- ----------------------------
INSERT INTO `chongwuxinxi` VALUES (69, '2025-04-29 20:28:27', '豆豆', '犬类（狗）', 'upload/chongwu1.jpg', '金毛寻回犬', '公', '2岁', '是', '是', '是', '喜欢户外活动，每天需要散步2次，喜欢玩飞盘', '每天2顿狗粮，偶尔吃鸡肉零食', 'b1', 'b1', 124, 12, NULL, 19, 0, 1);
INSERT INTO `chongwuxinxi` VALUES (70, '2025-04-29 20:28:29', '咪咪', '猫类', 'upload/chongwu2.jpg', '英国短毛猫', '母', '1岁', '是', '是', '否', '喜欢安静环境，爱睡觉，不喜欢陌生人', '每天定时喂猫粮，偶尔吃猫罐头', 'b1', 'b1', 213, 12, NULL, 32, 0, 1);
INSERT INTO `chongwuxinxi` VALUES (71, '2025-04-29 20:28:31', '小蓝', '鸟类', 'upload/chongwu3.jpg', '虎皮鹦鹉', '公', '6个月', '否', '否', '否', '喜欢鸣叫，需要定期放出笼子活动', '专用鸟粮，新鲜水果蔬菜', 'b1', 'b1', 231, 12, NULL, 23, 0, 0);
INSERT INTO `chongwuxinxi` VALUES (72, '2025-04-29 20:28:33', '球球', '小型哺乳动物', 'upload/chongwu4.jpg', '荷兰侏儒兔', '母', '8个月', '否', '是', '否', '胆小怕惊，需要安静环境', '干草为主，新鲜蔬菜为辅', 'b2', 'b2', 12, 12, NULL, 344, 0, 1);
INSERT INTO `chongwuxinxi` VALUES (73, '2025-04-29 20:28:35', '小龙', '爬行动物', 'upload/chongwu5.jpg', '玉米蛇', '公', '1岁', '否', '否', '否', '夜间活动，需要加热垫保持温度', '每周喂食1次小白鼠', 'b2', 'b2', 2343, 12, NULL, 13, 0, 0);
INSERT INTO `chongwuxinxi` VALUES (74, '2025-04-29 20:28:37', '泡泡', '鱼类', 'upload/chongwu6.jpg', '孔雀鱼', '母', '3个月', '否', '否', '否', '群居鱼类，需要保持水质清洁', '每天喂食少量鱼粮', 'b2', 'b2', 453, 12, NULL, 234, 0, 0);
INSERT INTO `chongwuxinxi` VALUES (75, '2025-04-29 20:28:39', '旺财', '犬类（狗）', 'upload/chongwu7.jpg', '柯基犬', '公', '3岁', '是', '是', '否', '精力旺盛，需要大量运动', '专用犬粮，每天3次', 'b3', 'b3', 6347, 12, NULL, 9, 0, 1);
INSERT INTO `chongwuxinxi` VALUES (76, '2025-04-29 20:28:44', '雪球', '猫类', 'upload/chongwu8.jpg', '布偶猫', '母', '2岁', '是', '是', '否', '温顺亲人，喜欢被抚摸', '高端猫粮，每天2次', 'b3', 'b3', 6346, 12, NULL, 252, 0, 1);
INSERT INTO `chongwuxinxi` VALUES (77, '2025-04-29 20:28:45', '彩虹', '鸟类', 'upload/chongwu9.jpg', '玄凤鹦鹉', '母', '1岁', '否', '否', '否', '喜欢与人互动，能学说话', '混合鸟粮，新鲜水果', 'b3', 'b3', 124, 12, NULL, 288, 1, 1);

-- ----------------------------
-- Table structure for chongwuyanghuzhishi
-- ----------------------------
DROP TABLE IF EXISTS `chongwuyanghuzhishi`;
CREATE TABLE `chongwuyanghuzhishi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `biaoti` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `yanghufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '养护分类',
  `tupian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片',
  `yufangjibing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '预防疾病',
  `hulipinlv` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '护理频率',
  `shiyong` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '适用',
  `fabushijian` date NULL DEFAULT NULL COMMENT '发布时间',
  `zhuyishixiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '注意事项',
  `zhishixiangqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '知识详情',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) NULL DEFAULT 0 COMMENT '点击次数',
  `discussnum` int(11) NULL DEFAULT 0 COMMENT '评论数',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物养护知识' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongwuyanghuzhishi
-- ----------------------------
INSERT INTO `chongwuyanghuzhishi` VALUES (79, '2025-04-26 18:34:00', '如何定期检查宠物健康', '宠物健康管理', 'upload/yanghuzhishi1.jpg', '定期体检可以帮助预防常见的疾病，如心脏病、糖尿病等。', '每年至少一次体检，老年宠物每半年一次。', '所有宠物', '2025-04-26', '不及时发现健康问题可能会导致宠物病情加重，延误治疗', '<p>定期的健康检查能帮助早期发现潜在疾病。体检时，兽医会检查宠物的体温、脉搏、呼吸、牙齿、皮肤等各个方面，必要时进行血液或尿液化验。</p>', 1, 0, NULL, 7, 0, 1);
INSERT INTO `chongwuyanghuzhishi` VALUES (80, '2025-04-26 18:37:52', '如何选择合适的宠物食物', '宠物饮食护理', 'upload/yanghuzhishi2.jpg', '合理饮食能预防肥胖、营养不良、消化不良等问题。\n', '每日喂食两次，根据宠物的年龄和体重调整分量。\n', '狗、猫等常见宠物', '2025-04-26', '避免给宠物喂食人类食物，特别是巧克力、洋葱等对宠物有害的食物。\n', '<p>根据宠物的年龄、体重和活跃度选择合适的宠物粮。确保饮食中含有足够的蛋白质、脂肪、维生素和矿物质，同时避免过度喂食造成肥胖。</p>', 0, 0, NULL, 1, 0, 0);
INSERT INTO `chongwuyanghuzhishi` VALUES (81, '2025-04-26 18:39:34', '如何教会狗狗不乱叫', '宠物行为与训练', 'upload/yanghuzhishi3.jpg', '不直接涉及预防疾病，但良好的行为训练能减少因不当行为带来的压力和焦虑。\n', '每天进行5-10分钟的训练。\n', '所有犬类', '2025-04-26', '训练过程中不要使用暴力或过度惩罚，以免造成宠物情绪问题。\n', '<p>训练狗狗停止乱叫可以通过正向强化，如每当狗狗安静时给予奖励。避免惩罚性训练方法，建立与宠物之间的信任。</p>', 1, 0, NULL, 2, 1, 1);
INSERT INTO `chongwuyanghuzhishi` VALUES (82, '2025-04-26 18:40:54', '如何正确给猫狗洗澡与护理皮肤', '宠物外部护理', 'upload/yanghuzhishi4.jpg', '定期洗澡有助于预防皮肤病和寄生虫。', '根据宠物的活动量和毛发类型，通常每月洗澡一次。\n', '长毛猫、长毛犬、短毛猫、短毛犬', '2025-04-26', '避免过度洗澡导致宠物皮肤干燥，选用专门的宠物洗浴产品。\n', '<p>正确的洗澡方法应使用温水和宠物专用洗澡液，避免水进入宠物耳朵。洗完后用毛巾擦干并吹风，以防湿气引发皮肤病。</p>', 0, 0, NULL, 2, 0, 0);
INSERT INTO `chongwuyanghuzhishi` VALUES (83, '2025-04-26 18:42:17', '如何缓解宠物的焦虑情绪', '宠物情感护理', 'upload/yanghuzhishi5.jpg', '情感护理有助于预防由压力引起的健康问题，如胃肠不适和免疫力下降。\n', '根据宠物的情绪波动进行日常安抚。', '所有宠物', '2025-04-26', '忽视宠物的情绪问题可能导致行为问题和健康问题，尤其是对独处焦虑的宠物。\n', '<p>宠物的情感需求同样重要。与宠物建立紧密的互动关系，增加陪伴时间，可以有效缓解焦虑。同时，可以通过使用安抚喷雾或专门的情绪舒缓产品来辅助治疗。</p><p><br></p>', 0, 0, NULL, 1, 0, 0);
INSERT INTO `chongwuyanghuzhishi` VALUES (84, '2025-04-26 18:43:26', '如何设计宠物的日常运动计划', '宠物运动与娱乐', 'upload/yanghuzhishi6.jpg', '运动可以预防肥胖、关节病等慢性疾病。', '每天进行至少30分钟的运动，活跃犬种可适当增加运动量。\n', '活跃犬种', '2025-04-26', '避免过度运动，特别是在极端天气条件下，防止宠物中暑或过劳。\n', '<p>根据宠物的体力和需求设计运动量，确保宠物有足够的运动空间和适当的娱乐设施。适当的运动不仅能维持健康，还能减少破坏性行为。</p>', 0, 0, NULL, 1, 0, 0);
INSERT INTO `chongwuyanghuzhishi` VALUES (85, '2025-04-26 18:44:16', '打造安全舒适的宠物生活空间', '宠物环境护理', 'upload/yanghuzhishi7.jpg', '环境的整洁可以预防寄生虫和细菌的滋生。\n', '保持宠物栖息环境的清洁，每周清理一次。\n', '所有宠物', '2025-04-26', '宠物生活环境应保持干燥、通风，避免潮湿或过于封闭的空间。\n', '<p>创建一个安静、舒适的环境能让宠物感到安全。在宠物的生活空间内，定期清理床垫、食物碗、厕所等，避免细菌或异味的积聚。</p><p><br></p>', 1, 0, NULL, 3, 0, 0);
INSERT INTO `chongwuyanghuzhishi` VALUES (86, '2025-04-26 18:46:33', '宠物掉毛怎么办', '宠物常见问题', 'upload/yanghuzhishi8.jpg', '定期梳毛有助于预防皮肤问题和毛发缠结。\n', '每周梳理一次，掉毛期可增加频率。\n', '掉毛较多的宠物', '2025-04-26', '如果宠物掉毛异常，需关注是否为健康问题，及时就医。\n', '<p>掉毛是很多宠物的自然现象，但也可能是由于营养不良、季节性变化或皮肤病引起。定期梳理毛发，保持皮肤清洁，可以帮助减少掉毛量。</p>', 1, 0, NULL, 14, 0, 1);

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'upload/picture1.jpg', NULL);
INSERT INTO `config` VALUES (2, 'picture2', 'upload/picture2.jpg', NULL);
INSERT INTO `config` VALUES (3, 'picture3', 'upload/picture3.jpg', NULL);

-- ----------------------------
-- Table structure for discusschongwuchanpin
-- ----------------------------
DROP TABLE IF EXISTS `discusschongwuchanpin`;
CREATE TABLE `discusschongwuchanpin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物产品评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusschongwuchanpin
-- ----------------------------

-- ----------------------------
-- Table structure for discusschongwufenxiang
-- ----------------------------
DROP TABLE IF EXISTS `discusschongwufenxiang`;
CREATE TABLE `discusschongwufenxiang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物分享评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusschongwufenxiang
-- ----------------------------
INSERT INTO `discusschongwufenxiang` VALUES (1, '2025-04-27 00:58:12', 96, 1737390507206, 'upload/1737390503032.jpg', 'a4', '<p>你家金毛好可爱阿</p>', NULL);
INSERT INTO `discusschongwufenxiang` VALUES (2, '2025-04-27 00:58:55', 96, 1737390466763, 'upload/1737390458855.jpg', 'a1', '<p>谢谢大家</p>', NULL);
INSERT INTO `discusschongwufenxiang` VALUES (3, '2025-04-29 17:43:37', 100, 1737390466763, 'upload/yonghu_touxiang1.jpg', 'a1', '<p>111</p>', NULL);

-- ----------------------------
-- Table structure for discusschongwuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `discusschongwuxinxi`;
CREATE TABLE `discusschongwuxinxi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物饮食推荐评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusschongwuxinxi
-- ----------------------------
INSERT INTO `discusschongwuxinxi` VALUES (1, '2025-04-29 17:17:31', 77, 1737390466763, 'upload/yonghu_touxiang1.jpg', 'a1', '<p>111</p>', NULL);

-- ----------------------------
-- Table structure for discusschongwuyanghuzhishi
-- ----------------------------
DROP TABLE IF EXISTS `discusschongwuyanghuzhishi`;
CREATE TABLE `discusschongwuyanghuzhishi`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '宠物养护知识评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusschongwuyanghuzhishi
-- ----------------------------
INSERT INTO `discusschongwuyanghuzhishi` VALUES (1, '2025-04-29 17:34:53', 81, 1737390466763, 'upload/yonghu_touxiang1.jpg', 'a1', '<p>123123</p>', NULL);

-- ----------------------------
-- Table structure for discusssijiyangchong
-- ----------------------------
DROP TABLE IF EXISTS `discusssijiyangchong`;
CREATE TABLE `discusssijiyangchong`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '四季养宠评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusssijiyangchong
-- ----------------------------

-- ----------------------------
-- Table structure for forum
-- ----------------------------
DROP TABLE IF EXISTS `forum`;
CREATE TABLE `forum`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帖子标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) NULL DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `isdone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `istop` int(11) NULL DEFAULT 0 COMMENT '是否置顶',
  `toptime` datetime(0) NULL DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 149 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '论坛表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum
-- ----------------------------
INSERT INTO `forum` VALUES (149, '2025-04-27 01:02:02', '好喜欢金毛呀', '<p>真的真的好喜欢</p><p><br></p>', 0, 1737390466763, 'a1', NULL, '开放', 0, '2025-04-27 01:02:02');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `introduction` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '简介',
  `typename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发布人',
  `headportrait` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `clicknum` int(11) NULL DEFAULT 0 COMMENT '点击次数',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 198 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公告信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (191, '2025-04-25 17:19:51', '趁着年轻，输得起，看得开，去经历', '我在大学一年级那一年，毫无悬念地把自己吃成了一个胖子。不是那种巨大的胖子，而是介于正规的肥胖和臃肿之间的尴尬体型，比标准体型重了15斤。于是，我的整个大学生活变成了电影《蝴蝶效应》系列，那只蝴蝶重达15斤', '分类名称1', '发布人1', 'upload/news_headportrait1.jpg', 5, '2025-04-29 15:38:47', 2, 1, 2, 'upload/news_picture1.jpg', '<p>我在大学一年级那一年，毫无悬念地把自己吃成了一个胖子。不是那种巨大的胖子，而是介于正规的肥胖和臃肿之间的尴尬体型，比标准体型重了15斤。于是，我的整个大学生活变成了电影《蝴蝶效应》系列，那只蝴蝶重达15斤。</p><p>  首先，我皈依了减肥。我可以整整一天滴水不进，然后第二天中午，一个小时之内连续去三个食堂吃午饭，每次都是两荤一素、一两米饭加一瓶大可乐，像是一个人孢子分裂出了三个暴食症患者。其次，因为要么饿得百爪挠心，要么撑得寝食难安，我变成了一个昼夜颠倒的人，再加上觉得自己邋遢难看，不愿见人，便逃掉了很多课。其三，逃课的空虚让我花了大量时间网购，击败了全国90%以上的电商消费者，和快递员结下了深厚的友谊。我买的大多数是衣服，衣服又穿不进，羞愤难当，继续皈依减肥。总之，那是我非常不快乐的几年。因为难以接受自己，所以蜷缩着，拒绝他人。</p><p>    我很久之后才知道，人用来自憎的大脑边缘系统，在童年时就已经形成。可是，用来开导自己、原谅自己、使自己变得强大的智慧，却往往在我们本该成熟的年纪依然不具备。每一世代的年轻人都是脆弱的、敏感的、容易受他人影响的。而对于正年轻的一代来说，这个挑战异乎寻常的艰难。</p><p> 电影《楚门的世界》中提出了一个假设以及相应的解答:当一个人活在所有人的窥探之下，他应该怎么办?答案是:他逃走，获得自由。然而，如果所有人活在所有人的窥探之下，那又该如何逃避?这不是假设，而是正在悄然发生的现实。我们无时无刻不在朋友圈、微博、贴吧、个人主页上展现自己的生活，同时，也在同样的平台上窥探他人的生活。我们无时无刻不在评估他人，同时，也在接受他人的评估。“个性张扬”只是狐假虎威的外衣，为的是掩饰自卑与自恋此起彼伏、相爱相杀的脆弱。我们羡慕嫉妒他人，也努力把自己的生活修饰得让他人羡慕嫉妒。我们对他人的意见过于敏感，无法忍受不被“点赞”的人生。</p><p>  社交网络的核心在于“社交”，社交的动力，是出于人们无法忍受孤独;人们之所以无法忍受孤独，是因为人们无法拷问自己。可是，总有一天，我们要站在镜子前，发现我们并不是自己创造出来的那个有趣、可爱、有吸引力、有能力的人。那么，你还喜欢镜子里的自己吗?或者，镜子里的你还喜欢自己吗?这个世界是否称赞你、羡慕你、爱你，在某种程度上是个不断膨胀的谎言。关键的问题在于，你是否对自己足够诚实，并且接受诚实之后的不完美。</p><p>   失去的痛苦、被拒绝的痛苦、被伤害的痛苦、分别的痛苦，它们如此显眼地横在前行的路上，让人想逃遁到那个充满着“赞”的虚幻世界里。然而，我们是人，走在一条从摇篮到坟墓的路上，年轻在途中，衰老在途中。必须和真实的世界发生联系，而不是兀自为尚未发生的事情恐惧;必须和真实的人发生各种关系，而不是如一座座只能遥远眺望的孤岛。</p><p>那些杀不死我们的，它们有时并不会让我们更加强大，而只是成为一段诗意或自嘲的记忆。趁着年轻，输得起，看得开，去经历。那些杀不死我们的，它们在混沌而无序的未来里，并不能成为我们手中的武器，却为我们的存活，增加了反抗脆弱与敏感的韧性。</p>');
INSERT INTO `news` VALUES (192, '2025-04-25 17:19:51', '大学就该抓住青春，用汗水实现梦想', '大学之青春，人生之春，人生之王，人生之华也，宝贵的时光我们理当去珍惜。然而，当我们在青春布满藤墓的围墙上缓慢的攀行时;依旧游离在青春摇摆不定的尾巴上时;奋力想抓却抓不住，用力一扯，却又是散落一地的音符时;我们是否该回头思考了。零零碎碎的记忆，偶尔会闪过寂寞的长空，飘然在无际的苍穹，仅仅留下几颗闪烁的残星让我们自己深思，青春易逝，好比东逝的水—去不复还', '分类名称2', '发布人2', 'upload/news_headportrait2.jpg', 5, '2025-04-29 02:12:51', 3, 2, 3, 'upload/news_picture2.jpg', '<p>  大学之青春，人生之春，人生之王，人生之华也，宝贵的时光我们理当去珍惜。然而，当我们在青春布满藤墓的围墙上缓慢的攀行时;依旧游离在青春摇摆不定的尾巴上时;奋力想抓却抓不住，用力一扯，却又是散落一地的音符时;我们是否该回头思考了。零零碎碎的记忆，偶尔会闪过寂寞的长空，飘然在无际的苍穹，仅仅留下几颗闪烁的残星让我们自己深思，青春易逝，好比东逝的水—去不复还。</p><p>  青春是属于我们的，是人生最最美好的时光。我们应该好好把握住现在象牙塔的点点滴滴。大学对于我们来说很重要，这里充满了好奇、机遇和挑战。当我懵懵懂懂的走过了两年才突然发现原来大学是这样的，每个人有不同的选择，有不同的理想，也有不同的人生。但是无论怎样都是一个博学的过程，学做人，学知识，学生活..…...春是疯狂的，是充满激情的，是奋斗的，最重要的是我们要坚定我们的梦想，为了梦想付出一切，为了梦想坚持到底，这才是真正的青春。青春的梦想就是黑夜里的灯塔在我们迷茫时给予我们方向，就是力量的源泉在我们身陷逆境时给予我们最大的动力，就是爱的港湾在我们屡次失败时给予我们受伤的心灵以安慰。因此无论何时何地，都不能忘却心里坚守的那份沉甸甸的梦想。</p><p>   青春的梦想很简单，可能是梦想成为学习的佼佼者让GPA无限趋于4.0，可能是梦想成为学生工作的杰出者当上主席为自己的从政事业奠定基础，也可能是梦想成为营养成分场上的超级明星拥有大量的球迷粉丝，也可能是梦想成为职场达人，面试无压力，就业有保障...….或许你觉得这些都算不上梦想，其实梦想并不分大小和轻重，不能说只有中国梦才算是梦想，梦想就是这样每个人有不同的定位，但都是值得去追逐的，去为之奋斗的。()拥有了梦想，就有了坚定的信念，海风再大海浪再大，也无法扼杀我们追逐胜利的信念。信念给我们坚持的勇气，勇气赐我们昂扬的斗志，斗志带我们摆脱厄运;拥有了梦想，就能化压力为动力，梦想会时刻在鞭策我们，鼓励我们，让我们审视自己，发现不足，奋力补救，让自己保持不懈的前进动力;拥有了梦想，我们就不会在迷茫的路上更加迷茫，我们就能在青春之歌复杂的五线谱中听到动人的旋律。</p><p>   我们是大学生，是祖国的未来，是民族复兴的脊梁，面对如此重任，怎么能不胸怀大志，坚定梦想，在青春的道路上奋斗。“恰同学少年，风华正茂，书生意气，挥斥方道。”青春是黄金时段，我们要以梦想为方向，扬帆起航，努力拼搏，给我们即将失去的青春以最好的结局。人因梦想而伟大，让我们一起奏响青春的梦想之歌，为各自的梦想努力进发吧!</p>');
INSERT INTO `news` VALUES (193, '2025-04-25 17:19:51', '留退路就没有出路', '公元前一世纪，凯撒大帝率领他的军队抵达了英格兰，他决心要赢得这场战争，不管遇到什么情况都不会退却。为了让士兵们明白自己必胜的决心和信心，也为了断绝士兵们逃跑退缩的念头，凯撒命令士兵将运载他们的所有船只都烧毁。这使得军队的士气受到了莫大的鼓舞。后来他们获胜了', '分类名称3', '发布人3', 'upload/news_headportrait3.jpg', 5, '2025-02-04 20:11:32', 3, 3, 3, 'upload/news_picture3.jpg', '<p>  公元前一世纪，凯撒大帝率领他的军队抵达了英格兰，他决心要赢得这场战争，不管遇到什么情况都不会退却。为了让士兵们明白自己必胜的决心和信心，也为了断绝士兵们逃跑退缩的念头，凯撒命令士兵将运载他们的所有船只都烧毁。这使得军队的士气受到了莫大的鼓舞。后来他们获胜了。</p><p>  很多人在处理重要问题的时候，总是喜欢把这些问题暂且搁置在一边，等以后再做。他们没有决定的勇气和魄力，总是在着手做事的时候想给自己留一条后路，以免没有出路。对于他们来说，退路就是出路。但是，事实证明，这样是不会有任何成就的。</p><p>背水一战、破釜沉舟的军队往往能获得胜利。同样，一个做事不留退路、一心向前的人，不管遇到什么困难和障碍，他都不会后退，因为他没有路可以退。而那些人在为自己准备退路的同时就是在后退，他们立志不坚，把精力和时间投入到退缩的准备上，这种人绝不会获得成功。</p><p>  一个人能否成功，关键在于他意志力的强弱。意志坚强的人不管遇到什么困难和障碍，都会百折不挠，想方设法地克服;意志薄弱的人一遇到麻烦，甚至在挫折还没有到来之前，他们就开始庸人自扰，彷徨失措，把精力都放在如何规避问题上，放在为自己铺设后路上。当困难一个接一个来时，他们就一步接一步后退，最后他们终将无路可退。</p><p>现实生活中，到处都充斥着这样的青年，他们富有上进心，希望有一番成就和作为，但是他们意志薄弱，没有必胜的决心，不敢破釜沉舟;他们始终左摇右摆，没有坚定的信念，一遇到挫折和困难，马上就缩回了进取的手和脚。这样的人，这样的心态，最后遭受失败也不足为奇。</p><p>   不给自己留后路，让自己没有回旋的余地，方能竭尽全力，锐意进取，就算遇到千万困难，也不会退缩，因为回头也没有路了，不如不顾一切地前进，还能找到一线希望。有了这样一种“拼命”和“豁出去”了的信念，才能彻彻底底地消除心中的恐惧、犹豫、胆怯。当一个人不给自己任何退路的时候，他就什么都不怕了，勇气、信心、热忱等从心底油然而生，到最后自然能“置之死地而后生”。</p><p>    面对严峻的问题和重要环节，周全而细致地考虑问题的各个方面也是应该的，但是过多地权衡，前怕狼后怕虎，一会儿这样一会儿那样，最终却还是原样，可以肯定地说，你不会有任何进展，甚至还会变得—塌糊涂。</p><p>出路和退路不是同义词，而是反义词，留退路就没有出路，因此，你应该只找出路，不留退路。大学生励志青春文章:培养积极的思维模式。</p>');
INSERT INTO `news` VALUES (194, '2025-04-25 17:19:51', '在大学给自己定个目标', '最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到', '分类名称4', '发布人4', 'upload/news_headportrait4.jpg', 4, '2025-04-25 17:19:51', 4, 4, 4, 'upload/news_picture4.jpg', '<p>  最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到。</p><p>   这让我想到前段时间蹿红网络的“悔过励志帖”——《同学，我大四了》，作者回首自己的大学4年，他感叹投入精力“充其量不过40%”︰每天上网时间少则4个小时，多则10个小时;考试永远是画画重点，在高呼“60分万岁”中与奖学金无缘。作者借自己求职受挫，写帖子以警醒后来人，不要等毕业时再后悔，就业难不仅仅是大学、社会的问题，也是自身的问题。</p><p>  也许，这样的大学生不是一个两个，而是一个群体。然而，我总是怀疑这样的励志帖，甚至教师在课堂上苦口婆心地劝说，能对现实中的大学和大学生起到多大的影响和作用，很多时候恐怕只有“三分钟热度”的效应。毕竟，现实的窘境不是一天积累起来的，从小学到高中，学生们的学习都是被动地接受应试，隐藏着功利性的目的，也许从没有为主动学习感到过快乐，而在高中时代，有的教师甚至打出这样的励志宣言:等你考上大学，你就可以想干什么干什么了..…..乎，高中时代的目标是很清晰的，就是为了考上大学，而在一些高中生的眼里，大学甚至就好比是天堂，进了大学的门就可以放轻松了。</p><p> 此前，有很多声音都认为大学越来越像培训机构，功利性学习正在整个大学蔓延，考证热、过早地职业化都是大学功利性学习最好的表现形式。在这种批判的声音中，“培训机构”总有被贬低的意味，难与大学之学术思想殿堂的高雅相媲美。但是，在这种批判的背后，还有一个现实问题被遮蔽，那就是很多大学生对自己的学习、对大学生活没有任何目标。</p><p>暨南大学舆情研究中心曾就“当代广州大学生生活与思想现状”作过详细的问卷调查，其中，接受调查的广州高校在读本科生共有191份有效样本，就“读大学的原因”、“大学第一印象”、“专业选择首要因素”等问题制作问卷调查并进行分析。结果显示，在未来规划方面，73.3%的同学表示只有粗略的想法，并无非常明确的目标。</p><p>  如果说功利化的学习毕竟还有一个前进的目标，至少能体现出一种为了目标而奋斗的精神和奔头，而没有任何目标，漫无目的地混日子则更可怕，它体现的是一种虚无、意义的缺失。说实话，没有引导学生树立明确的奋斗目标、进而指引学生为之努力的大学，学生很难找到努力的方向，也找不到努力的意义，这还不如“培训机构”来得实在、来得有效用，至少，培训机构的目标很清晰，它能够给学生们一个实实在在看得见的效果，而没有任何目标、浑浑噩噩的大学生活，也许只会给很多学生带来悔过。</p><p>无论如何，混日子的大学生活是不可取的。一方面，高校应该在新生入学的时候，作好目标和方向的引导，甚至贯穿大学4年的学习过程;另一方面，还在迷途的大学生，应尽早为自己找个前进的方向，作好自我规划，对自己的未来和前途负责。</p>');
INSERT INTO `news` VALUES (195, '2025-04-25 17:19:51', '做个真正的学生', '最坚强的人，是以宽容的态度面对自己缺点的人，而懦弱的人，则不敢面对自己的缺点，最终自暴自弃，葬送自己。只要有进取心，我们都能从失败的领域中，发现到达成功的途径;只要有自信心，我们身上的每一个缺陷，也都可以成为与众不同的优点', '分类名称5', '发布人5', 'upload/news_headportrait5.jpg', 5, '2025-04-25 17:19:51', 5, 5, 5, 'upload/news_picture5.jpg', '<p>  最坚强的人，是以宽容的态度面对自己缺点的人，而懦弱的人，则不敢面对自己的缺点，最终自暴自弃，葬送自己。只要有进取心，我们都能从失败的领域中，发现到达成功的途径;只要有自信心，我们身上的每一个缺陷，也都可以成为与众不同的优点。</p><p>曾经有人特地赶赴日本，向三宅一生服装设计大师请教如何设计出独具一格的服装款式。三宅一生大师提出两个很有意思的观点:一是，设计的衣服，其实都是没有全部完成的，其余的创作空间，则是留给穿衣服的人去完成的;二是，选择布料时，会请厂商提供纺织、印染失败的布料，从这些“残次”的作品中寻找泉涌般的创作灵感，设计出最具独创性的作品。</p><p>这样一来，顾客才能穿出自己的风格，并使得同一件衣服，在不同的人身上，能有不同的效果。而且，以这样的概念设计出来的衣服，也不容易失败。正是因为这两个观点，三宅一生所设计的服装总是独一无二地能够引领世界潮流。</p><p>  在艺术家的眼中，任何事物都是创作的最好材料，不管是枯木还是残破的布料，对他们而言，都是最具生命力的事物，在他们手中都能画腐朽为神奇。</p><p>朽木也能精雕，更何况我们自己。那些看起来弯曲、盘旋、似乎毫无用处的木料，往往最终能成为艺术品的原材料，因为这种不同，才特别珍贵。花点心思，身上的缺点也能变成独特的优点，就像艺术家们一般，顺着曲折的木头，创造出与众不同、完美无缺的惊世杰作。</p><p>励志文章3:一生学习，成就一生无知的人并不是没有学问的人，而是不明了自己的人。当一个有学问的人信赖书本、知识和权威，借着它们而了解自己，那么他便是愚蠢的。了解是由自我认识而来，而自我认识乃是一个人明白他自己的整个心理过程。因此，教育的真正意义是自我了解，因为整个生活是汇聚于我们每个人的身心的最高“机密”。</p><p>   目前我们所谓的教育，只是由书本聚集见闻、知识，这是任何懂得阅读的人都办得到的。这种教育提供了一条巧妙的逃避自我之途，如同其他所有的逃避方式一样，它无可避免地制造出有增无减的苦难。冲突和混乱是由于我们和他人、事物、概念之间差错的关系而产生，除非我们了解此项关系而改变它，否则，知识的学习和堆砌，各种技能的获取，都只会将我们导向更深的混乱和毁灭。</p><p> 我们将子女送入学校，学习一些技能，并希望借此来带动整个家庭的长久繁荣，至少在家长们年老的时候有养老保险，有稳定的照顾。我们对孩子最急切的渴望，就是将他塑造成一个能在一个领域中出类拔萃之人，希望给予他一个安全的经济地位。物质的获得有时候并不难，然而，技术的训练能使我们了解自己吗?</p><p>虽然，懂得念书写字、学习土木工程或其他某种职业，是必需的，然而技术能给予我们了解生活的能力吗?技术，无疑是次要的;如果技术是我们惟一奋力以求的东西，那么我们就摒弃了生活中最主要的东西了。</p><p>    生活，是痛苦、喜悦、美、丑、爱等多种感受的综合，一旦我们将它整体地加以了解，那么这项了解在各方面都会创出它应有的技术。不过，相反的说法就不是真的了∶技术永远无法产生创造性的了解。</p><p>如果过分强调技术，我们便毁灭了人。磨练技能和效率，然而对生活却不了解，对思想、欲望的行踪不能领悟，只会使我们变得日益残暴无情，以致于触发战争，危害了我们肉体上的安全。由于我们的教育过重于单单培养技术，已经制造出许多科学家、数学家、造桥工程师、征服太空的人，但这些人了解生活的整体过程吗?一个专家能把生活本身完整地体验感受表达出来吗?或者他真的体验到生活了吗?有时候，当他不是专家时，反而更能直指生活的本质。一颗能够给予人辉煌一生的企图心，首先应当是一颗敏感的善良的热情的心，让我们对周围的一切保持孩童一样旺盛的好奇心。我们应当渴望了解新奇的事物，渴望探索未知的领域。只有在这种理念的支配下，我们才能不断地、孜孜以求地、乐此不疲地提升自己的认知和理解能力，改善自我，从而更接近成功的巅峰。</p>');
INSERT INTO `news` VALUES (196, '2025-04-25 17:19:51', '远大的目标是成功的磁石', '上天对每个老实人都是公平的，每个人每一天都是二十四个小时，每个人的所有时间都是一生;同时上天对每个老实人又是不公平的，给每一个人的时间不都是二十四个小时，给每一个人的所有时间不都是一生。这之间的区别就在于有无远大目标', '分类名称6', '发布人6', 'upload/news_headportrait6.jpg', 6, '2025-04-25 17:19:51', 6, 6, 6, 'upload/news_picture6.jpg', '<p>  上天对每个老实人都是公平的，每个人每一天都是二十四个小时，每个人的所有时间都是一生;同时上天对每个老实人又是不公平的，给每一个人的时间不都是二十四个小时，给每一个人的所有时间不都是一生。这之间的区别就在于有无远大目标。</p><p>    有大目标的人，生活永远是积极的，他们会朝着自己的目标不断前进;没有大目标的老实人浑浑噩噩，不思进取，最后被生活淘汰。</p><p> 从前有个叫阿巴格的人生活在内蒙古草原上。有一次，年少的阿巴格和爸爸在草原上迷了路，阿巴格又累又怕，到最后快走不动了。爸爸就从兜里掏出五枚硬币，把一枚硬币埋在草地里，把其余四枚放在阿巴格的手上，说:“人生有五枚金币，童年、少年、青年、中年、老年各有一枚，你现在才用了一枚，就是埋在草地里的那一枚，你不能把五枚都扔在草原里，你要一点点地用，每一次都用出不同来，这样才不枉人生一世。今天我们一定要走出草原，你将来也一定要走出草原。世界很大，人活着，就要多走些地方，多看看，不要让你的金币没有用就扔掉。”在父亲的鼓励下，阿巴格走出了草原。长大后，阿巴格离开了家乡，成了一名十分优秀的船长。</p><p>  目标是与一个人的愿望相联系的，是对未来的一种设想，它往往和目前的行动不直接联系。但目标又不能脱离现实的生活，现实生活中的某些现象如果符合了个人的需要，与个人的世界观一致，这些现实的因素就会以个人目标的形式表现出来。目标总是对现实生活的重新加工，舍弃其中某些成分，又对某些因素给予强调的过程，但它必须以对客观规律的认识为基础，符合客观规律。</p><p> 能实现自己目标的老实人，对他个人而言，他是一个成功者，也是个幸福者。目标是成功的必要条件，虽然仅仅拥有目标，你不一定能取得成功;但是如果没有目标，成功对你而言就无从谈起。</p><p>远大的美好目标能吸引人努力为实现它而奋斗不止。</p>');
INSERT INTO `news` VALUES (197, '2025-04-25 17:19:51', '做一个最好的自己', '自信是成功的前提，你拥有自信，就拥有成功的一半机会。相信自己是最棒的就一定会成就一定的事业。拥有自信的人之所以会心想事成、走向成功，是因为他们都有着巨大无比的潜能等着去开发;消极失败的心态之所以会使人怯弱无能、走向失败，是因为它使人放弃潜能的开发，让潜能在那里沉睡、白白浪费', '分类名称7', '发布人7', 'upload/news_headportrait7.jpg', 7, '2025-04-25 17:19:51', 7, 7, 7, 'upload/news_picture7.jpg', '<p>自信是成功的前提，你拥有自信，就拥有成功的一半机会。相信自己是最棒的就一定会成就一定的事业。拥有自信的人之所以会心想事成、走向成功，是因为他们都有着巨大无比的潜能等着去开发;消极失败的心态之所以会使人怯弱无能、走向失败，是因为它使人放弃潜能的开发，让潜能在那里沉睡、白白浪费。</p><p>我们大家都知道的人大脑拥有140亿个脑细胞，但我们思维意识只利用了脑细胞的很少部分，如能将更多的脑细胞从睡眠中激活出来，人的思维意识将更加强大。如果我们都能充满自信，就能创造人间奇迹，亦能创造一个最好的自己。</p><p> 一个人相信自己是什么，就会是什么。一个人心里怎样想，就会成为怎样的人。这从心里学上讲是有一定的道理的。我们每一个人心里都有一幅心里蓝图，或是一幅自画像，有人称它为运作结果。如果你想象的是做最好的你，那么你就会在你内心的荧光屏上看到一个踌躇满志、不断进取、勇于开拓创新的自我。同时还会经常收到我做的很好，我以后还会做的更好之类的信息，这样你注定会成为一个最好的你。美国哲学家爱默生说:“人的一生正如他一天中所想的那样，你怎么想，怎么期待，就有怎样的人生。”美国有名的钢铁大王安德鲁·卡耐基就是一个充分发挥自己创造机会的楷模。他12岁时由英格兰移居美国，先是在一家纺织厂做工人，当时他的目标是“做全厂最出色的工人。”因为他经常这样想，以这样做，最终他实现了他的目标。后来命运有安排他当邮递员，他想的是怎样成为“全美最杰出的邮递员。”结果他的这一目标也实现了。他的一生总是根据自己所处的环境和地位塑造最佳的自己，他的座右铭就是“相信自己是最棒的。“</p><p>做一个最好的自己，不一定非要当什么“家”，也不一定非要出什么“名”，更不要与别人比高低、比大小。就像人的手指，有大有小，有长有短，他们各有所长，各有所短，你能说拇指比食指好吗?决定最好的你，既不是你拥有的物质财富的多少，也不是你身份的贵贱，关键是看你是否拥有实现自己理想的强烈愿望的程度，看你身上的潜力能否充分发挥。人们熟知的一些英雄模范，就是在平凡的工作岗位上充分发挥人的创新能力，做好自己身边的每一件小事，创造了做好的自己。</p><p>“塑造一个最好的自己”，这个目标人人都可以实现。你只意识到自己是大自然的一分子，坚信自己拥有“无限的能力”与“无限的可能”，这种坚定的信心能帮助你创造和谐的心理、生理韵律，建立起自己理想的自我形象，体现自己人格行为应该具有的魅力。</p>');
INSERT INTO `news` VALUES (198, '2025-04-25 17:19:51', '有了梦想就不会感到疲惫', '一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃', '分类名称8', '发布人8', 'upload/news_headportrait8.jpg', 8, '2025-04-25 17:19:51', 8, 8, 8, 'upload/news_picture8.jpg', '<p>  一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃。</p><p>“峣峣者易折，皎皎者易污。”能够从内地高校到香港读书的学子，都是一些很优秀的年轻人。不知道曾经高居象牙塔的书生，怎样狠下心，咬牙面对那一个天渊般的落差，以及旁人的目光和议论。</p><p>  说到这里，很像一个《读者》式的励志故事。但是这种励志故事从来就不缺乏感动人的力量，因为虽然光明的尾巴不是人人都能够拥有，但是人人都有梦想，面对实现过程中的困难，其奋斗或者说挣扎，却常常和平凡如你我的人们相遇。</p><p>    《当幸福来敲门/The Pursuit of Happyness》就是这样偶然被看到，又感动了我的电影。黑人克里斯是一名普普通通的医疗器械推销员，妻子忍受不了经济上的压力离开了他，留下5岁的儿子克里斯托夫和他相依为命。克里斯银行账户里只剩下21块钱，因为没钱付房租，他和儿子被撵出了公寓。费尽周折，克里斯赢得了在一家着名股票投资公司实习的机会，但是实习期间没有薪水，而且最终只有一人可以成功进入公司。</p><p>    学妹曾经告诉我一个故事，让我每次想到都觉得莫名恐怖。她说，她硕士毕业去广东求职，一个中学要招几个老师，结果南来北往的硕士博士挤了快有一个礼堂。可想而知，竞争有多么残酷。看来，中外求职者都面临着同样的挑战。但是克里斯和许多“80后”的大学毕业生不同，他更加坚韧:为了节省时间，上班时候不喝水，以避免上厕所。以疯狂的速度给客户打电话，打完一个，直接按挂机键就拨下一个电话。白天，克里斯忍受着一次又一次被拒绝的失望，带着微笑在公司和客户之间穿梭。回家，则要带着儿子穿过污秽的街道，忍受房东的咆哮。</p><p>    终于，交不起房租的父子俩流落街头。克里斯和儿子在午夜地铁里相对无言，儿子不能理解为什么不能回家住，爸爸却开始玩游戏:“我们通过时光机，到达古代了!”儿子立刻兴奋地配合起来，环顾左右。父子俩在“恐龙”的追杀下，逃到了一个“山洞”里，“山洞”是什么呢，其实是一间男厕所。克里斯搂着熟睡的儿子，坐靠在厕所的墙面。午夜的灯光很惨白，这个消瘦的、营养不良的父亲，默默地流下了泪水。</p><p>    父子俩依旧为了幸福到来而努力。他们开始住收容所，面对有限的床位，这个奔跑起来像猎豹一样的人，有时候得把草原上的爆发力运用到打架上面来。儿子在简陋的收容所床上睡着了，父亲还在埋头修理推销的医疗器械，或者翻那本厚厚的笔试全书。</p><p>   钱包磨损得厉害，而且，太瘪了，每张钱都很熟悉。老板要借5块钱，犹豫再三，摩挚着纸币，最终还是把钱送了出去。卖血。鲜血在塑料袋里面渗开，那是一个男人所能奉献的最后。拿着卖血的钱，克里斯仍然去买电子元件。一点点的希望，都要去坚持。</p><p>对于父母，最心酸的事儿是什么呢?就是子女的一点可怜的愿望得不到满足。克里斯托夫的惟一的玩偶“美国英雄”，在一次挤车的过程中掉到了地上。5岁的男孩悲伤欲绝，克里斯坚硬的表情下，读出的是面对困难的凶狠和惨痛。但是，无论多么深切的无望，都没有摧毁父子间的亲情与他们的信念，他们相信幸福总会落到自己的身上。“你是个好爸爸”，克里斯托夫跟着爸爸四处流浪，可是孩子的心灵，衡量的砝码和天使是—样的。</p><p>  克里斯最终成为了投资公司的员工，看似冷漠的白人老板们，此时显出他们的些微温情。他忍住了泪水，颤抖着拿起自己的物品，走入了茫茫人海。在熙熙攘攘的人群中间，克里斯举起手，为自己鼓掌，那无声的，一下下重重的掌声，是在为自己喝彩。其实，克里斯托夫的“美国英雄”并没有失落。</p><p>  这是一个非常典型的“美国梦”:一个人通过自己的努力，可以实现自己的梦想，幸福，会来敲门。很多人往往会关注对于梦想的树立，而往往忽略过程的艰辛。特别是，当面对一个看似无望的现实的时候，有多少人会坚持，多少人会放弃呢?生活总是在不断地修正，并且提醒我们，顺应大潮的人总是较有可能抵达成功的彼岸。可是，确实是有些人，愿意逆流而上。我相信，这是导演对于逆行者的一点鼓励。</p><p>那个香港的匿名毕业生后来博士毕业，找到了一份不错的工作，有了漂亮的妻子和可爱的孩子。这个强人在帖子里说，有什么坚持不下来的呢?只要有梦想</p>');

-- ----------------------------
-- Table structure for newstype
-- ----------------------------
DROP TABLE IF EXISTS `newstype`;
CREATE TABLE `newstype`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `typename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 188 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公告信息分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of newstype
-- ----------------------------
INSERT INTO `newstype` VALUES (181, '2025-04-25 17:19:51', '分类名称1');
INSERT INTO `newstype` VALUES (182, '2025-04-25 17:19:51', '分类名称2');
INSERT INTO `newstype` VALUES (183, '2025-04-25 17:19:51', '分类名称3');
INSERT INTO `newstype` VALUES (184, '2025-04-25 17:19:51', '分类名称4');
INSERT INTO `newstype` VALUES (185, '2025-04-25 17:19:51', '分类名称5');
INSERT INTO `newstype` VALUES (186, '2025-04-25 17:19:51', '分类名称6');
INSERT INTO `newstype` VALUES (187, '2025-04-25 17:19:51', '分类名称7');
INSERT INTO `newstype` VALUES (188, '2025-04-25 17:19:51', '分类名称8');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `orderid` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'chongwuchanpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NOT NULL DEFAULT 0 COMMENT '价格',
  `total` double NOT NULL DEFAULT 0 COMMENT '总价格',
  `type` int(11) NULL DEFAULT 1 COMMENT '支付类型',
  `status` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货人',
  `logistics` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '物流',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `goodtype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类型',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '审核回复',
  `role` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户角色',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '商家账号',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家姓名',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `orderid`(`orderid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (6, '2025-04-29 15:36:44', '202551153644979', 'chongwuchanpin', 1737390466763, 127, '宠物训练喷雾（PetSafe）', 'upload/chongwuchanpin9.jpg', 1, 99, 99, 1, '已退款', '南理工', '15995521234', 'a1', NULL, '', NULL, '', NULL, 'yonghu', 'b3', 'b3');
INSERT INTO `orders` VALUES (7, '2025-04-29 00:13:46', '20255201346323', 'chongwuchanpin', 1737390466763, 125, '宠物沙发床（MerryPet）', 'upload/chongwuchanpin7.jpg', 2, 599, 1198, 1, '已支付', '南理工', '15995521234', 'a1', NULL, '', NULL, '', NULL, 'yonghu', 'b3', 'b3');
INSERT INTO `orders` VALUES (8, '2025-04-29 00:13:59', '20255201359866', 'chongwuchanpin', 1737390466763, 119, '皇家犬粮（Royal Canin）', 'upload/chongwuchanpin1.jpg', 1, 200, 200, 1, '已完成', '南理工', '15995521234', 'a1', NULL, '', NULL, '待审核', NULL, 'yonghu', 'b1', 'b1');

-- ----------------------------
-- Table structure for shangjia
-- ----------------------------
DROP TABLE IF EXISTS `shangjia`;
CREATE TABLE `shangjia`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家账号',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `touxiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `shangjiaxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商家姓名',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `money` double NULL DEFAULT 0 COMMENT '余额',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuzhanghao`(`shangjiazhanghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1745959786002 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangjia
-- ----------------------------
INSERT INTO `shangjia` VALUES (1737390481601, '2025-04-27 00:28:01', 'b2', '123', 'upload/shangjia_touxiang2.jpg', 'b2', '男', '13812962662', 0);
INSERT INTO `shangjia` VALUES (1737390494413, '2025-04-27 00:28:14', 'b3', '123', 'upload/shangjia_touxiang3.jpg', 'b3', '女', '13812962663', 0);
INSERT INTO `shangjia` VALUES (1745917863288, '2025-04-29 17:11:03', 'b1', '123', 'upload/shangjia_touxiang1.jpg', 'b1', '男', '13812962661', 0);

-- ----------------------------
-- Table structure for sijiyangchong
-- ----------------------------
DROP TABLE IF EXISTS `sijiyangchong`;
CREATE TABLE `sijiyangchong`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yangchongbiaoti` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '养宠标题',
  `sijifenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '四季分类',
  `yangchongneirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '养宠内容',
  `shipin` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '视频',
  `fabushijian` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `discussnum` int(11) NULL DEFAULT 0 COMMENT '评论数',
  `storeupnum` int(11) NULL DEFAULT 0 COMMENT '收藏数',
  `fengmian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '封面',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 112 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '四季养宠' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sijiyangchong
-- ----------------------------
INSERT INTO `sijiyangchong` VALUES (109, '2025-04-26 19:06:14', '如何应对宠物的花粉过敏', '春季', '春季是花粉过敏的高发期，许多宠物（尤其是犬类）可能会出现过敏症状，如打喷嚏、流泪、皮肤瘙痒等。\n预防措施：\n经常给宠物洗澡，去除附着的花粉。\n保持家中空气清新，使用空气净化器。\n外出后清洁宠物的脚垫和毛发，防止花粉残留。\n咨询兽医，是否需要使用抗过敏药物。\n小贴士：避免让宠物在花粉浓度高的时段外出，尤其是清晨和傍晚。', 'upload/sijiyangchong1.mp4', '2025-04-26 19:03:52', '2025-04-29 01:53:20', 0, 0, 'upload/sijifengmian1.jpg');
INSERT INTO `sijiyangchong` VALUES (110, '2025-04-26 19:10:03', '夏季高温如何为宠物降温', '夏季', '夏季高温对宠物尤其是毛发浓密的狗狗和猫咪有较大影响，容易引起中暑和脱水。\n降温措施：\n提供充足的清水，确保宠物随时饮用。\n使用宠物专用的冷却垫或降温背心。\n在户外活动时尽量避开高温时段，选择清晨或傍晚。\n在家中保持良好的通风，使用空调或风扇帮助降温。\n给宠物修剪毛发，但不要剃光，保留一些保护层。\n小贴士：避免让宠物长时间暴露在阳光下，尤其是老年宠物和胖宠物，更容易中暑。', 'upload/sijiyangchong2.mp4', '2025-04-26 19:09:01', '2025-04-29 01:53:18', 0, 0, 'upload/sijifengmian2.jpg');
INSERT INTO `sijiyangchong` VALUES (111, '2025-04-26 19:10:20', '秋季掉毛怎么办？', '秋季', '秋季是很多宠物的换毛季节，尤其是双层毛发的犬猫，会有明显的掉毛现象。\n护理措施：\n每周定期给宠物梳毛，尤其是长毛品种，有助于减少掉毛，并去除毛发中的污垢和打结。\n提供高质量的饮食，补充毛发所需的营养，如欧米伽-3脂肪酸。\n适当的洗澡，避免过度洗涤导致皮肤干燥。\n预防皮肤问题：秋季干燥，使用润肤喷雾保持宠物皮肤的水分。\n小贴士：加强环境清洁，定期清理掉落的毛发，避免对宠物造成刺激。', 'upload/sijiyangchong3.mp4', '2025-04-26 19:10:05', '2025-04-29 20:13:59', 0, 1, 'upload/sijifengmian3.jpg');
INSERT INTO `sijiyangchong` VALUES (112, '2025-04-26 19:10:41', '如何保护宠物免受寒冷侵害', '冬季', '冬季低温对宠物尤其是小型犬、短毛猫及老年宠物有较大影响，容易引起冻伤或体温过低。\n保暖措施：\n为宠物准备适合的保暖衣物，特别是外出时，短毛品种需要额外的保护。\n温暖环境：确保宠物的栖息地温暖干燥，避免长时间待在寒冷的地面上。\n每日带宠物适当外出活动，但应避免暴露于极寒环境中，尤其是在寒风刺骨的情况下。\n注意宠物的脚垫，冬季的盐和冰雪可能会对它们造成刺激，可使用宠物脚垫保护。\n小贴士：避免让宠物长时间暴露在寒冷中，特别是老年宠物，容易受到低温影响。\n', 'upload/sijiyangchong4.mp4', '2025-04-26 19:10:30', '2025-04-29 15:38:31', 0, 1, 'upload/sijifengmian4.jpg');

-- ----------------------------
-- Table structure for storeup
-- ----------------------------
DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) NULL DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片',
  `type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 66 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storeup
-- ----------------------------
INSERT INTO `storeup` VALUES (4, '2025-04-26 23:49:42', 11, 64, 'chongwuyinshituijian', '', 'upload/1737366666015.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (6, '2025-04-27 00:58:06', 1737390507206, 96, 'chongwufenxiang', '金毛Lucky的成长故事', 'upload/1737390785701.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (8, '2025-02-04 19:21:07', 1737390466763, 64, 'chongwuyinshituijian', '', 'upload/1737366666015.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (10, '2025-02-04 19:21:27', 1737390466763, 72, 'chongwuyanghuwenzhang', '鱼缸中的水质管理与维护', 'upload/1737367236709.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (11, '2025-02-04 19:21:59', 1737390466763, 86, 'chongwuyanghuzhishi', '宠物掉毛怎么办', 'upload/1737369965066.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (13, '2025-02-04 19:31:32', 1737390466763, 79, 'chongwuyanghuzhishi', '如何定期检查宠物健康', 'upload/1737369067258.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (14, '2025-02-04 19:31:34', 1737390466763, 79, 'chongwuyanghuzhishi', '如何定期检查宠物健康', 'upload/1737369067258.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (16, '2025-02-04 19:31:48', 1737390466763, 100, 'chongwufenxiang', '热带鱼缸里的宁静世界', 'upload/1737391421852.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (17, '2025-02-04 19:35:59', 1737390466763, 96, 'chongwufenxiang', '金毛Lucky的成长故事', 'upload/1737390785701.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (18, '2025-02-04 19:36:00', 1737390466763, 96, 'chongwufenxiang', '金毛Lucky的成长故事', 'upload/1737390785701.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (20, '2025-02-04 20:11:26', 1737390466763, 192, 'news', '大学就该抓住青春，用汗水实现梦想', 'upload/news_picture2.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (21, '2025-02-04 20:11:27', 1737390466763, 192, 'news', '大学就该抓住青春，用汗水实现梦想', 'upload/news_picture2.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (25, '2025-04-29 17:11:35', 1737390466763, 76, 'chongwuxinxi', '', 'upload/chongwu8.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (26, '2025-04-29 17:11:37', 1737390466763, 76, 'chongwuxinxi', '', 'upload/chongwu8.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (33, '2025-04-29 17:15:04', 1737390466763, 77, 'chongwuxinxi', '', 'upload/chongwu9.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (34, '2025-04-29 17:17:36', 1737390466763, 77, 'chongwuxinxi', '', 'upload/chongwu9.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (35, '2025-04-29 17:18:17', 1737390466763, 72, 'chongwuxinxi', '', 'upload/chongwu4.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (36, '2025-04-29 17:29:22', 1737390466763, 86, 'chongwuyanghuzhishi', '宠物掉毛怎么办', 'upload/yanghuzhishi8.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (37, '2025-04-29 17:34:48', 1737390466763, 81, 'chongwuyanghuzhishi', '如何教会狗狗不乱叫', 'upload/yanghuzhishi3.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (38, '2025-04-29 17:34:49', 1737390466763, 81, 'chongwuyanghuzhishi', '如何教会狗狗不乱叫', 'upload/yanghuzhishi3.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (42, '2025-04-29 17:41:30', 1737390466763, 100, 'chongwufenxiang', '热带鱼缸里的宁静世界', 'upload/chongwufenxiang5.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (43, '2025-04-29 17:43:45', 1737390466763, 98, 'chongwufenxiang', '鹦鹉小蓝的故事', 'upload/chongwufenxiang3.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (44, '2025-04-29 01:53:10', 1737390466763, 112, 'sijiyangchong', '如何保护宠物免受寒冷侵害', NULL, '1', '冬季', NULL);
INSERT INTO `storeup` VALUES (45, '2025-04-29 02:07:03', 1737390466763, 125, 'chongwuchanpin', '宠物沙发床（MerryPet）', 'upload/chongwuchanpin7.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (47, '2025-04-29 02:10:20', 1737390466763, 123, 'chongwuchanpin', '宠物维生素补充剂（Zesty Paws）', 'upload/chongwuchanpin5.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (48, '2025-04-29 02:12:14', 1737390466763, 70, 'chongwuxinxi', '', 'upload/chongwu2.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (51, '2025-04-29 02:12:18', 1737390466763, 70, 'chongwuxinxi', '', 'upload/chongwu2.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (52, '2025-04-29 02:12:44', 1737390466763, 191, 'news', '趁着年轻，输得起，看得开，去经历', 'upload/news_picture1.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (53, '2025-04-29 02:12:45', 1737390466763, 191, 'news', '趁着年轻，输得起，看得开，去经历', 'upload/news_picture1.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (56, '2025-04-29 02:13:25', 1737390466763, 75, 'chongwuxinxi', '', 'upload/chongwu7.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (57, '2025-04-29 02:13:29', 1737390466763, 75, 'chongwuxinxi', '', 'upload/chongwu7.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (60, '2025-04-29 02:17:42', 1737390466763, 127, 'chongwuchanpin', '宠物训练喷雾（PetSafe）', 'upload/chongwuchanpin9.jpg', '1', NULL, NULL);
INSERT INTO `storeup` VALUES (61, '2025-04-29 02:47:06', 1737390466763, 85, 'chongwuyanghuzhishi', '打造安全舒适的宠物生活空间', 'upload/yanghuzhishi7.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (62, '2025-04-29 02:47:18', 1737390466763, 111, 'sijiyangchong', '秋季掉毛怎么办？', NULL, '1', '秋季', NULL);
INSERT INTO `storeup` VALUES (63, '2025-04-29 23:28:34', 1737390481601, 75, 'chongwuxinxi', '', 'upload/chongwu7.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (64, '2025-04-29 23:32:14', 1737390466763, 69, 'chongwuxinxi', '', 'upload/chongwu1.jpg', '21', NULL, NULL);
INSERT INTO `storeup` VALUES (65, '2025-04-29 23:41:28', 1737390466763, 69, 'chongwuxinxi', '', 'upload/chongwu1.jpg', '1', NULL, NULL);

-- ----------------------------
-- Table structure for systemintro
-- ----------------------------
DROP TABLE IF EXISTS `systemintro`;
CREATE TABLE `systemintro`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统简介' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of systemintro
-- ----------------------------
INSERT INTO `systemintro` VALUES (1, '2025-04-25 17:19:51', '系统简介', 'SYSTEM INTRODUCTION', '在平静的海平面上，每个人都可以成为领航员。但如果只有阳光而没有阴影，只有欢乐而没有痛苦，那就不是完整的人生。就拿最幸福的人来说吧——他的幸福是一团纠结的纱线。痛苦和幸福轮番而至，让我们悲喜交集，甚至死亡都让人生更加可爱。人在生命的严肃时刻，在悲伤与丧亲的阴影下，才最接近真实的自我。在生活和事业的各个方面，才智的护理频率远不如性格，头脑的护理频率远不如心性，天分远不如自制力、毅力与教养。我始终认为内心开始过严肃生活的人，他外在的生活会开始变得更为俭朴。在一个奢侈浪费的年代，但愿我能让世人了解：人类真正的需求是多么的稀少。不重蹈覆辙才是真正的醒悟。比别人优秀并无任何高贵之处，真正的高贵在于超越从前的自我。', 'upload/systemintro_picture1.jpg', 'upload/systemintro_picture2.jpg', 'upload/systemintro_picture3.jpg');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 11, '用户账号1', 'yonghu', '用户', 'f2ruxotkgub28lxgu3ye9jd38g1jt5p2', '2025-04-25 17:23:54', '2025-04-27 01:26:17');
INSERT INTO `token` VALUES (2, 1, 'admin', 'users', '管理员', '90ki4cu8m7xiv1gdhr3t5ma5fwkp9z6g', '2025-04-25 17:24:30', '2025-04-29 21:12:16');
INSERT INTO `token` VALUES (3, 12, '用户账号2', 'yonghu', '用户', 'h4fybuh4cz1ue5n8hr4s7kj9dfc6hy03', '2025-04-27 00:22:02', '2025-04-27 01:22:02');
INSERT INTO `token` VALUES (4, 1737390200026, '1234567', 'yonghu', '用户', '3kx28bkdn6awk5f5q282acdymx41renk', '2025-04-27 00:23:25', '2025-04-27 01:25:32');
INSERT INTO `token` VALUES (5, 1737390466763, 'a1', 'yonghu', '用户', 'j9i554nht3s2pg077fc89wf2t4tpg8gz', '2025-04-27 00:32:26', '2025-04-29 21:13:41');
INSERT INTO `token` VALUES (6, 1737390481601, 'a2', 'yonghu', '用户', 'v3f3h2vb5zvvazodpcr3l7uqjrcp5j6l', '2025-04-27 00:37:39', '2025-04-29 00:28:30');
INSERT INTO `token` VALUES (7, 1737390494413, 'a3', 'yonghu', '用户', 'dzsa2p67qoo5flmb66pfocbq0ijxo89e', '2025-04-27 00:39:07', '2025-04-29 00:26:06');
INSERT INTO `token` VALUES (8, 1737390507206, 'a4', 'yonghu', '用户', 'kzpy738n68v9llf1rlq6slbc4d16ufqn', '2025-04-27 00:40:25', '2025-04-27 01:55:44');
INSERT INTO `token` VALUES (9, 1737390519000, 'a5', 'yonghu', '用户', 'haaxbz4317a9svehcx09c0zeee6p6xhr', '2025-04-27 00:42:15', '2025-04-27 01:42:16');
INSERT INTO `token` VALUES (10, 1737390466763, 'a1', 'shangjia', '商家', 'b0r8skndt20x2016goiwzbxqzqvmmm2n', '2025-04-29 14:32:34', '2025-04-29 18:10:28');
INSERT INTO `token` VALUES (11, 1737390481601, 'b2', 'shangjia', '商家', '9ltygmiks7q0hysmqu7u0qlcgzkhe5zs', '2025-04-29 17:03:09', '2025-04-29 18:10:34');
INSERT INTO `token` VALUES (12, 1737390494413, 'b3', 'shangjia', '商家', '275aq88s0fxr8xprv1qw5mhn6wrxa36e', '2025-04-29 17:04:07', '2025-04-29 01:43:44');
INSERT INTO `token` VALUES (13, 1745917863288, 'b1', 'shangjia', '商家', 'hi3ic8xzar1o36tkj7ycfaugee5dwdmc', '2025-04-29 17:11:14', '2025-04-29 21:12:21');
INSERT INTO `token` VALUES (14, 1745959786002, 'b4', 'shangjia', '商家', 'vp7agszo3vevz97m2xi0ky8qk5rtvem4', '2025-04-29 04:49:51', '2025-04-29 05:49:51');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', 'admin', 'upload/admin.jpg', '管理员', '2025-04-25 17:19:51');

-- ----------------------------
-- Table structure for yanghufenlei
-- ----------------------------
DROP TABLE IF EXISTS `yanghufenlei`;
CREATE TABLE `yanghufenlei`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yanghufenlei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '养护分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '养护分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yanghufenlei
-- ----------------------------
INSERT INTO `yanghufenlei` VALUES (29, '2025-04-25 17:51:44', '宠物健康管理');
INSERT INTO `yanghufenlei` VALUES (30, '2025-04-25 17:51:49', '宠物饮食护理');
INSERT INTO `yanghufenlei` VALUES (31, '2025-04-25 17:51:55', '宠物行为与训练');
INSERT INTO `yanghufenlei` VALUES (32, '2025-04-25 17:52:00', '宠物外部护理');
INSERT INTO `yanghufenlei` VALUES (33, '2025-04-25 17:52:04', '宠物情感护理');
INSERT INTO `yanghufenlei` VALUES (35, '2025-04-25 17:52:13', '宠物环境护理');
INSERT INTO `yanghufenlei` VALUES (37, '2025-04-25 17:52:21', '宠物常见问题');
INSERT INTO `yanghufenlei` VALUES (38, '2025-04-26 18:07:30', '宠物运动与娱乐');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `touxiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `yonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `money` double NULL DEFAULT 0 COMMENT '余额',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuzhanghao`(`yonghuzhanghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1737390566702 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (1737390466763, '2025-04-27 00:27:46', 'a1', '123', 'upload/yonghu_touxiang1.jpg', 'a1', '女', '15995529761', 8339);
INSERT INTO `yonghu` VALUES (1737390481601, '2025-04-27 00:28:01', 'a2', '123', 'upload/yonghu_touxiang2.jpg', 'a2', '男', '15995529762', 1200);
INSERT INTO `yonghu` VALUES (1737390494413, '2025-04-27 00:28:14', 'a3', '123', 'upload/yonghu_touxiang3.jpg', 'a3', '男', '15995529763', 0);
INSERT INTO `yonghu` VALUES (1737390507206, '2025-04-27 00:28:27', 'a4', '123', 'upload/yonghu_touxiang4.jpg', 'a4', '男', '15995529764', 0);
INSERT INTO `yonghu` VALUES (1737390519000, '2025-04-27 00:28:39', 'a5', '123', 'upload/yonghu_touxiang5.jpg', 'a5', '男', '15995529765', 0);
INSERT INTO `yonghu` VALUES (1737390540260, '2025-04-27 00:29:00', 'a6', '123', 'upload/yonghu_touxiang6.jpg', 'a6', '男', '15995529766', 0);
INSERT INTO `yonghu` VALUES (1737390552095, '2025-04-27 00:29:12', 'a7', '123', 'upload/yonghu_touxiang7.jpg', 'a7', '女', '15995529767', 0);
INSERT INTO `yonghu` VALUES (1737390566702, '2025-04-27 00:29:26', 'a8', '123', 'upload/yonghu_touxiang8.jpg', 'a8', '女', '15995529768', 0);

SET FOREIGN_KEY_CHECKS = 1;
