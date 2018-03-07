package com.tistory.nuridan.restapi.sample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tistory.nuridan.restapi.config.version.ApiVersion;
import com.tistory.nuridan.restapi.sample.model.SampleVO;

@RestController
public class SampleController {
    

	@ApiVersion(1)
    @RequestMapping(value = "/samples/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleVO postSample(@RequestBody SampleVO vo) throws Exception {
		
		return vo;
    }

	@ApiVersion(1)
    @RequestMapping(value = "/samples/{sampleId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleVO putSample(@RequestBody SampleVO vo, @PathVariable String sampleId) throws Exception {
		
		vo.setSampleId(sampleId);
		
		return vo;
    }
	

	@ApiVersion(1)
    @RequestMapping(value = "/samples/{sampleId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleVO deleteSample(@PathVariable String sampleId) throws Exception {
		
		SampleVO vo = new SampleVO();
		vo.setSampleId(sampleId);
		
		return vo;
    }

	@ApiVersion(1)
    @RequestMapping(value = "/samples/{sampleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleVO getSample(@PathVariable String sampleId) throws Exception {
		
		SampleVO vo = new SampleVO();
		vo.setSampleId(sampleId);
    	
		return vo;
    }
	
}
