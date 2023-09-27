FROM oven/bun

WORKDIR /app

COPY ../package.json .

RUN bun install

COPY ../ .

CMD ["bun","--hot","run","index.ts"]