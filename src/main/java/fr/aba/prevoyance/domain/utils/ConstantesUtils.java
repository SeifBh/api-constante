package fr.aba.prevoyance.domain.utils;


import fr.aba.prevoyance.domain.constante.garantie.ConstantesGaranties;
import fr.aba.prevoyance.domain.constante.produit.ConstantesProduits;
import fr.aba.prevoyance.domain.constante.risque.ConstantesRisques;

import java.util.HashMap;
import java.util.Map;

public class ConstantesUtils {

	/**
	 * Cette méthode est utilisée pour obtenir toutes les constantes.
	 *
	 * @return Map - Retourne une map contenant toutes les constantes.
	 */
	public static Map<String, String> getConstantes() {
		Map<String, String> m = new HashMap<>();
		m.putAll(getCodesProduits());
		m.putAll(getCodesGaranties());
		m.putAll(getCodesRisques());
		return m;
	}

	/**
	 * Cette méthode est utilisée pour obtenir les codes des produits.
	 *
	 * @return Map - Retourne une map contenant les codes des produits.
	 */
	public static Map<String, String> getCodesProduits() {
		Map<String, String> m = new HashMap<>();
		m.put("CODE_PRODUIT_SOLUTION_PRO_V1", ConstantesProduits.LIBELLE_PRODUIT_SP1_V);
		m.put("CODE_PRODUIT_SENSEO_V4", ConstantesProduits.LIBELLE_PRODUIT_SE4_V);
		m.put("CODE_PRODUIT_SENSEO_MED_V4", ConstantesProduits.LIBELLE_PRODUIT_SE4MV);
		m.put("CODE_PRODUIT_SENSEO_AGRI_V4", ConstantesProduits.LIBELLE_PRODUIT_SE4GV);
		m.put("CODE_PRODUIT_SENSEO_LIB_V4", ConstantesProduits.LIBELLE_PRODUIT_SE4LV);
		return m;
	}

	/**
	 * Cette méthode est utilisée pour obtenir les codes des garanties.
	 *
	 * @return Map - Retourne une map contenant les codes des garanties.
	 */
	public static Map<String, String> getCodesGaranties() {
		Map<String, String> m = new HashMap<>();
		m.put("CODE_GARANTIE_DECES", ConstantesGaranties.CODE_GARANTIE_DECES);
		m.put("CODE_GARANTIE_IJ_COURTE", ConstantesGaranties.CODE_GARANTIE_IJ_COURTE);
		return m;
	}

	/**
	 * Cette méthode est utilisée pour obtenir les codes des risques.
	 *
	 * @return Map - Retourne une map contenant les codes des risques.
	 */
	public static Map<String, String> getCodesRisques() {
		Map<String, String> m = new HashMap<>();
		m.put("AUGMENTATION", ConstantesRisques.AUGMENTATION);
		m.put("DIMINUTION", ConstantesRisques.DIMINUTION);
		m.put("SANS_IMPACT", ConstantesRisques.SANS_IMPACT);
		return m;
	}
}