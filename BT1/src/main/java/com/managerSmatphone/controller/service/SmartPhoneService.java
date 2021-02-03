package com.managerSmatphone.controller.service;

import com.managerSmatphone.controller.model.SmartPhone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartPhoneService implements ISmartPhoneService {
    private static Map<Integer, SmartPhone> lisSmartPhone;

    static {
        lisSmartPhone = new HashMap<>();
        lisSmartPhone.put(1,new SmartPhone(1,"Nokia","110i",10000,"01/02/2010","10x12"));
        lisSmartPhone.put(2,new SmartPhone(2,"Nokia","110i",200000,"01/02/2010","10x12"));
        lisSmartPhone.put(3,new SmartPhone(3,"Nokia","110i",300000,"01/02/2010","10x12"));
        lisSmartPhone.put(4,new SmartPhone(4,"Nokia","110i",400000,"01/02/2010","10x12"));
        lisSmartPhone.put(5,new SmartPhone(5,"Nokia","110i",600000,"01/02/2010","10x12"));
        lisSmartPhone.put(6,new SmartPhone(6,"Nokia","110i",800000,"01/02/2010","10x12"));
        lisSmartPhone.put(7,new SmartPhone(7,"Nokia","110i",200000,"01/02/2010","10x12"));
        lisSmartPhone.put(8,new SmartPhone(8,"Nokia","110i",234234,"01/02/2010","10x12"));
    }

    @Override
    public List<SmartPhone> findAll() {
        return new ArrayList(lisSmartPhone.values());
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return lisSmartPhone.put(smartPhone.getId(),smartPhone);
    }

    @Override
    public SmartPhone updateById(int id, SmartPhone smartPhone) {
        return lisSmartPhone.replace(id,smartPhone);
    }

    @Override
    public SmartPhone findById(int id) {
        return lisSmartPhone.get(id);
    }

    @Override
    public void deleteById(int id) {
        lisSmartPhone.remove(id);
    }
}
