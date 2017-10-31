package br.com.sefip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class BeanControle {
	
	GetSetSefip getSetSefip = new GetSetSefip();
	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
	
	ArrayList<String> Arraybloco00 = new ArrayList<String> ();	
	ArrayList<String> Arraybloco10 = new ArrayList<String> ();	
	ArrayList<String> Arraybloco12 = new ArrayList<String> ();
	ArrayList<String> Arraybloco13 = new ArrayList<String> ();
	ArrayList<String> Arraybloco14 = new ArrayList<String> ();
	ArrayList<String> Arraybloco20 = new ArrayList<String> ();	
	ArrayList<String> Arraybloco32NomeEmpresaInscricaoObra = new ArrayList<String> ();
	ArrayList<String> Arraybloco21 = new ArrayList<String> ();	
	ArrayList<String> Arraybloco30 = new ArrayList<String> ();
	ArrayList<String> Arraybloco30PISNomeTrabalhados = new ArrayList<String> ();
	ArrayList<String> Arraybloco32 = new ArrayList<String> ();
	ArrayList<String> Arraybloco32PISNomeTrabalhadosDataMovimento = new ArrayList<String> ();
	
	
	ArrayList<String> Arraybloco50 = new ArrayList<String> ();	
	ArrayList<String> Arraybloco51 = new ArrayList<String> ();
	ArrayList<String> Arraybloco90 = new ArrayList<String> ();
	
	
    public GetSetSefip sefip(String Path) { 
	    	System.out.println(Path);
	    	File file = new File(Path);
	    	String Obra = " - Obra: - Nao";
	    	
	    	Arraybloco30PISNomeTrabalhados.clear();
	    	Arraybloco32PISNomeTrabalhadosDataMovimento.clear();
	    	Arraybloco32NomeEmpresaInscricaoObra.clear();
	    	
	    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
	    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
	
	    	
	    	System.out.println("RECEBEU  Path = " + Path);
	    	
	    	try {
	            FileReader reader = new FileReader(file);  
	            BufferedReader input = new BufferedReader(reader);
	            String linha;
	            while ((linha = input.readLine()) != null) {
	
		  	    
	        		if((linha.substring(0,2)).equals("00"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco00.add(linha);
	        		}
	        		else if((linha.substring(0,2)).equals("10"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco10.add(linha);
	        		}
	        		else if((linha.substring(0,2)).equals("12"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco12.add(linha);
	        		} 
	        		else if((linha.substring(0,2)).equals("13"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco13.add(linha);
	        		}  
	        		else if((linha.substring(0,2)).equals("14"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco14.add(linha);
	        		}         		
	        		else if((linha.substring(0,2)).equals("20"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco20.add(linha);
	        			
	        			//Obra + Nome da Empresa
	        			Arraybloco32NomeEmpresaInscricaoObra.add(linha.substring(18,32)+ " - "+ linha.substring(53,93));
	        			getSetSefip.setBloco20ArrayNomeEmpresaInscricaoObra(Arraybloco32NomeEmpresaInscricaoObra);
	        			getSetSefip.setLisEmpresaCodigoObra(Arraybloco32NomeEmpresaInscricaoObra);
	
	        		}  
	        		else if((linha.substring(0,2)).equals("21"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco21.add(linha);
	        		} 
	        		else if((linha.substring(0,2)).equals("30"))
	        		{
	        			//System.out.println(linha);
	        			
	        			Arraybloco30.add(linha);
	        			
	        			
	        			if (!linha.substring(18,32).trim().isEmpty())
	        				Obra = " - OBRA: "+ linha.substring(18,32).trim();
	        			else
	        				Obra = " - OBRA: SEM OBRA";
	        		
	        			//Arraybloco30PISNomeTrabalhados.add(linha.substring(32,43)+" "+linha.substring(53,123));
	        			Arraybloco30PISNomeTrabalhados.add(linha.substring(53,123)+" "+linha.substring(32,43) + Obra);
	        			getSetSefip.setBloco30ArrayBloco30NumeroPisBloco30NomeTrabalhador(Arraybloco30PISNomeTrabalhados);        			
	        			getSetSefip.setLisFuncionarios(Arraybloco30PISNomeTrabalhados);
	        		}  
	        		else if((linha.substring(0,2)).equals("32"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco32.add(linha);
	        			
	        			Arraybloco32PISNomeTrabalhadosDataMovimento.add(linha.substring(53,123)+" "+linha.substring(32,43)+" "+linha.substring(125,133));
	        			getSetSefip.setBloco32ArrayBloco32NumeroPisBloco32NomeTrabalhadorDataMovimento(Arraybloco32PISNomeTrabalhadosDataMovimento);
	        			getSetSefip.setLisFuncionariosMovimentacao(Arraybloco32PISNomeTrabalhadosDataMovimento);
	        		}   
	        		else if((linha.substring(0,2)).equals("50"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco50.add(linha);
	        		}  
	        		else if((linha.substring(0,2)).equals("51"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco51.add(linha);
	        		}  
	        		else if((linha.substring(0,2)).equals("90"))
	        		{
	        			//System.out.println(linha);
	        			Arraybloco90.add(linha);
	        		}          		
		  	    
	            }
	
	            
	            input.close();
	          } catch (IOException ioe) {
	          	System.out.println(ioe);
	          }
	   	
			return getSetSefip;
    }
    
    
    
    public GetSetSefip popularRegistrodoTrabalhadorBloco30(String comboSelecionadoFuncionario) throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario.substring(72,82) + "/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' ##,###,#0");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco30) { 
//    		System.out.println("s.Arraybloco30  > " + s );
//    		System.out.println("s.substring(20,25 > " + s.substring(20,25) );
//    		System.out.println("POPULANDO TELA RECEBEU: /" + comboSelecionadoFuncionario );
    		//System.out.println("comboSelecionadoFuncionario s.substring(93,98) /" + comboSelecionadoFuncionario.substring(93,98) +"/" );
    		//System.out.println("comboSelecionadoFuncionario s.substring(72,82) /" + comboSelecionadoFuncionario.substring(72,82) +"/" );
    		//System.out.println("s.substring(33,43) /" + s.substring(33,43) +"/" );
    		//System.out.println("s.substring(20,25) /" + s.substring(20,25) +"/" );
    		
    		// - Obra: Sim
    		
    		//Descrito em Obra (M OBR") existir e o PIS for igual OU Pis for igual e incricao da obra for igualS
    		if(comboSelecionadoFuncionario.substring(93,98).equals("M OBR") && comboSelecionadoFuncionario.substring(72,82).equals(s.substring(33,43)) || comboSelecionadoFuncionario.substring(72,82).equals(s.substring(33,43)) && comboSelecionadoFuncionario.substring(93,98).equals(s.substring(20,25))){
    			System.out.println("ENCONTROU IGUAL VAI JOGAR NA TELA");
				//valor = Long.parseLong (s.substring(141,146).trim());
				//valor = Long.toString (Long.parseLong (s.substring(141,146).trim()));
    			
    			//getSetSefip.setBloco30TipoRegisto("30");
    			getSetSefip.setBloco30TipoRegisto(s.substring(0,2));
				getSetSefip.setBloco30TipoInscricaoEmpresa(s.substring(2,3).trim());	
				//getSetSefip.setBloco30InscricaoEmpresa(s.substring(3,17).trim());

				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco30InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));
				
				getSetSefip.setBloco30TipoInscricaoObra(s.substring(17,18).trim());
				
				if (!s.substring(18,32).trim().isEmpty())
					getSetSefip.setBloco30InscricaTomadorObraConstrucaoCivel( String.valueOf( Long.parseLong(s.substring(18,32).trim())));
				
				getSetSefip.setBloco30PisPaseCi(s.substring(32,43).trim());
				getSetSefip.setBloco30DataAdm(s.substring(43,51).trim());
				getSetSefip.setBloco30Categoria(s.substring(51,53).trim());
				getSetSefip.setBloco30NomeTrabalhador(s.substring(53,123).trim());
				
				if (!s.substring(123,134).trim().isEmpty())
					getSetSefip.setBloco30MatriculaEmpregado( String.valueOf( Long.parseLong(s.substring(123,134).trim())));
				
				if (!s.substring(134,141).trim().isEmpty())
						getSetSefip.setBloco30NumeroCTPS( String.valueOf( Long.parseLong(s.substring(134,141).trim())));
				
				if (!s.substring(141,146).trim().isEmpty())
					getSetSefip.setBloco30SerieCTPS( String.valueOf( Long.parseLong(s.substring(141,146).trim())));
				
				getSetSefip.setBloco30DataOpcao(s.substring(146,154).trim());
				getSetSefip.setBloco30DataNascimento(s.substring(154,162).trim());
				
				if (!s.substring(162,167).trim().isEmpty())
					getSetSefip.setBloco30CBO( String.valueOf( Long.parseLong(s.substring(162,167).trim())));
				//getSetSefip.setBloco30CBO(s.substring(162,167).trim());
				
				if (s.substring(167,182).trim().equals("000000000000000"))
					getSetSefip.setBloco30RemuneracaoSem13("");
				else 
					getSetSefip.setBloco30RemuneracaoSem13(FormataMoeda(s.substring(167,182)));
				
				if (s.substring(182,197).trim().equals("000000000000000"))
					getSetSefip.setBloco30Remuneracao13("");				
				else
					getSetSefip.setBloco30Remuneracao13(FormataMoeda(s.substring(182,197)));
				
				getSetSefip.setBloco30ClasseContribuicao(s.substring(197,199).trim());
				getSetSefip.setBloco30Ocorrencia(s.substring(199,201).trim());
				
				
//				System.out.println("_------> s.substring(201,216).trim() /" + s.substring(201,216).trim() +"/");
//				System.out.println("_------> s.substring(216,231).trim() /" + s.substring(216,231).trim() +"/");
//				System.out.println("_------> s.substring(231,246).trim() /" + s.substring(231,246).trim() +"/");
//				System.out.println("_------> s.substring(246,261).trim() /" + s.substring(246,261).trim() +"/");
//				System.out.println("_------> s.substring(167,182).trim() /" + s.substring(167,182).trim() +"/");
//				System.out.println("_------> s.substring(167,182).trim() /" + s.substring(167,182).trim() +"/");
				
				if (s.substring(201,216).trim().equals("000000000000000"))
					getSetSefip.setBloco30ValorDescontoSegurado("");
				else
					getSetSefip.setBloco30ValorDescontoSegurado(FormataMoeda(s.substring(201,216)));
				
				if (s.substring(216,231).trim().equals("000000000000000"))
					getSetSefip.setBloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria("");
				else
					getSetSefip.setBloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria(FormataMoeda(s.substring(216,231)));
				
				if (s.substring(231,246).trim().equals("000000000000000"))
					getSetSefip.setBloco30BaseCalculo13PrevidenciaSocial("");			
				else
					getSetSefip.setBloco30BaseCalculo13PrevidenciaSocial(FormataMoeda(s.substring(231,246)));
				
				if (s.substring(246,261).trim().equals("000000000000000"))
					getSetSefip.setBloco30BaseCalculo13PrevidenciaGPSCompetencia13("");
				else
					getSetSefip.setBloco30BaseCalculo13PrevidenciaGPSCompetencia13(FormataMoeda(s.substring(246,261)));
    		}	
		}
		return getSetSefip;
    }

    
    public GetSetSefip popularRegistroMovimentaoTrabalhadorBloco32(String comboSelecionadoFuncionario) throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario +"/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco32) { 
    		//System.out.println("Arraybloco30" + Arraybloco30 );
//    		System.out.println("82 RECEBEU: /" + comboSelecionadoFuncionario );
//    		System.out.println("comboSelecionadoFuncionario.substring(84,91) /" + comboSelecionadoFuncionario.substring(83,91) +"/" );
//    		System.out.println("s.substring(125,132) 							   /" + s.substring(125,133) +"/" );
    		
    		//Comparando os PIS e Data se sao iguais para popular o combo
    		if(comboSelecionadoFuncionario.substring(72,82).equals(s.substring(33,43)) && comboSelecionadoFuncionario.substring(83,91).equals(s.substring(125,133))){
    			//System.out.println("ENCONTROU IGUAL VAI JOGAR NA TELA");
        		//System.out.println("POPULANDO TELA RECEBEU: /" + comboSelecionadoFuncionario.substring(72,82) );
        		//System.out.println("s.substring(32,43)/" + s.substring(33,43) +"/" );

    			
    			getSetSefip.setBloco32TipoRegisto(s.substring(0,2));
				getSetSefip.setBloco32TipoInscricaoEmpresa(s.substring(2,3).trim());
				
				
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco32InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));
			
				//getSetSefip.setBloco32InscricaoEmpresa(s.substring(3,17).trim());
				getSetSefip.setBloco32TipoInscricaoObra(s.substring(17,18).trim());
				
				if (!s.substring(18,32).trim().isEmpty())
					getSetSefip.setBloco32InscricaTomadorObraConstrucaoCivel( String.valueOf( String.valueOf(Long.parseLong(s.substring(18,32).trim()))));
				
				//getSetSefip.setBloco32InscricaTomadorObraConstrucaoCivel(s.substring(18,32).trim());
				
				
				getSetSefip.setBloco32PisPaseCi(s.substring(32,43).trim());
				getSetSefip.setBloco32DataAdm(s.substring(43,51).trim());
				getSetSefip.setBloco32Categoria(s.substring(51,53).trim());
				getSetSefip.setBloco32NomeTrabalhador(s.substring(53,123).trim());
				
				getSetSefip.setBloco32CodMovimentacao(s.substring(123,125).trim());
				getSetSefip.setBloco32DataMovimentacao(s.substring(125,133).trim());
				getSetSefip.setBloco32IndicativoRecolhimentoFGTS(s.substring(133,134).trim());
				
//				System.out.println("CodMovimentacao = " + s.substring(123,125) +"" );
//				System.out.println("setBloco32DataMovimentacao = " + s.substring(125,133) +"" );
//				System.out.println("setBloco32IndicativoRecolhimentoFGTS = " + s.substring(133,134) +"" );
				
				
    		}	
		}
   	
		return getSetSefip;
    }
    
    
    public GetSetSefip popularRegistrodoTrabalhadorBloco13(String comboSelecionadoFuncionario) throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario.substring(72,82) + "/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' ##,###,#0");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco13) { 
//    		System.out.println("Arraybloco14" + Arraybloco14 );
//    		System.out.println("comboSelecionadoFuncionario14 /" + comboSelecionadoFuncionario );
//    		System.out.println("BLOCO PIS(73,81)/" + comboSelecionadoFuncionario.substring(73,81) +"/" );
//    		System.out.println("BLOCO PIS(55,63)/" + s.substring(55,63) +"/" );
    		
    		//Comparando os PIS se sao iguais para popular o combo
    		if(comboSelecionadoFuncionario.substring(73,81).equals(s.substring(55,63))){
   			
    			getSetSefip.setBloco13TipoRegisto(s.substring(0,2));
				getSetSefip.setBloco13TipoInscricaoEmpresa(s.substring(2,3).trim());
				
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco13InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));
				//getSetSefip.setBloco13InscricaoEmpresa(s.substring(3,17).trim());
				
				getSetSefip.setBloco13PisPaseCi(s.substring(53,64).trim());
				getSetSefip.setBloco13DataAdm(s.substring(64,72).trim());
				getSetSefip.setBloco13Categoria(s.substring(72,74).trim());
				
				if (!s.substring(74,85).trim().isEmpty())
					getSetSefip.setBloco13MatriculaEmpregado( String.valueOf( String.valueOf(Long.parseLong(s.substring(74,85).trim()))));

				//getSetSefip.setBloco13MatriculaEmpregado(s.substring(74,85).trim());
				
				if (!s.substring(85,92).trim().isEmpty())
					getSetSefip.setBloco13NumeroCTPS( String.valueOf( String.valueOf(Long.parseLong(s.substring(85,92).trim()))));

				//getSetSefip.setBloco13NumeroCTPS(s.substring(85,92).trim());
				
				if (!s.substring(92,97).trim().isEmpty())
					getSetSefip.setBloco13SerieCTPS( String.valueOf( String.valueOf(Long.parseLong(s.substring(92,97).trim()))));

				//getSetSefip.setBloco13SerieCTPS(s.substring(92,97).trim());
				
				
				getSetSefip.setBloco13NomeTrabalhador(s.substring(97,167).trim());
				
				if (!s.substring(167,181).trim().isEmpty())
					getSetSefip.setBloco13CodigoEmpresaCAIXA( String.valueOf( String.valueOf(Long.parseLong(s.substring(167,181).trim()))));
					//getSetSefip.setBloco13CodigoEmpresaCAIXA(s.substring(167,181).trim());
				if (!s.substring(181,192).trim().isEmpty())
					getSetSefip.setBloco13CodigoTrabalhadorCAIXA( String.valueOf( String.valueOf(Long.parseLong(s.substring(181,192).trim()))));
					//getSetSefip.setBloco13CodigoTrabalhadorCAIXA(s.substring(181,192).trim());
				if (!s.substring(192,195).trim().isEmpty())
					getSetSefip.setBloco13CodigoAlteraoCadastral( String.valueOf( String.valueOf(Long.parseLong(s.substring(192,195).trim()))));
					//getSetSefip.setBloco13CodigoAlteraoCadastral(s.substring(192,195).trim());
				
				getSetSefip.setBloco13NovoConteudoDoCampo(s.substring(195,265).trim());
    		}	
		}
		return getSetSefip;
    }     
    
    
    
    public GetSetSefip popularRegistrodoTrabalhadorBloco14(String comboSelecionadoFuncionario) throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario.substring(72,82) + "/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' ##,###,#0");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco14) { 
//    		System.out.println("Arraybloco14" + Arraybloco14 );
//    		System.out.println("comboSelecionadoFuncionario14 /" + comboSelecionadoFuncionario );
//    		System.out.println("BLOCO PIS(73,81)/" + comboSelecionadoFuncionario.substring(73,81) +"/" );
//    		System.out.println("BLOCO PIS(55,63)/" + s.substring(55,63) +"/" );
    		
    		//Comparando os PIS se sao iguais para popular o combo
    		if(comboSelecionadoFuncionario.substring(73,81).equals(s.substring(55,63))){
   			
    			getSetSefip.setBloco14TipoRegisto(s.substring(0,2));
				getSetSefip.setBloco14TipoInscricaoEmpresa(s.substring(2,3).trim());
				
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco14InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));
					//getSetSefip.setBloco14InscricaoEmpresa(s.substring(3,17).trim());
				
				getSetSefip.setBloco14PisPaseCi(s.substring(53,64).trim());
				getSetSefip.setBloco14DataAdm(s.substring(64,72).trim());
				getSetSefip.setBloco14Categoria(s.substring(72,74).trim());
				getSetSefip.setBloco14NomeTrabalhador(s.substring(74,144).trim());
				
				if (!s.substring(144,151).trim().isEmpty())
					getSetSefip.setBloco14NumeroCTPS( String.valueOf( String.valueOf(Long.parseLong(s.substring(144,151).trim()))));
					//getSetSefip.setBloco14NumeroCTPS(s.substring(144,151).trim());
				
				if (!s.substring(151,156).trim().isEmpty())
					getSetSefip.setBloco14SerieCTPS( String.valueOf( String.valueOf(Long.parseLong(s.substring(151,156).trim()))));
					//getSetSefip.setBloco14SerieCTPS(s.substring(151,156).trim());
				
				getSetSefip.setBloco14Logradouro(s.substring(156,206).trim());
				getSetSefip.setBloco14Bairro(s.substring(206,226).trim());
				getSetSefip.setBloco14CEP(s.substring(226,234).trim());
				getSetSefip.setBloco14Cidade(s.substring(234,254).trim());
				getSetSefip.setBloco14UF(s.substring(254,256).trim());
				
    		}	
		}
		return getSetSefip;
    }  
    
    
    
    
    public GetSetSefip popularRegistroRegistroTomadorServioObraConstruoCivilBloco20(String comboSelecionadoFuncionario) throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario +"/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	
    	//ARRAY BLOCO 20
    	for(String s : Arraybloco20) { 
    		//System.out.println("Arraybloco20" + Arraybloco30 );
//    		System.out.println("comboSelecionadoFuncionario.substring(0,10)" + comboSelecionadoFuncionario.substring(0,10) );
//    		System.out.println("s.substring(17,28) /" + s.substring(18,28) +"/" );
//    		System.out.println("s.substring(125,132) 							   /" + s.substring(125,133) +"/" );
    		
    		//Comparando os PIS e Data se sao iguais para popular o combo
    		if(comboSelecionadoFuncionario.substring(0,10).equals(s.substring(18,28))){
    			
    			getSetSefip.setBloco20TipoRegisto(s.substring(0,2));
				getSetSefip.setBloco20TipoInscricaoEmpresa(s.substring(2,3).trim());
				getSetSefip.setBloco20TipoDaEmpresa(s.substring(4,17).trim());
				getSetSefip.setBloco20TipoInscricaTomadorObraConstrucaoCivel(s.substring(17,18));
				
				if (!s.substring(18,32).trim().isEmpty())
					getSetSefip.setBloco20InscricaTomadorObraConstrucaoCivel( String.valueOf( Long.parseLong(s.substring(18,32).trim())));
					//getSetSefip.setBloco20InscricaTomadorObraConstrucaoCivel(s.substring(18,32));
				
				
				getSetSefip.setBloco20NomeTomadorObraConstCivil(s.substring(53,93).trim());
				getSetSefip.setBloco20Logradouro(s.substring(93,143).trim());
				getSetSefip.setBloco20Bairro(s.substring(143,163).trim());
				getSetSefip.setBloco20CEP(s.substring(163,171).trim());
				getSetSefip.setBloco20Cidade(s.substring(171,191).trim());
				getSetSefip.setBloco20UF(s.substring(191,193).trim());
				
				
				if (!s.substring(193,197).trim().isEmpty())
					getSetSefip.setBloco20CodPgtoGPS( String.valueOf( Long.parseLong(s.substring(193,197).trim())));
				
		
				if (s.substring(197,212).trim().equals("000000000000000"))
					getSetSefip.setBloco20SalarioFamilia("");				
				else
					getSetSefip.setBloco20SalarioFamilia(FormataMoeda(s.substring(197,212)));
				
				
				if (s.substring(212,227).trim().equals("000000000000000"))
					getSetSefip.setBloco20ContribDescEmpregadoRefercompetncia13("");				
				else
					getSetSefip.setBloco20ContribDescEmpregadoRefercompetncia13(FormataMoeda(s.substring(212,227)));				
				
				getSetSefip.setBloco20IndicadorValorNegativoPositivo(s.substring(227,228));
				
				if (s.substring(228,242).trim().equals("00000000000000"))
					getSetSefip.setBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia("");				
				else
					getSetSefip.setBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia(FormataMoeda(s.substring(228,242)));	
				
				if (s.substring(242,257).trim().equals("000000000000000"))
					getSetSefip.setBloco20ValordeRetencao("");				
				else
					getSetSefip.setBloco20ValordeRetencao(FormataMoeda(s.substring(242,257)));	
				
				if (s.substring(257,272).trim().equals("000000000000000"))
					getSetSefip.setBloco20ValordasfaturasEmitidasParaTomador("");				
				else
					getSetSefip.setBloco20ValordasfaturasEmitidasParaTomador(FormataMoeda(s.substring(257,272)));					
    		}	
		}
    	
    	
    	for(String s : Arraybloco21) { 
    		System.out.println("s = " + s );
    		System.out.println("comboSelecionadoFuncionario.substring(0,10)" + comboSelecionadoFuncionario.substring(0,10) );
    		System.out.println("s.substring(18,28)  /" + s.substring(18,28) +"/" );
    		
    		//Comparando os PIS e Data se sao iguais para popular o combo
    		if(comboSelecionadoFuncionario.substring(0,10).equals(s.substring(18,28))){
    			System.out.println("ENCONTROU IGUAL VAI JOGAR NA TELA");
        		//System.out.println("POPULANDO TELA RECEBEU: /" + comboSelecionadoFuncionario.substring(72,82) );
        		//System.out.println("s.substring(32,43)/" + s.substring(33,43) +"/" );

    			
    			getSetSefip.setBloco21Ti3poRegisto(s.substring(0,2).trim());
    			getSetSefip.setBloco21TipoInscricaoEmpresa(s.substring(2,3).trim());
    			
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco21InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));    			
    				//getSetSefip.setBloco21InscricaoEmpresa(s.substring(3,17).trim());
    			
    			
    			getSetSefip.setBloco21TipoInscricaTomadorObraConstrucaoCivel(s.substring(17,18).trim());
    			getSetSefip.setBloco21InscricaTomadorObraConstrucaoCivel(s.substring(18,32).trim());
    			
				if (s.substring(53,68).trim().equals("000000000000000"))
					getSetSefip.setBloco21CompensacaoValorCorrigido("");				
				else
					getSetSefip.setBloco21CompensacaoValorCorrigido(FormataMoeda(s.substring(53,68)));
    				//getSetSefip.setBloco21CompensacaoValorCorrigido(s.substring(53,68));
    			
    			getSetSefip.setBloco21CompensacaoPeriodoInicio(s.substring(68,74).trim());
    			getSetSefip.setBloco21CompensacaoPeriodoFim(s.substring(74,80).trim());
    			
				if (s.substring(80,95).trim().equals("000000000000000"))
					getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresValorInss("");				
				else
					getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresValorInss(FormataMoeda(s.substring(80,95)));
    				//getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresValorInss(s.substring(80,95));
    			
    			
				if (s.substring(95,110).trim().equals("000000000000000"))
					getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades("");				
				else
					getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades(FormataMoeda(s.substring(95,110)));
    				//getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades(s.substring(95,110));
    			
    			
				if (s.substring(110,125).trim().equals("000000000000000"))
					getSetSefip.setBloco21ParcelamentoFGTScategorias0102030506("");				
				else
					getSetSefip.setBloco21ParcelamentoFGTScategorias0102030506(FormataMoeda(s.substring(110,125)));
					//getSetSefip.setBloco21ParcelamentoFGTScategorias0102030506(s.substring(110,125));
    			
				if (s.substring(125,140).trim().equals("000000000000000"))
					getSetSefip.setBloco21ParcelamentoFGTScategorias0407("");				
				else
					getSetSefip.setBloco21ParcelamentoFGTScategorias0407(FormataMoeda(s.substring(125,140)));
					//getSetSefip.setBloco21ParcelamentoFGTScategorias0407(s.substring(125,140));
    			
				if (s.substring(140,155).trim().equals("000000000000000"))
					getSetSefip.setBloco21ParcelamentoFGTSvalorrecolhido("");				
				else
					getSetSefip.setBloco21ParcelamentoFGTSvalorrecolhido(FormataMoeda(s.substring(140,155)));
					//getSetSefip.setBloco21ParcelamentoFGTSvalorrecolhido(s.substring(140,155));

				
									
    		}	
		}    	
   	
		return getSetSefip;
    }
    
    
    public GetSetSefip popularInformacoesDaEmpresaBloco10() throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario +"/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco10) { 
    		//System.out.println("Arraybloco30" + Arraybloco30 );
