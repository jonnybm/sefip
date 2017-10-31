package br.com.sefip;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;


public class GetSetSefip {
	
	//Para Usar no Combo 20 Empresa + Codigo da Obra
	List<String> lisEmpresaCodigoObra = new ArrayList<String>();
	
	public List<String> getLisEmpresaCodigoObra() {
		return lisEmpresaCodigoObra;
	}
	public void setLisEmpresaCodigoObra(List<String> lisEmpresaCodigoObra) {
		this.lisEmpresaCodigoObra = lisEmpresaCodigoObra;
	}

	

	//Para Usar no Combo 32- Movimentacao Funcionrios
	List<String> lisFuncionariosMovimentacao = new ArrayList<String>();
	
	public List<String> getLisFuncionariosMovimentacao() {
		return lisFuncionariosMovimentacao;
	}
	public void setLisFuncionariosMovimentacao(
			List<String> lisFuncionariosMovimentacao) {
		this.lisFuncionariosMovimentacao = lisFuncionariosMovimentacao;
	}

	
	//Para usar no combo 30 Funcionarios
	List<String> lisFuncionarios = new ArrayList<String>();
	public List<String> getLisFuncionarios() {
		return lisFuncionarios;
	}
	public void setLisFuncionarios(List<String> lisFuncionarios) {
		this.lisFuncionarios = lisFuncionarios;
	}
	
	
	

		
	public String Bloco50 = "";	
	public String Bloco51 = "";
	public String Bloco90 = "";
	
	
	//INICIO 00
	public String Bloco00 = "";	
	public String Bloco00TipoRegisto = "";
	public String Bloco00TipodeRemessa = "";	
	public String Bloco00TipodeInscricaoResponsavel = "";	
	public String Bloco00InscricaoResponsavel = "";	
	public String Bloco00RazaoSocial = "";	
	public String Bloco00NomePessoaContato = "";	
	public String Bloco00Logradouro = "";	
	public String Bloco00Bairro = "";	
	public String Bloco00Cep = "";	
	public String Bloco00Cidade = "";	
	public String Bloco00UF = "";	
	public String Bloco00TelefoneInternetContato = "";	
	public String Bloco00EnderecoInternetContato = "";	
	public String Bloco00Competencia = "";	
	public String Bloco00CodRecolhimento = "";	
	public String Bloco00IndicadorDeRecolhimentoFGTS = "";	
	public String Bloco00ModalidadeArquivo = "";	
	public String Bloco00DataDeRecolhimentoDoFGTS = "";	
	public String Bloco00IndicadorRecolhimenetoPrevidenciaSocial = "";	
	public String Bloco00DataDeRecolhimentoDaPrevidenciaSocial = "";	
	public String Bloco00IndiceRecolhimentAtrasoPrevidenciaSocial = "";	
	public String Bloco00TipoInscricaoFornecedor = "";	
	public String Bloco00InscrioDoFornecedorFolhaDePagamento = "";	
	
	public String Bloco00Brancos = "                                                   ";
	public String Bloco00BrancosFim = "                  ";	
	public String Bloco00FinalLinha = "*"; 
		
	
	
	public String getBloco00TipoRegisto() {
		return Bloco00TipoRegisto;
	}
	public void setBloco00TipoRegisto(String bloco00TipoRegisto) {
		Bloco00TipoRegisto = bloco00TipoRegisto;
	}	
	public String getBloco00TipodeRemessa() {
		return Bloco00TipodeRemessa;
	}
	public void setBloco00TipodeRemessa(String bloco00TipodeRemessa) {
		Bloco00TipodeRemessa = bloco00TipodeRemessa;
	}
	public String getBloco00TipodeInscricaoResponsavel() {
		return Bloco00TipodeInscricaoResponsavel;
	}
	public void setBloco00TipodeInscricaoResponsavel(
			String bloco00TipodeInscricaoResponsavel) {
		Bloco00TipodeInscricaoResponsavel = bloco00TipodeInscricaoResponsavel;
	}
	public String getBloco00InscricaoResponsavel() {
		return Bloco00InscricaoResponsavel;
	}
	public void setBloco00InscricaoResponsavel(String bloco00InscricaoResponsavel) {
		Bloco00InscricaoResponsavel = bloco00InscricaoResponsavel;
	}
	public String getBloco00RazaoSocial() {
		return Bloco00RazaoSocial;
	}
	public void setBloco00RazaoSocial(String bloco00RazaoSocial) {
		Bloco00RazaoSocial = bloco00RazaoSocial;
	}
	public String getBloco00NomePessoaContato() {
		return Bloco00NomePessoaContato;
	}
	public void setBloco00NomePessoaContato(String bloco00NomePessoaContato) {
		Bloco00NomePessoaContato = bloco00NomePessoaContato;
	}
	public String getBloco00Logradouro() {
		return Bloco00Logradouro;
	}
	public void setBloco00Logradouro(String bloco00Logradouro) {
		Bloco00Logradouro = bloco00Logradouro;
	}
	public String getBloco00Bairro() {
		return Bloco00Bairro;
	}
	public void setBloco00Bairro(String bloco00Bairro) {
		Bloco00Bairro = bloco00Bairro;
	}
	public String getBloco00Cep() {
		return Bloco00Cep;
	}
	public void setBloco00Cep(String bloco00Cep) {
		Bloco00Cep = bloco00Cep;
	}
	public String getBloco00Cidade() {
		return Bloco00Cidade;
	}
	public void setBloco00Cidade(String bloco00Cidade) {
		Bloco00Cidade = bloco00Cidade;
	}
	public String getBloco00UF() {
		return Bloco00UF;
	}
	public void setBloco00UF(String bloco00uf) {
		Bloco00UF = bloco00uf;
	}
	public String getBloco00EnderecoInternetContato() {
		return Bloco00EnderecoInternetContato;
	}
	public void setBloco00EnderecoInternetContato(
			String bloco00EnderecoInternetContato) {
		Bloco00EnderecoInternetContato = bloco00EnderecoInternetContato;
	}	
	public String getBloco00TelefoneInternetContato() {
		return Bloco00TelefoneInternetContato;
	}
	public void setBloco00TelefoneInternetContato(
			String bloco00TelefoneInternetContato) {
		Bloco00TelefoneInternetContato = bloco00TelefoneInternetContato;
	}
	public String getBloco00Competencia() {
		return Bloco00Competencia;
	}
	public void setBloco00Competencia(String bloco00Competencia) {
		Bloco00Competencia = bloco00Competencia;
	}
	public String getBloco00CodRecolhimento() {
		return Bloco00CodRecolhimento;
	}
	public void setBloco00CodRecolhimento(String bloco00CodRecolhimento) {
		Bloco00CodRecolhimento = bloco00CodRecolhimento;
	}
	public String getBloco00IndicadorDeRecolhimentoFGTS() {
		return Bloco00IndicadorDeRecolhimentoFGTS;
	}
	public void setBloco00IndicadorDeRecolhimentoFGTS(
			String bloco00IndicadorDeRecolhimentoFGTS) {
		Bloco00IndicadorDeRecolhimentoFGTS = bloco00IndicadorDeRecolhimentoFGTS;
	}
	public String getBloco00ModalidadeArquivo() {
		return Bloco00ModalidadeArquivo;
	}
	public void setBloco00ModalidadeArquivo(String bloco00ModalidadeArquivo) {
		Bloco00ModalidadeArquivo = bloco00ModalidadeArquivo;
	}
	public String getBloco00DataDeRecolhimentoDoFGTS() {
		return Bloco00DataDeRecolhimentoDoFGTS;
	}
	public void setBloco00DataDeRecolhimentoDoFGTS(
			String bloco00DataDeRecolhimentoDoFGTS) {
		Bloco00DataDeRecolhimentoDoFGTS = bloco00DataDeRecolhimentoDoFGTS;
	}
	public String getBloco00IndicadorRecolhimenetoPrevidenciaSocial() {
		return Bloco00IndicadorRecolhimenetoPrevidenciaSocial;
	}
	public void setBloco00IndicadorRecolhimenetoPrevidenciaSocial(
			String bloco00IndicadorRecolhimenetoPrevidenciaSocial) {
		Bloco00IndicadorRecolhimenetoPrevidenciaSocial = bloco00IndicadorRecolhimenetoPrevidenciaSocial;
	}
	public String getBloco00DataDeRecolhimentoDaPrevidenciaSocial() {
		return Bloco00DataDeRecolhimentoDaPrevidenciaSocial;
	}
	public void setBloco00DataDeRecolhimentoDaPrevidenciaSocial(
			String bloco00DataDeRecolhimentoDaPrevidenciaSocial) {
		Bloco00DataDeRecolhimentoDaPrevidenciaSocial = bloco00DataDeRecolhimentoDaPrevidenciaSocial;
	}
	public String getBloco00IndiceRecolhimentAtrasoPrevidenciaSocial() {
		return Bloco00IndiceRecolhimentAtrasoPrevidenciaSocial;
	}
	public void setBloco00IndiceRecolhimentAtrasoPrevidenciaSocial(
			String bloco00IndiceRecolhimentAtrasoPrevidenciaSocial) {
		Bloco00IndiceRecolhimentAtrasoPrevidenciaSocial = bloco00IndiceRecolhimentAtrasoPrevidenciaSocial;
	}
	public String getBloco00TipoInscricaoFornecedor() {
		return Bloco00TipoInscricaoFornecedor;
	}
	public void setBloco00TipoInscricaoFornecedor(
			String bloco00TipoInscricaoFornecedor) {
		Bloco00TipoInscricaoFornecedor = bloco00TipoInscricaoFornecedor;
	}
	public String getBloco00InscrioDoFornecedorFolhaDePagamento() {
		return Bloco00InscrioDoFornecedorFolhaDePagamento;
	}
	public void setBloco00InscrioDoFornecedorFolhaDePagamento(
			String bloco00InscrioDoFornecedorFolhaDePagamento) {
		Bloco00InscrioDoFornecedorFolhaDePagamento = bloco00InscrioDoFornecedorFolhaDePagamento;
	}
	//FIM 00
	
	



