package com.piggsoft.auto.operator.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author piggsoft
 * @since 2017-08-19
 */
public class Apn extends Model<Apn> {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	@TableField("operator_id")
	private Long operatorId;
	@TableField("real_key")
	private String realKey;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getRealKey() {
		return realKey;
	}

	public void setRealKey(String realKey) {
		this.realKey = realKey;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Apn{" +
			"id=" + id +
			", name=" + name +
			", operatorId=" + operatorId +
			", realKey=" + realKey +
			"}";
	}
}
