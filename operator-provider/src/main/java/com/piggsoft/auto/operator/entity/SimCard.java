package com.piggsoft.auto.operator.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author piggsoft
 * @since 2017-08-19
 */
@TableName("sim_card")
public class SimCard extends Model<SimCard> {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String imsi;
	@TableField("card_no")
	private String cardNo;
	private String iccid;
	@TableField("operator_id")
	private Long operatorId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SimCard{" +
			"id=" + id +
			", imsi=" + imsi +
			", cardNo=" + cardNo +
			", iccid=" + iccid +
			", operatorId=" + operatorId +
			"}";
	}
}
