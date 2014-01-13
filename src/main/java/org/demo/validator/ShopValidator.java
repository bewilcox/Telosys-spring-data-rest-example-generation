/*
 * Created on 13 janv. 2014 ( Time 12:02:48 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.validator;

import org.demo.bean.Shop ;
import org.demo.common.MessagesKeys;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Validator for entity Shop
 * 
 * @author Telosys Tools Generator
 *
 */
public class ShopValidator extends AbstractValidator<Shop>{

    @Override
    public void validateEntity(Shop entity, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "code", MessagesKeys.ID_MUST_DEFINE);

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryCode", MessagesKeys.NOT_BLANK);

    }
}