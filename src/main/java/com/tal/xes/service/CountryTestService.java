/**
 * 
 */
package com.tal.xes.service;

import org.springframework.stereotype.Service;

import com.tal.xes.domain.CountryModel;

/**   
* @Title: CountryServiceTest.java 
* @Package com.tal.xes.service 
* @Description: TODO
* @author zhangzhiyang
* @date 2018年4月10日 下午7:12:08 
* @version V1.0   
*/
@Service
public interface CountryTestService {
	/**
	 * 
	 * SAVE  test
	 * */
	
	public  void  saveCountry(CountryModel countryModel);

}
