package com.piggsoft.auto.operator.entity;

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
public class Operator extends Model<Operator> {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String code;


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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Operator{" +
			"id=" + id +
			", name=" + name +
			", code=" + code +
			"}";
	}
}
