package com.example.springjpa2.controller;

import com.example.springjpa2.config.DataLoader;
import com.example.springjpa2.model.Comment;
import com.example.springjpa2.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ルートパスのコントローラ。
 */
@Controller
public class CommentController {

    /**
     * Commentテーブルのリポジトリ。
     * <p>コンストラクタでインジェクションされる。
     */
    private final CommentRepository repository;

    /**
     * コンストラクタ。
     * <p>コンストラクタインジェクションでリポジトリがインジェクションされる。
     * なお、コンストラクタが１つの場合、{@code @Autowired} は省略可。また、Lombok で
     * コンストラクタを生成すれば、コンストラクタ自体も記述不要。
     * @param repository DIされたCommentテーブルのリポジトリ
     * @see DataLoader#DataLoader(CommentRepository)
     */
    @Autowired
    public CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    /**
     * ルートパスのGETリクエストのハンドラメソッド。
     * @param comment モデルに追加されるオブジェクト
     * @param model モデル
     * @return 遷移後の画面
     */
    @GetMapping("/")
    public String getAllComments(@ModelAttribute Comment comment, Model model) {
        model.addAttribute("comments", repository.findAll()); // Commentテーブルの全件をModelに追加
        return "list"; // 画面遷移
    }

    /**
     * コメント登録処理のハンドラメソッド。
     * @param comment リクエストボディがバインドされた検証済みのオブジェクト
     * @param result バインド結果
     * @param model モデル
     * @return 遷移後の画面
     */
    @PostMapping("/add")
    public String addComment(@Validated @ModelAttribute Comment comment, BindingResult result, Model model) {
        if (result.hasErrors()) { // バリデーションエラーがある場合、
            model.addAttribute("comments", repository.findAll());
            return "list"; // 登録処理を中断し、画面にエラーを表示
        }
        repository.save(comment); // DB登録
        return "redirect:/"; // ルートパス（"/"）にリダイレクト（PRGパターン）
    }

}
