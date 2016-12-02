package com.dayday.cook.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fan on 2016/12/1.
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
public class HomeTopic implements Serializable {

    /**
     * themeList : [{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161201/724f0b45-bd04-47cf-9a47-0a9d4390f15d","recommend_type":"2","description":"韩剧主角必备的泡面锅","click_count":936,"title":"翻滚吧 泡面君","rid":2286,"share_count":0,"str_date":"2016-12-01 17:03:00","recipe_id":39575,"group_id":-2,"locationId":null,"favorite_count":5,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161201/a48eeed5-1180-4ae4-900b-5f645c0e3788","recommend_type":"2","description":"清酒醉鸡翅","click_count":630,"title":"小鸡快跑！不然就到碗里来","rid":2277,"share_count":0,"str_date":"2016-12-01 10:36:00","recipe_id":39574,"group_id":-2,"locationId":null,"favorite_count":10,"favorite":"false","makingTime":null},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161130/461f79f1-cbe3-4801-8f44-2257c3e032b1","recommend_type":"2","description":"@FateVegetarian","click_count":873,"title":"葱油拌面的家常做法","rid":2276,"share_count":5,"str_date":"2016-12-01 10:21:00","recipe_id":39570,"group_id":-2,"locationId":null,"favorite_count":54,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161130/94d5d9f8-2748-44f4-a406-2365b461b2cf","recommend_type":"2","description":"超值特惠：39.9元/3罐","click_count":1822,"title":"深海食材金枪鱼罐头","rid":2270,"share_count":5,"str_date":"2016-11-30 19:21:00","recipe_id":39438,"group_id":-2,"locationId":null,"favorite_count":30,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161130/d563e9d4-ee98-4f18-9ce3-8a8742cce412","recommend_type":"2","description":"瘦身养颜黄瓜粥","click_count":1710,"title":"这些菜，越吃越美丽","rid":2262,"share_count":0,"str_date":"2016-11-30 10:15:00","recipe_id":39569,"group_id":-2,"locationId":null,"favorite_count":23,"favorite":"false","makingTime":null},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161129/0c569a58-716a-4b4e-8248-e354150b3ed9","recommend_type":"2","description":"@美食的秘密","click_count":1808,"title":"快手香煎小土豆","rid":2261,"share_count":14,"str_date":"2016-11-30 10:06:00","recipe_id":39562,"group_id":-2,"locationId":null,"favorite_count":158,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161129/275498eb-e65e-4aa9-8d11-5ba666b6b806","recommend_type":"2","description":"直降￥170","click_count":743,"title":"现代长效不锈钢保温壶","rid":2260,"share_count":3,"str_date":"2016-11-30 01:50:00","recipe_id":39561,"group_id":-2,"locationId":null,"favorite_count":6,"favorite":"false","makingTime":null},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161129/69b6801d-8fa7-44c9-8906-40c5222956fb","recommend_type":"2","description":"日式牛肉咖喱","click_count":2640,"title":"五款让你回味的咖喱","rid":2257,"share_count":3,"str_date":"2016-11-29 12:14:00","recipe_id":39560,"group_id":-2,"locationId":null,"favorite_count":85,"favorite":"false","makingTime":null},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161129/49957717-83b9-4b39-822a-c0eb02581443","recommend_type":"2","description":"@BetweenUs我们","click_count":1751,"title":"私房秘制酱鸭","rid":2256,"share_count":11,"str_date":"2016-11-29 11:37:00","recipe_id":39559,"group_id":-2,"locationId":null,"favorite_count":126,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161128/14d78225-e744-4c4f-a28d-64a05e544d1b","recommend_type":"2","description":"匠人精神 质朴醇厚","click_count":1526,"title":"黑胡桃木日系餐具盘","rid":2255,"share_count":7,"str_date":"2016-11-29 07:25:00","recipe_id":39543,"group_id":-2,"locationId":null,"favorite_count":33,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161128/e5081dcc-7bd4-406c-84bc-7bd523e90262","recommend_type":"2","description":"香菇什锦鸡肉炒饭","click_count":4164,"title":"炒饭的花样吃法","rid":2238,"share_count":5,"str_date":"2016-11-28 14:19:00","recipe_id":39542,"group_id":-2,"locationId":null,"favorite_count":129,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161128/5377f9e7-7d37-46a1-aec0-b94654e325fb","recommend_type":"2","description":"@Star·小猪","click_count":2302,"title":"花样水晶金鱼蒸饺","rid":2237,"share_count":24,"str_date":"2016-11-28 13:51:00","recipe_id":39541,"group_id":-2,"locationId":null,"favorite_count":143,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161125/caf50621-41d8-42d9-a336-311c9b336662","recommend_type":"2","description":"超能耐温 聚能缩水 ¥88","click_count":1798,"title":"进口锂辉石焖烧锅","rid":2234,"share_count":7,"str_date":"2016-11-27 23:59:00","recipe_id":39540,"group_id":-2,"locationId":null,"favorite_count":38,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161026/8a319e27-cd2d-4be3-872c-369a68e6d1f5","recommend_type":"2","description":"糖醋排骨","click_count":17440,"title":"糖醋做法大全","rid":2233,"share_count":36,"str_date":"2016-11-27 23:58:00","recipe_id":39334,"group_id":-2,"locationId":null,"favorite_count":482,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161124/2ad88bc3-839b-4967-a692-37f673ae7951","recommend_type":"2","description":"@食尚小米","click_count":2712,"title":"辣子鸡丁的家常做法","rid":2232,"share_count":18,"str_date":"2016-11-27 23:58:00","recipe_id":39535,"group_id":-2,"locationId":null,"favorite_count":252,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161125/5c58254f-3f64-4f04-909c-76f8eeb73359","recommend_type":"2","description":"日式釉面调味三件套","click_count":1766,"title":"厨房里的烟火味道","rid":2230,"share_count":4,"str_date":"2016-11-26 23:38:00","recipe_id":39539,"group_id":-2,"locationId":null,"favorite_count":25,"favorite":"false","makingTime":null},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161027/b7568e17-758f-4eb8-8ce0-7f84befd1622","recommend_type":"2","description":"黑木耳莴笋炒山药","click_count":10065,"title":"5款最美味家常时蔬","rid":2227,"share_count":11,"str_date":"2016-11-26 11:05:00","recipe_id":39336,"group_id":-2,"locationId":null,"favorite_count":162,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161124/dd9aa55f-a69a-4eb0-961e-f8bd699b1369","recommend_type":"2","description":"@隐食家说","click_count":2547,"title":"莲藕玉米排骨汤","rid":2226,"share_count":20,"str_date":"2016-11-26 11:03:00","recipe_id":39534,"group_id":-2,"locationId":null,"favorite_count":182,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161125/6a491526-f777-436e-a026-847643a4a74a","recommend_type":"2","description":"女性必备暖冬神器 仅要￥68","click_count":2819,"title":"一个杯子过暖冬","rid":2225,"share_count":6,"str_date":"2016-11-25 19:04:00","recipe_id":39537,"group_id":-2,"locationId":null,"favorite_count":35,"favorite":"false","makingTime":""},{"recipe_type":"01","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161124/2c9da0a6-140d-4b29-9091-c689e5552f3e","recommend_type":"2","description":"自制香草波本冰淇淋＋创意圣代杯","click_count":4111,"title":"一\u201c杯\u201d子的甜蜜","rid":2224,"share_count":3,"str_date":"2016-11-25 17:00:00","recipe_id":39533,"group_id":-2,"locationId":null,"favorite_count":143,"favorite":"false","makingTime":null}]
     * recipeList : [{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20160526/15055d79-efc1-4057-ba6c-b6c3e8eca409","recommend_type":"1","description":"日本咖喱味道偏甜，是因为他们喜欢加入苹果调味，香甜的咖喱味道连小朋友也能接受，这款和风咖喱猪肉饭一家大小都会喜欢。","click_count":41704,"title":"和风咖喱猪肉饭","rid":2279,"share_count":156,"str_date":"2016-12-01 11:04:00","recipe_id":37999,"group_id":0,"locationId":null,"favorite_count":5050,"favorite":"false","makingTime":"1小时"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20160412/aead2ab9-c3cc-4821-a69e-f238ac475a78","recommend_type":"1","description":"扇贝和粉丝的配搭很常见，大多是用蒸的方法处理。但是你一定想不到配搭芝士汁来烤，味道也很惊艳！粉丝沾满芝士的香浓味道，这款新式煮法一定能给你惊喜。","click_count":15559,"title":"芝士汁粉丝焗扇贝","rid":2278,"share_count":76,"str_date":"2016-12-01 11:03:00","recipe_id":37853,"group_id":0,"locationId":null,"favorite_count":1901,"favorite":"false","makingTime":"30分钟"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20160410/be802747-a44d-45b8-bf47-c1d6471da9cc","recommend_type":"1","description":"每次做黑椒炒大虾，厨房都传来阵阵香气令人食指大动，这次加入粉丝一起煮，粉丝吸尽大虾和黑椒的味道，大虾顿时成了配角呢！","click_count":24450,"title":"黑椒大虾炒粉丝","rid":2266,"share_count":148,"str_date":"2016-11-30 11:24:00","recipe_id":37848,"group_id":0,"locationId":null,"favorite_count":2556,"favorite":"false","makingTime":"20分钟"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/ImageMigration/1000x750/recipe_37581_39861.jpg","recommend_type":"1","description":"纵然海鲜烹饪方法多样，但冬日最适合不过的还是中式的炖法。取冬季时令蔬菜大白菜和蟹、虾、鱼等几种海鲜炖在一起，将海鲜的美味淋漓尽致的发挥，让整个汤都散发着浓浓的鲜味。喜食海鲜的一定不能错过这道海味盛宴。\r\n","click_count":17367,"title":"海鲜一品锅","rid":2265,"share_count":114,"str_date":"2016-11-30 11:24:00","recipe_id":37581,"group_id":0,"locationId":null,"favorite_count":1986,"favorite":"false","makingTime":"1.5小时"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/ImageMigration/1000x750/recipe_35621_37691.jpg","recommend_type":"1","description":"精致的法国大餐一直是浪漫情调的催化剂。想要给你的另一半最好的料理，不妨从这道普罗旺斯烩鸡开始吧！浓郁的香料和鸡肉的搭配堪称完美，让你即使不在法国，也能有身临其境的感觉。\r\n\r\n \r\n","click_count":5594,"title":"普罗旺斯烩鸡","rid":2259,"share_count":23,"str_date":"2016-11-29 17:49:00","recipe_id":35621,"group_id":0,"locationId":null,"favorite_count":753,"favorite":"false","makingTime":"30分钟"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/ImageMigration/1000x750/recipe_36111_38301.jpg","recommend_type":"1","description":"蒸食能最大限度的保留食物原有的营养成分，尤其对于鱼肉来说。鳕鱼刺少肉质鲜美，香菇素来有\u201c菇中之王\u201d的美誉，当菌类搭配海鲜，加上传统的蒸菜工艺，让两种食材的味道调和到极限。如此一道简单易学的满汉全席菜式可是展示自己高逼格厨艺的不二选择。\r\n","click_count":5169,"title":"香菇蒸鳕鱼","rid":2258,"share_count":50,"str_date":"2016-11-29 17:48:00","recipe_id":36111,"group_id":0,"locationId":null,"favorite_count":910,"favorite":"false","makingTime":"30分钟"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/ImageMigration/1000x750/recipe_34541_37001.jpg","recommend_type":"1","description":"花螺体积小小的，肉质鲜甜爽脆，最受欢迎的做法是用辣酒煮，每粒花螺浸满辣汁，用竹签挑出来一啖一粒，下酒一流。","click_count":4056,"title":"辣酒煮花螺","rid":2236,"share_count":34,"str_date":"2016-11-28 10:56:00","recipe_id":34541,"group_id":0,"locationId":null,"favorite_count":680,"favorite":"false","makingTime":"1小时"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/ImageMigration/1000x750/recipe_34511_36471.jpg","recommend_type":"1","description":"暑假到了，大家一起做一道味道酸甜的泰式香茅单骨鸡翅吧。","click_count":6914,"title":"泰式香茅单骨鸡翅","rid":2235,"share_count":36,"str_date":"2016-11-28 10:55:00","recipe_id":34511,"group_id":0,"locationId":null,"favorite_count":763,"favorite":"false","makingTime":"30分钟"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20160430/330cc333-d9e6-409c-9d2b-857c78239242","recommend_type":"1","description":"一学就会的经典意大利奶油酱，配上经典自制肉丸，属于小两口的晚餐约会。","click_count":35570,"title":"经典肉丸配奶油蛋黄沙司意面","rid":2196,"share_count":108,"str_date":"2016-11-25 13:48:00","recipe_id":37898,"group_id":0,"locationId":null,"favorite_count":3359,"favorite":"false","makingTime":"1小时"},{"recipe_type":"00","locationName":null,"image_url":"http://pic.daydaycook.com/production/images/20161021/fec03b54-d1cc-4b6c-bba3-94100df3c924","recommend_type":"1","description":"新年吃年糕是传统习俗，年糕寓意我们的工作和学习一年比一年提高，今天介绍的是中西结合的菜式，让大家吃年糕吃出披萨味。","click_count":37938,"title":"芝士焗年糕","rid":2190,"share_count":126,"str_date":"2016-11-24 12:03:00","recipe_id":37683,"group_id":0,"locationId":null,"favorite_count":3488,"favorite":"false","makingTime":"30分钟"}]
     */
    private List<ThemeListEntity> themeList;
    private List<RecipeListEntity> recipeList;

