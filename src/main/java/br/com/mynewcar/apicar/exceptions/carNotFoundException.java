package br.com.mynewcar.apicar.exceptions;

public class carNotFoundException extends Throwable {

    public carNotFoundException(String s) { super(s); }

    public carNotFoundException(String s, Throwable error) { super(s, error); }

}
