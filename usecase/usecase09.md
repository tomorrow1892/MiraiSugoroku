# ユースケース 09： ログインする(マス作成者)

## 概要

マス作成者が自身のアカウントにログインする．

## アクター

- 作成者ユーザ

## 事前条件

- ユーザを登録していること．

## 事後条件

- ユーザがシステムにログインした状態になる．
- メニュー画面に移動する．

## トリガ―

- ユーザがログイン画面にアクセスする．

## 基本フロー

1. システムは，ログイン画面を表示する．
2. ユーザは，ユーザ ID を入力し，ログインボタンを押す．
3. システムは，ユーザ ID からユーザが存在するかを確認する．
4. システムはユーザの属性に合わせてメニュー画面を表示する．

## 代替フロー

### 代替フロー 1

- 3a.1 ユーザが存在しない場合，システムはログインエラーを出し，1 に戻る．

## GUI 紙芝居
![](img/user_login.JPG)
s
