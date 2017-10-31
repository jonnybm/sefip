package br.com.sefip;

 
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.servlet.ServletContext;
 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;


import br.com.sefip.GetSetSefip;

//import br.com.auditoria.controller.BeanParseSped;
 
//@ManagedBean
@ManagedBean(name = "BeanSefip")
@SessionScoped
public class BeanSefip {
	
	private BeanControle beanControle = new BeanControle();
	
	private GetSetSefip getSetSefip = new GetSetSefip();
	private GetSetSefip RetornogetSetSefip = new GetSetSefip();
	
	List<SelectItem> lst30 = new ArrayList<SelectItem>();
	List<SelectItem> lst32 = new ArrayList<SelectItem>();
	List<SelectItem> lst20 = new ArrayList<SelectItem>();
	
	private String PathSped = "";
	
	

	public void upload(FileUploadEvent event) {  
        // Do what you want with the file        
        try {
        	//Copia arquivos SPED local para abrir e ler conteudo
        	copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        	
        	
    		RetornogetSetSefip = beanControle.limpacampos();
     	   	setSetSefip(RetornogetSetSefip);    				
    		//System.out.println("== getBloco30PisPaseCi " + getSetSefip.getBloco30PisPaseCi());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void copyFile(String fileName, InputStream in) {
        try {
            // write the inputStream to a FileOutputStream
            //OutputStream out = new FileOutputStream(new File("C:/PROJETOS/Auditoria/DOCUMENTOS APOIO/UPLOAD/" + fileName));
        	
 		
    		//Vendo se Diretorio Existe caso nao exista cria
//        	File diretorio = new File("UPLoadSefipRE"); // ajfilho  uma pasta!
//        	if (!diretorio.exists()) {
//        	   diretorio.mkdirs(); //mkdir() cria somente um diretrio, mkdirs() cria diretrios e subdiretrios.
//        	   //System.out.println("Diretrio NAO existe vai criar");
//        	} else {
//        	   System.out.println("Diretrio j existente");
//        	}
    		
        	//Copiando arquivo no diretorio
//    		OutputStream out = new FileOutputStream(new File("UPLoadSefipRE/"+fileName));
//    		PathSped = new File("").getAbsolutePath()+ "\\UPLoadSefipRE\\"+fileName;
    		//System.out.println("PathSped " + PathSped);
        	
        	
        	
        	
        		PathSped = "/Volumes/HD/BackupJonny/Projetos/Auditoria/DOCUMENTOSAPOIO/UPLOAD/" + fileName;
        	
            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(new File(PathSped));
            
            
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
            out.close();

      
       
           if(fileName.indexOf(".RE") != -1)
           {
        	   System.out.println("CARREAGANDO ...");
        	   RetornogetSetSefip = beanControle.sefip(PathSped);
        	   setSetSefip(RetornogetSetSefip);
        	   
        	   lst32.clear();
        	   lst30.clear();
        	  // getOpcoes();
        	 
        	  // System.out.println("BeanSefip.setSefip.ncmAliquotaZero " + getSetSefip.getLisFuncionarios());       	  
           }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }
	
    public GetSetSefip getSetSefip() {
		return getSetSefip;
	}
	public void setSetSefip(GetSetSefip SetSefip) {
		this.getSetSefip = SetSefip;
	} 
	
	
	public void load() throws IOException{
		lst30.clear();
		lst32.clear();
		
		  
		//Chamada para popular a Tela do Bloco 10
		try {
				
				RetornogetSetSefip = beanControle.popularInformacoesDaEmpresaBloco10();			
			   	setSetSefip(RetornogetSetSefip);
		  } 
		  catch (IOException e) {
				e.printStackTrace();
		  }	
		
		 
		  
		//Chamada para popular a Tela do Bloco 12
		try {
				
				RetornogetSetSefip = beanControle.popularInformaAdicionaisRecolhimentoEmpresa12();			
			   	setSetSefip(RetornogetSetSefip);
		  } 
		  catch (IOException e) {
				e.printStackTrace();
		  }
		  
		
		  
		  //Chamada para popular a Tela do Bloco 12
		try {
				
			RetornogetSetSefip = beanControle.popularInformacoesDoResponsavelBloco10();			
			   setSetSefip(RetornogetSetSefip);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}			  
		  
		  
			  
		  

    }
	
	public void cutuca(){

    }
	
	
	
	
	// INI COMBO DUNFIONARIOS
	public List<SelectItem> getCarregaComboFuncionario() {
		
		lst30.clear();
		
		for(String s : getSetSefip.lisFuncionarios) {  
			lst30.add(new SelectItem(s));
		}
		
		Collections.sort(lst30,new FuncionarioComparator() );
		return lst30;
	}
	public void carregaValoresTrabalhado3032(){
		lst30.clear();
    }

	
	// INI COMBO TOMADOR SERVICO OBRA
	public List<SelectItem> getCarregaComboBloco20TomadorServicoObra() {
		
		lst20.clear();
		
		for(String s : getSetSefip.lisEmpresaCodigoObra) {  
			lst20.add(new SelectItem(s));
		}
		
		Collections.sort(lst20,new FuncionarioComparator() );
		return lst20;
	}

	
	

	public class FuncionarioComparator implements Comparator<SelectItem> {
	    public int compare(SelectItem conta, SelectItem outraConta) {
	       
	    	return conta.getValue().toString().compareTo(outraConta.getValue().toString());
	    }
	}
	

	
	
	public void comboFuncionarioSelecionado(ValueChangeEvent event){  
	      String valor = (String) event.getNewValue(); 

		try {
			
			RetornogetSetSefip = beanControle.popularRegistrodoTrabalhadorBloco30(valor);
		   	setSetSefip(RetornogetSetSefip);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
			      
			      
		
		try {
			RetornogetSetSefip = beanControle.limpacamposBloco32();
			setSetSefip(RetornogetSetSefip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 	   
		
		try {
			RetornogetSetSefip = beanControle.limpacamposBloco13();
			setSetSefip(RetornogetSetSefip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		try {
			RetornogetSetSefip = beanControle.limpacamposBloco14();
			setSetSefip(RetornogetSetSefip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		getSetSefip.setBloco30ValorComboSelecionadoFuncionario(valor.replaceAll("[^0-9]", ""));
	      
	    try {
	      	RetornogetSetSefip = beanControle.popularRegistrodoTrabalhadorBloco14(valor);			
	      	setSetSefip(RetornogetSetSefip);
		} 
			catch (IOException e) {
			e.printStackTrace();
		}	 
			
			
	    try {
	      	RetornogetSetSefip = beanControle.popularRegistrodoTrabalhadorBloco13(valor);			
	      	setSetSefip(RetornogetSetSefip);
		} 
			catch (IOException e) {
			e.printStackTrace();
		}			
  
	      
	      
	   }
	// FIM COMBO FUNCIONARIOS
		
	// INI COMBO DUNFIONARIOS MOVIMENTACAO
	public List<SelectItem> getCombofuncionarioMovimentacao() {
		
		lst32.clear();
		
		String ValorComboSelecionadoFuncionario = getSetSefip.getBloco30ValorComboSelecionadoFuncionario();
		
		for(String s : getSetSefip.lisFuncionariosMovimentacao) { 
			
			//System.out.println("COMBO PREECNHER S " + s);
			
			if(ValorComboSelecionadoFuncionario.substring(0,10).equals(s.replaceAll("[^0-9]", "").substring(0,10))){
				lst32.add(new SelectItem(s));
				
			}
		}
		return lst32;
	}
	
	
	public void carregaValoresTrabalhadoMovimentacao3032(){
		lst32.clear();
    }
	

	public void comboFuncionarioMovimentacaoSelecionado(ValueChangeEvent event) throws IOException{  
	      
		String valor = (String) event.getNewValue();  
	     // System.out.println("comboFuncionarioMovmentacao Selecionado " + valor); 


	      try {
			
			RetornogetSetSefip = beanControle.popularRegistroMovimentaoTrabalhadorBloco32(valor);			
     	   	setSetSefip(RetornogetSetSefip);
     	   	
					
//			System.out.println("CARREGA NA TELA PisPaseCi " + getSetSefip.getBloco32PisPaseCi());
//			System.out.println("CARREGA NA TELA TipoRegisto " + getSetSefip.getBloco32TipoRegisto());
	      } 
	      catch (IOException e) {
			e.printStackTrace();
	      }	      
	      
	   }	
	// FIM COMBO FUNCIONARIOS MOVUMENTACAO
	
		
	//ABA SERVIC/OBRA - BLOCO 20
	
	public void comboTomadordeObraSelecionado(ValueChangeEvent event) throws IOException{  
	      
		String valor = (String) event.getNewValue();  
	     // System.out.println("comboFuncionarioMovmentacao Selecionado " + valor); 
		
		
		try {
			RetornogetSetSefip = beanControle.limpacamposBloco20();
			setSetSefip(RetornogetSetSefip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			RetornogetSetSefip = beanControle.limpacamposBloco21();
			setSetSefip(RetornogetSetSefip);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		


		  try {
			
			RetornogetSetSefip = beanControle.popularRegistroRegistroTomadorServioObraConstruoCivilBloco20(valor);			
		   	setSetSefip(RetornogetSetSefip);
		
		  } 
		  catch (IOException e) {
			e.printStackTrace();
		  }	      
	      
	   }

}
