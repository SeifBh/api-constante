package fr.aba.prevoyance.presentation.api.garantie;

import com.aviva.prevoyance.pivottechnical.MicroServiceResponse;
import com.aviva.prevoyance.utils.api.component.ApiAuthentComponent;
import fr.aba.prevoyance.domain.utils.ConstantesUtils;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/constantes/garanties")
@RequiredArgsConstructor
public class GarantieConstanteController {

    @Value("${api.authent.constante.garantie}")
    private String apiAuthent;
    private final ApiAuthentComponent cApiAuthent;

    @ApiOperation(value = "Récuperer l'ensemble des valeurs des constantes garanties")
    @GetMapping("/codes")
    public ResponseEntity<MicroServiceResponse<Map<String, String>>> getConstantesGaranties(
            @RequestHeader(value = "app-key", required = false) final String appKey,
            @RequestHeader(value = "app-consumers", required = false) final String appConsumers) {

        cApiAuthent.verifyV2(appKey, appConsumers, apiAuthent);

        return ResponseEntity.ok(new MicroServiceResponse<>(ConstantesUtils.getCodesGaranties()));
    }

}
