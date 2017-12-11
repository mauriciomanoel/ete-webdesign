function validarForm() {
    var val = document.getElementById("valido");
    try {
        var nome = document.forms["meuForm"]["nome"].value;
        if (nome == null || nome == "") {
            throw "O Nome deve ser preenchido!";
        }
        var email = document.forms["meuForm"]["email"].value;
        var atpos = email.indexOf("@");
        var dotpos = email.lastIndexOf(".");
        if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= email.length){
            throw "Digite um e-mail válido!";
        }
        return true;
    } catch (err) {
        val.style.color = "#FF0000";
        val.innerHTML = "Erro: " + err;
        return false;
    } //Fim catch
} //Fim function


