package com.tistory.nuridan.restapi.sample.model;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true, includeFieldNames = true)
public class SampleVO implements Serializable {

	private static final long serialVersionUID = -8393820430601561718L;

	//회원ID
	private String sampleId;
	
	//회원명
	private String sampleNm;
}
