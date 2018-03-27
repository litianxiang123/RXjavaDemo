package helloworld.example.com.rxjavademo;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CategoryVoInfo {
    private Long categoryId; //分类Id 注意 约定 id 为  1 的 为精选

    private Integer categoryType; //分类的类型 0 首页

    private String name;//类目名称

    private Integer level;//类目级别

    private Long parentId;//父类目Id 一级目录的 父id 为0

    private String parentTree; //父类目路径从0开始 格式为 0_1

    private Integer gender;//分类性别 0:女 1:男 2:通用

    private String imgUrl;//图片地址

    private String aliCategoryId;//淘宝类目id

    private String aliCategoryName;//淘宝类目名称

    private String aliParentTree;//淘宝类目父类目路径

    private Integer position;//位置

    private Integer categoryStatus;//分类状态 0 新建 1 上线 2下线

    private Long updateTime;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentTree() {
        return parentTree;
    }

    public void setParentTree(String parentTree) {
        this.parentTree = parentTree;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAliCategoryId() {
        return aliCategoryId;
    }

    public void setAliCategoryId(String aliCategoryId) {
        this.aliCategoryId = aliCategoryId;
    }

    public String getAliCategoryName() {
        return aliCategoryName;
    }

    public void setAliCategoryName(String aliCategoryName) {
        this.aliCategoryName = aliCategoryName;
    }

    public String getAliParentTree() {
        return aliParentTree;
    }

    public void setAliParentTree(String aliParentTree) {
        this.aliParentTree = aliParentTree;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
