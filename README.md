## 概要

以下の要素を含む簡単な Spring Boot アプリケーションです。

* Spring Data JPA で H2 Database からデータ取得・登録
* CommandLineRunner を実装したコンポーネントを定義し、  
  Spring Boot 起動時に DB 初期データを登録するコマンドラインを実行
* バリデーション実装
* WebJars で Bootstrap 導入

## 画面

<small>初期表示</small>  
<img width="500" alt="00" src="https://user-images.githubusercontent.com/59589496/127767031-550e7acd-65a3-4a5e-8f61-19b40e257b45.png">  

<small>バリデーション</small>  
<img width="1213" alt="01" src="https://user-images.githubusercontent.com/59589496/127766896-89c9226f-ee6a-4329-bf37-7103ac1fc3c8.png">  

<small>登録</small>  
<img width="1213" alt="02" src="https://user-images.githubusercontent.com/59589496/127766912-cf5b5c69-2d2f-49ea-b358-c2cc18cf1d6a.png">  

<small>H2 コンソール</small>  
<img width="500" alt="03_h2" src="https://user-images.githubusercontent.com/59589496/127766929-53d3bdd2-9c71-4600-8ee2-31f03a9aaad1.png">  

## フォルダ構成

<img width="299" alt="04_folder" src="https://user-images.githubusercontent.com/59589496/127766999-92216dba-0864-4bd1-bcff-efc3ce8f0e29.png">  

## 依存関係

* Spring Boot DevTools
* Thymeleaf
* Spring Web
* Validation
* Spring Data JPA
* H2 Database
* Lombok
* WebJars -> BootStrap
