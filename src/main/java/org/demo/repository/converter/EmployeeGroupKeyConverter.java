/*
 * Created on 20 mars 2014 ( Time 12:14:05 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.repository.converter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.demo.common.Constants;
import org.demo.bean.EmployeeGroupKey;

/**
 * Converter for decode a string to a EmployeeGroupKey
 * 
 * @author Telosys Tools Generator
 *
 */
public class EmployeeGroupKeyConverter implements Converter<String, EmployeeGroupKey>{
	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeGroupKeyConverter.class);
	
	@Override
	public EmployeeGroupKey convert(String stringKey) {
		// TODO FIXME : When implemented this method, the spring-hateoas API had an issue
		// concerning the pipe encoding. The % is encoding twice. You have %257C instead of %7C
		// https://github.com/spring-projects/spring-hateoas/issues/96
		// So you can have %7C in your string. We decode automatically the given string 
		try {
			stringKey = URLDecoder.decode(stringKey,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			LOG.error("Enable to decode the following string : {}",stringKey, e);
		}
		String[] stringKeys = stringKey.split("\\"+Constants.COMPOSITE_KEY_SEPARATOR);

		EmployeeGroupKey compositeKey = new EmployeeGroupKey(stringKeys[0], Short.parseShort(stringKeys[1]));
		return compositeKey;
	}

}