/*
 * Created on 13 janv. 2014 ( Time 12:02:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.validator;

import org.demo.bean.Author ;
import org.demo.common.MessagesKeys;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Validator for entity Author
 * 
 * @author Telosys Tools Generator
 *
 */
public class AuthorValidator extends AbstractValidator<Author>{

    @Override
    public void validateEntity(Author entity, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", MessagesKeys.ID_MUST_DEFINE);


    }
}