	// INICIO 12
	public String Bloco12 = "";
	public String Bloco12TipoRegisto = "";
	public String Bloco12TipoInscricaoEmpresa = "";
	public String Bloco12InscricaoEmpresa = "";
	public String Bloco12Deducao13SalarioMaternidade = "";
	public String Bloco12ReceitaEventoDesportivoPatrocinio = "";
	public String Bloco12IndicativoOrigemReceita = "";
	public String Bloco12ComercializacaoProducaoPF = "";
	public String Bloco12ComercializacaoProducaoPJ = "";
	public String Bloco12OutroasInformacoesProcesso = "";
	public String Bloco12OutroasInformacoesProcessoAno = "";
	public String Bloco12OutroasInformacoesVaraJCJ = "";
	public String Bloco12OutroasInformacoesPeriodoIni = "";
	public String Bloco12OutroasInformacoesPeriodoFIm = "";
	public String Bloco12CompensacaoValorCorrigido = "";
	public String Bloco12CompensacaoPeriodoInicio = "";
	public String Bloco12CompensacaoPeriodoFim = "";
	public String Bloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha = "";
	public String Bloco12RecolhimentoCompetenciaAnteriorOutasEntidades = "";
	public String Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS = "";
	public String Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades = "";
	public String Bloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva = "";
	public String Bloco12ParcelamentoFGTSSomatorioCategoria0102030506 = "";
	public String Bloco12ParcelamentoFGTSSomatorioCategoria0407 = "";
	public String Bloco12ParcelamentoFGTSValorRecolhido = "";
	public String Bloco12ValoresPGTOCooperativas = "";
	
	public String Bloco12ImplementacaoFutura = "000000000000000000000000000000000000000000000";
	public String Bloco12Brancos = "      ";//brancos Sempre Fixo
	public String Bloco12FinalLinha = "*";//Sempre Fixo
	
	
	
	
	public String getBloco12TipoRegisto() {
		return Bloco12TipoRegisto;
	}
	public void setBloco12TipoRegisto(String bloco12TipoRegisto) {
		Bloco12TipoRegisto = bloco12TipoRegisto;
	}
	public String getBloco12TipoInscricaoEmpresa() {
		return Bloco12TipoInscricaoEmpresa;
	}
	public void setBloco12TipoInscricaoEmpresa(String bloco12TipoInscricaoEmpresa) {
		Bloco12TipoInscricaoEmpresa = bloco12TipoInscricaoEmpresa;
	}
	public String getBloco12InscricaoEmpresa() {
		return Bloco12InscricaoEmpresa;
	}
	public void setBloco12InscricaoEmpresa(String bloco12InscricaoEmpresa) {
		Bloco12InscricaoEmpresa = bloco12InscricaoEmpresa;
	}
	public String getBloco12Deducao13SalarioMaternidade() {
		return Bloco12Deducao13SalarioMaternidade;
	}
	public void setBloco12Deducao13SalarioMaternidade(
			String bloco12Deducao13SalarioMaternidade) {
		Bloco12Deducao13SalarioMaternidade = bloco12Deducao13SalarioMaternidade;
	}
	public String getBloco12ReceitaEventoDesportivoPatrocinio() {
		return Bloco12ReceitaEventoDesportivoPatrocinio;
	}
	public void setBloco12ReceitaEventoDesportivoPatrocinio(
			String bloco12ReceitaEventoDesportivoPatrocinio) {
		Bloco12ReceitaEventoDesportivoPatrocinio = bloco12ReceitaEventoDesportivoPatrocinio;
	}
	public String getBloco12IndicativoOrigemReceita() {
		return Bloco12IndicativoOrigemReceita;
	}
	public void setBloco12IndicativoOrigemReceita(
			String bloco12IndicativoOrigemReceita) {
		Bloco12IndicativoOrigemReceita = bloco12IndicativoOrigemReceita;
	}
	public String getBloco12ComercializacaoProducaoPF() {
		return Bloco12ComercializacaoProducaoPF;
	}
	public void setBloco12ComercializacaoProducaoPF(
			String bloco12ComercializacaoProducaoPF) {
		Bloco12ComercializacaoProducaoPF = bloco12ComercializacaoProducaoPF;
	}
	public String getBloco12ComercializacaoProducaoPJ() {
		return Bloco12ComercializacaoProducaoPJ;
	}
	public void setBloco12ComercializacaoProducaoPJ(
			String bloco12ComercializacaoProducaoPJ) {
		Bloco12ComercializacaoProducaoPJ = bloco12ComercializacaoProducaoPJ;
	}
	public String getBloco12OutroasInformacoesProcesso() {
		return Bloco12OutroasInformacoesProcesso;
	}
	public void setBloco12OutroasInformacoesProcesso(
			String bloco12OutroasInformacoesProcesso) {
		Bloco12OutroasInformacoesProcesso = bloco12OutroasInformacoesProcesso;
	}
	public String getBloco12OutroasInformacoesProcessoAno() {
		return Bloco12OutroasInformacoesProcessoAno;
	}
	public void setBloco12OutroasInformacoesProcessoAno(
			String bloco12OutroasInformacoesProcessoAno) {
		Bloco12OutroasInformacoesProcessoAno = bloco12OutroasInformacoesProcessoAno;
	}
	public String getBloco12OutroasInformacoesVaraJCJ() {
		return Bloco12OutroasInformacoesVaraJCJ;
	}
	public void setBloco12OutroasInformacoesVaraJCJ(
			String bloco12OutroasInformacoesVaraJCJ) {
		Bloco12OutroasInformacoesVaraJCJ = bloco12OutroasInformacoesVaraJCJ;
	}
	public String getBloco12OutroasInformacoesPeriodoIni() {
		return Bloco12OutroasInformacoesPeriodoIni;
	}
	public void setBloco12OutroasInformacoesPeriodoIni(
			String bloco12OutroasInformacoesPeriodoIni) {
		Bloco12OutroasInformacoesPeriodoIni = bloco12OutroasInformacoesPeriodoIni;
	}
	public String getBloco12OutroasInformacoesPeriodoFIm() {
		return Bloco12OutroasInformacoesPeriodoFIm;
	}
	public void setBloco12OutroasInformacoesPeriodoFIm(
			String bloco12OutroasInformacoesPeriodoFIm) {
		Bloco12OutroasInformacoesPeriodoFIm = bloco12OutroasInformacoesPeriodoFIm;
	}
	public String getBloco12CompensacaoValorCorrigido() {
		return Bloco12CompensacaoValorCorrigido;
	}
	public void setBloco12CompensacaoValorCorrigido(
			String bloco12CompensacaoValorCorrigido) {
		Bloco12CompensacaoValorCorrigido = bloco12CompensacaoValorCorrigido;
	}
	public String getBloco12CompensacaoPeriodoInicio() {
		return Bloco12CompensacaoPeriodoInicio;
	}
	public void setBloco12CompensacaoPeriodoInicio(
			String bloco12CompensacaoPeriodoInicio) {
		Bloco12CompensacaoPeriodoInicio = bloco12CompensacaoPeriodoInicio;
	}
	public String getBloco12CompensacaoPeriodoFim() {
		return Bloco12CompensacaoPeriodoFim;
	}
	public void setBloco12CompensacaoPeriodoFim(String bloco12CompensacaoPeriodoFim) {
		Bloco12CompensacaoPeriodoFim = bloco12CompensacaoPeriodoFim;
	}
	public String getBloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha() {
		return Bloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha;
	}
	public void setBloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha(
			String bloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha) {
		Bloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha = bloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha;
	}
	public String getBloco12RecolhimentoCompetenciaAnteriorOutasEntidades() {
		return Bloco12RecolhimentoCompetenciaAnteriorOutasEntidades;
	}
	public void setBloco12RecolhimentoCompetenciaAnteriorOutasEntidades(
			String bloco12RecolhimentoCompetenciaAnteriorOutasEntidades) {
		Bloco12RecolhimentoCompetenciaAnteriorOutasEntidades = bloco12RecolhimentoCompetenciaAnteriorOutasEntidades;
	}
	public String getBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS() {
		return Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS;
	}
	public void setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS(
			String bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS) {
		Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS = bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS;
	}
	public String getBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades() {
		return Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades;
	}
	public void setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades(
			String bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades) {
		Bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades = bloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades;
	}
	public String getBloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva() {
		return Bloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva;
	}
	public void setBloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva(
			String bloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva) {
		Bloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva = bloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva;
	}
	public String getBloco12ParcelamentoFGTSSomatorioCategoria0102030506() {
		return Bloco12ParcelamentoFGTSSomatorioCategoria0102030506;
	}
	public void setBloco12ParcelamentoFGTSSomatorioCategoria0102030506(
			String bloco12ParcelamentoFGTSSomatorioCategoria0102030506) {
		Bloco12ParcelamentoFGTSSomatorioCategoria0102030506 = bloco12ParcelamentoFGTSSomatorioCategoria0102030506;
	}
	public String getBloco12ParcelamentoFGTSSomatorioCategoria0407() {
		return Bloco12ParcelamentoFGTSSomatorioCategoria0407;
	}
	public void setBloco12ParcelamentoFGTSSomatorioCategoria0407(
			String bloco12ParcelamentoFGTSSomatorioCategoria0407) {
		Bloco12ParcelamentoFGTSSomatorioCategoria0407 = bloco12ParcelamentoFGTSSomatorioCategoria0407;
	}
	public String getBloco12ParcelamentoFGTSValorRecolhido() {
		return Bloco12ParcelamentoFGTSValorRecolhido;
	}
	public void setBloco12ParcelamentoFGTSValorRecolhido(
			String bloco12ParcelamentoFGTSValorRecolhido) {
		Bloco12ParcelamentoFGTSValorRecolhido = bloco12ParcelamentoFGTSValorRecolhido;
	}
	public String getBloco12ValoresPGTOCooperativas() {
		return Bloco12ValoresPGTOCooperativas;
	}
	public void setBloco12ValoresPGTOCooperativas(
			String bloco12ValoresPGTOCooperativas) {
		Bloco12ValoresPGTOCooperativas = bloco12ValoresPGTOCooperativas;
	}

