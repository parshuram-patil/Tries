package com.cs.regex;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		
		//removeNonAphabeticChars();
		extractFieldFromJwtTokenBody();

	}

	private static void removeNonAphabeticChars() {
		String input = "parshuram.patil@outlook.in";
		System.out.println(input.replaceAll("[^a-zA-Z]", ""));
	}
	
	private static String extractFieldFromJwtTokenBody() {
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		String field = "name";
		
        String[] splittedToken = token.split("\\.");
        String encodedBodyString = splittedToken[1];
        Base64.getDecoder().decode(encodedBodyString);
        byte[] decodedBodyBytes = Base64.getDecoder().decode(encodedBodyString);
        String decodedBodyString = new String(decodedBodyBytes, Charset.forName("UTF-8"));
        String regex = "(\"" + field + "\")([^,]*)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(decodedBodyString);
        String result = "";
        while (matcher.find()) {
            result = matcher.group().split("\"")[3];
            break;
        }
        
        System.out.println(result);

        return result;
    }
}
