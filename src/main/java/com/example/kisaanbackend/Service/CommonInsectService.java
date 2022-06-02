package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.CommonInsect;
import com.example.kisaanbackend.Entity.Insect;
import com.example.kisaanbackend.Repository.CommonInsectRepository;
import com.example.kisaanbackend.Repository.InsectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommonInsectService {

    @Autowired
    private CommonInsectRepository commonInsectRepository;

    @Autowired
    private InsectRepository insectRepository;

    public String addCommonInsects(CommonInsect commonInsect){

        CommonInsect check = commonInsectRepository.findByCommonInsectName(commonInsect.getCommonInsectName());

        if(check!=null){
            return "Insect with the given name is already present";
        }


        commonInsectRepository.save(commonInsect);

        Insect insecten = new Insect();
        Insect insecthin = new Insect();
        Insect insectpun = new Insect();

        insecten.setInsectName(commonInsect.getInsectNames().get(0));
        insecten.setInsectDetail(commonInsect.getInsectDetails().get(0));
        insecten.setCropsAffected(commonInsect.getCropsAffects().get(0));
        insecten.setPesticides(commonInsect.getPesticides().get(0));

        insectRepository.save(insecten);

        insecthin.setInsectName(commonInsect.getInsectNames().get(1));
        insecthin.setInsectDetail(commonInsect.getInsectDetails().get(1));
        insecthin.setCropsAffected(commonInsect.getCropsAffects().get(1));
        insecthin.setPesticides(commonInsect.getPesticides().get(1));

        insectRepository.save(insecthin);

        insectpun.setInsectName(commonInsect.getInsectNames().get(2));
        insectpun.setInsectDetail(commonInsect.getInsectDetails().get(2));
        insectpun.setCropsAffected(commonInsect.getCropsAffects().get(2));
        insectpun.setPesticides(commonInsect.getPesticides().get(2));

        insectRepository.save(insectpun);





        return "Common Insect Added";
    }

    public List<CommonInsect> getAllCommonInsects(){
        return commonInsectRepository.findAll();
    }

    public List<String> langInsect(String str){

        List<String> strList  = new ArrayList<>();



        if(str.equals("en")){
            for(int i=0; i<commonInsectRepository.findAll().size(); i++){

                strList.add(commonInsectRepository.findAll().get(i).getInsectDetails().get(1));

            }
        }



        return strList;
    }

}