    public void setThemeList(List<ThemeListEntity> themeList) {
        this.themeList = themeList;
    }

    public void setRecipeList(List<RecipeListEntity> recipeList) {
        this.recipeList = recipeList;
    }

    public List<ThemeListEntity> getThemeList() {
        return themeList;
    }

    public List<RecipeListEntity> getRecipeList() {
        return recipeList;
    }

    public class ThemeListEntity implements Serializable {
        /**
         * recipe_type : 01
         * locationName : null
         * image_url : http://pic.daydaycook.com/production/images/20161201/724f0b45-bd04-47cf-9a47-0a9d4390f15d
         * recommend_type : 2
         * description : 韩剧主角必备的泡面锅
         * click_count : 936
         * title : 翻滚吧 泡面君
         * rid : 2286
         * share_count : 0
         * str_date : 2016-12-01 17:03:00
         * recipe_id : 39575
         * group_id : -2
         * locationId : null
         * favorite_count : 5
         * favorite : false
         * makingTime :
         */
        private String recipe_type;
        private String locationName;
        private String image_url;
        private String recommend_type;
        private String description;
        private int click_count;
        private String title;
        private int rid;
        private int share_count;
        private String str_date;
        private int recipe_id;
        private int group_id;
        private String locationId;
        private int favorite_count;
        private String favorite;
        private String makingTime;

