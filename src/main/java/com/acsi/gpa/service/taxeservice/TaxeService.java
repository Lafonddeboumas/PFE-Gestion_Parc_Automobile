package com.acsi.gpa.service.taxeservice;

import com.acsi.gpa.dto.taxedto.TaxeRequest;
import com.acsi.gpa.dto.taxedto.TaxeResponse;

import java.util.List;

public interface TaxeService {

    TaxeResponse saveTaxe(TaxeRequest  taxeRequest);

    TaxeResponse updateTaxe(TaxeRequest taxeRequest);

    TaxeResponse findTaxeById(Long id);

    List<TaxeResponse> listTaxe();

    void deleteTaxeById(long id);
}
