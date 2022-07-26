# ユースケース 5： マスを承認する

## 概要
管理者が，マス作成者が作成したマスの内容を確認し，必要があれば内容を編集したうえで，マスをシステムに登録することを承認する．

## アクター
- 管理者

## 事前条件
- 管理者画面にログインしている．
- イベント管理画面が表示されている．


## 事後条件
- マスが承認され，システムに登録される

## トリガ―
- イベント管理画面の，承認ボタンを押す．

## 基本フロー
1. システムは，未承認ます一覧画面を表示する．
2. 管理者は，未承認マスを一つクリックする．
3. システムは，マス承認画面に，選択された未承認マスのタイトル・内容・アクション・画像を表示する．
4. 管理者は，表示された情報を確認し，内容に問題がないかチェックする．
5. 管理者は，必要に応じてマスの内容・画像を追加する．
6. 管理者は，チェックが終わったら承認するボタンを押す．
7. システムは，承認確認画面を表示する．
8. 管理者は，承認ボタンを押す．
9. システムは，承認完了画面を表示する．

## 代替フロー
### 代替フロー1
- 4a.1  管理者はチェックした結果，もう一度マス作成者にマスを作ってもらうなど，未承認マスを削除したい場合は，削除ボタンを押す．
- 4a.2 システムは，未承認マスを削除し，未承認マス一覧画面を表示する．

