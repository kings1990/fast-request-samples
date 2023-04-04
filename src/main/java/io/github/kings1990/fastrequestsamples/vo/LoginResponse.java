package io.github.kings1990.fastrequestsamples.vo;

import lombok.Data;

@Data
public class LoginResponse {
    /**
     * username
     */
    private String userName;

    /**
     * user token
     */
    private String token;
}
