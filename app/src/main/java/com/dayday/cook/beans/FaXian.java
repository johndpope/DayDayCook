package com.dayday.cook.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fan on 2016/12/3.
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
public class FaXian implements Serializable {
    @SerializedName("1")
    public List<One> one;
    @SerializedName("2")
    public List<One> two;
    @SerializedName("3")
    public List<One> three;
    @SerializedName("4")
    public List<One> four;
    @SerializedName("5")
    public List<One> five;
    @SerializedName("6")
    public List<One> six;
    @SerializedName("7")
    public List<One> seven;
    @SerializedName("8")
    public List<One> eight;
    @SerializedName("-1")
    public List<One> nine;
    @Override
    public String toString() {
        return "FaXian{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                ", four=" + four +
                ", five=" + five +
                ", six=" + six +
                ", seven=" + seven +
                ", eight=" + eight +
                ", nine=" + nine +
                '}';
    }
    public class One implements Serializable{
        @Override
        public String toString() {
            return "One{" +
                    "recipe_type='" + recipe_type + '\'' +
                    ", locationName='" + locationName + '\'' +
                    ", image_url='" + image_url + '\'' +
                    ", recommend_type='" + recommend_type + '\'' +
                    ", description='" + description + '\'' +
                    ", click_count=" + click_count +
                    ", title='" + title + '\'' +
                    ", rid=" + rid +
                    ", share_count=" + share_count +
                    ", str_date='" + str_date + '\'' +
                    ", recipe_id=" + recipe_id +
                    ", group_id=" + group_id +
                    ", locationId=" + locationId +
                    ", favorite_count=" + favorite_count +
                    ", favorite='" + favorite + '\'' +
                    ", makingTime='" + makingTime + '\'' +
                    '}';
        }
        /**
         * recipe_type : 01
         * locationName : 烘培
         * image_url : http://pic.daydaycook.com/production/images/20160811/a9a6e060-0fec-4738-b9a5-f177c9b42e75
         * recommend_type : 2
         * description :
         * click_count : 79957
         * title : 烘焙
         * rid : 1244
         * share_count : 31
         * str_date : 2016-08-30 10:30:00
         * recipe_id : 38126
         * group_id : 1
         * locationId : 5
         * favorite_count : 684
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
        private int locationId;
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

        public void setLocationId(int locationId) {
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

        public int getLocationId() {
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
