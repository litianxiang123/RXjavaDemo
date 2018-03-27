package helloworld.example.com.rxjavademo;

/**
 * Created by 李天祥 on 2018/3/22.
 */

public class SearchInfo {

    private Long numIid; //淘宝商品Id

    private String title;//商品标题

    private String pictUrl;//商品主图

    private String smallImages;//商品小图

    private String reservePrice;//商品一口价格

    private String zkFinalPrice;//商品折扣价格

    private Integer userType;//卖家类型，0表示集市，1表示商城

    private String state;//商品所在省

    private String provcity;//宝贝所在地

    private String itemUrl;//商品详情页链接地址

    private String nick;//卖家昵称

    private Long sellerId;//卖家id

    private String shopName;//店铺名称

    private Long volume;//30天销量

    private Integer mall;//是否天猫宝贝. 1 是, 0 不是

    private String postFee;//平邮邮费. 单位:元,精确到分

    private Integer num;//库存数量

    private String price;//商品优惠券前的价格 或者 商品优惠价格(PC端),可能为空. 单位:元,精确到分。当PC端访问,且当前时间落在price_start_time到price_end_time区间内时使用该价格

    private String promotedService;//消保类型，多个类型以,分割。可取以下值： 2：假一赔三；4：7天无理由退换货；

    private Long cid;//商品叶子类目

    private String cname;//淘宝商品类目名称

    private Long priceStartTime;//PC端商品优惠价格开始时间。如果当前没有PC端优惠，该字段为空

    private Long priceEndTime;//PC端商品优惠价格结束时间。如果当前没有PC端优惠，该字段为空

    private Long priceWapStartTime;//手机端商品优惠价格开始时间。如果当前没有手机端优惠，该字段为空

    private Long priceWapEndTime;//手机端商品优惠价格结束时间。如果当前没有手机端优惠，该字段为空

    private String priceWap;//手机端商品优惠价格. 可能为空。单位:元,精确到分。当手机端访问且当前时间落在price_wap_start_time到price_wap_end_time之间的话，使用该价格。如果改价格为空，请使用reserve_price.

    private String openIid;//商品混淆ID

    private Long juStart;//聚划算活动开始时间，1970年到现在的毫秒数。如果不是聚划算商品，该值为空

    private Long juEnd;//聚划算活动结束时间，1970年到现在的毫秒数。如果不是聚划算商品，该值为空

    private Long juPrice;//聚划算参团价格，如果不是聚划算商品，该值为空

    private Integer juItem;//是否是聚划算商品,如果查询参数的fields里没有设置ju条件，该值为空

    private String itemDescription;//宝贝描述（推荐理由）

    private String taobaokeLinks;//淘宝客链接

    private String tkRate;//淘客佣金比例，比如：750 表示 7.50%

    private Integer istk;//是否淘客商品

    private String commission;//佣金

    private String platform;//平台名称 天猫|淘宝

    private String couponId;//优惠券Id

    private Integer couponTotalCount;//优惠券数量

    private String commissionRate;//佣金比率(%)

    private Integer couponRemainCount;//优惠券剩余数量

    private String couponInfo;//优惠券面额

    private String couponStartTime;//优惠券开始时间

    private String couponEndTime;//优惠券结束时间

    private String couponUrl;//优惠券url

    private String couponClickUrl;//推广链接url

    private Long createTime;//创建时间

    private Long userCollectionId;//判断登录用户是否收藏

    private Integer importType;//导入的商品类型  0 有优惠券  1 无劵 折扣价  2 一口价

    private String presentPrice;//现价  如果有劵  就是劵后价格，如果没有券有折扣就是折扣价，如果没有券也没有折扣就是一口价 ，如果没有折扣没有劵也没有一口价 就是原价

    private String shareUrl;//分享链接

    private String phonePlatform;

    public Long getNumIid() {
        return numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl == null ? null : pictUrl.trim();
    }

    public String getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(String smallImages) {
        this.smallImages = smallImages == null ? null : smallImages.trim();
    }

    public String getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(String reservePrice) {
        this.reservePrice = reservePrice == null ? null : reservePrice.trim();
    }

