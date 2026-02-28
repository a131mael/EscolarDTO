package org.aaf.escolar.enums;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

public enum EscolaEnum {

	ADONAI("Adonai","Bela Vista",BairroEnum.BELA_VISTA,-27.6571103,-48.6866351),
	CEMA("Cema", "Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6447663,-48.6682334),
	VENCESLAU("Venceslau Bueno","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6474254,-48.6689506),
	JOAO_SILVEIRA("João Silveira","Aririu",BairroEnum.ARIRIU,-27.6411215,-48.6789533),
	EVANDRA_SUELI("Evandra Sueli","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.661316,-48.6673215),
	INES_MARTA("Inês Marta","Bela Vista",BairroEnum.BELA_VISTA,-27.6411215,-48.6789533),
	VOVO_MARIA("Vovó Maria","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6558415,-48.6730515),
	VOO_LIVRE("Voo Livre","Bela Vista",BairroEnum.BELA_VISTA,-27.655456,-48.6833873),
	DOM_JAIME("Dom Jaime","Bela Vista",BairroEnum.BELA_VISTA,-27.6552598,-48.6825776),
	ITERACAO("Interação","Bela Vista",BairroEnum.BELA_VISTA,-27.6551332,-48.6814714),
	PROJETO_ESPERANCA("Projeto Esperança","Guarda do Cubatão",BairroEnum.GUARDA,-27.7019953,-48.68401679999999),
	PROF_GUILHERME("Prof. Guilherme","Palhoca",BairroEnum.BELA_VISTA,-27.6569484,-48.69580089999999),
	MULLER("Porta do CÉU","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6569146,-48.6703713),
	MODELO("Modelo","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6411215,48.6789533),
	MULTIPLA_ESCOLHA("Crescer e Aprender","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6416294,-48.6642096),
	RODA_PIAO("Roda Pião","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6496224,-48.6706396),
	ELCANA("Elcana","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6565844,-48.67336359999999),
	ELCANANINHA("Elcaninha","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6565844, -48.67336359999999),
	VIVENCIA("Vivência","Aririu",BairroEnum.ARIRIU,-27.6706583,-48.6835441),
	PARAISO_DO_AMOR("Paraíso do Amor","Aririu",BairroEnum.ARIRIU,-25.2175232,-48.0404918),
	ZILAR_ROSAR("Zilar Rosar","Aririu",BairroEnum.ARIRIU,-27.6750595,-48.6800287),
	NOVA_ESPERANCA("Nova Esperança","Guarda",BairroEnum.GUARDA,-27.6411215,-48.6789533),
	MARIA_JOSE_MEDEIROS("Maria José de Medeiros","Aririu",BairroEnum.ARIRIU,-11.4098737,-41.2808577),
	N_S_FATIMA("N.S. Fátima","Aririu",BairroEnum.ARIRIU,-25.2175232,-48.0404918),
	INOVACAO("Inovação","Pacheco",BairroEnum.PACHECOS,-27.6438595,-48.6674454),
	MARIA_DO_CARMO("Maria do Carmo","Pacheco",BairroEnum.PACHECOS,-27.6770829,-48.667089),
	CETEK("CETEK","Aririu",BairroEnum.ARIRIU,-27.6603441,-48.6738425),
	CENTRO_COMUNITARIO_ARIRIU("Centro comunitario aririu","Aririu",BairroEnum.ARIRIU,-27.6411215,-48.6789533),
	CENTRO_COMUNITARIO_ALTO_ARIRIU("Centro comunitario alto aririu","Alto Aririu",BairroEnum.ALTO_ARIRIU,-27.6411215,-48.6789533),
	NICOLINA("Nicolina Tancredo","Alto Aririu",BairroEnum.ALTO_ARIRIU,-27.6411215,-48.6789533),
	MUNDO_ENCANTADO("Mundo Encantado","Bela Vista",BairroEnum.BELA_VISTA,-27.6579218,-48.69102300000001),
	RAIZES("Raizes","Bela Vista",BairroEnum.BELA_VISTA,-27.2529148,-51.241375),
	CIRANDA_COLORIDA("Ciranda Colorida","Pachecos",BairroEnum.PACHECOS,-27.6690558,-48.6662381),
	COLEGIO_MILITAR("Colégio Militar","Bela Vista",BairroEnum.BELA_VISTA,-27.6498304,-48.7023022),
	SESC("SESC","Ponte Imaruim",BairroEnum.Ponte_IMARUIM,-27.634646,-48.65141999999999),
	EDUCARE("Centro Educacional Educare","Centro Palhoça",BairroEnum.PALHOCA_CENTRO,-27.6545955,-48.67274080000001),
	IVO_SILVEIRA("Ivo Silveira","Centro Palhoça",BairroEnum.PALHOCA_CENTRO,-27.6465597,-48.668387),
	FATEMP("Escola básica municipal Palhoca","Centro Palhoça",BairroEnum.PALHOCA_CENTRO,27.6714812,-48.6647565),
	VIVIANE_LAURITA("Viviane Laurita","Centro Palhoça",BairroEnum.PALHOCA_CENTRO,-27.6503455,-48.6698141),
	ESPACO_PACHECO("Espaço Pacheco","Pacheco",BairroEnum.PACHECOS,-27.6764999,-42.77355559999999),
	PEDRO_IVO("PEDRO IVO","Centro Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6282556,-48.665513),
	ANJINHO_GUARDA("Anjinho Guarda","Pacheco",BairroEnum.PACHECOS,-27.6765336,-48.6649547),
	ANTONIETA("Antonieta","Guarda",BairroEnum.GUARDA,-27.6948566,-48.675873),
	KERIGMA("KERIGMA","Centro Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6558415, -48.6730515),
	LAURITA_WAGNER("LAURITA WAGNER","FORMIGA",BairroEnum.FORMIGA,-25.2175232,-48.0404918),
	FUTURE_KIDS("Future Kids","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6448012,-48.66953789999999),
	REINALDO("Reinaldo Weingartner","Palhoca",BairroEnum.PALHOCA_CENTRO,-27.6643061,-48.65975479999999),
	VALE_ENCANTADO("Vale Encantado","Vale Verde",BairroEnum.VALE_VERDE,-27.6472366,-48.7088206),
	DUARTE("Centro Educacional Duarte","Duarte",BairroEnum.PALHOCA_CENTRO,-27.6620545,-48.6604452);
	
	private String name;
	private String bairro;
	private BairroEnum bairroEnum;
	private double lat;
    private double lon;
    private static final Map<String, EscolaEnum> LOOKUP = new HashMap<>();
    
    static {
    	System.out.println("itens do lookuo");
        for (EscolaEnum e : values()) {
        	System.out.println("normalizadolookup " + normalize(e.name));
            LOOKUP.put(normalize(e.name), e);
        }
    }
    
    private static String normalize(String value) {
        if (value == null) return null;

        String normalized = Normalizer.normalize(value, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        normalized = normalized.toLowerCase().trim();
        normalized = normalized.replaceAll("\\s+", " "); // remove espaços duplicados

        return normalized;
    }
    
	/*EscolaEnum(String name){
		this.name = name;
		
	}*/
	
	EscolaEnum(String name,String bairro,BairroEnum bairroEnum,double lat, double lon){
		this.name = name;
		this.bairro = bairro;
		this.bairroEnum = bairroEnum;
		this.lat = lat;
		this.lon = lon;
		
	}
	public String getName() {
		return name;
	}
	public String getBairro() {
		return bairro;
	}
	public BairroEnum getBairroEnum() {
		return bairroEnum;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public static EscolaEnum fromName(String name) {
	    if (name == null) return null;
	    return LOOKUP.get(normalize(name));
	}
}
