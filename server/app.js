const http = require('http')

const port = 8080
const host = '127.0.0.1'

const server = http.createServer((_, res) => res.end('Hello World!'))

server.listen(port, host, () => console.log(`Server start at ${port} at ${host}`))