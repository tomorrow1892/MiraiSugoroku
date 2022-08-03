# ユースケース 7： マスを作成する

## 概要
作成者が, マスを作成する.

## アクター
- 作成者

## 事前条件
- マス作成画面が表示されている.

## 事後条件
- 作成者が作成したマスが, 管理者の承認待ち状態となっていること.

## トリガ―
- 作成者メニューでマスを作成するボタンを選択する.

## 基本フロー
1. 作成者は, タイトル, 内容, マスイベント, 写真を入力する.
2. 作成者は, 承認申請ボタンを選択する.
2. システムは, 確認画面を表示する.
3. 作成者は, YESを選択する
4. システムは，完了画面を表示する.
5. ユーザは, マス作成を続けるを選択する. 
6. システムは, マス作成画面を表示する.

## 代替フロー
### 代替フロー1
- 3a.1  作成者はNOを選択する.
- 基本フロー6へ

### 代替フロー2
- 5a.1 ユーザは, メニューに戻るを選択する.
- 5a.2 基本フロー6へ
