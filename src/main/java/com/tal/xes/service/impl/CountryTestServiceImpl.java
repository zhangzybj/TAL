/**
 * 
 */
package com.tal.xes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tal.xes.domain.CountryModel;
import com.tal.xes.mapper.CountryModelMapper;
import com.tal.xes.service.CountryTestService;

/**   
* @Title: CountryTestServiceImpl.java 
* @Package com.tal.xes.service.impl 
* @Description: TODO
* @author zhangzhiyang
* @date 2018年4月10日 下午7:22:19 
* @version V1.0   
*/
@Service
public class CountryTestServiceImpl implements CountryTestService{
	@Autowired
     private CountryModelMapper countryModelMapper;

	/* (non-Javadoc)
	 * @see com.tal.xes.service.CountryTestService#saveCountry(com.tal.xes.entity.CountryModel)
	 */
	@Override
	public void saveCountry(CountryModel countryModel) {
		// TODO Auto-generated method stub
		countryModelMapper.insert(countryModel);
	}
	
}