    public String getZkFinalPrice() {
        return zkFinalPrice;
    }

    public void setZkFinalPrice(String zkFinalPrice) {
        this.zkFinalPrice = zkFinalPrice == null ? null : zkFinalPrice.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProvcity() {
        return provcity;
    }

    public void setProvcity(String provcity) {
        this.provcity = provcity == null ? null : provcity.trim();
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Integer getMall() {
        return mall;
    }

    public void setMall(Integer mall) {
        this.mall = mall;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPromotedService() {
        return promotedService;
    }

    public void setPromotedService(String promotedService) {
        this.promotedService = promotedService == null ? null : promotedService.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Long getPriceStartTime() {
        return priceStartTime;
    }

    public void setPriceStartTime(Long priceStartTime) {
        this.priceStartTime = priceStartTime;
    }

    public Long getPriceEndTime() {
        return priceEndTime;
    }

    public void setPriceEndTime(Long priceEndTime) {
        this.priceEndTime = priceEndTime;
    }

    public Long getPriceWapStartTime() {
        return priceWapStartTime;
    }

    public void setPriceWapStartTime(Long priceWapStartTime) {
        this.priceWapStartTime = priceWapStartTime;
    }

    public Long getPriceWapEndTime() {
        return priceWapEndTime;
    }

    public void setPriceWapEndTime(Long priceWapEndTime) {
        this.priceWapEndTime = priceWapEndTime;
    }

    public String getPriceWap() {
        return priceWap;
    }

    public void setPriceWap(String priceWap) {
        this.priceWap = priceWap == null ? null : priceWap.trim();
    }

    public String getOpenIid() {
        return openIid;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid == null ? null : openIid.trim();
    }

    public Long getJuStart() {
        return juStart;
    }

    public void setJuStart(Long juStart) {
        this.juStart = juStart;
    }

    public Long getJuEnd() {
        return juEnd;
    }

    public void setJuEnd(Long juEnd) {
        this.juEnd = juEnd;
    }

    public Long getJuPrice() {
        return juPrice;
    }

    public void setJuPrice(Long juPrice) {
        this.juPrice = juPrice;
    }

    public Integer getJuItem() {
        return juItem;
    }

    public void setJuItem(Integer juItem) {
        this.juItem = juItem;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription == null ? null : itemDescription.trim();
    }

    public String getTaobaokeLinks() {
        return taobaokeLinks;
    }

    public void setTaobaokeLinks(String taobaokeLinks) {
        this.taobaokeLinks = taobaokeLinks == null ? null : taobaokeLinks.trim();
    }

    public String getTkRate() {
        return tkRate;
    }

    public void setTkRate(String tkRate) {
        this.tkRate = tkRate == null ? null : tkRate.trim();
    }

    public Integer getIstk() {
        return istk;
    }

    public void setIstk(Integer istk) {
        this.istk = istk;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission == null ? null : commission.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Integer getCouponTotalCount() {
        return couponTotalCount;
    }

    public void setCouponTotalCount(Integer couponTotalCount) {
        this.couponTotalCount = couponTotalCount;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate == null ? null : commissionRate.trim();
    }

    public Integer getCouponRemainCount() {
        return couponRemainCount;
    }

    public void setCouponRemainCount(Integer couponRemainCount) {
        this.couponRemainCount = couponRemainCount;
    }

    public String getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    public String getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime == null ? null : couponStartTime.trim();
    }

    public String getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime == null ? null : couponEndTime.trim();
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl == null ? null : couponUrl.trim();
    }

    public String getCouponClickUrl() {
        return couponClickUrl;
    }

    public void setCouponClickUrl(String couponClickUrl) {
        this.couponClickUrl = couponClickUrl == null ? null : couponClickUrl.trim();
    }

    public Integer getImportType() {
        return importType;
    }

    public void setImportType(Integer importType) {
        this.importType = importType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(Long userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(String presentPrice) {
        this.presentPrice = presentPrice;
    }

    public String getPhonePlatform() {
        return phonePlatform;
    }

    public void setPhonePlatform(String phonePlatform) {
        this.phonePlatform = phonePlatform;
    }

}
