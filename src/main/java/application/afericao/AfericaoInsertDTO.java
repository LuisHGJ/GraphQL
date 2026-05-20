package application.afericao;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO para Criação/Alteração de Aferições de Sensores")
public record AfericaoInsertDTO(
    @Schema(
        description = "ID do sensor da aferição",
        example = "TERM01",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String idSensor,
    @Schema(
        description = "Unidade Usada na aferição",
        example = "Graus Celsius",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String unidade,
    @Schema(
        description = "Valor da aferição",
        example = "45",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String valor) {

    public AfericaoInsertDTO(Afericao dados) {
        this(dados.getIdSensor(), dados.getUnidade(), dados.getValor());
    }    
}
