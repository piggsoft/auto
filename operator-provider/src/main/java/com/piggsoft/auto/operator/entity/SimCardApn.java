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
@TableName("sim_card_apn")
public class SimCardApn extends Model<SimCardApn> {

    private static final long serialVersionUID = 1L;

	private Long id;
	@TableField("sim_card_id")
	private Long simCardId;
	@TableField("apn_id")
	private Long apnId;
	private Double flow;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSimCardId() {
		return simCardId;
	}

	public void setSimCardId(Long simCardId) {
		this.simCardId = simCardId;
	}

	public Long getApnId() {
		return apnId;
	}

	public void setApnId(Long apnId) {
		this.apnId = apnId;
	}

	public Double getFlow() {
		return flow;
	}

	public void setFlow(Double flow) {
		this.flow = flow;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SimCardApn{" +
			"id=" + id +
			", simCardId=" + simCardId +
			", apnId=" + apnId +
			", flow=" + flow +
			"}";
	}
}
