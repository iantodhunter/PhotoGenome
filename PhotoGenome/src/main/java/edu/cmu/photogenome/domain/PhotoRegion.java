package edu.cmu.photogenome.domain;

// Generated May 24, 2013 3:47:50 PM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Photoregion generated by hbm2java
 */
@Entity
@Table(name = "photoregion")
public class PhotoRegion implements java.io.Serializable {

	private Integer regionId;
	private int photoId;
	private int userId;
	private int shapeId;
	private String regionName;
	private Date photoRegionTimestamp;
	private Boolean photoRegionIsdeleted;
	private String photoRegionOption1;
	private String photoRegionOption2;
	private String photoRegionOption3;
	private String photoRegionOption4;
	private String photoRegionOption5;

	public PhotoRegion() {
	}

	public PhotoRegion(int photoId, int userId, int shapeId,
			Date photoRegionTimestamp) {
		this.photoId = photoId;
		this.userId = userId;
		this.shapeId = shapeId;
		this.photoRegionTimestamp = photoRegionTimestamp;
	}

	public PhotoRegion(int photoId, int userId, int shapeId, String regionName,
			Date photoRegionTimestamp, Boolean photoRegionIsdeleted,
			String photoRegionOption1, String photoRegionOption2,
			String photoRegionOption3, String photoRegionOption4,
			String photoRegionOption5) {
		this.photoId = photoId;
		this.userId = userId;
		this.shapeId = shapeId;
		this.regionName = regionName;
		this.photoRegionTimestamp = photoRegionTimestamp;
		this.photoRegionIsdeleted = photoRegionIsdeleted;
		this.photoRegionOption1 = photoRegionOption1;
		this.photoRegionOption2 = photoRegionOption2;
		this.photoRegionOption3 = photoRegionOption3;
		this.photoRegionOption4 = photoRegionOption4;
		this.photoRegionOption5 = photoRegionOption5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "region_id", unique = true, nullable = false)
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Column(name = "photo_id", nullable = false)
	public int getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "shape_id", nullable = false)
	public int getShapeId() {
		return this.shapeId;
	}

	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	@Column(name = "region_name", length = 200)
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PhotoRegion_timestamp", nullable = false, length = 19)
	public Date getPhotoRegionTimestamp() {
		return this.photoRegionTimestamp;
	}

	public void setPhotoRegionTimestamp(Date photoRegionTimestamp) {
		this.photoRegionTimestamp = photoRegionTimestamp;
	}

	@Column(name = "PhotoRegion_isdeleted")
	public Boolean getPhotoRegionIsdeleted() {
		return this.photoRegionIsdeleted;
	}

	public void setPhotoRegionIsdeleted(Boolean photoRegionIsdeleted) {
		this.photoRegionIsdeleted = photoRegionIsdeleted;
	}

	@Column(name = "PhotoRegion_option1", length = 65535)
	public String getPhotoRegionOption1() {
		return this.photoRegionOption1;
	}

	public void setPhotoRegionOption1(String photoRegionOption1) {
		this.photoRegionOption1 = photoRegionOption1;
	}

	@Column(name = "PhotoRegion_option2", length = 65535)
	public String getPhotoRegionOption2() {
		return this.photoRegionOption2;
	}

	public void setPhotoRegionOption2(String photoRegionOption2) {
		this.photoRegionOption2 = photoRegionOption2;
	}

	@Column(name = "PhotoRegion_option3", length = 65535)
	public String getPhotoRegionOption3() {
		return this.photoRegionOption3;
	}

	public void setPhotoRegionOption3(String photoRegionOption3) {
		this.photoRegionOption3 = photoRegionOption3;
	}

	@Column(name = "PhotoRegion_option4", length = 65535)
	public String getPhotoRegionOption4() {
		return this.photoRegionOption4;
	}

	public void setPhotoRegionOption4(String photoRegionOption4) {
		this.photoRegionOption4 = photoRegionOption4;
	}

	@Column(name = "PhotoRegion_option5", length = 65535)
	public String getPhotoRegionOption5() {
		return this.photoRegionOption5;
	}

	public void setPhotoRegionOption5(String photoRegionOption5) {
		this.photoRegionOption5 = photoRegionOption5;
	}

}
