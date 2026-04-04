# システム名
ユーザー管理システム
# 利用技術
- Java
- SpringBoot
- MySQL
- Docker
- OCI
# 起動方法
## Windows(local)
### フォルダ移動
[Clone Directory]UserMgmtSystem
### Springサーバ実行
mvnw spring-boot:run
### API実行(get)
ブラウザで http://localhost:8080/users を実行
### API実行(post)
コマンドプロンプトで実行
```
curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"test\",\"email\":\"test@example.com\"}"
```
API(get)を再度実行してpostしたデータを表示する