FROM node:lts-alpine3.14

WORKDIR /usr/src/app

COPY . .

RUN npm install

RUN npm run build

WORKDIR /usr/src/app/build

RUN npm install

EXPOSE 3000

CMD ["npm", "start"]