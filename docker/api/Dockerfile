# ベースイメージ指定
FROM eclipse-temurin:17-jre-alpine

# 作業ディレクトリ指定
WORKDIR /app

# プロジェクトをコピー
COPY target/UserMgmtSys-0.0.1-SNAPSHOT.jar ./UserMgmtSys.jar

# Dockerイメージのビルド時に実行するシェルコマンド
ENTRYPOINT ["java","-jar","UserMgmtSys.jar"]