package com.example.insta.Service;

import com.example.insta.Entity.Status;
import com.example.insta.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {

    @Autowired
    StatusRepo statusRepo;

    @Autowired
    UserService userService;

    public Status submitDataIntoDB(Status status) {
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus(){

        ArrayList<Status> statusList=statusRepo.findAll();

        for(int i=0;i<statusList.size();i++) {
            Status statusItem=statusList.get(i);
            statusItem.setUserName(userService.displayUserMetaData(statusItem.getUserId()).getUserName());
        }

        return statusList;
    }
}
