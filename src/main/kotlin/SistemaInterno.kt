class SistemaInterno {
    fun entra (admin:FuncionariosAdmin,senha: Int){
       if (admin.autentica(senha)){
           println("Bem vindo ao bytebank")
       } else{
           println("Senha invalida")
       }
    }
}