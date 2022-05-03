package src;

public class decimalBinario {
	
	public String decimalABinario(int decimalInicial)
	{
	// de decimal a binario
    String binario = Integer.toBinaryString(decimalInicial);
    System.out.println(binario); // 1000
    
    return binario;
	}

	public int binarioADecimal (String binario)
	{
    // de binario a decimal
    int decimalConvertido = Integer.parseInt(binario, 2);
    System.out.println(decimalConvertido); // 8
    
    return decimalConvertido;
	}

}
