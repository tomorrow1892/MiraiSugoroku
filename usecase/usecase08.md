# ユースケース 8： グループ・ニックネームを編集する

## 概要

マス作成者の所属するグループとニックネームの情報を編集する

## アクター

- マス作成者

## 事前条件

- マス作成者のアカウントが存在
- マス作成者のアカウントでログイン

## 事後条件

- マス作成者のグループ・ニックネームが更新される
- マス作成者のメニュー画面が表示される

## トリガ―

- マス作成者がメニュー画面からプロフィールの編集を選択

## 基本フロー

1. マス作成者がログインする
2. システムはマス作成者のメニュー画面を表示する
3. マス作成者はメニュー画面からプロフィールの編集を選択
4. システムはプロフィール編集画面を表示
5. マス作成者は新しいグループを選択または新しいニックネームを入力
6. マス作成者は更新ボタンを押す
7. システムは新しいプロフィール情報をもとにデータベースを更新する
8. システムはメニュー画面を表示する

## 代替フロー

### 代替フロー1

- 1a.1 マス作成者のグループとニックネームが登録されていない場合，システムはメニュー画面ではなく登録画面を表示する
- 1a.2 マス作成者はグループを選択し，ニックネームを入力する
- 1a.3 マス作成者は登録ボタンを押す
- 1a.4 システムは登録された情報をデータベースに登録する