package telran.converter.dto;

import java.time.LocalDate;
import java.util.Map;

import lombok.Getter;

@Getter
public class CurrencyConverterDto {
	boolean success;
	long timestamp;
	String base;
	// @JsonFormat(pattern = "yyyy-MM-dd")
	LocalDate date;
	Map<String, Double> rates;

}
