package com.dayday.cook.beans;

import java.util.List;

/**
 * Created by fan on 2016/12/8.
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * <p/>
 * ━━━━━━感觉萌萌哒━━━━━━
 */
public class ChuYi {

    /**
     * msg : 操作成功
     * code : 200
     * data : [{"levelInfo":"新手级","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161115/d9135915-c7c9-4531-a645-f0dfc267c4e9","level":1,"participantCount":364,"totalStep":3,"lessonId":68,"rank":14,"title":"食物的手机拍摄技巧","largeImgUrl":"http://pic.daydaycook.com/production/images/20161115/cd50b025-10aa-48db-bb27-c3983373a7ab"},{"levelInfo":"初级","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161111/5fe9803a-da41-4685-86a1-cbd9746eb23a","level":4,"participantCount":90,"totalStep":2,"lessonId":67,"rank":13,"title":"DIY趣味卡通曲奇","largeImgUrl":"http://pic.daydaycook.com/production/images/20161111/e7d413d6-22e8-4e0c-8302-638c227102e4"},{"levelInfo":"中级","userInfo":null,"indexImgUrl":"http://pichk.daydaycook.com/production/images/20161031/d610b053-0d1c-4409-96f7-f00bfa066ca2","level":6,"participantCount":542,"totalStep":1,"lessonId":65,"rank":12,"title":"你必须要挑战的马卡龙课程","largeImgUrl":"http://pichk.daydaycook.com/production/images/20161031/1cb174a8-c438-4e7f-a26e-3f076fe6a111"},{"levelInfo":"初级基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/ef912288-89ce-4b42-91ad-53ee9a1ad307","level":4,"participantCount":508,"totalStep":1,"lessonId":64,"rank":11,"title":"抹茶生巧克力等你来挑战","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/8e4eaeed-d886-47b2-b0c5-0ac3a436d163"},{"levelInfo":"新手基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/c47b2c8e-7138-4374-b11d-6175c44f906a","level":2,"participantCount":547,"totalStep":1,"lessonId":63,"rank":10,"title":"最营养的牛油果早餐","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/858d7ef4-9308-4644-bce1-bb27a649499d"},{"levelInfo":"新手基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/ea97a5d2-8643-4349-bb99-c5ceaa016cb1","level":2,"participantCount":1016,"totalStep":1,"lessonId":62,"rank":9,"title":"减肥的沙拉有它就够了","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/0fe3ffd7-a9f2-4fc2-a462-a3aa9aac9ea8"},{"levelInfo":"新手基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/26eefc2f-439b-4736-968c-b44aa2526cc1","level":2,"participantCount":1424,"totalStep":1,"lessonId":61,"rank":8,"title":"快手面成就你的营养晚餐","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/29daebf7-afda-4f84-afbb-cf028ffc583a"},{"levelInfo":"初学基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/e3a64783-2312-432f-bb99-cc1075d8eb18","level":4,"participantCount":917,"totalStep":2,"lessonId":60,"rank":7,"title":"送给新手的2款DIY饼干","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/5927399e-5d04-43cf-9940-5ed82f9e30d6"},{"levelInfo":"初学基础","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/07f892e5-aaab-4c2d-902e-6af73f5a72a5","level":4,"participantCount":511,"totalStep":5,"lessonId":59,"rank":6,"title":"来，DIY一杯健康饮品","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/79799298-56b4-4414-b0fd-2303c87209c0"},{"levelInfo":"初级食谱","userInfo":null,"indexImgUrl":"http://pic.daydaycook.com/production/images/20161028/97bb49b9-c792-48c5-8688-3f931e7ebf21","level":4,"participantCount":1035,"totalStep":1,"lessonId":56,"rank":5,"title":"冰皮的月饼才好吃","largeImgUrl":"http://pic.daydaycook.com/production/images/20161028/474d4ef0-305e-46e8-9b4a-d3a2f18fcc25"}]
     */
    private String msg;
    private String code;
    private List<DataEntity> data;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public class DataEntity {
        /**
         * levelInfo : 新手级
         * userInfo : null
         * indexImgUrl : http://pic.daydaycook.com/production/images/20161115/d9135915-c7c9-4531-a645-f0dfc267c4e9
         * level : 1
         * participantCount : 364
         * totalStep : 3
         * lessonId : 68
         * rank : 14
         * title : 食物的手机拍摄技巧
         * largeImgUrl : http://pic.daydaycook.com/production/images/20161115/cd50b025-10aa-48db-bb27-c3983373a7ab
         */
        private String levelInfo;
        private String userInfo;
        private String indexImgUrl;
        private int level;
        private int participantCount;
        private int totalStep;
        private int lessonId;
        private int rank;
        private String title;
        private String largeImgUrl;

        public void setLevelInfo(String levelInfo) {
            this.levelInfo = levelInfo;
        }

        public void setUserInfo(String userInfo) {
            this.userInfo = userInfo;
        }

        public void setIndexImgUrl(String indexImgUrl) {
            this.indexImgUrl = indexImgUrl;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public void setParticipantCount(int participantCount) {
            this.participantCount = participantCount;
        }

        public void setTotalStep(int totalStep) {
            this.totalStep = totalStep;
        }

        public void setLessonId(int lessonId) {
            this.lessonId = lessonId;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setLargeImgUrl(String largeImgUrl) {
            this.largeImgUrl = largeImgUrl;
        }

        public String getLevelInfo() {
            return levelInfo;
        }

        public String getUserInfo() {
            return userInfo;
        }

        public String getIndexImgUrl() {
            return indexImgUrl;
        }

        public int getLevel() {
            return level;
        }

        public int getParticipantCount() {
            return participantCount;
        }

        public int getTotalStep() {
            return totalStep;
        }

        public int getLessonId() {
            return lessonId;
        }

        public int getRank() {
            return rank;
        }

        public String getTitle() {
            return title;
        }

        public String getLargeImgUrl() {
            return largeImgUrl;
        }
    }
}
