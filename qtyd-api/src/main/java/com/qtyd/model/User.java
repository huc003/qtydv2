package com.qtyd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private Integer typeId;

    private Integer order;

    private String username;

    private String password;

    private String paypassword;

    private Integer islock;

    private String inviteUserid;

    private BigDecimal inviteMoney;

    private Byte realStatus;

    private String cardType;

    private String cardId;

    private String cardPic1;

    private String cardPic2;

    private String nation;

    private String realname;

    private Integer investIntegral;

    private Integer integral;

    private Integer status;

    private Integer avatarStatus;

    private Byte emailStatus;

    private Byte phoneStatus;

    private Integer videoStatus;

    private Integer sceneStatus;

    private String email;

    private Byte sex;

    private String litpic;

    private String tel;

    private String phone;

    private String qq;

    private String wangwang;

    private String emailTemp;

    private Boolean emailStatusTemp;

    private Date birthday;

    private String province;

    private String city;

    private Integer area;

    private String address;

    private Integer logintime;

    private Integer addtime;

    private String addip;

    private Integer uptime;

    private String upip;

    private Integer lasttime;

    private String lastip;

    private Integer chongzuId;

    private BigDecimal czMoney;

    private BigDecimal czCash;

    private Integer chongzuNewId;

    private Integer idcardpic;

    private String job;

    private Byte isCompany;

    private String reginvitename;

    private Byte regSource;

    private String trackid;

    private Byte sinaStatus;

    private String sinaUid;

    private String nickName;

    private Integer realnameTime;

    private String regPort;

    private String realPort;

    private String realPage;

    private String addipProvince;

    private String phoneProvince;

    private Byte isBorrowTender;

    private Byte isAccountRecharge;

    private Byte isPaymentPassword;

    private Byte withhold;

    private Byte isBirthdayRemind;

    private Integer tracktypeId;

    private Byte isLazyTender;

    private Byte deviceStatus;

    private String taskMarker;

    private String platcust;

    private Byte xiamenStatus;

    private Byte isPaymentPasswordSina;

    private Byte logoutStatus;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public String getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(String inviteUserid) {
        this.inviteUserid = inviteUserid == null ? null : inviteUserid.trim();
    }

    public BigDecimal getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(BigDecimal inviteMoney) {
        this.inviteMoney = inviteMoney;
    }

    public Byte getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(Byte realStatus) {
        this.realStatus = realStatus;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getCardPic1() {
        return cardPic1;
    }

    public void setCardPic1(String cardPic1) {
        this.cardPic1 = cardPic1 == null ? null : cardPic1.trim();
    }

    public String getCardPic2() {
        return cardPic2;
    }

    public void setCardPic2(String cardPic2) {
        this.cardPic2 = cardPic2 == null ? null : cardPic2.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getInvestIntegral() {
        return investIntegral;
    }

    public void setInvestIntegral(Integer investIntegral) {
        this.investIntegral = investIntegral;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAvatarStatus() {
        return avatarStatus;
    }

    public void setAvatarStatus(Integer avatarStatus) {
        this.avatarStatus = avatarStatus;
    }

    public Byte getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Byte emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Byte getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Byte phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWangwang() {
        return wangwang;
    }

    public void setWangwang(String wangwang) {
        this.wangwang = wangwang == null ? null : wangwang.trim();
    }

    public String getEmailTemp() {
        return emailTemp;
    }

    public void setEmailTemp(String emailTemp) {
        this.emailTemp = emailTemp == null ? null : emailTemp.trim();
    }

    public Boolean getEmailStatusTemp() {
        return emailStatusTemp;
    }

    public void setEmailStatusTemp(Boolean emailStatusTemp) {
        this.emailStatusTemp = emailStatusTemp;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip == null ? null : addip.trim();
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public String getUpip() {
        return upip;
    }

    public void setUpip(String upip) {
        this.upip = upip == null ? null : upip.trim();
    }

    public Integer getLasttime() {
        return lasttime;
    }

    public void setLasttime(Integer lasttime) {
        this.lasttime = lasttime;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip == null ? null : lastip.trim();
    }

    public Integer getChongzuId() {
        return chongzuId;
    }

    public void setChongzuId(Integer chongzuId) {
        this.chongzuId = chongzuId;
    }

    public BigDecimal getCzMoney() {
        return czMoney;
    }

    public void setCzMoney(BigDecimal czMoney) {
        this.czMoney = czMoney;
    }

    public BigDecimal getCzCash() {
        return czCash;
    }

    public void setCzCash(BigDecimal czCash) {
        this.czCash = czCash;
    }

    public Integer getChongzuNewId() {
        return chongzuNewId;
    }

    public void setChongzuNewId(Integer chongzuNewId) {
        this.chongzuNewId = chongzuNewId;
    }

    public Integer getIdcardpic() {
        return idcardpic;
    }

    public void setIdcardpic(Integer idcardpic) {
        this.idcardpic = idcardpic;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Byte getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(Byte isCompany) {
        this.isCompany = isCompany;
    }

    public String getReginvitename() {
        return reginvitename;
    }

    public void setReginvitename(String reginvitename) {
        this.reginvitename = reginvitename == null ? null : reginvitename.trim();
    }

    public Byte getRegSource() {
        return regSource;
    }

    public void setRegSource(Byte regSource) {
        this.regSource = regSource;
    }

    public String getTrackid() {
        return trackid;
    }

    public void setTrackid(String trackid) {
        this.trackid = trackid == null ? null : trackid.trim();
    }

    public Byte getSinaStatus() {
        return sinaStatus;
    }

    public void setSinaStatus(Byte sinaStatus) {
        this.sinaStatus = sinaStatus;
    }

    public String getSinaUid() {
        return sinaUid;
    }

    public void setSinaUid(String sinaUid) {
        this.sinaUid = sinaUid == null ? null : sinaUid.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getRealnameTime() {
        return realnameTime;
    }

    public void setRealnameTime(Integer realnameTime) {
        this.realnameTime = realnameTime;
    }

    public String getRegPort() {
        return regPort;
    }

    public void setRegPort(String regPort) {
        this.regPort = regPort == null ? null : regPort.trim();
    }

    public String getRealPort() {
        return realPort;
    }

    public void setRealPort(String realPort) {
        this.realPort = realPort == null ? null : realPort.trim();
    }

    public String getRealPage() {
        return realPage;
    }

    public void setRealPage(String realPage) {
        this.realPage = realPage == null ? null : realPage.trim();
    }

    public String getAddipProvince() {
        return addipProvince;
    }

    public void setAddipProvince(String addipProvince) {
        this.addipProvince = addipProvince == null ? null : addipProvince.trim();
    }

    public String getPhoneProvince() {
        return phoneProvince;
    }

    public void setPhoneProvince(String phoneProvince) {
        this.phoneProvince = phoneProvince == null ? null : phoneProvince.trim();
    }

    public Byte getIsBorrowTender() {
        return isBorrowTender;
    }

    public void setIsBorrowTender(Byte isBorrowTender) {
        this.isBorrowTender = isBorrowTender;
    }

    public Byte getIsAccountRecharge() {
        return isAccountRecharge;
    }

    public void setIsAccountRecharge(Byte isAccountRecharge) {
        this.isAccountRecharge = isAccountRecharge;
    }

    public Byte getIsPaymentPassword() {
        return isPaymentPassword;
    }

    public void setIsPaymentPassword(Byte isPaymentPassword) {
        this.isPaymentPassword = isPaymentPassword;
    }

    public Byte getWithhold() {
        return withhold;
    }

    public void setWithhold(Byte withhold) {
        this.withhold = withhold;
    }

    public Byte getIsBirthdayRemind() {
        return isBirthdayRemind;
    }

    public void setIsBirthdayRemind(Byte isBirthdayRemind) {
        this.isBirthdayRemind = isBirthdayRemind;
    }

    public Integer getTracktypeId() {
        return tracktypeId;
    }

    public void setTracktypeId(Integer tracktypeId) {
        this.tracktypeId = tracktypeId;
    }

    public Byte getIsLazyTender() {
        return isLazyTender;
    }

    public void setIsLazyTender(Byte isLazyTender) {
        this.isLazyTender = isLazyTender;
    }

    public Byte getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Byte deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getTaskMarker() {
        return taskMarker;
    }

    public void setTaskMarker(String taskMarker) {
        this.taskMarker = taskMarker == null ? null : taskMarker.trim();
    }

    public String getPlatcust() {
        return platcust;
    }

    public void setPlatcust(String platcust) {
        this.platcust = platcust == null ? null : platcust.trim();
    }

    public Byte getXiamenStatus() {
        return xiamenStatus;
    }

    public void setXiamenStatus(Byte xiamenStatus) {
        this.xiamenStatus = xiamenStatus;
    }

    public Byte getIsPaymentPasswordSina() {
        return isPaymentPasswordSina;
    }

    public void setIsPaymentPasswordSina(Byte isPaymentPasswordSina) {
        this.isPaymentPasswordSina = isPaymentPasswordSina;
    }

    public Byte getLogoutStatus() {
        return logoutStatus;
    }

    public void setLogoutStatus(Byte logoutStatus) {
        this.logoutStatus = logoutStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPaypassword() == null ? other.getPaypassword() == null : this.getPaypassword().equals(other.getPaypassword()))
            && (this.getIslock() == null ? other.getIslock() == null : this.getIslock().equals(other.getIslock()))
            && (this.getInviteUserid() == null ? other.getInviteUserid() == null : this.getInviteUserid().equals(other.getInviteUserid()))
            && (this.getInviteMoney() == null ? other.getInviteMoney() == null : this.getInviteMoney().equals(other.getInviteMoney()))
            && (this.getRealStatus() == null ? other.getRealStatus() == null : this.getRealStatus().equals(other.getRealStatus()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getCardPic1() == null ? other.getCardPic1() == null : this.getCardPic1().equals(other.getCardPic1()))
            && (this.getCardPic2() == null ? other.getCardPic2() == null : this.getCardPic2().equals(other.getCardPic2()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getInvestIntegral() == null ? other.getInvestIntegral() == null : this.getInvestIntegral().equals(other.getInvestIntegral()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAvatarStatus() == null ? other.getAvatarStatus() == null : this.getAvatarStatus().equals(other.getAvatarStatus()))
            && (this.getEmailStatus() == null ? other.getEmailStatus() == null : this.getEmailStatus().equals(other.getEmailStatus()))
            && (this.getPhoneStatus() == null ? other.getPhoneStatus() == null : this.getPhoneStatus().equals(other.getPhoneStatus()))
            && (this.getVideoStatus() == null ? other.getVideoStatus() == null : this.getVideoStatus().equals(other.getVideoStatus()))
            && (this.getSceneStatus() == null ? other.getSceneStatus() == null : this.getSceneStatus().equals(other.getSceneStatus()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getLitpic() == null ? other.getLitpic() == null : this.getLitpic().equals(other.getLitpic()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWangwang() == null ? other.getWangwang() == null : this.getWangwang().equals(other.getWangwang()))
            && (this.getEmailTemp() == null ? other.getEmailTemp() == null : this.getEmailTemp().equals(other.getEmailTemp()))
            && (this.getEmailStatusTemp() == null ? other.getEmailStatusTemp() == null : this.getEmailStatusTemp().equals(other.getEmailStatusTemp()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLogintime() == null ? other.getLogintime() == null : this.getLogintime().equals(other.getLogintime()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()))
            && (this.getAddip() == null ? other.getAddip() == null : this.getAddip().equals(other.getAddip()))
            && (this.getUptime() == null ? other.getUptime() == null : this.getUptime().equals(other.getUptime()))
            && (this.getUpip() == null ? other.getUpip() == null : this.getUpip().equals(other.getUpip()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getLastip() == null ? other.getLastip() == null : this.getLastip().equals(other.getLastip()))
            && (this.getChongzuId() == null ? other.getChongzuId() == null : this.getChongzuId().equals(other.getChongzuId()))
            && (this.getCzMoney() == null ? other.getCzMoney() == null : this.getCzMoney().equals(other.getCzMoney()))
            && (this.getCzCash() == null ? other.getCzCash() == null : this.getCzCash().equals(other.getCzCash()))
            && (this.getChongzuNewId() == null ? other.getChongzuNewId() == null : this.getChongzuNewId().equals(other.getChongzuNewId()))
            && (this.getIdcardpic() == null ? other.getIdcardpic() == null : this.getIdcardpic().equals(other.getIdcardpic()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getIsCompany() == null ? other.getIsCompany() == null : this.getIsCompany().equals(other.getIsCompany()))
            && (this.getReginvitename() == null ? other.getReginvitename() == null : this.getReginvitename().equals(other.getReginvitename()))
            && (this.getRegSource() == null ? other.getRegSource() == null : this.getRegSource().equals(other.getRegSource()))
            && (this.getTrackid() == null ? other.getTrackid() == null : this.getTrackid().equals(other.getTrackid()))
            && (this.getSinaStatus() == null ? other.getSinaStatus() == null : this.getSinaStatus().equals(other.getSinaStatus()))
            && (this.getSinaUid() == null ? other.getSinaUid() == null : this.getSinaUid().equals(other.getSinaUid()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getRealnameTime() == null ? other.getRealnameTime() == null : this.getRealnameTime().equals(other.getRealnameTime()))
            && (this.getRegPort() == null ? other.getRegPort() == null : this.getRegPort().equals(other.getRegPort()))
            && (this.getRealPort() == null ? other.getRealPort() == null : this.getRealPort().equals(other.getRealPort()))
            && (this.getRealPage() == null ? other.getRealPage() == null : this.getRealPage().equals(other.getRealPage()))
            && (this.getAddipProvince() == null ? other.getAddipProvince() == null : this.getAddipProvince().equals(other.getAddipProvince()))
            && (this.getPhoneProvince() == null ? other.getPhoneProvince() == null : this.getPhoneProvince().equals(other.getPhoneProvince()))
            && (this.getIsBorrowTender() == null ? other.getIsBorrowTender() == null : this.getIsBorrowTender().equals(other.getIsBorrowTender()))
            && (this.getIsAccountRecharge() == null ? other.getIsAccountRecharge() == null : this.getIsAccountRecharge().equals(other.getIsAccountRecharge()))
            && (this.getIsPaymentPassword() == null ? other.getIsPaymentPassword() == null : this.getIsPaymentPassword().equals(other.getIsPaymentPassword()))
            && (this.getWithhold() == null ? other.getWithhold() == null : this.getWithhold().equals(other.getWithhold()))
            && (this.getIsBirthdayRemind() == null ? other.getIsBirthdayRemind() == null : this.getIsBirthdayRemind().equals(other.getIsBirthdayRemind()))
            && (this.getTracktypeId() == null ? other.getTracktypeId() == null : this.getTracktypeId().equals(other.getTracktypeId()))
            && (this.getIsLazyTender() == null ? other.getIsLazyTender() == null : this.getIsLazyTender().equals(other.getIsLazyTender()))
            && (this.getDeviceStatus() == null ? other.getDeviceStatus() == null : this.getDeviceStatus().equals(other.getDeviceStatus()))
            && (this.getTaskMarker() == null ? other.getTaskMarker() == null : this.getTaskMarker().equals(other.getTaskMarker()))
            && (this.getPlatcust() == null ? other.getPlatcust() == null : this.getPlatcust().equals(other.getPlatcust()))
            && (this.getXiamenStatus() == null ? other.getXiamenStatus() == null : this.getXiamenStatus().equals(other.getXiamenStatus()))
            && (this.getIsPaymentPasswordSina() == null ? other.getIsPaymentPasswordSina() == null : this.getIsPaymentPasswordSina().equals(other.getIsPaymentPasswordSina()))
            && (this.getLogoutStatus() == null ? other.getLogoutStatus() == null : this.getLogoutStatus().equals(other.getLogoutStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPaypassword() == null) ? 0 : getPaypassword().hashCode());
        result = prime * result + ((getIslock() == null) ? 0 : getIslock().hashCode());
        result = prime * result + ((getInviteUserid() == null) ? 0 : getInviteUserid().hashCode());
        result = prime * result + ((getInviteMoney() == null) ? 0 : getInviteMoney().hashCode());
        result = prime * result + ((getRealStatus() == null) ? 0 : getRealStatus().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getCardPic1() == null) ? 0 : getCardPic1().hashCode());
        result = prime * result + ((getCardPic2() == null) ? 0 : getCardPic2().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getInvestIntegral() == null) ? 0 : getInvestIntegral().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAvatarStatus() == null) ? 0 : getAvatarStatus().hashCode());
        result = prime * result + ((getEmailStatus() == null) ? 0 : getEmailStatus().hashCode());
        result = prime * result + ((getPhoneStatus() == null) ? 0 : getPhoneStatus().hashCode());
        result = prime * result + ((getVideoStatus() == null) ? 0 : getVideoStatus().hashCode());
        result = prime * result + ((getSceneStatus() == null) ? 0 : getSceneStatus().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getLitpic() == null) ? 0 : getLitpic().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWangwang() == null) ? 0 : getWangwang().hashCode());
        result = prime * result + ((getEmailTemp() == null) ? 0 : getEmailTemp().hashCode());
        result = prime * result + ((getEmailStatusTemp() == null) ? 0 : getEmailStatusTemp().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLogintime() == null) ? 0 : getLogintime().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
        result = prime * result + ((getAddip() == null) ? 0 : getAddip().hashCode());
        result = prime * result + ((getUptime() == null) ? 0 : getUptime().hashCode());
        result = prime * result + ((getUpip() == null) ? 0 : getUpip().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getLastip() == null) ? 0 : getLastip().hashCode());
        result = prime * result + ((getChongzuId() == null) ? 0 : getChongzuId().hashCode());
        result = prime * result + ((getCzMoney() == null) ? 0 : getCzMoney().hashCode());
        result = prime * result + ((getCzCash() == null) ? 0 : getCzCash().hashCode());
        result = prime * result + ((getChongzuNewId() == null) ? 0 : getChongzuNewId().hashCode());
        result = prime * result + ((getIdcardpic() == null) ? 0 : getIdcardpic().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getIsCompany() == null) ? 0 : getIsCompany().hashCode());
        result = prime * result + ((getReginvitename() == null) ? 0 : getReginvitename().hashCode());
        result = prime * result + ((getRegSource() == null) ? 0 : getRegSource().hashCode());
        result = prime * result + ((getTrackid() == null) ? 0 : getTrackid().hashCode());
        result = prime * result + ((getSinaStatus() == null) ? 0 : getSinaStatus().hashCode());
        result = prime * result + ((getSinaUid() == null) ? 0 : getSinaUid().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getRealnameTime() == null) ? 0 : getRealnameTime().hashCode());
        result = prime * result + ((getRegPort() == null) ? 0 : getRegPort().hashCode());
        result = prime * result + ((getRealPort() == null) ? 0 : getRealPort().hashCode());
        result = prime * result + ((getRealPage() == null) ? 0 : getRealPage().hashCode());
        result = prime * result + ((getAddipProvince() == null) ? 0 : getAddipProvince().hashCode());
        result = prime * result + ((getPhoneProvince() == null) ? 0 : getPhoneProvince().hashCode());
        result = prime * result + ((getIsBorrowTender() == null) ? 0 : getIsBorrowTender().hashCode());
        result = prime * result + ((getIsAccountRecharge() == null) ? 0 : getIsAccountRecharge().hashCode());
        result = prime * result + ((getIsPaymentPassword() == null) ? 0 : getIsPaymentPassword().hashCode());
        result = prime * result + ((getWithhold() == null) ? 0 : getWithhold().hashCode());
        result = prime * result + ((getIsBirthdayRemind() == null) ? 0 : getIsBirthdayRemind().hashCode());
        result = prime * result + ((getTracktypeId() == null) ? 0 : getTracktypeId().hashCode());
        result = prime * result + ((getIsLazyTender() == null) ? 0 : getIsLazyTender().hashCode());
        result = prime * result + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        result = prime * result + ((getTaskMarker() == null) ? 0 : getTaskMarker().hashCode());
        result = prime * result + ((getPlatcust() == null) ? 0 : getPlatcust().hashCode());
        result = prime * result + ((getXiamenStatus() == null) ? 0 : getXiamenStatus().hashCode());
        result = prime * result + ((getIsPaymentPasswordSina() == null) ? 0 : getIsPaymentPasswordSina().hashCode());
        result = prime * result + ((getLogoutStatus() == null) ? 0 : getLogoutStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", typeId=").append(typeId);
        sb.append(", order=").append(order);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", paypassword=").append(paypassword);
        sb.append(", islock=").append(islock);
        sb.append(", inviteUserid=").append(inviteUserid);
        sb.append(", inviteMoney=").append(inviteMoney);
        sb.append(", realStatus=").append(realStatus);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardId=").append(cardId);
        sb.append(", cardPic1=").append(cardPic1);
        sb.append(", cardPic2=").append(cardPic2);
        sb.append(", nation=").append(nation);
        sb.append(", realname=").append(realname);
        sb.append(", investIntegral=").append(investIntegral);
        sb.append(", integral=").append(integral);
        sb.append(", status=").append(status);
        sb.append(", avatarStatus=").append(avatarStatus);
        sb.append(", emailStatus=").append(emailStatus);
        sb.append(", phoneStatus=").append(phoneStatus);
        sb.append(", videoStatus=").append(videoStatus);
        sb.append(", sceneStatus=").append(sceneStatus);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", litpic=").append(litpic);
        sb.append(", tel=").append(tel);
        sb.append(", phone=").append(phone);
        sb.append(", qq=").append(qq);
        sb.append(", wangwang=").append(wangwang);
        sb.append(", emailTemp=").append(emailTemp);
        sb.append(", emailStatusTemp=").append(emailStatusTemp);
        sb.append(", birthday=").append(birthday);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", address=").append(address);
        sb.append(", logintime=").append(logintime);
        sb.append(", addtime=").append(addtime);
        sb.append(", addip=").append(addip);
        sb.append(", uptime=").append(uptime);
        sb.append(", upip=").append(upip);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", lastip=").append(lastip);
        sb.append(", chongzuId=").append(chongzuId);
        sb.append(", czMoney=").append(czMoney);
        sb.append(", czCash=").append(czCash);
        sb.append(", chongzuNewId=").append(chongzuNewId);
        sb.append(", idcardpic=").append(idcardpic);
        sb.append(", job=").append(job);
        sb.append(", isCompany=").append(isCompany);
        sb.append(", reginvitename=").append(reginvitename);
        sb.append(", regSource=").append(regSource);
        sb.append(", trackid=").append(trackid);
        sb.append(", sinaStatus=").append(sinaStatus);
        sb.append(", sinaUid=").append(sinaUid);
        sb.append(", nickName=").append(nickName);
        sb.append(", realnameTime=").append(realnameTime);
        sb.append(", regPort=").append(regPort);
        sb.append(", realPort=").append(realPort);
        sb.append(", realPage=").append(realPage);
        sb.append(", addipProvince=").append(addipProvince);
        sb.append(", phoneProvince=").append(phoneProvince);
        sb.append(", isBorrowTender=").append(isBorrowTender);
        sb.append(", isAccountRecharge=").append(isAccountRecharge);
        sb.append(", isPaymentPassword=").append(isPaymentPassword);
        sb.append(", withhold=").append(withhold);
        sb.append(", isBirthdayRemind=").append(isBirthdayRemind);
        sb.append(", tracktypeId=").append(tracktypeId);
        sb.append(", isLazyTender=").append(isLazyTender);
        sb.append(", deviceStatus=").append(deviceStatus);
        sb.append(", taskMarker=").append(taskMarker);
        sb.append(", platcust=").append(platcust);
        sb.append(", xiamenStatus=").append(xiamenStatus);
        sb.append(", isPaymentPasswordSina=").append(isPaymentPasswordSina);
        sb.append(", logoutStatus=").append(logoutStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}