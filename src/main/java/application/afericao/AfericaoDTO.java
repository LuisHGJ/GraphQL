package application.afericao;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO para Aferições de Sensores")
public record AfericaoDTO(
    @Schema(
        description = "ID da aferição",
        requiredMode = Schema.RequiredMode.AUTO
    )
    long id,
    @Schema(
        description = "ID do sensor da aferição",
        example = "TERM01",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String idSensor,
    @Schema(
        description = "Unidade Usana na aferição",
        example = "Graus Celsius",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String unidade,
    @Schema(
        description = "Valoe da aferição",
        example = "45",
        requiredMode = Schema.RequiredMode.REQUIRED)
    String valor
) {
    public AfericaoDTO(Afericao dados) {
        this(dados.getId(), dados.getIdSensor(), dados.getUnidade(), dados.getValor());
    }    
}
