package com.example.springjpa2.config;

import com.example.springjpa2.model.Comment;
import com.example.springjpa2.repository.CommentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * DBに初期データを登録するコンポーネント。
 * <p>Spring Boot 起動時にコマンドラインとして実行され、
 * Commentテーブルに初期データを登録する。
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    /**
     * Commentテーブルのリポジトリ。
     * <p>Lombok の {@code @RequiredArgsConstructor} で自動生成された
     * コンストラクタでインジェクションされる（コンストラクタが１つの場合、
     * {@code @Autowired} は省略できる）。
     */
    private final CommentRepository repository;

    /**
     * Spring Boot 起動時にコマンドラインとして実行する処理。
     * <p>Commentテーブルに初期データを登録する。
     */
    @Override
    public void run(String... args) throws Exception {
        Comment comment = new Comment(); // エンティティ
        comment.setContent("こんにちは");
        repository.save(comment); // DB登録

        comment = new Comment();
        comment.setContent("テストコメント");
        repository.save(comment);
    }

}
