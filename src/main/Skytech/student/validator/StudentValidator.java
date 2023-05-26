package Skytech.student.validator;

import Skytech.student.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
public class StudentValidator implements Validator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student) target;
        String address = student.getAddress();
        String email = student.getEmail();
        int age = student.getAge();

        ValidationUtils.rejectIfEmpty(errors, "address", "student.address.empty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "student.email.empty");

        if (age < 18 || age == 0) {
            errors.rejectValue("age", "student.age.empty");
        }


        // Custom email validation using regex pattern
        if (StringUtils.hasText(email) && !validateEmail(email)) {
            errors.rejectValue("email", "student.email.invalid");
        }


    }

    private boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