        public void setRecipe_type(String recipe_type) {
            this.recipe_type = recipe_type;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public void setRecommend_type(String recommend_type) {
            this.recommend_type = recommend_type;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setClick_count(int click_count) {
            this.click_count = click_count;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRid(int rid) {
            this.rid = rid;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public void setStr_date(String str_date) {
            this.str_date = str_date;
        }

        public void setRecipe_id(int recipe_id) {
            this.recipe_id = recipe_id;
        }

        public void setGroup_id(int group_id) {
            this.group_id = group_id;
        }

        public void setLocationId(String locationId) {
            this.locationId = locationId;
        }

        public void setFavorite_count(int favorite_count) {
            this.favorite_count = favorite_count;
        }

        public void setFavorite(String favorite) {
            this.favorite = favorite;
        }

        public void setMakingTime(String makingTime) {
            this.makingTime = makingTime;
        }

        public String getRecipe_type() {
            return recipe_type;
        }

        public String getLocationName() {
            return locationName;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getRecommend_type() {
            return recommend_type;
        }

        public String getDescription() {
            return description;
        }

        public int getClick_count() {
            return click_count;
        }

        public String getTitle() {
            return title;
        }

        public int getRid() {
            return rid;
        }

        public int getShare_count() {
            return share_count;
        }

        public String getStr_date() {
            return str_date;
        }

        public int getRecipe_id() {
            return recipe_id;
        }

        public int getGroup_id() {
            return group_id;
        }

        public String getLocationId() {
            return locationId;
        }

        public int getFavorite_count() {
            return favorite_count;
        }

        public String getFavorite() {
            return favorite;
        }

        public String getMakingTime() {
            return makingTime;
        }
    }

    public class RecipeListEntity {
        /**
         * recipe_type : 00
         * locationName : null
         * image_url : http://pic.daydaycook.com/production/images/20160526/15055d79-efc1-4057-ba6c-b6c3e8eca409
         * recommend_type : 1
         * description : 日本咖喱味道偏甜，是因为他们喜欢加入苹果调味，香甜的咖喱味道连小朋友也能接受，这款和风咖喱猪肉饭一家大小都会喜欢。
         * click_count : 41704
         * title : 和风咖喱猪肉饭
         * rid : 2279
         * share_count : 156
         * str_date : 2016-12-01 11:04:00
         * recipe_id : 37999
         * group_id : 0
         * locationId : null
         * favorite_count : 5050
         * favorite : false
         * makingTime : 1小时
         */
        private String recipe_type;
        private String locationName;
        private String image_url;
        private String recommend_type;
        private String description;
        private int click_count;
        private String title;
        private int rid;
        private int share_count;
        private String str_date;
        private int recipe_id;
        private int group_id;
        private String locationId;
        private int favorite_count;
        private String favorite;
        private String makingTime;

        public void setRecipe_type(String recipe_type) {
            this.recipe_type = recipe_type;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public void setRecommend_type(String recommend_type) {
            this.recommend_type = recommend_type;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setClick_count(int click_count) {
            this.click_count = click_count;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRid(int rid) {
            this.rid = rid;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public void setStr_date(String str_date) {
            this.str_date = str_date;
        }

        public void setRecipe_id(int recipe_id) {
            this.recipe_id = recipe_id;
        }

        public void setGroup_id(int group_id) {
            this.group_id = group_id;
        }

        public void setLocationId(String locationId) {
            this.locationId = locationId;
        }

        public void setFavorite_count(int favorite_count) {
            this.favorite_count = favorite_count;
        }

        public void setFavorite(String favorite) {
            this.favorite = favorite;
        }

        public void setMakingTime(String makingTime) {
            this.makingTime = makingTime;
        }

        public String getRecipe_type() {
            return recipe_type;
        }

        public String getLocationName() {
            return locationName;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getRecommend_type() {
            return recommend_type;
        }

        public String getDescription() {
            return description;
        }

        public int getClick_count() {
            return click_count;
        }

        public String getTitle() {
            return title;
        }

        public int getRid() {
            return rid;
        }

        public int getShare_count() {
            return share_count;
        }

        public String getStr_date() {
            return str_date;
        }

        public int getRecipe_id() {
            return recipe_id;
        }

        public int getGroup_id() {
            return group_id;
        }

        public String getLocationId() {
            return locationId;
        }

        public int getFavorite_count() {
            return favorite_count;
        }

        public String getFavorite() {
            return favorite;
        }

        public String getMakingTime() {
            return makingTime;
        }
    }
}
