package com.qtyd.model;

import java.io.Serializable;

public class UserWithBLOBs extends User implements Serializable {
    private String purview;

    private String remind;

    private String privacy;

    private static final long serialVersionUID = 1L;

    public String getPurview() {
        return purview;
    }

    public void setPurview(String purview) {
        this.purview = purview == null ? null : purview.trim();
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind == null ? null : remind.trim();
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy == null ? null : privacy.trim();
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
        UserWithBLOBs other = (UserWithBLOBs) that;
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
            && (this.getLogoutStatus() == null ? other.getLogoutStatus() == null : this.getLogoutStatus().equals(other.getLogoutStatus()))
            && (this.getPurview() == null ? other.getPurview() == null : this.getPurview().equals(other.getPurview()))
            && (this.getRemind() == null ? other.getRemind() == null : this.getRemind().equals(other.getRemind()))
            && (this.getPrivacy() == null ? other.getPrivacy() == null : this.getPrivacy().equals(other.getPrivacy()));
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
        result = prime * result + ((getPurview() == null) ? 0 : getPurview().hashCode());
        result = prime * result + ((getRemind() == null) ? 0 : getRemind().hashCode());
        result = prime * result + ((getPrivacy() == null) ? 0 : getPrivacy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", purview=").append(purview);
        sb.append(", remind=").append(remind);
        sb.append(", privacy=").append(privacy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}