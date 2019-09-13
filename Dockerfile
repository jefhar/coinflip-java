FROM openjdk:12
COPY ./out/production/CoinFlipSimulation/ /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "CoinFlip"]