FROM node: 16
ENV NODE_ENV=main

WORKDIR /app

COPY ["package.json", "package-lock.json*", "./"]

RUN yarn install --production

COPY . .

EXPOSE 3000

CMD ["yarn","start"]
