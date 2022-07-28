# ユースケース 6： 作成者アカウントを登録する

## 概要
管理者が，マス作成者のアカウントを登録する

## アクター
- 管理者

## 事前条件
- 管理者画面に表示されたイベント一覧から，イベントメニュー画面に遷移している

## 事後条件
- マス作成者アカウントが登録される.
- イベントメニュー画面が表示される

## トリガ―
- イベントメニュー画面で，マス作成者アカウントを作成するボタンを押す．

## 基本フロー
1. システムは，マス作成者アカウント作成画面を表示する
2. 管理者は，入力欄に新規マス作成者のユーザIDを入力し，作成ボタンを押す．
3. システムは，イベントにマス作成者を登録する
4. システムは，イベントメニュー画面を表示する

## 代替フロー
### 代替フロー1
- 2a.1  入力されたユーザIDがイベント内に既に存在している場合，システムはその旨を表示し，基本フロー1に戻る.
