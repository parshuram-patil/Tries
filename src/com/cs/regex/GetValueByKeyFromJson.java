package com.cs.regex;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetValueByKeyFromJson {

	public static void main(String[] args) {

		String accessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
		String value = extractFieldFromToken(accessToken, "name");
		System.out.println(value);

	}

	public static String getValueByKeyFromJsonString(String jsonString, String field) {
		String result = null;

		try {
			String regex = "(\"" + field + "\")([^,]*)";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(jsonString);
			while (matcher.find()) {
				result = matcher.group().replace("\"", "").split(":")[1];
				result.trim();
				break;
			}
		} catch (NullPointerException e) {
			System.err.println("\n\n Null input JSON string \n\n");
		}

		return result;
	}

	public static String extractFieldFromToken(String token, String field) {
		String[] splittedToken = token.split("\\.");
		String encodedBodyString = splittedToken[1];
		byte[] decodedBodyBytes = Base64.getDecoder().decode(encodedBodyString);
		String decodedBodyString = new String(decodedBodyBytes, Charset.forName("UTF-8"));

		return getValueByKeyFromJsonString(decodedBodyString, field);
	}

}