//    		System.out.println("82 RECEBEU: /" + comboSelecionadoFuncionario );
//    		System.out.println("comboSelecionadoFuncionario.substring(84,91) /" + comboSelecionadoFuncionario.substring(83,91) +"/" );
//    		System.out.println("s.substring(125,132) 							   /" + s.substring(125,133) +"/" );
    		
    		//Comparando os PIS e Data se sao iguais para popular o combo

    			//System.out.println("ENCONTROU IGUAL VAI JOGAR NA TELA");
        		//System.out.println("POPULANDO TELA RECEBEU: /" + comboSelecionadoFuncionario.substring(72,82) );
        		//System.out.println("s.substring(32,43)/" + s.substring(33,43) +"/" );

    			
    			getSetSefip.setBloco10TipoRegisto(s.substring(0,2));
    			getSetSefip.setBloco10TipoInscricaoEmpresa(s.substring(2,3));
    			
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco10InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));     			
    				//getSetSefip.setBloco10InscricaoEmpresa(s.substring(3,17));
    			
    			getSetSefip.setBloco10NomeEmpresaRazaoSocial(s.substring(53,93).trim());
    			getSetSefip.setBloco10Logradouro(s.substring(93,143).trim());
    			getSetSefip.setBloco10Bairro(s.substring(143,163).trim());
    			getSetSefip.setBloco10CEP(s.substring(163,171));
    			getSetSefip.setBloco10Cidade(s.substring(171,191).trim());
    			getSetSefip.setBloco10UF(s.substring(191,193).trim());
    			
    			
    			if (!s.substring(193,205).trim().isEmpty())
					getSetSefip.setBloco10Telefone( String.valueOf( String.valueOf(Long.parseLong(s.substring(193,205).trim()))));
    				//getSetSefip.setBloco10Telefone(s.substring(193,205));
    			
    			getSetSefip.setBloco10IndicadorAlteracaoEndereco(s.substring(205,206).trim());
    			getSetSefip.setBloco10CNAE(s.substring(206,213));
    			getSetSefip.setBloco10indicadorAlteracaoCNAE(s.substring(213,214).trim());
    			getSetSefip.setBloco10AliquotaRAT(s.substring(214,216));
    			getSetSefip.setBloco10CodigoCentralizacao(s.substring(216,217));
    			getSetSefip.setBloco10Simples(s.substring(217,218));
    			getSetSefip.setBloco10FPAS(s.substring(218,221));
    			
    			
				if (!s.substring(221,225).trim().isEmpty())
					getSetSefip.setBloco10CodigoOutroasEntidades( String.valueOf( Long.parseLong(s.substring(221,225).trim())));
    				//getSetSefip.setBloco10CodigoOutroasEntidades(s.substring(221,225).trim());
    			
    			getSetSefip.setBloco10CodigoPgtoGPS(s.substring(225,229));
    			getSetSefip.setBloco10PercentualInsencaoFilantropica(s.substring(229,234).trim());
    			
    			
				if (s.substring(234,249).trim().equals("000000000000000"))
					getSetSefip.setBloco10SalarioFamilia("");				
				else
					getSetSefip.setBloco10SalarioFamilia(FormataMoeda(s.substring(234,249)));    			
    				//getSetSefip.setBloco10SalarioFamilia(s.substring(234,249));
    			
    			
    			
				if (s.substring(249,264).trim().equals("000000000000000"))
					getSetSefip.setBloco10SalarioMaternidade("");				
				else
					getSetSefip.setBloco10SalarioMaternidade(FormataMoeda(s.substring(249,264)));
    				//getSetSefip.setBloco10SalarioMaternidade(s.substring(249,264));
    				
    			
				if (s.substring(264,279).trim().equals("000000000000000"))
					getSetSefip.setBloco10ContribDescEmpregadoReferentaCompetencia13("");				
				else
					getSetSefip.setBloco10ContribDescEmpregadoReferentaCompetencia13(FormataMoeda(s.substring(264,279)));    			
					//getSetSefip.setBloco10ContribDescEmpregadoReferentaCompetencia13(s.substring(264,279));
    			
    			
    			
    			getSetSefip.setBloco10IndicadorValorNegativoPositivo(s.substring(279,280));
    			
    			
				if (s.substring(280,294).trim().equals("00000000000000"))
					getSetSefip.setBloco10ValorDevidoPrevidnciaSocialReferenteComp13("");				
				else
					getSetSefip.setBloco10ValorDevidoPrevidnciaSocialReferenteComp13(FormataMoeda(s.substring(280,294)));     			
    				//getSetSefip.setBloco10ValorDevidoPrevidnciaSocialReferenteComp13(s.substring(280,294));
    			
    				
    			getSetSefip.setBloco10Banco(s.substring(294,297).trim());
    			getSetSefip.setBloco10Agencia(s.substring(297,301).trim());
    			getSetSefip.setBloco10ContaCorrente(s.substring(301,310).trim());
    			
		}
   	
		return getSetSefip;
    }    
   
    public GetSetSefip popularInformaAdicionaisRecolhimentoEmpresa12() throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario +"/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	System.out.println("BLOCO 12 ENTRO");
    	
    	for(String s : Arraybloco12) { 
    		//System.out.println("Arraybloco30" + Arraybloco30 );
//    		System.out.println("82 RECEBEU: /" + comboSelecionadoFuncionario );
//    		System.out.println("comboSelecionadoFuncionario.substring(84,91) /" + comboSelecionadoFuncionario.substring(83,91) +"/" );
//    		System.out.println("s.substring(125,132) 							   /" + s.substring(125,133) +"/" );
    		
    		//Comparando os PIS e Data se sao iguais para popular o combo

    			System.out.println("BLOCO 12");
        		//System.out.println("POPULANDO TELA RECEBEU: /" + comboSelecionadoFuncionario.substring(72,82) );
        		//System.out.println("s.substring(32,43)/" + s.substring(33,43) +"/" );

    			
    			getSetSefip.setBloco12TipoRegisto(s.substring(0,2));
    			getSetSefip.setBloco12TipoInscricaoEmpresa(s.substring(2,3));
    			
				if (!s.substring(3,17).trim().isEmpty())
					getSetSefip.setBloco12InscricaoEmpresa( String.valueOf( String.valueOf(Long.parseLong(s.substring(3,17).trim()))));   			
    				//getSetSefip.setBloco12InscricaoEmpresa(s.substring(3,17));    			
    			
    			
				if (s.substring(53,68).trim().equals("000000000000000"))
					getSetSefip.setBloco12Deducao13SalarioMaternidade("");				
				else
					getSetSefip.setBloco12Deducao13SalarioMaternidade(FormataMoeda(s.substring(53,68)));				
					//getSetSefip.setBloco12Deducao13SalarioMaternidade(s.substring(53,68).trim());	
    			
    			
				if (s.substring(68,83).trim().equals("000000000000000"))
					getSetSefip.setBloco12ReceitaEventoDesportivoPatrocinio("");				
				else
					getSetSefip.setBloco12ReceitaEventoDesportivoPatrocinio(FormataMoeda(s.substring(68,83)));    			
					//getSetSefip.setBloco12ReceitaEventoDesportivoPatrocinio(s.substring(68,83).trim());
    			
    			
    			getSetSefip.setBloco12IndicativoOrigemReceita(s.substring(83,84).trim());
    			
				if (s.substring(84,99).trim().equals("000000000000000"))
					getSetSefip.setBloco12ComercializacaoProducaoPF("");				
				else
					getSetSefip.setBloco12ComercializacaoProducaoPF(FormataMoeda(s.substring(84,99)));     			
    				//getSetSefip.setBloco12ComercializacaoProducaoPF(s.substring(84,99).trim());
    			
				
				if (s.substring(99,114).trim().equals("000000000000000"))
					getSetSefip.setBloco12ComercializacaoProducaoPJ("");				
				else
					getSetSefip.setBloco12ComercializacaoProducaoPJ(FormataMoeda(s.substring(99,114)));    				
					//getSetSefip.setBloco12ComercializacaoProducaoPJ(s.substring(99,114).trim());
    			
    			
				getSetSefip.setBloco12OutroasInformacoesProcesso(s.substring(114,125).trim());
    			getSetSefip.setBloco12OutroasInformacoesProcessoAno(s.substring(125,129).trim());
    			getSetSefip.setBloco12OutroasInformacoesVaraJCJ(s.substring(129,134).trim());
    			getSetSefip.setBloco12OutroasInformacoesPeriodoIni(s.substring(134,140).trim());
    			getSetSefip.setBloco12OutroasInformacoesPeriodoFIm(s.substring(140,146).trim());
    			
				if (s.substring(146,161).trim().equals("000000000000000"))
					getSetSefip.setBloco12CompensacaoValorCorrigido("");				
				else
					getSetSefip.setBloco12CompensacaoValorCorrigido(FormataMoeda(s.substring(146,161)));    			
    				//getSetSefip.setBloco12CompensacaoValorCorrigido(s.substring(146,161).trim());
    			
    			
    			getSetSefip.setBloco12CompensacaoPeriodoInicio(s.substring(161,167).trim());
    			getSetSefip.setBloco12CompensacaoPeriodoFim(s.substring(167,173).trim());
    			
    			
				if (s.substring(173,188).trim().equals("000000000000000"))
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha("");				
				else
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha(FormataMoeda(s.substring(173,188)));    			    			
    				//getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorValorINSSSobreFolha(s.substring(173,188).trim());
    			
				
				if (s.substring(188,203).trim().equals("000000000000000"))
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorOutasEntidades("");				
				else
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorOutasEntidades(FormataMoeda(s.substring(188,203)));    			    			
    				//getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorOutasEntidades(s.substring(188,203).trim());
    			
				
				if (s.substring(203,218).trim().equals("000000000000000"))
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS("");				
				else
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS(FormataMoeda(s.substring(203,218)));    			
    				//getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoINSS(s.substring(203,218).trim());
    			
				
				if (s.substring(218,233).trim().equals("000000000000000"))
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades("");				
				else
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades(FormataMoeda(s.substring(218,233))); 				
    				//getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorComercializacaoProducaoOutrasEntidades(s.substring(218,233).trim());
    			
				if (s.substring(233,248).trim().equals("000000000000000"))
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva("");				
				else
					getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva(FormataMoeda(s.substring(233,248))); 				
    				//getSetSefip.setBloco12RecolhimentoCompetenciaAnteriorReceitaDespotiva(s.substring(233,248).trim());
    			
				
				if (s.substring(248,263).trim().equals("000000000000000"))
					getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0102030506("");				
				else
					getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0102030506(FormataMoeda(s.substring(248,263)));    			
    				//getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0102030506(s.substring(248,263).trim());
    			
    			
				if (s.substring(263,278).trim().equals("000000000000000"))
					getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0407("");				
				else
					getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0407(FormataMoeda(s.substring(263,278)));       			
					//getSetSefip.setBloco12ParcelamentoFGTSSomatorioCategoria0407(s.substring(263,278).trim());
    			
			
				if (s.substring(278,293).trim().equals("000000000000000"))
					getSetSefip.setBloco12ParcelamentoFGTSValorRecolhido("");				
				else
					getSetSefip.setBloco12ParcelamentoFGTSValorRecolhido(FormataMoeda(s.substring(278,293)));				
					//getSetSefip.setBloco12ParcelamentoFGTSValorRecolhido(s.substring(278,293).trim());
    			
				
				if (s.substring(293,308).trim().equals("000000000000000"))
					getSetSefip.setBloco12ValoresPGTOCooperativas("");				
				else
					getSetSefip.setBloco12ValoresPGTOCooperativas(FormataMoeda(s.substring(293,308)));				
					//getSetSefip.setBloco12ValoresPGTOCooperativas(s.substring(293,308).trim());
    			
		}
   	
		return getSetSefip;
    }  
    
    
    public GetSetSefip popularInformacoesDoResponsavelBloco10() throws IOException { 
    	//System.out.println("POPULANDO TELA Sbustrin: /" + comboSelecionadoFuncionario +"/");
  
    	DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    	NumberFormat formatacampo = NumberFormat.getCurrencyInstance();
    	String Valor = "";
    	
    	for(String s : Arraybloco00) { 
    			
    			getSetSefip.setBloco00TipoRegisto(s.substring(0,2));
    			getSetSefip.setBloco00TipodeRemessa(s.substring(53,54));
    			getSetSefip.setBloco00TipodeInscricaoResponsavel(s.substring(54,55));
    			getSetSefip.setBloco00InscricaoResponsavel(s.substring(55,69).trim());
    			getSetSefip.setBloco00RazaoSocial(s.substring(69,99).trim());
    			getSetSefip.setBloco00NomePessoaContato(s.substring(99,119).trim());
    			getSetSefip.setBloco00Logradouro(s.substring(119,169).trim());
    			getSetSefip.setBloco00Bairro(s.substring(169,189).trim());
    			getSetSefip.setBloco00Cep(s.substring(189,197).trim());
    			getSetSefip.setBloco00Cidade(s.substring(197,217).trim());
    			getSetSefip.setBloco00UF(s.substring(217,219).trim());
    			getSetSefip.setBloco00TelefoneInternetContato(s.substring(219,231).trim());
    			getSetSefip.setBloco00EnderecoInternetContato(s.substring(231,291).trim());
    			getSetSefip.setBloco00Competencia(s.substring(291,297).trim());
    			getSetSefip.setBloco00CodRecolhimento(s.substring(297,300).trim());
    			getSetSefip.setBloco00IndicadorDeRecolhimentoFGTS(s.substring(300,301).trim());
    			getSetSefip.setBloco00ModalidadeArquivo(s.substring(301,302).trim());
    			getSetSefip.setBloco00DataDeRecolhimentoDoFGTS(s.substring(302,310).trim());
    			getSetSefip.setBloco00IndicadorRecolhimenetoPrevidenciaSocial(s.substring(310,311).trim());
    			getSetSefip.setBloco00DataDeRecolhimentoDaPrevidenciaSocial(s.substring(311,319).trim());
    			getSetSefip.setBloco00IndiceRecolhimentAtrasoPrevidenciaSocial(s.substring(319,326).trim());
    			getSetSefip.setBloco00TipoInscricaoFornecedor(s.substring(326,327).trim());
    			getSetSefip.setBloco00InscrioDoFornecedorFolhaDePagamento(s.substring(327,341).trim());
    			
		}
   	
		return getSetSefip;
    }    
    
    
    public GetSetSefip limpacampos() throws IOException { 
    	
    	getSetSefip.setBloco30TipoRegisto("");
		getSetSefip.setBloco30TipoInscricaoEmpresa("");
		getSetSefip.setBloco30InscricaoEmpresa("");
		getSetSefip.setBloco30TipoInscricaoObra("");
		getSetSefip.setBloco30InscricaTomadorObraConstrucaoCivel("");
		getSetSefip.setBloco30PisPaseCi("");
		getSetSefip.setBloco30DataAdm("");
		getSetSefip.setBloco30Categoria("");
		getSetSefip.setBloco30NomeTrabalhador("");
		getSetSefip.setBloco30MatriculaEmpregado("");
		getSetSefip.setBloco30NumeroCTPS("");
		getSetSefip.setBloco30SerieCTPS("");
		getSetSefip.setBloco30DataOpcao("");
		getSetSefip.setBloco30DataNascimento("");
		getSetSefip.setBloco30CBO("");
		getSetSefip.setBloco30RemuneracaoSem13("");
		getSetSefip.setBloco30Remuneracao13("");				
		getSetSefip.setBloco30ClasseContribuicao("");
		getSetSefip.setBloco30Ocorrencia("");
		getSetSefip.setBloco30ValorDescontoSegurado("");
		getSetSefip.setBloco30RemuneracaoBaseCalculoContribuicaoPrevidenciaria("");
		getSetSefip.setBloco30BaseCalculo13PrevidenciaSocial("");		
		getSetSefip.setBloco30BaseCalculo13PrevidenciaGPSCompetencia13("");
    			
		getSetSefip.setBloco32TipoRegisto("");
		getSetSefip.setBloco32TipoInscricaoEmpresa("");	
		getSetSefip.setBloco32InscricaoEmpresa("");
		getSetSefip.setBloco32TipoInscricaoObra("");
		getSetSefip.setBloco32InscricaTomadorObraConstrucaoCivel("");;
		getSetSefip.setBloco32PisPaseCi("");
		getSetSefip.setBloco32DataAdm("");;
		getSetSefip.setBloco32Categoria("");
		getSetSefip.setBloco32NomeTrabalhador("");
		getSetSefip.setBloco32CodMovimentacao("");
		getSetSefip.setBloco32DataMovimentacao("");
		getSetSefip.setBloco32IndicativoRecolhimentoFGTS("");
				
		getSetSefip.setBloco14TipoRegisto("");
		getSetSefip.setBloco14TipoInscricaoEmpresa("");	
		getSetSefip.setBloco14InscricaoEmpresa("");
		getSetSefip.setBloco14PisPaseCi("");
		getSetSefip.setBloco14DataAdm("");
		getSetSefip.setBloco14Categoria("");
		getSetSefip.setBloco14NomeTrabalhador("");
		getSetSefip.setBloco14NumeroCTPS("");
		getSetSefip.setBloco14SerieCTPS("");
		getSetSefip.setBloco14Logradouro("");
		getSetSefip.setBloco14Bairro("");;
		getSetSefip.setBloco14CEP("");
		getSetSefip.setBloco14Cidade("");
		getSetSefip.setBloco14UF("");
		
		getSetSefip.setBloco13TipoRegisto("");
		getSetSefip.setBloco13TipoInscricaoEmpresa("");	
		getSetSefip.setBloco13InscricaoEmpresa("");
		getSetSefip.setBloco13PisPaseCi("");
		getSetSefip.setBloco13DataAdm("");
		getSetSefip.setBloco13Categoria("");
		getSetSefip.setBloco13MatriculaEmpregado("");
		getSetSefip.setBloco13NumeroCTPS("");
		getSetSefip.setBloco13SerieCTPS("");
		getSetSefip.setBloco13NomeTrabalhador("");
		getSetSefip.setBloco13CodigoEmpresaCAIXA("");
		getSetSefip.setBloco13CodigoTrabalhadorCAIXA("");
		getSetSefip.setBloco13CodigoAlteraoCadastral("");
		getSetSefip.setBloco13NovoConteudoDoCampo("");
		
	   getSetSefip.setBloco20TipoRegisto("");
	   getSetSefip.setBloco20TipoInscricaoEmpresa("");
	   getSetSefip.setBloco20TipoDaEmpresa("");
	   getSetSefip.setBloco20TipoInscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco20InscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco20NomeTomadorObraConstCivil("");
	   getSetSefip.setBloco20Logradouro("");
	   getSetSefip.setBloco20Bairro("");
	   getSetSefip.setBloco20CEP("");
	   getSetSefip.setBloco20Cidade("");
	   getSetSefip.setBloco20UF("");	
	   getSetSefip.setBloco20CodPgtoGPS("");	
	   getSetSefip.setBloco20SalarioFamilia("");
	   getSetSefip.setBloco20ContribDescEmpregadoRefercompetncia13("");
	   getSetSefip.setBloco20IndicadorValorNegativoPositivo("");
	   getSetSefip.setBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia("");
	   getSetSefip.setBloco20ValordeRetencao("");
	   getSetSefip.setBloco20ValordasfaturasEmitidasParaTomador("");	
	   
	   getSetSefip.setBloco21Ti3poRegisto("");
	   getSetSefip.setBloco21TipoInscricaoEmpresa("");
	   getSetSefip.setBloco21InscricaoEmpresa("");
	   getSetSefip.setBloco21TipoInscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco21InscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco21CompensacaoValorCorrigido("");
	   getSetSefip.setBloco21CompensacaoPeriodoInicio("");
	   getSetSefip.setBloco21CompensacaoPeriodoFim("");
	   getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresValorInss("");
	   getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades("");
	   getSetSefip.setBloco21ParcelamentoFGTScategorias0102030506("");
	   getSetSefip.setBloco21ParcelamentoFGTScategorias0407("");
	   getSetSefip.setBloco21ParcelamentoFGTSvalorrecolhido("");
	   
	   
		getSetSefip.setBloco10TipoRegisto("");
		getSetSefip.setBloco10TipoInscricaoEmpresa("");
		getSetSefip.setBloco30InscricaoEmpresa("");
		getSetSefip.setBloco10NomeEmpresaRazaoSocial("");
		getSetSefip.setBloco10Logradouro("");
		getSetSefip.setBloco10Bairro("");
		getSetSefip.setBloco10CEP("");
		getSetSefip.setBloco10Cidade("");
		getSetSefip.setBloco10UF("");
		getSetSefip.setBloco10Telefone("");
		getSetSefip.setBloco10IndicadorAlteracaoEndereco("");
		getSetSefip.setBloco10CNAE("");
		getSetSefip.setBloco10indicadorAlteracaoCNAE("");
		getSetSefip.setBloco10AliquotaRAT("");
		getSetSefip.setBloco10CodigoCentralizacao("");
		getSetSefip.setBloco10Simples("");
		getSetSefip.setBloco10FPAS("");
		getSetSefip.setBloco10CodigoOutroasEntidades("");
		getSetSefip.setBloco10CodigoPgtoGPS("");
		getSetSefip.setBloco10PercentualInsencaoFilantropica("");
		getSetSefip.setBloco10SalarioFamilia("");
		getSetSefip.setBloco10SalarioMaternidade("");
		getSetSefip.setBloco10ContribDescEmpregadoReferentaCompetencia13("");
		getSetSefip.setBloco10IndicadorValorNegativoPositivo("");
		getSetSefip.setBloco10ValorDevidoPrevidnciaSocialReferenteComp13("");
		getSetSefip.setBloco10Banco("");
		getSetSefip.setBloco10Agencia("");
		getSetSefip.setBloco10ContaCorrente("");
				

		return getSetSefip;
    }   
    
    
   public GetSetSefip limpacamposBloco32() throws IOException { 
    			
		getSetSefip.setBloco32TipoRegisto("");
		getSetSefip.setBloco32TipoInscricaoEmpresa("");	
		getSetSefip.setBloco32InscricaoEmpresa("");
		getSetSefip.setBloco32TipoInscricaoObra("");
		getSetSefip.setBloco32InscricaTomadorObraConstrucaoCivel("");;
		getSetSefip.setBloco32PisPaseCi("");
		getSetSefip.setBloco32DataAdm("");;
		getSetSefip.setBloco32Categoria("");
		getSetSefip.setBloco32NomeTrabalhador("");
		getSetSefip.setBloco32CodMovimentacao("");
		getSetSefip.setBloco32DataMovimentacao("");
		getSetSefip.setBloco32IndicativoRecolhimentoFGTS("");

		return getSetSefip;
    }  
   
   public GetSetSefip limpacamposBloco14() throws IOException { 
		
		getSetSefip.setBloco14TipoRegisto("");
		getSetSefip.setBloco14TipoInscricaoEmpresa("");	
		getSetSefip.setBloco14InscricaoEmpresa("");
		getSetSefip.setBloco14PisPaseCi("");
		getSetSefip.setBloco14DataAdm("");
		getSetSefip.setBloco14Categoria("");
		getSetSefip.setBloco14NomeTrabalhador("");
		getSetSefip.setBloco14NumeroCTPS("");
		getSetSefip.setBloco14SerieCTPS("");
		getSetSefip.setBloco14Logradouro("");
		getSetSefip.setBloco14Bairro("");;
		getSetSefip.setBloco14CEP("");
		getSetSefip.setBloco14Cidade("");
		getSetSefip.setBloco14UF("");

		return getSetSefip;
   }   
   
   
   public GetSetSefip limpacamposBloco13() throws IOException { 

		getSetSefip.setBloco13TipoRegisto("");
		getSetSefip.setBloco13TipoInscricaoEmpresa("");	
		getSetSefip.setBloco13InscricaoEmpresa("");
		getSetSefip.setBloco13PisPaseCi("");
		getSetSefip.setBloco13DataAdm("");
		getSetSefip.setBloco13Categoria("");
		
		getSetSefip.setBloco13MatriculaEmpregado("");
		getSetSefip.setBloco13NumeroCTPS("");
		getSetSefip.setBloco13SerieCTPS("");
		getSetSefip.setBloco13NomeTrabalhador("");
		getSetSefip.setBloco13CodigoEmpresaCAIXA("");
		getSetSefip.setBloco13CodigoTrabalhadorCAIXA("");
		getSetSefip.setBloco13CodigoAlteraoCadastral("");
		getSetSefip.setBloco13NovoConteudoDoCampo("");

		return getSetSefip;
  } 
   
   
   public GetSetSefip limpacamposBloco20() throws IOException { 
	   
	   
	   getSetSefip.setBloco20TipoRegisto("");
	   getSetSefip.setBloco20TipoInscricaoEmpresa("");
	   getSetSefip.setBloco20TipoDaEmpresa("");
	   getSetSefip.setBloco20TipoInscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco20InscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco20NomeTomadorObraConstCivil("");
	   getSetSefip.setBloco20Logradouro("");
	   getSetSefip.setBloco20Bairro("");
	   getSetSefip.setBloco20CEP("");
	   getSetSefip.setBloco20Cidade("");
	   getSetSefip.setBloco20UF("");	
	   getSetSefip.setBloco20CodPgtoGPS("");	
	   getSetSefip.setBloco20SalarioFamilia("");
	   getSetSefip.setBloco20ContribDescEmpregadoRefercompetncia13("");
	   getSetSefip.setBloco20IndicadorValorNegativoPositivo("");
	   getSetSefip.setBloco20ValorDevidoPrevidnciaSocialReferenteCompetncia("");
	   getSetSefip.setBloco20ValordeRetencao("");
	   getSetSefip.setBloco20ValordasfaturasEmitidasParaTomador("");
		

		return getSetSefip;
  }
   
   public GetSetSefip limpacamposBloco21() throws IOException { 
	   
	   
	   getSetSefip.setBloco21Ti3poRegisto("");
	   getSetSefip.setBloco21TipoInscricaoEmpresa("");
	   getSetSefip.setBloco21InscricaoEmpresa("");
	   getSetSefip.setBloco21TipoInscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco21InscricaTomadorObraConstrucaoCivel("");
	   getSetSefip.setBloco21CompensacaoValorCorrigido("");
	   getSetSefip.setBloco21CompensacaoPeriodoInicio("");
	   getSetSefip.setBloco21CompensacaoPeriodoFim("");
	   getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresValorInss("");
	   getSetSefip.setBloco21RecolhimentoCompetenciasAnterioresOutrasEntidades("");
	   getSetSefip.setBloco21ParcelamentoFGTScategorias0102030506("");
	   getSetSefip.setBloco21ParcelamentoFGTScategorias0407("");
	   getSetSefip.setBloco21ParcelamentoFGTSvalorrecolhido("");	  
	   

		return getSetSefip;
  }   
    
    public String FormataMoeda(String Campo){
        String MilharCentena = Campo.substring(0, Campo.length()-2);  
        String Centavos = Campo.substring(MilharCentena.length(),MilharCentena.length() + 2);  
        String aux = MilharCentena+"."+Centavos;
        double Valor = Double.parseDouble(aux);
        NumberFormat Moeda = NumberFormat.getInstance();                           // Sem Locale usa o pais do Sistema Operacional
        return Moeda.format( Valor );
      }

}
