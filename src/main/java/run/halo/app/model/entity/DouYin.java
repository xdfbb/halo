package run.halo.app.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

@Entity
@Table(name = "DouYin")
public class DouYin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private Long version;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastModified;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean disabled = false;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean deleted = false;

    @Column(unique = true)
    private long douyin_id;
    private String douyin_name;
    private String douyin_code;
    private String orgavatar;
    private Date dt;
    private String video_count;
    private String video_count_up;
    private String fans_count;
    private String fans_count_up;
    private String following_count;
    private String following_count_up;
    private String like_count;
    private String like_count_up;
    private String tname;
    private String tid;
    private String ptid;
    private String catename;
    private String cateid;
    private String douyinrowguid;
    @Column(columnDefinition = "TEXT")
    private String qrCodeUrl;
    private int douyinVideoMonitorState;
    private int douyinCodeMonitorState;
    private int ranking;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public long getDouyin_id() {
        return douyin_id;
    }

    public void setDouyin_id(long douyin_id) {
        this.douyin_id = douyin_id;
    }

    public String getDouyin_name() {
        return douyin_name;
    }

    public void setDouyin_name(String douyin_name) {
        this.douyin_name = douyin_name;
    }

    public String getDouyin_code() {
        return douyin_code;
    }

    public void setDouyin_code(String douyin_code) {
        this.douyin_code = douyin_code;
    }

    public String getOrgavatar() {
        return orgavatar;
    }

    public void setOrgavatar(String orgavatar) {
        this.orgavatar = orgavatar;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getVideo_count() {
        return video_count;
    }

    public void setVideo_count(String video_count) {
        this.video_count = video_count;
    }

    public String getVideo_count_up() {
        return video_count_up;
    }

    public void setVideo_count_up(String video_count_up) {
        this.video_count_up = video_count_up;
    }

    public String getFans_count() {
        return fans_count;
    }

    public void setFans_count(String fans_count) {
        this.fans_count = fans_count;
    }

    public String getFans_count_up() {
        return fans_count_up;
    }

    public void setFans_count_up(String fans_count_up) {
        this.fans_count_up = fans_count_up;
    }

    public String getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(String following_count) {
        this.following_count = following_count;
    }

    public String getFollowing_count_up() {
        return following_count_up;
    }

    public void setFollowing_count_up(String following_count_up) {
        this.following_count_up = following_count_up;
    }

    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }

    public String getLike_count_up() {
        return like_count_up;
    }

    public void setLike_count_up(String like_count_up) {
        this.like_count_up = like_count_up;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPtid() {
        return ptid;
    }

    public void setPtid(String ptid) {
        this.ptid = ptid;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public String getCateid() {
        return cateid;
    }

    public void setCateid(String cateid) {
        this.cateid = cateid;
    }

    public String getDouyinrowguid() {
        return douyinrowguid;
    }

    public void setDouyinrowguid(String douyinrowguid) {
        this.douyinrowguid = douyinrowguid;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public int getDouyinVideoMonitorState() {
        return douyinVideoMonitorState;
    }

    public void setDouyinVideoMonitorState(int douyinVideoMonitorState) {
        this.douyinVideoMonitorState = douyinVideoMonitorState;
    }

    public int getDouyinCodeMonitorState() {
        return douyinCodeMonitorState;
    }

    public void setDouyinCodeMonitorState(int douyinCodeMonitorState) {
        this.douyinCodeMonitorState = douyinCodeMonitorState;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
