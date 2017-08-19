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
public class Package extends Model<Package> {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double price;
	private Double size;
	@TableField("operator_id")
	private Long operatorId;


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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
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
		return "Package{" +
			"id=" + id +
			", name=" + name +
			", price=" + price +
			", size=" + size +
			", operatorId=" + operatorId +
			"}";
	}
}
