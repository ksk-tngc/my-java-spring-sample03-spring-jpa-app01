package com.example.springjpa2.repository;

import com.example.springjpa2.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Commentテーブルのリポジトリ。
 * <p>{@link JpaRepository} が備えるメソッドを利用可能。
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
