<h1 align="center">Alura Challenge - Sprint 1</h1>

![Alt text](sprint%201/assets/sprint1%20-%20alura.png)

Página foi desenvolvida durante os estudos da Alura ONE! Nesse projeto utilizei apenas as tecnologias <strong>HTML, CSS e JavaScript</strong>.
<br>
A página tem a função de pegar um texto digitado e criptografar. Caso o texto digitado seja um criptografia então será possível também descriptografar. Veja mais a seguir sobre o projeto!

<br>

# 🚀 Tecnologias
Projetos desenvolvidos com as seguintes tecnologias:
<ul>
  <li>HTML e CSS</li>
  <li>JavaScript</li>
  <li>lib CryptoJS</li>
  <li>Git e Github</li>
  <li>Figma</li>
</ul>

<br>

# 💻 Principais issues
- Desenvolvimento Tela Desktop
- Desenvolvimento Tela Mobile (Tablet/Celular)
- Página Resposiva
- interação HTML com JS
- Criptografia com JS
- Config botão "copiar"

<br>

# 👨‍💻 CryptoJS
CryptoJs é uma biblioteca de criptografia em JavaScript que oferece implementações de diversos algoritmos criptográficos como o AES que foi utilizado nesse projeto. Ele pode ser usado tanto para criptografar quanto para descriptografar dados, gerar hashes e entre outras utilidades. 

Para implementar no HTML:

```
<script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js"></script>
```

Para criptografar a mensagem no JavaScript é preciso do texto a ser criptografado, da chave e do vetor de inicialização.

OBS: <em>Para entender melhor é só acessar o código no arquivo <strong>script.js</strong></em>

Para implementar criptografia no JS:

```
// Para criptografar
const textEncrypt = CryptoJS.AES.encrypt(message, key, {iv:iv}).toString();

// Para descriptografar
const textDecrypt = CryptoJS.AES.decrypt(textEncrypted, key, {iv:iv}).toString(CryptoJS.enc.Utf8);
```
