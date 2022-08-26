package io.github.kings1990.fastrequestsamples.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MultipartParam {
    private Integer id;

    private MultipartFile file;


}
