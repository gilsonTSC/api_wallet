package com.wallet.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletItemDTO {

	private Long id;
	
	@NotNull(message = "Insira o id da carteira")
	private Long wallet;
	
	@NotNull(message = "Informe a data")
	private Date date;
	
	@NotNull(message = "Informe o tipo")
	@Pattern(regexp="^(ENTRADA|SAÍDA)$", message = "Para o tipo somente são aceitos os valores ENTRADA ou SAÍDA")
	private String type;
	
	@NotNull(message = "Informe a descrição")
	@Length(min = 5, message = "A descrição deve ter no mínimo 5 caracteres")
	private String description;
	
	@NotNull(message = "Informe um valor")
	private BigDecimal value;
	
}