	//FIM 12
	
	

	//INICIO 10
	public String Bloco10 = "";
	
	public String Bloco10TipoRegisto = "";
	public String Bloco10TipoInscricaoEmpresa = "";
	public String Bloco10InscricaoEmpresa = "";
	public String Bloco10NomeEmpresaRazaoSocial = "";
	public String Bloco10Logradouro = "";
	public String Bloco10Bairro = "";
	public String Bloco10CEP = "";
	public String Bloco10Cidade = "";
	public String Bloco10UF = "";
	public String Bloco10Telefone = "";
	public String Bloco10IndicadorAlteracaoEndereco = "";
	public String Bloco10CNAE = "";
	public String Bloco10indicadorAlteracaoCNAE = "";
	public String Bloco10AliquotaRAT = "";
	public String Bloco10CodigoCentralizacao = "";
	public String Bloco10Simples = "";
	public String Bloco10FPAS = "";
	public String Bloco10CodigoOutroasEntidades = "";
	public String Bloco10CodigoPgtoGPS = "";
	public String Bloco10PercentualInsencaoFilantropica = "";
	public String Bloco10SalarioFamilia = "";
	public String Bloco10SalarioMaternidade = "";
	public String Bloco10ContribDescEmpregadoReferentaCompetencia13 = "";
	public String Bloco10IndicadorValorNegativoPositivo = "";
	public String Bloco10ValorDevidoPrevidnciaSocialReferenteComp13 = "";
	public String Bloco10Banco = "";
	public String Bloco10Agencia = "";
	public String Bloco10ContaCorrente = "";
	
	
	public String Bloco10Zero = "000000000000000000000000000000000000000000000";
	public String Bloco10Brancos = "                                    ";
	public String Bloco10BrancosFinalLinha = "    ";
	public String Bloco10FinalLinha = "*";//Sempre Fixo
	
	
	public String getBloco10TipoRegisto() {
		return Bloco10TipoRegisto;
	}
	public void setBloco10TipoRegisto(String bloco10TipoRegisto) {
		Bloco10TipoRegisto = bloco10TipoRegisto;
	}
	public String getBloco10TipoInscricaoEmpresa() {
		return Bloco10TipoInscricaoEmpresa;
	}
	public void setBloco10TipoInscricaoEmpresa(String bloco10TipoInscricaoEmpresa) {
		Bloco10TipoInscricaoEmpresa = bloco10TipoInscricaoEmpresa;
	}
	public String getBloco10InscricaoEmpresa() {
		return Bloco10InscricaoEmpresa;
	}
	public void setBloco10InscricaoEmpresa(String bloco10InscricaoEmpresa) {
		Bloco10InscricaoEmpresa = bloco10InscricaoEmpresa;
	}	
	public String getBloco10NomeEmpresaRazaoSocial() {
		return Bloco10NomeEmpresaRazaoSocial;
	}
	public void setBloco10NomeEmpresaRazaoSocial(
			String bloco10NomeEmpresaRazaoSocial) {
		Bloco10NomeEmpresaRazaoSocial = bloco10NomeEmpresaRazaoSocial;
	}
	public String getBloco10Logradouro() {
		return Bloco10Logradouro;
	}
	public void setBloco10Logradouro(String bloco10Logradouro) {
		Bloco10Logradouro = bloco10Logradouro;
	}
	public String getBloco10Bairro() {
		return Bloco10Bairro;
	}
	public void setBloco10Bairro(String bloco10Bairro) {
		Bloco10Bairro = bloco10Bairro;
	}
	public String getBloco10CEP() {
		return Bloco10CEP;
	}
	public void setBloco10CEP(String bloco10cep) {
		Bloco10CEP = bloco10cep;
	}
	public String getBloco10Cidade() {
		return Bloco10Cidade;
	}
	public void setBloco10Cidade(String bloco10Cidade) {
		Bloco10Cidade = bloco10Cidade;
	}
	public String getBloco10UF() {
		return Bloco10UF;
	}
	public void setBloco10UF(String bloco10uf) {
		Bloco10UF = bloco10uf;
	}
	public String getBloco10Telefone() {
		return Bloco10Telefone;
	}
	public void setBloco10Telefone(String bloco10Telefone) {
		Bloco10Telefone = bloco10Telefone;
	}
	public String getBloco10IndicadorAlteracaoEndereco() {
		return Bloco10IndicadorAlteracaoEndereco;
	}
	public void setBloco10IndicadorAlteracaoEndereco(
			String bloco10IndicadorAlteracaoEndereco) {
		Bloco10IndicadorAlteracaoEndereco = bloco10IndicadorAlteracaoEndereco;
	}
	public String getBloco10CNAE() {
		return Bloco10CNAE;
	}
	public void setBloco10CNAE(String bloco10cnae) {
		Bloco10CNAE = bloco10cnae;
	}
	public String getBloco10indicadorAlteracaoCNAE() {
		return Bloco10indicadorAlteracaoCNAE;
	}
	public void setBloco10indicadorAlteracaoCNAE(
			String bloco10indicadorAlteracaoCNAE) {
		Bloco10indicadorAlteracaoCNAE = bloco10indicadorAlteracaoCNAE;
	}
	public String getBloco10AliquotaRAT() {
		return Bloco10AliquotaRAT;
	}
	public void setBloco10AliquotaRAT(String bloco10AliquotaRAT) {
		Bloco10AliquotaRAT = bloco10AliquotaRAT;
	}
	public String getBloco10CodigoCentralizacao() {
		return Bloco10CodigoCentralizacao;
	}
	public void setBloco10CodigoCentralizacao(String bloco10CodigoCentralizacao) {
		Bloco10CodigoCentralizacao = bloco10CodigoCentralizacao;
	}
	public String getBloco10Simples() {
		return Bloco10Simples;
	}
	public void setBloco10Simples(String bloco10Simples) {
		Bloco10Simples = bloco10Simples;
	}
	public String getBloco10FPAS() {
		return Bloco10FPAS;
	}
	public void setBloco10FPAS(String bloco10fpas) {
		Bloco10FPAS = bloco10fpas;
	}
	public String getBloco10CodigoOutroasEntidades() {
		return Bloco10CodigoOutroasEntidades;
	}
	public void setBloco10CodigoOutroasEntidades(
			String bloco10CodigoOutroasEntidades) {
		Bloco10CodigoOutroasEntidades = bloco10CodigoOutroasEntidades;
	}
	public String getBloco10CodigoPgtoGPS() {
		return Bloco10CodigoPgtoGPS;
	}
	public void setBloco10CodigoPgtoGPS(String bloco10CodigoPgtoGPS) {
		Bloco10CodigoPgtoGPS = bloco10CodigoPgtoGPS;
	}
	public String getBloco10PercentualInsencaoFilantropica() {
		return Bloco10PercentualInsencaoFilantropica;
	}
	public void setBloco10PercentualInsencaoFilantropica(
			String bloco10PercentualInsencaoFilantropica) {
		Bloco10PercentualInsencaoFilantropica = bloco10PercentualInsencaoFilantropica;
	}
	public String getBloco10SalarioFamilia() {
		return Bloco10SalarioFamilia;
	}
	public void setBloco10SalarioFamilia(String bloco10SalarioFamilia) {
		Bloco10SalarioFamilia = bloco10SalarioFamilia;
	}
	public String getBloco10SalarioMaternidade() {
		return Bloco10SalarioMaternidade;
	}
	public void setBloco10SalarioMaternidade(String bloco10SalarioMaternidade) {
		Bloco10SalarioMaternidade = bloco10SalarioMaternidade;
	}
	public String getBloco10ContribDescEmpregadoReferentaCompetencia13() {
		return Bloco10ContribDescEmpregadoReferentaCompetencia13;
	}
	public void setBloco10ContribDescEmpregadoReferentaCompetencia13(
			String bloco10ContribDescEmpregadoReferentaCompetencia13) {
		Bloco10ContribDescEmpregadoReferentaCompetencia13 = bloco10ContribDescEmpregadoReferentaCompetencia13;
	}
	public String getBloco10IndicadorValorNegativoPositivo() {
		return Bloco10IndicadorValorNegativoPositivo;
	}
	public void setBloco10IndicadorValorNegativoPositivo(
			String bloco10IndicadorValorNegativoPositivo) {
		Bloco10IndicadorValorNegativoPositivo = bloco10IndicadorValorNegativoPositivo;
	}
	public String getBloco10ValorDevidoPrevidnciaSocialReferenteComp13() {
		return Bloco10ValorDevidoPrevidnciaSocialReferenteComp13;
	}
	public void setBloco10ValorDevidoPrevidnciaSocialReferenteComp13(
			String bloco10ValorDevidoPrevidnciaSocialReferenteComp13) {
		Bloco10ValorDevidoPrevidnciaSocialReferenteComp13 = bloco10ValorDevidoPrevidnciaSocialReferenteComp13;
	}
	public String getBloco10Banco() {
		return Bloco10Banco;
	}
	public void setBloco10Banco(String bloco10Banco) {
		Bloco10Banco = bloco10Banco;
	}	
	public String getBloco10Agencia() {
		return Bloco10Agencia;
	}
	public void setBloco10Agencia(String bloco10Agencia) {
		Bloco10Agencia = bloco10Agencia;
	}
	public String getBloco10ContaCorrente() {
		return Bloco10ContaCorrente;
	}
	public void setBloco10ContaCorrente(String bloco10ContaCorrente) {
		Bloco10ContaCorrente = bloco10ContaCorrente;
	}
	public String getBloco10BrancosFinalLinha() {
		return Bloco10BrancosFinalLinha;
	}
	public void setBloco10BrancosFinalLinha(String bloco10BrancosFinalLinha) {
		Bloco10BrancosFinalLinha = bloco10BrancosFinalLinha;
	}
	//
	
	
	
	
	//INICIO 20
	public String Bloco20 = "";
	public String Bloco20TipoRegisto = "";
	public String Bloco20TipoInscricaoEmpresa = "";
	public String Bloco20TipoDaEmpresa = "";
	public String Bloco20TipoInscricaTomadorObraConstrucaoCivel = "";
	public String Bloco20InscricaTomadorObraConstrucaoCivel = "";
	public String Bloco20NomeTomadorObraConstCivil = "";
	public String Bloco20Logradouro = "";
	public String Bloco20Bairro = "";
	public String Bloco20CEP = "";
	public String Bloco20Cidade = "";
	public String Bloco20UF = "";	
	public String Bloco20CodPgtoGPS = "";	
	public String Bloco20SalarioFamilia = "";
	public String Bloco20ContribDescEmpregadoRefercompetncia13= "";
	public String Bloco20IndicadorValorNegativoPositivo = "";
	public String Bloco20ValorDevidoPrevidnciaSocialReferenteCompetncia = "";
	public String Bloco20ValordeRetencao = "";
	public String Bloco20ValordasfaturasEmitidasParaTomador = "";
	
