/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.thymleaf.data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author 38068
 */
@Service
public class ListData {
    
    @Bean(name="myBean")
    public List<SampleData> myBean(){
    List<SampleData> result = new ArrayList<>();
    result.add(new SampleData("Ivan",25));
    result.add(new SampleData("Vasyl",27));
    result.add(new SampleData("Olena",24));
    return result;
    }
    
}
