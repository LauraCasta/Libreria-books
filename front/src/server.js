const cors_proxy = require('cors-anywhere');

const host = '0.0.0.0';
const port = 8080;

cors_proxy.createServer({
  originWhitelist: [], // Permite todos los orígenes
  requireHeader: ['origin', 'x-requested-with'],
  removeHeaders: ['cookie', 'cookie2']
}).listen(port, host, () => {
  console.log(`CORS Anywhere proxy está en ejecución en http://${host}:${port}/`);
});
