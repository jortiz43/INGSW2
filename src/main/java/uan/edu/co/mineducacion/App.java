package uan.edu.co.mineducacion;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	SimpleMinedu subddefomentodecompetencias = new SimpleMinedu("subd. dde fomento de competencias");
    	SimpleMinedu subdrecursoshumanossectoreducativo = new SimpleMinedu("subd. recursos humanos sector educativo");
    	SimpleMinedu subdsubdirecciondepermanencia = new SimpleMinedu("subd. subdirección de permanencia");
    	SimpleMinedu subddecalidaddepi = new SimpleMinedu("subd. de calidad de PI");
    	SimpleMinedu subddeinspeccionyvigilancia = new SimpleMinedu("subd. de inspección y vigilancia");
    	SimpleMinedu subddedesarrollosectorial = new SimpleMinedu("subd. de desarrollo sectorial");
    	SimpleMinedu subddegestionadministrativa = new SimpleMinedu("subd. de gestión administrativa");
    	SimpleMinedu subddecontratacion = new SimpleMinedu("subd. de contratación");
    	SimpleMinedu subddetalentohumano = new SimpleMinedu("subd. de talento humano");
    	SimpleMinedu subddedesarrolloorganizacional = new SimpleMinedu("subd. de desarrollo organizacional");
    	SimpleMinedu subddegestionfinanciera = new SimpleMinedu("subd. de gestión financiera");
    	SimpleMinedu unidaddeatencionalciudadano = new SimpleMinedu("unidad de atención al ciudadano");
    	
    	SimpleMinedu programatodosaaprender = new SimpleMinedu("programa todos a aprender");
    	SimpleMinedu oficinadeinnovacioneducativaconusodenuevastecnologias = new SimpleMinedu("oficina de innovación educativa con uso de nuevas tecnologias");
    	SimpleMinedu oficinaasesoradeplaneacionyfinanzas = new SimpleMinedu("oficina asesora de planeación y finanzas");
    	SimpleMinedu oficinadetecnologiaysistemasdeinformacion = new SimpleMinedu("oficina de tecnologia y sistemas de información");
    	SimpleMinedu oficinaasesoradejuridica = new SimpleMinedu("oficina asesora de juridica");
    	SimpleMinedu oficinadecontrolinterno = new SimpleMinedu("oficina de control interno");
    	SimpleMinedu oficinaasesoradecomunicaciones = new SimpleMinedu("oficina asesora de comunicaciones");
    	SimpleMinedu oficinadecooperacionyasuntosinternacionales = new SimpleMinedu("oficina de cooperación y asuntos internacionales");
    	
    	///////
    	
    	CompositeMinedu subddereferenciasyevaluaciondelacalidadeducativa =new CompositeMinedu("subd. de referencias y evaluación de la calidad educativa");
    	subddereferenciasyevaluaciondelacalidadeducativa.addHoja(subddefomentodecompetencias);
    	
    	CompositeMinedu subddefortalecimientoinstitucional=new CompositeMinedu("subd. de fortalecimiento institucional");
    	subddefortalecimientoinstitucional.addHoja(subdrecursoshumanossectoreducativo);
    	
    	CompositeMinedu subddeacceso=new CompositeMinedu("subd. de acceso");
    	subddeacceso.addHoja(subdsubdirecciondepermanencia);
    	
    	CompositeMinedu subddecoberturadepi=new CompositeMinedu("subd. de cobertura de PI");
    	subddecoberturadepi.addHoja(subddecalidaddepi);
    	
    	CompositeMinedu subdaseguramientodelacalidaddelaes=new CompositeMinedu("subd. aseguramiento de la calidad de la ES");
    	subdaseguramientodelacalidaddelaes.addHoja(subddeinspeccionyvigilancia);
    	  
    	CompositeMinedu subddeapoyoalagestiondelasies=new CompositeMinedu("subd. de apoyo a la gestión de las IES");
    	subddeapoyoalagestiondelasies.addHoja(subddedesarrollosectorial);
    	
    	    	
    	///////
    	
    	CompositeMinedu direcciondecalidadparalaeducacionpbm=new CompositeMinedu("dirección de calidad para la educación PBM");
    	direcciondecalidadparalaeducacionpbm.addHoja(subddereferenciasyevaluaciondelacalidadeducativa);
    	    	
    	CompositeMinedu subddemonitoreoycontrol=new CompositeMinedu("subd. de monitoreo y control");
    	subddemonitoreoycontrol.addHoja(subddefortalecimientoinstitucional);
    	
    	CompositeMinedu direcciondecoberturayequidad=new CompositeMinedu("dirección de cobertura y equidad");
    	direcciondecoberturayequidad.addHoja(subddeacceso);
    	
    	CompositeMinedu direcciondeprimerainfancia=new CompositeMinedu("dirección de primera infancia");
    	direcciondeprimerainfancia.addHoja(subddecoberturadepi);
    	
    	CompositeMinedu direcciondecalidadparalaes=new CompositeMinedu("dirección de calidad para la ES");
    	direcciondecalidadparalaes.addHoja(subdaseguramientodelacalidaddelaes);
    	    	
    	CompositeMinedu direcciondefomentodelaeducacionsuperior=new CompositeMinedu("dirección de fomento de la educación superior");
    	direcciondefomentodelaeducacionsuperior.addHoja(subddeapoyoalagestiondelasies);
    	
    	CompositeMinedu direccionfortalecimientoalagestionterritorial=new CompositeMinedu("dirección fortalecimiento a la gestión territorial");
    	direccionfortalecimientoalagestionterritorial.addHoja(subddemonitoreoycontrol);
    	
    	///////
    	
    	CompositeMinedu viceministeriodeeducacionpreescolarbasicaymedia=new CompositeMinedu("viceministerio d eeducación preescolar, básica y media");
    	viceministeriodeeducacionpreescolarbasicaymedia.addHoja(direcciondecalidadparalaeducacionpbm);
    	viceministeriodeeducacionpreescolarbasicaymedia.addHoja(direccionfortalecimientoalagestionterritorial);
    	viceministeriodeeducacionpreescolarbasicaymedia.addHoja(direcciondecoberturayequidad);
    	viceministeriodeeducacionpreescolarbasicaymedia.addHoja(direcciondeprimerainfancia);
    	
    	CompositeMinedu viceministeriodeeducacionsuperior=new CompositeMinedu("viceministeriodeeducacionsuperior");
    	viceministeriodeeducacionsuperior.addHoja(direcciondecalidadparalaes);
    	viceministeriodeeducacionsuperior.addHoja(direcciondefomentodelaeducacionsuperior);
    	
    	CompositeMinedu secretariageneral=new CompositeMinedu("secretaria general");
    	secretariageneral.addHoja(subddegestionadministrativa);
    	secretariageneral.addHoja(subddecontratacion);
    	secretariageneral.addHoja(subddetalentohumano);
    	secretariageneral.addHoja(subddedesarrolloorganizacional);
    	secretariageneral.addHoja(subddegestionfinanciera);
    	secretariageneral.addHoja(unidaddeatencionalciudadano);
    	
    	////////
    	   	
    	CompositeMinedu despachodelministeriodeeducacion=new CompositeMinedu("Despacho del ministerio de educación");
    	despachodelministeriodeeducacion.addHoja(viceministeriodeeducacionpreescolarbasicaymedia); 
    	despachodelministeriodeeducacion.addHoja(secretariageneral);
    	despachodelministeriodeeducacion.addHoja(programatodosaaprender);
    	despachodelministeriodeeducacion.addHoja(oficinadeinnovacioneducativaconusodenuevastecnologias);
    	despachodelministeriodeeducacion.addHoja(oficinaasesoradeplaneacionyfinanzas);
    	despachodelministeriodeeducacion.addHoja(oficinadetecnologiaysistemasdeinformacion);
    	despachodelministeriodeeducacion.addHoja(oficinaasesoradejuridica);
    	despachodelministeriodeeducacion.addHoja(oficinadecontrolinterno);
    	despachodelministeriodeeducacion.addHoja(oficinaasesoradecomunicaciones);
    	despachodelministeriodeeducacion.addHoja(oficinadecooperacionyasuntosinternacionales);
    	
    	
    	
    	ArrayList<String> hoja = new ArrayList();
        leerArray(hoja);
        System.out.println("Cadena de mayor longitud : " + cadenaMasLarga(hoja));
        
    }
    
    private static void leerArray(ArrayList<String> hoja) {
				
	}

	public static String cadenaMasLarga(ArrayList<String> hoja) {
        String mayor = hoja.get(0);
        for (int i = 1; i < hoja.size(); i++) {
            if (hoja.get(i).length() > mayor.length()) {
                mayor = hoja.get(i);
            }
        }
        return mayor;
    }
}
