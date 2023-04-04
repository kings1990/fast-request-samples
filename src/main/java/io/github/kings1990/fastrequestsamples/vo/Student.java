package io.github.kings1990.fastrequestsamples.vo;

import lombok.Data;


/**
 * student
 *
 * @author Kings
 * @date 2022/09/18
 */
@Data
public class Student {
    /**
     * id
     * @Ignore
     */
    private Integer id;


    /**
     * name
     */
    private String name;


    /**
     * age
     */
    private Integer age;
    /**
     * sex[0-unknown 1-female 2-male]
     */
    private Integer gender;

    public Student(Integer id, String name, Integer age, Integer gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}


