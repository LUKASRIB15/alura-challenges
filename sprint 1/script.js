const buttonEncrypt = document.getElementById("encrypt")
const buttonDecrypt = document.getElementById("decrypt")
const textCopyArea = document.querySelector("aside")

const inputTextCopy = document.createElement("textarea")
const buttonCopy = document.createElement("button")

buttonEncrypt.addEventListener('click', function(event){
  event.preventDefault()
  textCopyArea.innerHTML = ``
  inputTextCopy.id = "input-text-copy"
  inputTextCopy.rows = 5
  buttonCopy.id = "button-copy"
  buttonCopy.innerText = "Copiar"
  textCopyArea.appendChild(inputTextCopy);
  textCopyArea.appendChild(buttonCopy)
})

