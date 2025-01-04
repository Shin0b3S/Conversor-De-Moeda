package ConversorDeMoeda;

import ServicoIndiceDeCambio.TaxaDeCambioAPI;

public class ConversorDeMoeda {

    public double converter(String origem, String para, double quantidade) throws Exception {
        // Criar instância da classe TaxaDeCambioAPI
        TaxaDeCambioAPI api = new TaxaDeCambioAPI();

        // Obter a taxa de câmbio atualizada da API
        double taxaDeCambio = api.getIndiceDeTroca(origem.toUpperCase(), para.toUpperCase());

        // Retornar o valor convertido
        return quantidade * taxaDeCambio;
    }
}