	public String Bloco20Zero = "000000000000000000000000000000000000000000000";
	public String Bloco20Brancos = "                     ";//brancos Sempre Fixo
	public String Bloco20FinalLinha = "*";//Sempre Fixo
	
	
	
	public String getBloco20TipoRegisto() {
		return Bloco20TipoRegisto;
	}
	public void setBloco20TipoRegisto(String bloco20TipoRegisto) {
		Bloco20TipoRegisto = bloco20TipoRegisto;
	}
	public String getBloco20TipoInscricaoEmpresa() {
		return Bloco20TipoInscricaoEmpresa;
	}
	public void setBloco20TipoInscricaoEmpresa(String bloco20TipoInscricaoEmpresa) {
		Bloco20TipoInscricaoEmpresa = bloco20TipoInscricaoEmpresa;
	}
	public String getBloco20TipoInscricaTomadorObraConstrucaoCivel() {
		return Bloco20TipoInscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco20TipoInscricaTomadorObraConstrucaoCivel(
			String bloco20TipoInscricaTomadorObraConstrucaoCivel) {
		Bloco20TipoInscricaTomadorObraConstrucaoCivel = bloco20TipoInscricaTomadorObraConstrucaoCivel;
	}
	public String getBloco20TipoDaEmpresa() {
		return Bloco20TipoDaEmpresa;
	}
	public void setBloco20TipoDaEmpresa(String bloco20TipoDaEmpresa) {
		Bloco20TipoDaEmpresa = bloco20TipoDaEmpresa;
	}	
	public String getBloco20InscricaTomadorObraConstrucaoCivel() {
		return Bloco20InscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco20InscricaTomadorObraConstrucaoCivel(
			String bloco20InscricaTomadorObraConstrucaoCivel) {
		Bloco20InscricaTomadorObraConstrucaoCivel = bloco20InscricaTomadorObraConstrucaoCivel;
	}
	public String getBloco20NomeTomadorObraConstCivil() {
		return Bloco20NomeTomadorObraConstCivil;
	}
	public void setBloco20NomeTomadorObraConstCivil(
			String bloco20NomeTomadorObraConstCivil) {
		Bloco20NomeTomadorObraConstCivil = bloco20NomeTomadorObraConstCivil;
	}
	public String getBloco20Logradouro() {
		return Bloco20Logradouro;
	}
	public void setBloco20Logradouro(String bloco20Logradouro) {
		Bloco20Logradouro = bloco20Logradouro;
	}
	public String getBloco20Bairro() {
		return Bloco20Bairro;
	}
	public void setBloco20Bairro(String bloco20Bairro) {
		Bloco20Bairro = bloco20Bairro;
	}
	public String getBloco20CEP() {
		return Bloco20CEP;
	}
	public void setBloco20CEP(String bloco20cep) {
		Bloco20CEP = bloco20cep;
	}
	public String getBloco20Cidade() {
		return Bloco20Cidade;
	}
	public void setBloco20Cidade(String bloco20Cidade) {
		Bloco20Cidade = bloco20Cidade;
	}
	public String getBloco20UF() {
		return Bloco20UF;
	}
	public void setBloco20UF(String bloco20uf) {
		Bloco20UF = bloco20uf;
	}
	public String getBloco20CodPgtoGPS() {
		return Bloco20CodPgtoGPS;
	}
	public void setBloco20CodPgtoGPS(String bloco20CodPgtoGPS) {
		Bloco20CodPgtoGPS = bloco20CodPgtoGPS;
	}
	public String getBloco20SalarioFamilia() {
		return Bloco20SalarioFamilia;
	}
	public void setBloco20SalarioFamilia(String bloco20SalarioFamilia) {
		Bloco20SalarioFamilia = bloco20SalarioFamilia;
	}
	public String getBloco20ContribDescEmpregadoRefercompetncia13() {
		return Bloco20ContribDescEmpregadoRefercompetncia13;
	}
	public void setBloco20ContribDescEmpregadoRefercompetncia13(
			String bloco20ContribDescEmpregadoRefercompetncia13) {
		Bloco20ContribDescEmpregadoRefercompetncia13 = bloco20ContribDescEmpregadoRefercompetncia13;
	}
	public String getBloco20IndicadorValorNegativoPositivo() {
		return Bloco20IndicadorValorNegativoPositivo;
	}
	public void setBloco20IndicadorValorNegativoPositivo(
			String bloco20IndicadorValorNegativoPositivo) {
		Bloco20IndicadorValorNegativoPositivo = bloco20IndicadorValorNegativoPositivo;
	}

	
	
	public String getBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia() {
		return Bloco20ValorDevidoPrevidnciaSocialReferenteCompetncia;
	}
	public void setBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia(
			String bloco20ValorDevidoPrevidnciaSocialReferenteCompetncia) {
		Bloco20ValorDevidoPrevidnciaSocialReferenteCompetncia = bloco20ValorDevidoPrevidnciaSocialReferenteCompetncia;
	}
	public String getBloco20ValordeRetencao() {
		return Bloco20ValordeRetencao;
	}
	public void setBloco20ValordeRetencao(String bloco20ValordeRetencao) {
		Bloco20ValordeRetencao = bloco20ValordeRetencao;
	}
	public String getBloco20ValordasfaturasEmitidasParaTomador() {
		return Bloco20ValordasfaturasEmitidasParaTomador;
	}
	public void setBloco20ValordasfaturasEmitidasParaTomador(
			String bloco20ValordasfaturasEmitidasParaTomador) {
		Bloco20ValordasfaturasEmitidasParaTomador = bloco20ValordasfaturasEmitidasParaTomador;
	}
	
	
	public ArrayList<String> Bloco20ArrayNomeEmpresaInscricaoObra = new ArrayList<String> ();
	
	public ArrayList<String> getBloco20ArrayNomeEmpresaInscricaoObra() {
		return Bloco20ArrayNomeEmpresaInscricaoObra;
	}
	public void setBloco20ArrayNomeEmpresaInscricaoObra(
			ArrayList<String> bloco20ArrayNomeEmpresaInscricaoObra) {
		Bloco20ArrayNomeEmpresaInscricaoObra = bloco20ArrayNomeEmpresaInscricaoObra;
	}
	//FIM 20

	
	// INICIO 21
	public String Bloco21 = "";
	public String Bloco21Ti3poRegisto = "";
	public String Bloco21TipoInscricaoEmpresa = "";
	public String Bloco21InscricaoEmpresa = "";
	public String Bloco21TipoInscricaTomadorObraConstrucaoCivel = "";
	public String Bloco21InscricaTomadorObraConstrucaoCivel = "";
	public String Bloco21CompensacaoValorCorrigido = ""; 
	public String Bloco21CompensacaoPeriodoInicio = ""; 
	public String Bloco21CompensacaoPeriodoFim = "";
	public String Bloco21RecolhimentoCompetenciasAnterioresValorInss = "";
	public String Bloco21RecolhimentoCompetenciasAnterioresOutrasEntidades = "";
	public String Bloco21ParcelamentoFGTScategorias0102030506 = "";
	public String Bloco21ParcelamentoFGTScategorias0407 = "";
	public String Bloco21ParcelamentoFGTSvalorrecolhido = "";
	
	
	public String Bloco21Zero = "000000000000000000000";
	public String Bloco21Brancos = "                                                                                                                                                                                                            ";//brancos Sempre Fixo
	public String Bloco21FinalLinha = "*";//Sempre Fixo
	
	public String getBloco21Ti3poRegisto() {
		return Bloco21Ti3poRegisto;
	}
	public void setBloco21Ti3poRegisto(String bloco21Ti3poRegisto) {
		Bloco21Ti3poRegisto = bloco21Ti3poRegisto;
	}
	public String getBloco21TipoInscricaoEmpresa() {
		return Bloco21TipoInscricaoEmpresa;
	}
	public void setBloco21TipoInscricaoEmpresa(String bloco21TipoInscricaoEmpresa) {
		Bloco21TipoInscricaoEmpresa = bloco21TipoInscricaoEmpresa;
	}
	public String getBloco21InscricaoEmpresa() {
		return Bloco21InscricaoEmpresa;
	}
	public void setBloco21InscricaoEmpresa(String bloco21InscricaoEmpresa) {
		Bloco21InscricaoEmpresa = bloco21InscricaoEmpresa;
	}
	public String getBloco21TipoInscricaTomadorObraConstrucaoCivel() {
		return Bloco21TipoInscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco21TipoInscricaTomadorObraConstrucaoCivel(
			String bloco21TipoInscricaTomadorObraConstrucaoCivel) {
		Bloco21TipoInscricaTomadorObraConstrucaoCivel = bloco21TipoInscricaTomadorObraConstrucaoCivel;
	}
	public String getBloco21InscricaTomadorObraConstrucaoCivel() {
		return Bloco21InscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco21InscricaTomadorObraConstrucaoCivel(
			String bloco21InscricaTomadorObraConstrucaoCivel) {
		Bloco21InscricaTomadorObraConstrucaoCivel = bloco21InscricaTomadorObraConstrucaoCivel;
	}
	public String getBloco21CompensacaoValorCorrigido() {
		return Bloco21CompensacaoValorCorrigido;
	}
	public void setBloco21CompensacaoValorCorrigido(
			String bloco21CompensacaoValorCorrigido) {
		Bloco21CompensacaoValorCorrigido = bloco21CompensacaoValorCorrigido;
	}
	public String getBloco21CompensacaoPeriodoInicio() {
		return Bloco21CompensacaoPeriodoInicio;
	}
	public void setBloco21CompensacaoPeriodoInicio(
			String bloco21CompensacaoPeriodoInicio) {
		Bloco21CompensacaoPeriodoInicio = bloco21CompensacaoPeriodoInicio;
	}
	public String getBloco21CompensacaoPeriodoFim() {
		return Bloco21CompensacaoPeriodoFim;
	}
	public void setBloco21CompensacaoPeriodoFim(String bloco21CompensacaoPeriodoFim) {
		Bloco21CompensacaoPeriodoFim = bloco21CompensacaoPeriodoFim;
	}
	public String getBloco21RecolhimentoCompetenciasAnterioresValorInss() {
		return Bloco21RecolhimentoCompetenciasAnterioresValorInss;
	}
	public void setBloco21RecolhimentoCompetenciasAnterioresValorInss(
			String bloco21RecolhimentoCompetenciasAnterioresValorInss) {
		Bloco21RecolhimentoCompetenciasAnterioresValorInss = bloco21RecolhimentoCompetenciasAnterioresValorInss;
	}
	public String getBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades() {
		return Bloco21RecolhimentoCompetenciasAnterioresOutrasEntidades;
	}
	public void setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades(
			String bloco21RecolhimentoCompetenciasAnterioresOutrasEntidades) {
		Bloco21RecolhimentoCompetenciasAnterioresOutrasEntidades = bloco21RecolhimentoCompetenciasAnterioresOutrasEntidades;
	}
	public String getBloco21ParcelamentoFGTScategorias0102030506() {
		return Bloco21ParcelamentoFGTScategorias0102030506;
	}
	public void setBloco21ParcelamentoFGTScategorias0102030506(
			String bloco21ParcelamentoFGTScategorias0102030506) {
		Bloco21ParcelamentoFGTScategorias0102030506 = bloco21ParcelamentoFGTScategorias0102030506;
	}
	public String getBloco21ParcelamentoFGTScategorias0407() {
		return Bloco21ParcelamentoFGTScategorias0407;
	}
	public void setBloco21ParcelamentoFGTScategorias0407(
			String bloco21ParcelamentoFGTScategorias0407) {
		Bloco21ParcelamentoFGTScategorias0407 = bloco21ParcelamentoFGTScategorias0407;
	}
	public String getBloco21ParcelamentoFGTSvalorrecolhido() {
		return Bloco21ParcelamentoFGTSvalorrecolhido;
	}
	public void setBloco21ParcelamentoFGTSvalorrecolhido(
			String bloco21ParcelamentoFGTSvalorrecolhido) {
		Bloco21ParcelamentoFGTSvalorrecolhido = bloco21ParcelamentoFGTSvalorrecolhido;
	}

	// FIM 21
	



	// INICIO 13 --
	public String Bloco13 = "";
	public String Bloco13TipoRegisto = "";
	public String Bloco13TipoInscricaoEmpresa = "";	
	public String Bloco13InscricaoEmpresa = "";	
	public String Bloco13Zero = "000000000000000000000000000000000000";
	public String Bloco13PisPaseCi = "";
	public String Bloco13DataAdm = "";
	public String Bloco13Categoria = "";
	public String Bloco13MatriculaEmpregado = "";
	public String Bloco13NumeroCTPS = "";
	public String Bloco13SerieCTPS = "";	
	public String Bloco13NomeTrabalhador = "";
	
	public String Bloco13CodigoEmpresaCAIXA = "";
	public String Bloco13CodigoTrabalhadorCAIXA = "";
	public String Bloco13CodigoAlteraoCadastral = "";
	public String Bloco13NovoConteudoDoCampo = "";
	
	public String Bloco13Brancos = "                                                                                             ";//brancos Sempre Fixo
	public String Bloco13FinalLinha = "*";//Sempre Fixo
	
	

	public String getBloco13TipoRegisto() {
		return Bloco13TipoRegisto;
	}
	public void setBloco13TipoRegisto(String bloco13TipoRegisto) {
		Bloco13TipoRegisto = bloco13TipoRegisto;
	}
	public String getBloco13TipoInscricaoEmpresa() {
		return Bloco13TipoInscricaoEmpresa;
	}
	public void setBloco13TipoInscricaoEmpresa(String bloco13TipoInscricaoEmpresa) {
		Bloco13TipoInscricaoEmpresa = bloco13TipoInscricaoEmpresa;
	}
	public String getBloco13InscricaoEmpresa() {
		return Bloco13InscricaoEmpresa;
	}
	public void setBloco13InscricaoEmpresa(String bloco13InscricaoEmpresa) {
		Bloco13InscricaoEmpresa = bloco13InscricaoEmpresa;
	}
	public String getBloco13PisPaseCi() {
		return Bloco13PisPaseCi;
	}
	public void setBloco13PisPaseCi(String bloco13PisPaseCi) {
		Bloco13PisPaseCi = bloco13PisPaseCi;
	}
	public String getBloco13DataAdm() {
		return Bloco13DataAdm;
	}
	public void setBloco13DataAdm(String bloco13DataAdm) {
		Bloco13DataAdm = bloco13DataAdm;
	}
	public String getBloco13Categoria() {
		return Bloco13Categoria;
	}
	public void setBloco13Categoria(String bloco13Categoria) {
		Bloco13Categoria = bloco13Categoria;
	}
	public String getBloco13MatriculaEmpregado() {
		return Bloco13MatriculaEmpregado;
	}
	public void setBloco13MatriculaEmpregado(String bloco13MatriculaEmpregado) {
		Bloco13MatriculaEmpregado = bloco13MatriculaEmpregado;
	}
	public String getBloco13NumeroCTPS() {
		return Bloco13NumeroCTPS;
	}
	public void setBloco13NumeroCTPS(String bloco13NumeroCTPS) {
		Bloco13NumeroCTPS = bloco13NumeroCTPS;
	}
	public String getBloco13SerieCTPS() {
		return Bloco13SerieCTPS;
	}
	public void setBloco13SerieCTPS(String bloco13SerieCTPS) {
		Bloco13SerieCTPS = bloco13SerieCTPS;
	}
	public String getBloco13NomeTrabalhador() {
		return Bloco13NomeTrabalhador;
	}
	public void setBloco13NomeTrabalhador(String bloco13NomeTrabalhador) {
		Bloco13NomeTrabalhador = bloco13NomeTrabalhador;
	}
	public String getBloco13CodigoEmpresaCAIXA() {
		return Bloco13CodigoEmpresaCAIXA;
	}
	public void setBloco13CodigoEmpresaCAIXA(String bloco13CodigoEmpresaCAIXA) {
		Bloco13CodigoEmpresaCAIXA = bloco13CodigoEmpresaCAIXA;
	}
	public String getBloco13CodigoTrabalhadorCAIXA() {
		return Bloco13CodigoTrabalhadorCAIXA;
	}
	public void setBloco13CodigoTrabalhadorCAIXA(
			String bloco13CodigoTrabalhadorCAIXA) {
		Bloco13CodigoTrabalhadorCAIXA = bloco13CodigoTrabalhadorCAIXA;
	}
	
	public String getBloco13CodigoAlteraoCadastral() {
		return Bloco13CodigoAlteraoCadastral;
	}
	public void setBloco13CodigoAlteraoCadastral(
			String bloco13CodigoAlteraoCadastral) {
		Bloco13CodigoAlteraoCadastral = bloco13CodigoAlteraoCadastral;
	}
	public String getBloco13NovoConteudoDoCampo() {
		return Bloco13NovoConteudoDoCampo;
	}
	public void setBloco13NovoConteudoDoCampo(String bloco13NovoConteudoDoCampo) {
		Bloco13NovoConteudoDoCampo = bloco13NovoConteudoDoCampo;
	}

	// FIM 13
	
	
	



	// INICIO 14 --
	public String Bloco14 = "";
	public String Bloco14TipoRegisto = "";
	public String Bloco14TipoInscricaoEmpresa = "";	
	public String Bloco14InscricaoEmpresa = "";	
	public String Bloco14Zero = "000000000000000000000000000000000000";
	public String Bloco14PisPaseCi = "";
	public String Bloco14DataAdm = "";
	public String Bloco14Categoria = "";
	public String Bloco14NomeTrabalhador = "";
	public String Bloco14NumeroCTPS = "";
	public String Bloco14SerieCTPS = "";
	public String Bloco14Logradouro = "";
	public String Bloco14Bairro = "";
	public String Bloco14CEP = "";
	public String Bloco14Cidade = "";
	public String Bloco14UF = "";
	public String Bloco14Brancos = "                                                                                                       ";//brancos Sempre Fixo
	public String Bloco14FinalLinha = "*";//Sempre Fixo
	
	public String getBloco14TipoRegisto() {
		return Bloco14TipoRegisto;
	}
	public void setBloco14TipoRegisto(String bloco14TipoRegisto) {
		Bloco14TipoRegisto = bloco14TipoRegisto;
	}
	public String getBloco14TipoInscricaoEmpresa() {
		return Bloco14TipoInscricaoEmpresa;
	}
	public void setBloco14TipoInscricaoEmpresa(String bloco14TipoInscricaoEmpresa) {
		Bloco14TipoInscricaoEmpresa = bloco14TipoInscricaoEmpresa;
	}
	public String getBloco14InscricaoEmpresa() {
		return Bloco14InscricaoEmpresa;
	}
	public void setBloco14InscricaoEmpresa(String bloco14InscricaoEmpresa) {
		Bloco14InscricaoEmpresa = bloco14InscricaoEmpresa;
	}
	public String getBloco14PisPaseCi() {
		return Bloco14PisPaseCi;
	}
	public void setBloco14PisPaseCi(String bloco14PisPaseCi) {
		Bloco14PisPaseCi = bloco14PisPaseCi;
	}
	public String getBloco14DataAdm() {
		return Bloco14DataAdm;
	}
	public void setBloco14DataAdm(String bloco14DataAdm) {
		Bloco14DataAdm = bloco14DataAdm;
	}
	public String getBloco14Categoria() {
		return Bloco14Categoria;
	}
	public void setBloco14Categoria(String bloco14Categoria) {
		Bloco14Categoria = bloco14Categoria;
	}
	public String getBloco14NomeTrabalhador() {
		return Bloco14NomeTrabalhador;
	}
	public void setBloco14NomeTrabalhador(String bloco14NomeTrabalhador) {
		Bloco14NomeTrabalhador = bloco14NomeTrabalhador;
	}
	public String getBloco14NumeroCTPS() {
		return Bloco14NumeroCTPS;
	}
	public void setBloco14NumeroCTPS(String bloco14NumeroCTPS) {
		Bloco14NumeroCTPS = bloco14NumeroCTPS;
	}
	public String getBloco14SerieCTPS() {
		return Bloco14SerieCTPS;
	}
	public void setBloco14SerieCTPS(String bloco14SerieCTPS) {
		Bloco14SerieCTPS = bloco14SerieCTPS;
	}
	public String getBloco14Logradouro() {
		return Bloco14Logradouro;
	}
	public void setBloco14Logradouro(String bloco14Logradouro) {
		Bloco14Logradouro = bloco14Logradouro;
	}
	public String getBloco14Bairro() {
		return Bloco14Bairro;
	}
	public void setBloco14Bairro(String bloco14Bairro) {
		Bloco14Bairro = bloco14Bairro;
	}
	public String getBloco14CEP() {
		return Bloco14CEP;
	}
	public void setBloco14CEP(String bloco14cep) {
		Bloco14CEP = bloco14cep;
	}
	public String getBloco14Cidade() {
		return Bloco14Cidade;
	}
	public void setBloco14Cidade(String bloco14Cidade) {
		Bloco14Cidade = bloco14Cidade;
	}
	public String getBloco14UF() {
		return Bloco14UF;
	}
	public void setBloco14UF(String bloco14uf) {
		Bloco14UF = bloco14uf;
	}
	// FIM 14
	
	
	// INICIO 32 --
	public String Bloco32TipoRegisto = "";//Sempre Fixo	
	public String Bloco32TipoInscricaoEmpresa = "";	
	public String Bloco32InscricaoEmpresa = "";	
	public String Bloco32TipoInscricaoObra = "";
	public String Bloco32InscricaTomadorObraConstrucaoCivel = "";
	public String Bloco32PisPaseCi = "";//Ammara com o 30 este campo
	public String Bloco32DataAdm = "";
	public String Bloco32Categoria = "";
	public String Bloco32NomeTrabalhador = "";
	public String Bloco32CodMovimentacao = "";
	public String Bloco32DataMovimentacao = "";
	public String Bloco32IndicativoRecolhimentoFGTS = "";
	public String Bloco32Brancos = "                                                                                                                                                                                                                                  ";//256/255 brancos Sempre Fixo
	public String Bloco32FinalLinha = "*";//Sempre Fixo
	
	
	
	public String getBloco32TipoRegisto() {
		return Bloco32TipoRegisto;
	}
	public void setBloco32TipoRegisto(String bloco32TipoRegisto) {
		Bloco32TipoRegisto = bloco32TipoRegisto;
	}
	public String getBloco32TipoInscricaoEmpresa() {
		return Bloco32TipoInscricaoEmpresa;
	}
	public void setBloco32TipoInscricaoEmpresa(String bloco32TipoInscricaoEmpresa) {
		Bloco32TipoInscricaoEmpresa = bloco32TipoInscricaoEmpresa;
	}
	public String getBloco32InscricaoEmpresa() {
		return Bloco32InscricaoEmpresa;
	}
	public void setBloco32InscricaoEmpresa(String bloco32InscricaoEmpresa) {
		Bloco32InscricaoEmpresa = bloco32InscricaoEmpresa;
	}
	public String getBloco32TipoInscricaoObra() {
		return Bloco32TipoInscricaoObra;
	}
	public void setBloco32TipoInscricaoObra(String bloco32TipoInscricaoObra) {
		Bloco32TipoInscricaoObra = bloco32TipoInscricaoObra;
	}
	public String getBloco32InscricaTomadorObraConstrucaoCivel() {
		return Bloco32InscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco32InscricaTomadorObraConstrucaoCivel(
			String bloco32InscricaTomadorObraConstrucaoCivel) {
		Bloco32InscricaTomadorObraConstrucaoCivel = bloco32InscricaTomadorObraConstrucaoCivel;
	}
	public String getBloco32PisPaseCi() {
		return Bloco32PisPaseCi;
	}
	public void setBloco32PisPaseCi(String bloco32PisPaseCi) {
		Bloco32PisPaseCi = bloco32PisPaseCi;
	}
	public String getBloco32DataAdm() {
		return Bloco32DataAdm;
	}
	public void setBloco32DataAdm(String bloco32DataAdm) {
		Bloco32DataAdm = bloco32DataAdm;
	}
	public String getBloco32Categoria() {
		return Bloco32Categoria;
	}
	public void setBloco32Categoria(String bloco32Categoria) {
		Bloco32Categoria = bloco32Categoria;
	}
	public String getBloco32NomeTrabalhador() {
		return Bloco32NomeTrabalhador;
	}
	public void setBloco32NomeTrabalhador(String bloco32NomeTrabalhador) {
		Bloco32NomeTrabalhador = bloco32NomeTrabalhador;
	}
	public String getBloco32CodMovimentacao() {
		return Bloco32CodMovimentacao;
	}
	public void setBloco32CodMovimentacao(String bloco32CodMovimentacao) {
		Bloco32CodMovimentacao = bloco32CodMovimentacao;
	}
	public String getBloco32DataMovimentacao() {
		return Bloco32DataMovimentacao;
	}
	public void setBloco32DataMovimentacao(String bloco32DataMovimentacao) {
		Bloco32DataMovimentacao = bloco32DataMovimentacao;
	}
	public String getBloco32IndicativoRecolhimentoFGTS() {
		return Bloco32IndicativoRecolhimentoFGTS;
	}
	public void setBloco32IndicativoRecolhimentoFGTS(
			String bloco32IndicativoRecolhimentoFGTS) {
		Bloco32IndicativoRecolhimentoFGTS = bloco32IndicativoRecolhimentoFGTS;
	}
	public String getBloco32Brancos() {
		return Bloco32Brancos;
	}
	public void setBloco32Brancos(String bloco32Brancos) {
		Bloco32Brancos = bloco32Brancos;
	}
	public String getBloco32FinalLinha() {
		return Bloco32FinalLinha;
	}
	public void setBloco32FinalLinha(String bloco32FinalLinha) {
		Bloco32FinalLinha = bloco32FinalLinha;
	}	
	
	public ArrayList<String> getBloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento() {
		return Bloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento;
	}
	public void setBloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento(
			ArrayList<String> bloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento) {
		Bloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento = bloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento;
	}
	// FIM 32 --
	
	
	
	// INICIO BLOCO 30--
	public String Bloco30 = ""; 
	public String Bloco30TipoRegisto = "";//Sempre Fixo	
	public String Bloco30TipoInscricaoEmpresa = "";	
	public String Bloco30InscricaoEmpresa = "";	
	public String Bloco30TipoInscricaoObra = "";
	public String Bloco30InscricaTomadorObraConstrucaoCivel = "";
	public String Bloco30PisPaseCi = "";
	public String Bloco30DataAdm = "";
	public String Bloco30Categoria = "";
	public String Bloco30NomeTrabalhador = "";
	public String Bloco30MatriculaEmpregado = "";
	public String Bloco30NumeroCTPS = "";
	public String Bloco30SerieCTPS = "";
	public String Bloco30DataOpcao = "";
	public String Bloco30DataNascimento = "";
	public String Bloco30CBO = "";	
	public String Bloco30RemuneracaoSem13 = "";
	public String Bloco30Remuneracao13 = "";
	public String Bloco30ClasseContribuicao = "";
	public String Bloco30Ocorrencia = "";
	public String Bloco30ValorDescontoSegurado = "";
	public String Bloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria = "";
	public String Bloco30BaseCalculo13PrevidenciaSocial = "";
	public String Bloco30BaseCalculo13PrevidenciaGPSCompetencia13 = "";
	public String Bloco30Brancos = "                                                                                                  ";//Sempre Fixo
	public String Bloco30FinalLinha = "*";//Sempre Fixo
	public ArrayList<String> Bloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador = new ArrayList<String> ();
	public ArrayList<String> Bloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento = new ArrayList<String> ();
	public String Bloco30ValorComboSelecionadoFuncionario = "Selecione o Funcionario";//Sempre Fixo
	

	public String getBloco30() {
		return Bloco30;
	}
	public void setBloco30(String bloco30) {
		Bloco30 = bloco30;
	}
	public String getBloco30TipoRegisto() {
		return Bloco30TipoRegisto;
	}
	public void setBloco30TipoRegisto(String bloco30TipoRegisto) {
		Bloco30TipoRegisto = bloco30TipoRegisto;
	}
	public String getBloco30TipoInscricaoEmpresa() {
		return Bloco30TipoInscricaoEmpresa;
	}
	public void setBloco30TipoInscricaoEmpresa(String bloco30TipoInscricaoEmpresa) {
		Bloco30TipoInscricaoEmpresa = bloco30TipoInscricaoEmpresa;
	}
	public String getBloco30InscricaoEmpresa() {
		return Bloco30InscricaoEmpresa;
	}
	public void setBloco30InscricaoEmpresa(String bloco30InscricaoEmpresa) {
		Bloco30InscricaoEmpresa = bloco30InscricaoEmpresa;
	}
	public String getBloco30TipoInscricaoObra() {
		return Bloco30TipoInscricaoObra;
	}
	public void setBloco30TipoInscricaoObra(String bloco30TipoInscricaoObra) {
		Bloco30TipoInscricaoObra = bloco30TipoInscricaoObra;
	}
	public String getBloco30InscricaTomadorObraConstrucaoCivel() {
		return Bloco30InscricaTomadorObraConstrucaoCivel;
	}
	public void setBloco30InscricaTomadorObraConstrucaoCivel(
			String bloco30InscricaTomadorObraConstrucaoCivel) {
		Bloco30InscricaTomadorObraConstrucaoCivel = bloco30InscricaTomadorObraConstrucaoCivel;
	}	
	public String getBloco30PisPaseCi() {
		return Bloco30PisPaseCi;
	}
	public void setBloco30PisPaseCi(String bloco30PisPaseCi) {
		Bloco30PisPaseCi = bloco30PisPaseCi;
	}
	public String getBloco30DataAdm() {
		return Bloco30DataAdm;
	}
	public void setBloco30DataAdm(String bloco30DataAdm) {
		Bloco30DataAdm = bloco30DataAdm;
	}
	public String getBloco30Categoria() {
		return Bloco30Categoria;
	}
	public void setBloco30Categoria(String bloco30Categoria) {
		Bloco30Categoria = bloco30Categoria;
	}
	public String getBloco30NomeTrabalhador() {
		return Bloco30NomeTrabalhador;
	}
	public void setBloco30NomeTrabalhador(String bloco30NomeTrabalhador) {
		Bloco30NomeTrabalhador = bloco30NomeTrabalhador;
	}
	public String getBloco30MatriculaEmpregado() {
		return Bloco30MatriculaEmpregado;
	}
	public void setBloco30MatriculaEmpregado(String bloco30MatriculaEmpregado) {
		Bloco30MatriculaEmpregado = bloco30MatriculaEmpregado;
	}
	public String getBloco30NumeroCTPS() {
		return Bloco30NumeroCTPS;
	}
	public void setBloco30NumeroCTPS(String bloco30NumeroCTPS) {
		Bloco30NumeroCTPS = bloco30NumeroCTPS;
	}
	public String getBloco30SerieCTPS() {
		return Bloco30SerieCTPS;
	}
	public void setBloco30SerieCTPS(String bloco30SerieCTPS) {
		Bloco30SerieCTPS = bloco30SerieCTPS;
	}
	public String getBloco30DataOpcao() {
		return Bloco30DataOpcao;
	}
	public void setBloco30DataOpcao(String bloco30DataOpcao) {
		Bloco30DataOpcao = bloco30DataOpcao;
	}
	public String getBloco30DataNascimento() {
		return Bloco30DataNascimento;
	}
	public void setBloco30DataNascimento(String bloco30DataNascimento) {
		Bloco30DataNascimento = bloco30DataNascimento;
	}
	public String getBloco30CBO() {
		return Bloco30CBO;
	}
	public void setBloco30CBO(String bloco30cbo) {
		Bloco30CBO = bloco30cbo;
	}
	public String getBloco30RemuneracaoSem13() {
		return Bloco30RemuneracaoSem13;
	}
	public void setBloco30RemuneracaoSem13(String bloco30RemuneracaoSem13) {
		Bloco30RemuneracaoSem13 = bloco30RemuneracaoSem13;
	}
	public String getBloco30Remuneracao13() {
		return Bloco30Remuneracao13;
	}
	public void setBloco30Remuneracao13(String bloco30Remuneracao13) {
		Bloco30Remuneracao13 = bloco30Remuneracao13;
	}
	public String getBloco30ClasseContribuicao() {
		return Bloco30ClasseContribuicao;
	}
	public void setBloco30ClasseContribuicao(String bloco30ClasseContribuicao) {
		Bloco30ClasseContribuicao = bloco30ClasseContribuicao;
	}
	public String getBloco30Ocorrencia() {
		return Bloco30Ocorrencia;
	}
	public void setBloco30Ocorrencia(String bloco30Ocorrencia) {
		Bloco30Ocorrencia = bloco30Ocorrencia;
	}
	public String getBloco30ValorDescontoSegurado() {
		return Bloco30ValorDescontoSegurado;
	}
	public void setBloco30ValorDescontoSegurado(String bloco30ValorDescontoSegurado) {
		Bloco30ValorDescontoSegurado = bloco30ValorDescontoSegurado;
	}
	public String getBloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria() {
		return Bloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria;
	}
	public void setBloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria(
			String bloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria) {
		Bloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria = bloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria;
	}
	public String getBloco30BaseCalculo13PrevidenciaSocial() {
		return Bloco30BaseCalculo13PrevidenciaSocial;
	}
	public void setBloco30BaseCalculo13PrevidenciaSocial(
			String bloco30BaseCalculo13PrevidenciaSocial) {
		Bloco30BaseCalculo13PrevidenciaSocial = bloco30BaseCalculo13PrevidenciaSocial;
	}
	public String getBloco30BaseCalculo13PrevidenciaGPSCompetencia13() {
		return Bloco30BaseCalculo13PrevidenciaGPSCompetencia13;
	}
	public void setBloco30BaseCalculo13PrevidenciaGPSCompetencia13(
			String bloco30BaseCalculo13PrevidenciaGPSCompetencia13) {
		Bloco30BaseCalculo13PrevidenciaGPSCompetencia13 = bloco30BaseCalculo13PrevidenciaGPSCompetencia13;
	}
	public String getBloco30Brancos() {
		return Bloco30Brancos;
	}
	public void setBloco30Brancos(String bloco30Brancos) {
		Bloco30Brancos = bloco30Brancos;
	}
	public String getBloco30FinalLinha() {
		return Bloco30FinalLinha;
	}
	public void setBloco30FinalLinha(String bloco30FinalLinha) {
		Bloco30FinalLinha = bloco30FinalLinha;
	}
	public String getBloco30ValorComboSelecionadoFuncionario() {
		return Bloco30ValorComboSelecionadoFuncionario;
	}
	public void setBloco30ValorComboSelecionadoFuncionario(
			String bloco30ValorComboSelecionadoFuncionario) {
		Bloco30ValorComboSelecionadoFuncionario = bloco30ValorComboSelecionadoFuncionario;
	}	
	public ArrayList<String> getBloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador() {
		return Bloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador;
	}
	public void setBloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador(
			ArrayList<String> bloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador) {
		Bloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador = bloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador;
	}
	// FIM BLOCO 30--
	


	
	
    public ArrayList<String> ncmAliquotaZero = new ArrayList<String> ();
	
    public ArrayList<String> getNcmAliquotaZero() {
		return ncmAliquotaZero;
	}
	public void setNcmAliquotaZero(ArrayList<String> ncmAliquotaZero) {
		this.ncmAliquotaZero = ncmAliquotaZero;
	}

}
