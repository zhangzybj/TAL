/**
 * 
 */
package com.tal.xes.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tal.xes.entity.CountryModel;
import com.tal.xes.service.CountryTestService;

/**   
* @Title: CountryController.java 
* @Package com.tal.xes.web 
* @Description: TODO
* @author zhangzhiyang
* @date 2018年4月10日 下午7:27:24 
* @version V1.0   
*/
 @RestController
public class CountryController {
	 Logger logger =Logger.getLogger(this.getClass());
	 @Autowired
	 private CountryTestService cs;
	 @RequestMapping("/saveConutry")
	 public void  saveCountry( ){
		 logger.info("_____________save method");
		  CountryModel c=new CountryModel();
		  c.setId(new Long("1006"));
		  c.setCountryName("马来西亚");
		  try {
			  cs.saveCountry(c);
			  logger.info(" 保存成功！");
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	 }

}
