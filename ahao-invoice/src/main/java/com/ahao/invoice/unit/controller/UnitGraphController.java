package com.ahao.invoice.unit.controller;

import com.ahao.commons.entity.AjaxDTO;
import com.ahao.commons.util.lang.CollectionHelper;
import com.ahao.invoice.unit.service.UnitService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ahaochan on 2017/9/10.
 */
@RestController
public class UnitGraphController {

    private UnitService unitService;

    @Autowired
    public UnitGraphController(UnitService unitService){
        this.unitService = unitService;
    }


    @PostMapping("/invoice/unit/graph/distribution")
    public AjaxDTO getDistribution(){
        JSONObject result = unitService.getDistribution();
        if(CollectionHelper.isEmpty(result)){
            return AjaxDTO.failure("没有查询到数据");
        }
        return AjaxDTO.success("查询数据成功", result);
    }

    @PostMapping("/invoice/unit/count")
    public AjaxDTO getCount(){
        return AjaxDTO.success(unitService.getAllCount());
    }

    @PostMapping("/invoice/unit/province/max")
    public AjaxDTO getMaxCountOfProvince(){
        return AjaxDTO.success(unitService.selectMaxCount());
    }
}
