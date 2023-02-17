class CalculadoraBonificacao {
    var total: Double = 0.0
        private set
    fun calcula(funcionarios: Funcionarios) {
        this.total += funcionarios.bonificacao
    }
}