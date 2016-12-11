package com.dayday.cook.beans;

/**
 * Created by fan on 2016/12/9.
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
public class XiangQing {


    /**
     * msg : 操作成功
     * code : 200
     * data : {"clickCount":143777,"maketime":"","detailsUrl":"","taste":null,"systemUser":null,"indexUrl":"","description":"","screeningId":null,"videoRelId":null,"source":{"authorSummary":"生活就要极致","roleId":"1","authorName":"日日煮","authorId":"1","authorImageUrl":"http://pic.daydaycook.com/production/images/20161130/1dfd7c44-ff47-43cd-b7a6-e52770ef41ca"},"title":"早餐","type":"01","content":"","shareCount":54,"peopleEat":null,"loadContent":"http://api.daydaycook.com.cn:80/daydaycook/h5/recipe/loadContent.do?id=38024&languageId=3&mainland=1&ver=2.3.3&regionCode=156","deleteStatus":0,"imageUrl":"http://pic.daydaycook.com/production/images/20160811/52702902-6126-4aac-9042-b2f170c96f9c","lable":null,"id":38024,"categoryID":null,"createDate":1465199650000,"imageUrlFlow":null,"area":null,"imageWidth":null,"releasePlat":null,"modifyDate":1481256417000,"releaseDate":"2016-11-08 17:31:50.0","pageInfo":null,"technology":null,"userId":1,"imageHeight":null,"difficulty":null,"displayState":null,"multipleRateUrl":"","name":"早餐","parentCategoryId":null,"shareUrl":"http://api.daydaycook.com.cn:80/daydaycook/h5/recipe/recipedetail.do?id=38024&languageId=3&mainland=1&ver=2.3.3&regionCode=156","category":null,"favorite":false,"favoriteCount":299,"nivoRelId":null}
     */
    private String msg;
    private String code;
    private DataEntity data;

    @Override
    public String toString() {
        return "XiangQing{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public DataEntity getData() {
        return data;
    }

    public class DataEntity {
        @Override
        public String toString() {
            return "DataEntity{" +
                    "clickCount=" + clickCount +
                    ", maketime='" + maketime + '\'' +
                    ", detailsUrl='" + detailsUrl + '\'' +
                    ", taste='" + taste + '\'' +
                    ", systemUser='" + systemUser + '\'' +
                    ", indexUrl='" + indexUrl + '\'' +
                    ", description='" + description + '\'' +
                    ", screeningId='" + screeningId + '\'' +
                    ", videoRelId='" + videoRelId + '\'' +
                    ", source=" + source +
                    ", title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", content='" + content + '\'' +
                    ", shareCount=" + shareCount +
                    ", peopleEat='" + peopleEat + '\'' +
                    ", loadContent='" + loadContent + '\'' +
                    ", deleteStatus=" + deleteStatus +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", lable='" + lable + '\'' +
                    ", id=" + id +
                    ", categoryID='" + categoryID + '\'' +
                    ", createDate='" + createDate + '\'' +
                    ", imageUrlFlow='" + imageUrlFlow + '\'' +
                    ", area='" + area + '\'' +
                    ", imageWidth='" + imageWidth + '\'' +
                    ", releasePlat='" + releasePlat + '\'' +
                    ", modifyDate='" + modifyDate + '\'' +
                    ", releaseDate='" + releaseDate + '\'' +
                    ", pageInfo='" + pageInfo + '\'' +
                    ", technology='" + technology + '\'' +
                    ", userId=" + userId +
                    ", imageHeight='" + imageHeight + '\'' +
                    ", difficulty='" + difficulty + '\'' +
                    ", displayState='" + displayState + '\'' +
                    ", multipleRateUrl='" + multipleRateUrl + '\'' +
                    ", name='" + name + '\'' +
                    ", parentCategoryId='" + parentCategoryId + '\'' +
                    ", shareUrl='" + shareUrl + '\'' +
                    ", category='" + category + '\'' +
                    ", favorite=" + favorite +
                    ", favoriteCount=" + favoriteCount +
                    ", nivoRelId='" + nivoRelId + '\'' +
                    '}';
        }

        /**
         * clickCount : 143777
         * maketime :
         * detailsUrl :
         * taste : null
         * systemUser : null
         * indexUrl :
         * description :
         * screeningId : null
         * videoRelId : null
         * source : {"authorSummary":"生活就要极致","roleId":"1","authorName":"日日煮","authorId":"1","authorImageUrl":"http://pic.daydaycook.com/production/images/20161130/1dfd7c44-ff47-43cd-b7a6-e52770ef41ca"}
         * title : 早餐
         * type : 01
         * content :
         * shareCount : 54
         * peopleEat : null
         * loadContent : http://api.daydaycook.com.cn:80/daydaycook/h5/recipe/loadContent.do?id=38024&languageId=3&mainland=1&ver=2.3.3&regionCode=156
         * deleteStatus : 0
         * imageUrl : http://pic.daydaycook.com/production/images/20160811/52702902-6126-4aac-9042-b2f170c96f9c
         * lable : null
         * id : 38024
         * categoryID : null
         * createDate : 1465199650000
         * imageUrlFlow : null
         * area : null
         * imageWidth : null
         * releasePlat : null
         * modifyDate : 1481256417000
         * releaseDate : 2016-11-08 17:31:50.0
         * pageInfo : null
         * technology : null
         * userId : 1
         * imageHeight : null
         * difficulty : null
         * displayState : null
         * multipleRateUrl :
         * name : 早餐
         * parentCategoryId : null
         * shareUrl : http://api.daydaycook.com.cn:80/daydaycook/h5/recipe/recipedetail.do?id=38024&languageId=3&mainland=1&ver=2.3.3&regionCode=156
         * category : null
         * favorite : false
         * favoriteCount : 299
         * nivoRelId : null
         */

        private int clickCount;
        private String maketime;
        private String detailsUrl;
        private String taste;
        private String systemUser;
        private String indexUrl;
        private String description;
        private String screeningId;
        private String videoRelId;
        private SourceEntity source;
        private String title;
        private String type;
        private String content;
        private int shareCount;
        private String peopleEat;
        private String loadContent;
        private int deleteStatus;
        private String imageUrl;
        private String lable;
        private int id;
        private String categoryID;
        private String createDate;
        private String imageUrlFlow;
        private String area;
        private String imageWidth;
        private String releasePlat;
        private String modifyDate;
        private String releaseDate;
        private String pageInfo;
        private String technology;
        private int userId;
        private String imageHeight;
        private String difficulty;
        private String displayState;
        private String multipleRateUrl;
        private String name;
        private String parentCategoryId;
        private String shareUrl;
        private String category;
        private boolean favorite;
        private int favoriteCount;
        private String nivoRelId;

        public void setClickCount(int clickCount) {
            this.clickCount = clickCount;
        }

        public void setMaketime(String maketime) {
            this.maketime = maketime;
        }

        public void setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
        }

        public void setTaste(String taste) {
            this.taste = taste;
        }

        public void setSystemUser(String systemUser) {
            this.systemUser = systemUser;
        }

        public void setIndexUrl(String indexUrl) {
            this.indexUrl = indexUrl;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setScreeningId(String screeningId) {
            this.screeningId = screeningId;
        }

        public void setVideoRelId(String videoRelId) {
            this.videoRelId = videoRelId;
        }

        public void setSource(SourceEntity source) {
            this.source = source;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public void setPeopleEat(String peopleEat) {
            this.peopleEat = peopleEat;
        }

        public void setLoadContent(String loadContent) {
            this.loadContent = loadContent;
        }

        public void setDeleteStatus(int deleteStatus) {
            this.deleteStatus = deleteStatus;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setLable(String lable) {
            this.lable = lable;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setCategoryID(String categoryID) {
            this.categoryID = categoryID;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public void setImageUrlFlow(String imageUrlFlow) {
            this.imageUrlFlow = imageUrlFlow;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public void setImageWidth(String imageWidth) {
            this.imageWidth = imageWidth;
        }

        public void setReleasePlat(String releasePlat) {
            this.releasePlat = releasePlat;
        }

        public void setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public void setPageInfo(String pageInfo) {
            this.pageInfo = pageInfo;
        }

        public void setTechnology(String technology) {
            this.technology = technology;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public void setImageHeight(String imageHeight) {
            this.imageHeight = imageHeight;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public void setDisplayState(String displayState) {
            this.displayState = displayState;
        }

        public void setMultipleRateUrl(String multipleRateUrl) {
            this.multipleRateUrl = multipleRateUrl;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setParentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public void setNivoRelId(String nivoRelId) {
            this.nivoRelId = nivoRelId;
        }

        public int getClickCount() {
            return clickCount;
        }

        public String getMaketime() {
            return maketime;
        }

        public String getDetailsUrl() {
            return detailsUrl;
        }

        public String getTaste() {
            return taste;
        }

        public String getSystemUser() {
            return systemUser;
        }

        public String getIndexUrl() {
            return indexUrl;
        }

        public String getDescription() {
            return description;
        }

        public String getScreeningId() {
            return screeningId;
        }

        public String getVideoRelId() {
            return videoRelId;
        }

        public SourceEntity getSource() {
            return source;
        }

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }

        public String getContent() {
            return content;
        }

        public int getShareCount() {
            return shareCount;
        }

        public String getPeopleEat() {
            return peopleEat;
        }

        public String getLoadContent() {
            return loadContent;
        }

        public int getDeleteStatus() {
            return deleteStatus;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getLable() {
            return lable;
        }

        public int getId() {
            return id;
        }

        public String getCategoryID() {
            return categoryID;
        }

        public String getCreateDate() {
            return createDate;
        }

        public String getImageUrlFlow() {
            return imageUrlFlow;
        }

        public String getArea() {
            return area;
        }

        public String getImageWidth() {
            return imageWidth;
        }

        public String getReleasePlat() {
            return releasePlat;
        }

        public String getModifyDate() {
            return modifyDate;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public String getPageInfo() {
            return pageInfo;
        }

        public String getTechnology() {
            return technology;
        }

        public int getUserId() {
            return userId;
        }

        public String getImageHeight() {
            return imageHeight;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public String getDisplayState() {
            return displayState;
        }

        public String getMultipleRateUrl() {
            return multipleRateUrl;
        }

        public String getName() {
            return name;
        }

        public String getParentCategoryId() {
            return parentCategoryId;
        }

        public String getShareUrl() {
            return shareUrl;
        }

        public String getCategory() {
            return category;
        }

        public boolean isFavorite() {
            return favorite;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public String getNivoRelId() {
            return nivoRelId;
        }

        public class SourceEntity {
            /**
             * authorSummary : 生活就要极致
             * roleId : 1
             * authorName : 日日煮
             * authorId : 1
             * authorImageUrl : http://pic.daydaycook.com/production/images/20161130/1dfd7c44-ff47-43cd-b7a6-e52770ef41ca
             */
            private String authorSummary;
            private String roleId;
            private String authorName;
            private String authorId;
            private String authorImageUrl;

            public void setAuthorSummary(String authorSummary) {
                this.authorSummary = authorSummary;
            }

            public void setRoleId(String roleId) {
                this.roleId = roleId;
            }

            public void setAuthorName(String authorName) {
                this.authorName = authorName;
            }

            public void setAuthorId(String authorId) {
                this.authorId = authorId;
            }

            public void setAuthorImageUrl(String authorImageUrl) {
                this.authorImageUrl = authorImageUrl;
            }

            public String getAuthorSummary() {
                return authorSummary;
            }

            public String getRoleId() {
                return roleId;
            }

            public String getAuthorName() {
                return authorName;
            }

            public String getAuthorId() {
                return authorId;
            }

            public String getAuthorImageUrl() {
                return authorImageUrl;
            }
        }
    }
}

