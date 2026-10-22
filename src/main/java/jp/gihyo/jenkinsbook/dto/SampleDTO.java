package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

public class SampleDTO implements Serializable {

    private String firstName;
    private String lastName;
    private String message;

    public SampleDTO(final String firstNameParam, final String lastNameParam) {
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
        this.message = "Hello";
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setFirstName(final String firstNameParam) {
        this.firstName = firstNameParam;
    }

    public final void setLastName(final String lastNameParam) {
        this.lastName = lastNameParam;
    }

    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
