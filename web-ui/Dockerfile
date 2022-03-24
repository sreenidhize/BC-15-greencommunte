FROM node:14
ENV NODE_ENV=main

WORKDIR /app

COPY ["package.json", "package-lock.json*", "./"]

RUN yarn install --production

COPY . .

EXPOSE 8080

CMD ["yarn","start"]
