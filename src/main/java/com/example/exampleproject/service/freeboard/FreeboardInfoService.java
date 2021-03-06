package com.example.exampleproject.service.freeboard;

import com.example.exampleproject.model.Freeboard;
import com.example.exampleproject.repository.FreeboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class FreeboardInfoService {
    @Autowired
    private FreeboardRepository freeboardRepository;
    @Autowired
    private HttpSession session;

    public String getFreeboardPost(String stringFreeId){
        Long freeId = Long.parseLong(stringFreeId);
        Freeboard freeboard = freeboardRepository.findById(freeId).get();
        if (freeboard == null){
            return "freeboard";
        }

        session.setAttribute("freeboard",freeboard);

        return "freeBoardInfo";
    }
}