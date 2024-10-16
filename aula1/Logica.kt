object ReceitaFederal {
    fun calcularImposto(salario: Double){
        val = aliquota = when {
            (salario >= 0 && salario <= 1100) -> 0.05
            (salario >= 1100.01 && salario <= 2500) -> 0.10
            (salario >= 2500.01) -> 0.15
            else -> ("Nao e valido")
        }
        return aliquota * salario
    }
}

fun main(){
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficio = readLine()!!.toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficio;

    println(String.format("%.2f", saida));
}