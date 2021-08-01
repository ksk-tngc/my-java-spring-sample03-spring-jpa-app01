package com.example.springjpa2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * Commentテーブルのエンティティ。
 */
@Entity
@Data
public class Comment {

    /**
     * ID
     * <p>自動採番
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 内容
     * <p>必須、最大40文字
     */
    @NotBlank(message = "コメントを入力してください")
    @Size(max = 40, message = "コメントは{1}文字までです")
    private String content;

}
