const textareaContent = document.querySelector("textarea")
const buttonEncrypt = document.getElementById("encrypt")
const buttonDecrypt = document.getElementById("decrypt")
const textCopyArea = document.querySelector("aside")

var listTextsEncrypt = []
var listKeys = []
let count=0;

// create elements HTML
const inputTextCopy = document.createElement("div")
const buttonCopy = document.createElement("button")

buttonEncrypt.addEventListener('click', function(event){
  event.preventDefault()
  CreateElementsAndAtributtes()
  //CryptoJS Encrypt
  const message = textareaContent.value
  const key = crypto.randomUUID()
  const iv = CryptoJS.lib.WordArray.random(16);
  const textEncrypt = CryptoJS.AES.encrypt(message, key, {iv:iv}).toString();
  console.log("Texto criptografado: " + textEncrypt);
  listTextsEncrypt.push(textEncrypt)
  listKeys.push(key)
  count++;
  inputTextCopy.innerText = textEncrypt;
})

buttonDecrypt.addEventListener('click', function(event){
  event.preventDefault();
  CreateElementsAndAtributtes()
  //CryptoJS Decrypt
  const message = textareaContent.value
  for(var i=0; i<listTextsEncrypt.length; i++){
    if(message == listTextsEncrypt[i]){
      var key = listKeys[i];
      var textEncrypted = listTextsEncrypt[i];
      break; 
    }
  }
  const iv = CryptoJS.lib.WordArray.random(16);
  const textDecrypt = CryptoJS.AES.decrypt(textEncrypted, key, {iv:iv}).toString(CryptoJS.enc.Utf8);
  console.log("Texto descriptografado: " + textDecrypt)
  inputTextCopy.innerText = textDecrypt;
})

function CreateElementsAndAtributtes(){
  //Atributtes 
  inputTextCopy.id = "input-text-copy"
  buttonCopy.id = "button-copy"
  // get values
  buttonCopy.innerText= "Copiar"
  textCopyArea.innerHTML = ``
  // Put child inside your father
  textCopyArea.appendChild(inputTextCopy);
  textCopyArea.appendChild(buttonCopy)
}

