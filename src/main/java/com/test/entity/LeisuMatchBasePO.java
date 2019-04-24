package com.test.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "leisu_bb_match_base", schema = "db_lottery", catalog = "")
public class LeisuMatchBasePO {
    private long id;
    private Timestamp matchTime;
    private String homeTeamName;
    private String awayTeamName;
    private long homeTeamId;
    private long awayTeamId;
    private String jingcaiId;
    private Short status;
    private String season;
    private Short seasonRound;
    private String leagueName;
    private long leagueId;
    private long matchId;
    private Short homeFullScore;
    private Short awayFullScore;
    private Short homeHalfScore;
    private Short awayHalfScore;
    private Short homeFirstScore;
    private Short awayFirstScore;
    private Short homeSecondScore;
    private Short awaySecondScore;
    private Short homeThirdScore;
    private Short awayThirdScore;
    private Short homeFourthScore;
    private Short awayFourthScore;
    private Short homeOtScore;
    private Short awayOtScore;
    private String animationUrl;
    private Short animationStatus;
    private Short video;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String videoUrl;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "match_time", nullable = false)
    public Timestamp getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Timestamp matchTime) {
        this.matchTime = matchTime;
    }

    @Basic
    @Column(name = "home_team_name", nullable = true, length = 50)
    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    @Basic
    @Column(name = "away_team_name", nullable = true, length = 50)
    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    @Basic
    @Column(name = "home_team_id", nullable = false)
    public long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    @Basic
    @Column(name = "away_team_id", nullable = false)
    public long getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(long awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    @Basic
    @Column(name = "jingcai_id", nullable = true, length = 10)
    public String getJingcaiId() {
        return jingcaiId;
    }

    public void setJingcaiId(String jingcaiId) {
        this.jingcaiId = jingcaiId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "season", nullable = false, length = 20)
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Basic
    @Column(name = "season_round", nullable = true)
    public Short getSeasonRound() {
        return seasonRound;
    }

    public void setSeasonRound(Short seasonRound) {
        this.seasonRound = seasonRound;
    }

    @Basic
    @Column(name = "league_name", nullable = true, length = 30)
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Basic
    @Column(name = "league_id", nullable = false)
    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    @Basic
    @Column(name = "match_id", nullable = false)
    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    @Basic
    @Column(name = "home_full_score", nullable = true)
    public Short getHomeFullScore() {
        return homeFullScore;
    }

    public void setHomeFullScore(Short homeFullScore) {
        this.homeFullScore = homeFullScore;
    }

    @Basic
    @Column(name = "away_full_score", nullable = true)
    public Short getAwayFullScore() {
        return awayFullScore;
    }

    public void setAwayFullScore(Short awayFullScore) {
        this.awayFullScore = awayFullScore;
    }

    @Basic
    @Column(name = "home_half_score", nullable = true)
    public Short getHomeHalfScore() {
        return homeHalfScore;
    }

    public void setHomeHalfScore(Short homeHalfScore) {
        this.homeHalfScore = homeHalfScore;
    }

    @Basic
    @Column(name = "away_half_score", nullable = true)
    public Short getAwayHalfScore() {
        return awayHalfScore;
    }

    public void setAwayHalfScore(Short awayHalfScore) {
        this.awayHalfScore = awayHalfScore;
    }

    @Basic
    @Column(name = "home_first_score", nullable = true)
    public Short getHomeFirstScore() {
        return homeFirstScore;
    }

    public void setHomeFirstScore(Short homeFirstScore) {
        this.homeFirstScore = homeFirstScore;
    }

    @Basic
    @Column(name = "away_first_score", nullable = true)
    public Short getAwayFirstScore() {
        return awayFirstScore;
    }

    public void setAwayFirstScore(Short awayFirstScore) {
        this.awayFirstScore = awayFirstScore;
    }

    @Basic
    @Column(name = "home_second_score", nullable = true)
    public Short getHomeSecondScore() {
        return homeSecondScore;
    }

    public void setHomeSecondScore(Short homeSecondScore) {
        this.homeSecondScore = homeSecondScore;
    }

    @Basic
    @Column(name = "away_second_score", nullable = true)
    public Short getAwaySecondScore() {
        return awaySecondScore;
    }

    public void setAwaySecondScore(Short awaySecondScore) {
        this.awaySecondScore = awaySecondScore;
    }

    @Basic
    @Column(name = "home_third_score", nullable = true)
    public Short getHomeThirdScore() {
        return homeThirdScore;
    }

    public void setHomeThirdScore(Short homeThirdScore) {
        this.homeThirdScore = homeThirdScore;
    }

    @Basic
    @Column(name = "away_third_score", nullable = true)
    public Short getAwayThirdScore() {
        return awayThirdScore;
    }

    public void setAwayThirdScore(Short awayThirdScore) {
        this.awayThirdScore = awayThirdScore;
    }

    @Basic
    @Column(name = "home_fourth_score", nullable = true)
    public Short getHomeFourthScore() {
        return homeFourthScore;
    }

    public void setHomeFourthScore(Short homeFourthScore) {
        this.homeFourthScore = homeFourthScore;
    }

    @Basic
    @Column(name = "away_fourth_score", nullable = true)
    public Short getAwayFourthScore() {
        return awayFourthScore;
    }

    public void setAwayFourthScore(Short awayFourthScore) {
        this.awayFourthScore = awayFourthScore;
    }

    @Basic
    @Column(name = "home_ot_score", nullable = true)
    public Short getHomeOtScore() {
        return homeOtScore;
    }

    public void setHomeOtScore(Short homeOtScore) {
        this.homeOtScore = homeOtScore;
    }

    @Basic
    @Column(name = "away_ot_score", nullable = true)
    public Short getAwayOtScore() {
        return awayOtScore;
    }

    public void setAwayOtScore(Short awayOtScore) {
        this.awayOtScore = awayOtScore;
    }

    @Basic
    @Column(name = "animation_url", nullable = true, length = 100)
    public String getAnimationUrl() {
        return animationUrl;
    }

    public void setAnimationUrl(String animationUrl) {
        this.animationUrl = animationUrl;
    }

    @Basic
    @Column(name = "animation_status", nullable = true)
    public Short getAnimationStatus() {
        return animationStatus;
    }

    public void setAnimationStatus(Short animationStatus) {
        this.animationStatus = animationStatus;
    }

    @Basic
    @Column(name = "video", nullable = true)
    public Short getVideo() {
        return video;
    }

    public void setVideo(Short video) {
        this.video = video;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "video_url", nullable = true, length = 256)
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeisuMatchBasePO that = (LeisuMatchBasePO) o;

        if (id != that.id) return false;
        if (homeTeamId != that.homeTeamId) return false;
        if (awayTeamId != that.awayTeamId) return false;
        if (leagueId != that.leagueId) return false;
        if (matchId != that.matchId) return false;
        if (matchTime != null ? !matchTime.equals(that.matchTime) : that.matchTime != null) return false;
        if (homeTeamName != null ? !homeTeamName.equals(that.homeTeamName) : that.homeTeamName != null) return false;
        if (awayTeamName != null ? !awayTeamName.equals(that.awayTeamName) : that.awayTeamName != null) return false;
        if (jingcaiId != null ? !jingcaiId.equals(that.jingcaiId) : that.jingcaiId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (season != null ? !season.equals(that.season) : that.season != null) return false;
        if (seasonRound != null ? !seasonRound.equals(that.seasonRound) : that.seasonRound != null) return false;
        if (leagueName != null ? !leagueName.equals(that.leagueName) : that.leagueName != null) return false;
        if (homeFullScore != null ? !homeFullScore.equals(that.homeFullScore) : that.homeFullScore != null)
            return false;
        if (awayFullScore != null ? !awayFullScore.equals(that.awayFullScore) : that.awayFullScore != null)
            return false;
        if (homeHalfScore != null ? !homeHalfScore.equals(that.homeHalfScore) : that.homeHalfScore != null)
            return false;
        if (awayHalfScore != null ? !awayHalfScore.equals(that.awayHalfScore) : that.awayHalfScore != null)
            return false;
        if (homeFirstScore != null ? !homeFirstScore.equals(that.homeFirstScore) : that.homeFirstScore != null)
            return false;
        if (awayFirstScore != null ? !awayFirstScore.equals(that.awayFirstScore) : that.awayFirstScore != null)
            return false;
        if (homeSecondScore != null ? !homeSecondScore.equals(that.homeSecondScore) : that.homeSecondScore != null)
            return false;
        if (awaySecondScore != null ? !awaySecondScore.equals(that.awaySecondScore) : that.awaySecondScore != null)
            return false;
        if (homeThirdScore != null ? !homeThirdScore.equals(that.homeThirdScore) : that.homeThirdScore != null)
            return false;
        if (awayThirdScore != null ? !awayThirdScore.equals(that.awayThirdScore) : that.awayThirdScore != null)
            return false;
        if (homeFourthScore != null ? !homeFourthScore.equals(that.homeFourthScore) : that.homeFourthScore != null)
            return false;
        if (awayFourthScore != null ? !awayFourthScore.equals(that.awayFourthScore) : that.awayFourthScore != null)
            return false;
        if (homeOtScore != null ? !homeOtScore.equals(that.homeOtScore) : that.homeOtScore != null) return false;
        if (awayOtScore != null ? !awayOtScore.equals(that.awayOtScore) : that.awayOtScore != null) return false;
        if (animationUrl != null ? !animationUrl.equals(that.animationUrl) : that.animationUrl != null) return false;
        if (animationStatus != null ? !animationStatus.equals(that.animationStatus) : that.animationStatus != null)
            return false;
        if (video != null ? !video.equals(that.video) : that.video != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (videoUrl != null ? !videoUrl.equals(that.videoUrl) : that.videoUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (matchTime != null ? matchTime.hashCode() : 0);
        result = 31 * result + (homeTeamName != null ? homeTeamName.hashCode() : 0);
        result = 31 * result + (awayTeamName != null ? awayTeamName.hashCode() : 0);
        result = 31 * result + (int) (homeTeamId ^ (homeTeamId >>> 32));
        result = 31 * result + (int) (awayTeamId ^ (awayTeamId >>> 32));
        result = 31 * result + (jingcaiId != null ? jingcaiId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (season != null ? season.hashCode() : 0);
        result = 31 * result + (seasonRound != null ? seasonRound.hashCode() : 0);
        result = 31 * result + (leagueName != null ? leagueName.hashCode() : 0);
        result = 31 * result + (int) (leagueId ^ (leagueId >>> 32));
        result = 31 * result + (int) (matchId ^ (matchId >>> 32));
        result = 31 * result + (homeFullScore != null ? homeFullScore.hashCode() : 0);
        result = 31 * result + (awayFullScore != null ? awayFullScore.hashCode() : 0);
        result = 31 * result + (homeHalfScore != null ? homeHalfScore.hashCode() : 0);
        result = 31 * result + (awayHalfScore != null ? awayHalfScore.hashCode() : 0);
        result = 31 * result + (homeFirstScore != null ? homeFirstScore.hashCode() : 0);
        result = 31 * result + (awayFirstScore != null ? awayFirstScore.hashCode() : 0);
        result = 31 * result + (homeSecondScore != null ? homeSecondScore.hashCode() : 0);
        result = 31 * result + (awaySecondScore != null ? awaySecondScore.hashCode() : 0);
        result = 31 * result + (homeThirdScore != null ? homeThirdScore.hashCode() : 0);
        result = 31 * result + (awayThirdScore != null ? awayThirdScore.hashCode() : 0);
        result = 31 * result + (homeFourthScore != null ? homeFourthScore.hashCode() : 0);
        result = 31 * result + (awayFourthScore != null ? awayFourthScore.hashCode() : 0);
        result = 31 * result + (homeOtScore != null ? homeOtScore.hashCode() : 0);
        result = 31 * result + (awayOtScore != null ? awayOtScore.hashCode() : 0);
        result = 31 * result + (animationUrl != null ? animationUrl.hashCode() : 0);
        result = 31 * result + (animationStatus != null ? animationStatus.hashCode() : 0);
        result = 31 * result + (video != null ? video.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (videoUrl != null ? videoUrl.hashCode() : 0);
        return result;
    }
}
