package com.acsi.gpa.service.taxeservice;

import com.acsi.gpa.dto.taxedto.TaxeRequest;
import com.acsi.gpa.dto.taxedto.TaxeResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaxeServiceImpl implements TaxeService {


    @Override
    public TaxeResponse saveTaxe(TaxeRequest taxeRequest) {
        return null;
    }

    @Override
    public TaxeResponse updateTaxe(TaxeRequest taxeRequest) {
        return null;
    }

    @Override
    public TaxeResponse findTaxeById(Long id) {
        return null;
    }

    @Override
    public List<TaxeResponse> listTaxe() {
        return null;
    }

    @Override
    public void deleteTaxeById(long id) {

    }
}
